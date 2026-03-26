# Libretto Project Profile — Cursor / VS Code LSP

Connects **Cursor** or **VS Code** to the same Xtext **shaded language server** (`libretto.spec.ide-*-ls.jar`) used by Libretto Spec. That jar registers **both** LibrettoSpec and LibrettoProjectProfile; this extension only attaches the client to **`librettoprofile`** / `*.lpp`, with its own grammar and settings namespace **`librettoProfile.*`**.

Install **alongside** [`../cursor-libretto-lsp`](../cursor-libretto-lsp) if you edit both `.libretto` and `.lpp` files. That starts **two JVM processes** (one per extension), each running the same jar — acceptable for development; alternatively you could use a single combined extension if you prefer one process.

## Build the LSP jar

From **libretto.spec.parent** root:

```bash
mvn -q -pl libretto.spec.ide package -DskipTests
```

## Install this extension

```bash
cd editors/cursor-libretto-profile-lsp
npm install
```

Then **Install from Path** / **Install Extension from Location** and choose this folder.

## Settings

Default jar resolution: `../../libretto.spec.ide/target/*-ls.jar` from this extension directory.

Override if needed:

```json
{
  "librettoProfile.languageServer.jarPath": "${workspaceFolder}/libretto.spec.ide/target/libretto.spec.ide-1.0.0-SNAPSHOT-ls.jar"
}
```

- **Output channel:** Libretto Project Profile LSP  
- **Repair language mode:** Command palette → **Libretto Project Profile: Use profile language for this file**

Semantic token colors are set under `[librettoprofile]` in this extension’s `configurationDefaults` (see `package.json`).
