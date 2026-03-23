# Libretto Spec (Xtext)

## Language guide

Authoring reference for `.libretto` syntax (sections, records, ids, lists): **[docs/LIBRETTO-SPEC-LANGUAGE-GUIDE.md](docs/LIBRETTO-SPEC-LANGUAGE-GUIDE.md)**.

## Build (Tycho)

Always run Maven from **this directory** (`libretto.spec.parent`), not from a submodule path alone.

```bash
# Full reactor
mvn clean install -DskipTests

# Language server jar only (after the change to file-based target definition)
mvn -pl libretto.spec.ide -am package -DskipTests
```

### `Could not resolve target platform specification artifact libretto.spec:libretto.spec.target`

The parent POM uses a **file** reference to `libretto.spec.target/libretto.spec.target.target` via `${maven.multiModuleProjectDirectory}`, so Tycho does **not** require `libretto.spec.target` to be installed into `~/.m2` first.

You **must run Maven from the repo root** (`libretto.spec.parent`) so `maven.multiModuleProjectDirectory` points at that directory. If you ever need a custom path:

```bash
mvn -Dlibretto.spec.tycho.target.file=/absolute/path/to/libretto.spec.target.target ...
```

If you still see an **artifact** resolution error, update `pom.xml` from this repo (older setups referenced the target as a Maven `<artifact>`).

### Apple Silicon (aarch64)

The parent `pom.xml` only lists `x86_64` Tycho environments. If builds fail on macOS ARM, add an `aarch64` environment next to the existing `macosx/cocoa` entry in `tycho-target-platform-configuration`.
