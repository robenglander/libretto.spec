# Libretto Spec — Cursor / VS Code LSP

Connects **Cursor** (or VS Code) to the Xtext **shaded language server** (`*-ls.jar`) from `libretto.spec.ide`, and bundles the same **TextMate grammar** as `libretto/editors/vscode` under language id **`librettospec`** (so validation and syntax coloring use one language id).

**Project profile (`.lpp`)** is a separate extension: [`../cursor-libretto-profile-lsp`](../cursor-libretto-profile-lsp) (`librettoProfile.*` settings, same jar). Install both if you work with specs and profiles.

If you also use the standalone **Libretto** highlighting extension, **disable it** — it used to register **`libretto`**, which prevented the LSP (which expects **`librettospec`**) from attaching. That standalone package is now aligned to `librettospec` too, but two extensions registering the same grammar is redundant.

### Syntax coloring: where it comes from

VS Code / Cursor combine two mechanisms (you usually want **both**):

| Layer | Source | What it does |
|--------|--------|----------------|
| **TextMate** | Grammar in this extension (`syntaxes/libretto.tmLanguage.json`) | Fast regex-based colors (keywords, strings, comments, `B-###`, etc.). Works even if the server is down. |
| **Semantic highlighting** | **LSP** — Xtext exposes `textDocument/semanticTokens` | Colors from the real parse model (e.g. cross-references, types). The `vscode-languageclient` turns that into extra highlights **on top of** TextMate. |

**To get LSP-driven coloring:** connect the server (status **Libretto Spec**, jar resolves), then ensure semantic highlighting is on. This extension sets `"[librettospec]": { "editor.semanticHighlighting.enabled": true }` by default; you can also set it in **User** settings. Use a theme that supports semantic tokens (most do). To verify: **Developer: Inspect Editor Tokens and Scopes** — the tooltip shows **semantic token type** when the server supplied one.

There is no switch to “only use the server for all coloring” without TextMate; the normal model is TextMate base + semantic refinement. If semantic tokens look subtle, it’s often the theme — try another theme or add `semanticTokenColors` in `settings.json`.

### Do I need to enable or build something in the Xtext (`libretto.spec`) project?

**No extra Maven goal or checkbox.** Building `libretto.spec.ide` (the `*-ls.jar`) is enough: Xtext’s `LanguageServerImpl` already advertises **`semanticTokensProvider`** and the client will call `textDocument/semanticTokens/full` when the editor asks for highlights.

**Why Eclipse can look “more colored” than Cursor:** The Eclipse editor uses Xtext’s **workbench** pipeline (lexer/token highlighting wired in `AbstractLibrettoSpecUiModule`, e.g. `configureHighlightingLexer`). That is **not** the same code path as VS Code’s **LSP semantic tokens**. In Cursor/VS Code you get whatever the **LSP semantic token** implementation maps by default — often similar to keywords/strings and **not** a full custom style unless you add it.

**LibrettoSpec Xtext project:** `libretto.spec.ide` binds `LibrettoSpecSemanticHighlightingCalculator` (see `libretto.spec.ide/LSP-SEMANTIC-TOKENS.md`) so the LSP emits semantic tokens for spec id, behavior/acceptance ids, field label keywords (`property`, green via this extension’s defaults), reference list entries (`variable`), and prose text lists. **Rebuild the `*-ls.jar`** after changing that class. Section/header keywords still come from **TextMate** unless you add more semantic rules; semantic tokens refine ids and field names on top.

**Further customization** is just Java: extend the calculator with more `EClass` / feature handling, or map to other LSP token types your theme styles.

**Sanity check:** `trace: verbose` in extension settings and look for **`textDocument/semanticTokens/full`** in the output. If you see responses with data, the server is doing its part; any “weak” look is client/theme/default mapping, not a skipped build step.

## 1. Build the LSP jar

From the **libretto.spec.parent** repo root:

```bash
mvn -q -pl libretto.spec.ide package -DskipTests
```

Artifact:

`libretto.spec.ide/target/libretto.spec.ide-1.0.0-SNAPSHOT-ls.jar`

(version may differ)

## 2. Install the extension (local folder)

```bash
cd editors/cursor-libretto-lsp
npm install
```

**Cursor**

1. `Cmd+Shift+P` → **Extensions: Install from Path…** (or **Developer: Install Extension from Location…** — wording varies by build).
2. Choose the folder `editors/cursor-libretto-lsp` (the one that contains `package.json`).

**VS Code**

- Same idea: install from the unpacked extension directory, or run `npx @vscode/vsce package` and install the `.vsix`.

## 3. Optional: jar path

If the jar is **not** found automatically (default looks for `../../libretto.spec.ide/target/*-ls.jar` relative to this extension), set in **User** or **Workspace** `settings.json`:

```json
{
  "librettoSpec.languageServer.jarPath": "/absolute/path/to/libretto.spec.ide-1.0.0-SNAPSHOT-ls.jar"
}
```

Or with a workspace root:

```json
{
  "librettoSpec.languageServer.jarPath": "${workspaceFolder}/libretto.spec.ide/target/libretto.spec.ide-1.0.0-SNAPSHOT-ls.jar"
}
```

Use **Java 21+** (match the Tycho project). Override if needed:

```json
{
  "librettoSpec.languageServer.javaPath": "/usr/libexec/java_home -v 21 --exec java"
}
```

(Use a real `java` path; the above is illustrative.)

## 4. Open a `.libretto` file

The extension registers the language id **`librettospec`** for `*.libretto` and contributes **`configurationDefaults`** so `*.libretto` → `librettospec` unless your **User** or **Workspace** settings override `files.associations` (user settings win over extension defaults).

- **Auto-fix on open** (default on): if a `.libretto` file opens as Plain Text or another language, the extension sets **`librettospec`** so the LSP can attach. Turn off with `"librettoSpec.autoSetLanguageForDotLibretto": false` if you really want another language on that extension.
- **Manual fix**: Command Palette → **Libretto Spec: Use Libretto Spec language for this file** (also activates the extension if it wasn’t loaded yet).
- **Workspace with existing `.libretto` files**: the extension activates when the folder contains `**/*.libretto`, so language handling runs even before you pick the right mode once.

After install, open a `.libretto` file; the LSP should start when the jar resolves (see §3).

### Problems / validation missing in Cursor (but Eclipse works)

1. **Language mode** — Status bar should show **Libretto Spec** (`librettospec`). If you still see Plain Text, check **User** `settings.json` for `"files.associations": { "*.libretto": "..." }` and remove or change it to `"librettospec"`, or run the command **Libretto Spec: Use Libretto Spec language for this file**.
2. **Rebuild the jar** — Eclipse uses workspace plugins; Cursor uses `*-ls.jar`. Run `mvn -pl libretto.spec.ide package` after validator/grammar changes and point `librettoSpec.languageServer.jarPath` at the new jar.
3. **Trace diagnostics** — In settings, set `"librettoSpec.languageServer.trace": "verbose"` and optionally `"librettoSpec.languageServer.logDiagnostics": true`. Open **View → Output → Libretto Spec LSP**: you should see LSP traffic including `textDocument/publishDiagnostics`. If that notification never appears, the server isn’t publishing (jar/workspace issue). If it appears with a non‑zero count but there are no squiggles, it’s a client/URI issue (this extension aligns URIs to open editors when paths match).
4. **Workspace** — Open a folder (not only a loose file) so `rootUri` / workspace folders match what Xtext expects, especially in multi-root workspaces.
