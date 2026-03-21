"use strict";

const fs = require("fs");
const path = require("path");
const vscode = require("vscode");
const { LanguageClient } = require("vscode-languageclient/node");
const { Trace } = require("vscode-jsonrpc/node");

/** @type {LanguageClient | undefined} */
let client;

/**
 * @param {string} raw
 * @param {vscode.WorkspaceFolder | undefined} folder
 */
function expandWorkspaceFolder(raw, folder) {
	if (!raw || !folder) {
		return raw;
	}
	return raw.replace(/\$\{workspaceFolder\}/g, folder.uri.fsPath);
}

/**
 * Default jar: sibling libretto.spec.ide module under libretto.spec.parent repo layout.
 * @param {string} extensionRoot
 */
function defaultJarFromExtensionLayout(extensionRoot) {
	const candidate = path.resolve(
		extensionRoot,
		"..",
		"..",
		"libretto.spec.ide",
		"target"
	);
	if (!fs.existsSync(candidate)) {
		return undefined;
	}
	const files = fs.readdirSync(candidate).filter(
		(f) => f.startsWith("libretto.spec.ide-") && f.endsWith("-ls.jar")
	);
	if (files.length === 0) {
		return undefined;
	}
	files.sort();
	return path.join(candidate, files[files.length - 1]);
}

/**
 * @param {vscode.ExtensionContext} context
 */
function resolveJarPath(context) {
	const config = vscode.workspace.getConfiguration("librettoSpec.languageServer");
	let jarPath = config.get("jarPath", "").trim();
	const folder = vscode.workspace.workspaceFolders?.[0];

	jarPath = expandWorkspaceFolder(jarPath, folder) || jarPath;

	if (jarPath && fs.existsSync(jarPath)) {
		return jarPath;
	}

	const fallback = defaultJarFromExtensionLayout(context.extensionPath);
	if (fallback && fs.existsSync(fallback)) {
		return fallback;
	}

	return jarPath || undefined;
}

/**
 * Map the URI from publishDiagnostics to the same Uri instance used by an open
 * editor when paths match. Avoids missing squiggles when the server string
 * differs slightly from VS Code/Cursor's file URI (encoding, normalization).
 *
 * @param {vscode.Uri} uri
 * @returns {vscode.Uri}
 */
function alignDiagnosticUriWithOpenDocument(uri) {
	if (uri.scheme !== "file") {
		return uri;
	}
	const target = uri.fsPath;
	const docs = vscode.workspace.textDocuments.filter(
		(d) =>
			d.languageId === "librettospec" &&
			d.uri.scheme === "file" &&
			d.uri.fsPath === target
	);
	if (docs.length === 0) {
		return uri;
	}
	return docs[0].uri;
}

/**
 * @param {string} fsPath
 */
function isDotLibrettoPath(fsPath) {
	return path.extname(fsPath).toLowerCase() === ".libretto";
}

/**
 * If enabled, force librettospec so documentSelector matches and the LSP runs.
 *
 * @param {vscode.TextDocument} document
 */
async function trySetLibrettoLanguage(document) {
	if (document.uri.scheme !== "file") {
		return;
	}
	if (!isDotLibrettoPath(document.uri.fsPath)) {
		return;
	}
	const auto = vscode.workspace
		.getConfiguration()
		.get("librettoSpec.autoSetLanguageForDotLibretto", true);
	if (!auto) {
		return;
	}
	if (document.languageId === "librettospec") {
		return;
	}
	await vscode.languages.setTextDocumentLanguage(document, "librettospec");
}

/**
 * @param {vscode.ExtensionContext} context
 */
function registerLibrettoLanguageHandling(context) {
	context.subscriptions.push(
		vscode.workspace.onDidOpenTextDocument((doc) => {
			void trySetLibrettoLanguage(doc);
		})
	);
	for (const doc of vscode.workspace.textDocuments) {
		void trySetLibrettoLanguage(doc);
	}
	context.subscriptions.push(
		vscode.commands.registerCommand("librettoSpec.repairLanguageMode", async () => {
			const ed = vscode.window.activeTextEditor;
			if (!ed?.document) {
				void vscode.window.showWarningMessage("Libretto Spec: no active editor.");
				return;
			}
			const doc = ed.document;
			if (doc.uri.scheme !== "file" || !isDotLibrettoPath(doc.uri.fsPath)) {
				void vscode.window.showWarningMessage(
					"Libretto Spec: active file is not a .libretto file."
				);
				return;
			}
			await vscode.languages.setTextDocumentLanguage(doc, "librettospec");
			void vscode.window.showInformationMessage(
				"Libretto Spec: language set to Libretto Spec (librettospec)."
			);
		})
	);
}

/**
 * @param {string} raw
 */
function parseTrace(raw) {
	switch ((raw || "").toLowerCase()) {
		case "messages":
			return Trace.Messages;
		case "compact":
			return Trace.Compact;
		case "verbose":
			return Trace.Verbose;
		default:
			return Trace.Off;
	}
}

/**
 * @param {vscode.ExtensionContext} context
 */
function activate(context) {
	registerLibrettoLanguageHandling(context);

	const lsConfig = vscode.workspace.getConfiguration("librettoSpec.languageServer");
	const javaPath = lsConfig.get("javaPath", "java");
	const jvmArgs = lsConfig.get("jvmArgs", []);
	const traceLevel = parseTrace(lsConfig.get("trace", "off"));
	const logDiagnostics = lsConfig.get("logDiagnostics", false);

	const jarPath = resolveJarPath(context);
	if (!jarPath || !fs.existsSync(jarPath)) {
		void vscode.window.showWarningMessage(
			"Libretto Spec LSP: jar not found. Build with `mvn -pl libretto.spec.ide package` and set `librettoSpec.languageServer.jarPath` (or keep this extension under editors/cursor-libretto-lsp in the repo)."
		);
		return;
	}

	const outputChannel = vscode.window.createOutputChannel("Libretto Spec LSP");
	context.subscriptions.push(outputChannel);

	const args = [...jvmArgs, "-jar", jarPath];
	const serverOptions = {
		command: javaPath,
		args,
		options: {},
	};

	const clientOptions = {
		documentSelector: [{ scheme: "file", language: "librettospec" }],
		diagnosticCollectionName: "librettoSpec",
		outputChannel,
		// Prefer push diagnostics from Xtext; avoid pull-on-change if a future
		// server advertises diagnosticProvider with an incomplete implementation.
		diagnosticPullOptions: { onChange: false, onSave: false },
		middleware: {
			handleDiagnostics: (uri, diagnostics, next) => {
				const aligned = alignDiagnosticUriWithOpenDocument(uri);
				if (logDiagnostics) {
					outputChannel.appendLine(
						`[diagnostics] ${aligned.toString()} → ${diagnostics.length} issue(s)${
							aligned.toString() !== uri.toString() ? ` (aligned from ${uri})` : ""
						}`
					);
				}
				next(aligned, diagnostics);
			},
		},
	};

	client = new LanguageClient(
		"librettoSpec",
		"Libretto Spec Language Server",
		serverOptions,
		clientOptions
	);

	void client.start().then(() => {
		void client.setTrace(traceLevel);
		if (traceLevel !== Trace.Off) {
			outputChannel.appendLine(
				`LSP trace: ${lsConfig.get("trace")} (see Output → Libretto Spec LSP; set librettoSpec.languageServer.trace to "off" to disable)`
			);
		}
	});
	context.subscriptions.push(
		new vscode.Disposable(() => {
			void client.stop();
		})
	);
}

function deactivate() {
	return client ? client.stop() : undefined;
}

module.exports = { activate, deactivate };
