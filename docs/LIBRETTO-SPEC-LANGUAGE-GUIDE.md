# Libretto spec language guide

Libretto is a **structured specification language** for `.libretto` files. It describes module metadata, dependencies, prose placement, behaviors, acceptance tests, and cross-cutting architecture surfaces (operation surface, implements, boundaries).

This guide matches the **Xtext grammar** in `libretto.spec` (`LibrettoSpec.xtext`) and the parallel **ANTLR** grammar in the `libretto` repo (`libretto-language/.../LibrettoSpec.g4`).

---

## Design principles

1. **Loose syntax, strong validation** — Many fields are optional in the grammar so partial documents still parse. Tools enforce required fields and coherence with explicit **issue codes** (e.g. `MISSING_BEHAVIOR_SOURCE`, `DUPLICATE_NESTED_FIELD`).
2. **Order independence** — Top-level sections can appear in any order. Inside each record, child fields/blocks can appear in any order unless your house style says otherwise.
3. **Grammar vs validation** — The grammar allows **any number** of items of each kind in a body (e.g. multiple `source` blocks). Validators typically require **at most one** of each logical field per record (`DUPLICATE_NESTED_FIELD`).
4. **One block per section keyword** — You may only have **one** `metadata { }`, one `behaviors { }`, etc. per file (`DUPLICATE_TOP_LEVEL_SECTION`).

---

## Lexical rules

| Kind | Rule |
|------|------|
| **Whitespace** | Ignored between tokens. |
| **Comments** | `//` line comments and `/* … */` block comments (Xtext common terminals). |
| **Identifier (`LIBRETTO_ID`)** | Optional **`^`**, then a letter or `_`, then letters, digits, `_`, `-`, or `\`. The leading **`^`** escapes a token that would otherwise match a keyword (same idea as Xtext Common Terminals `ID`). |
| **String** | Standard quoted strings (with escapes as supported by the host grammar). |
| **Text block** | Triple-quoted `""" … """` for multi-line text (`TEXT_BLOCK`). |
| **Text values** | Any field typed as text accepts **either** a string or a `TEXT_BLOCK`. |

---

## Document shape

Every file is one **spec** whose name should match your module id convention:

```text
spec MyModuleId {
  // one or more sections (see below)
}
```

- **`spec`** — keyword.  
- **`MyModuleId`** — `LIBRETTO_ID`: the **canonical spec id** for the file (not repeated under `metadata`). Validators may require a `metadata { }` block with `status`, `module`, and `package` (`MISSING_METADATA_*`).

---

## Top-level sections

Each section is a **keyword** followed by `{ … }`. All are optional at parse time; your pipeline may require a subset (e.g. Lumiscape requires a `metadata` block with `status`, `module`, and `package` — see `MISSING_METADATA_*` issue codes).

| Section keyword | Contents |
|-----------------|----------|
| `metadata` | `MetadataField` entries |
| `dependencies` | `dependency` records |
| `references` | `reference` records |
| `prose` | `section_context` / `subsection_context` records |
| `out_of_scope` | `out_of_scope_item` records |
| `operation_surface` | `operation` records |
| `implements_surface` | `implements` records |
| `boundary_exports` | `boundary` records |
| `boundary_imports` | `boundary` records |
| `behaviors` | `behavior` records |
| `acceptance_tests` | `acceptance_test` records |
| `implementation_directives` | `implementation_directive` records |

---

## Metadata

The **spec id** is only the root `spec <id> {` token — it is not repeated inside `metadata`.

Inside `metadata { }`, each line is one of:

| Field | Type |
|-------|------|
| `title` | Text |
| `version` | Text |
| `status` | **`draft`** or **`public`** (grammar enum) |
| `module` | Text (required by validation for Lumiscape) |
| `package` | Text (required by validation; Java package) |
| `compiled_at` | Text |
| `compiler_version` | Text |
| `model_metadata` | Text |

Example:

```text
metadata {
  title: "ACCOUNT-403b"
  status: public
  module: "account"
  package: "com.lumiscape.account.api"
}
```

---

## Dependencies

```text
dependencies {
  dependency dep_001 {
    target_spec: "OtherSpec"
    notes: "optional"
  }
}
```

- **Header:** `dependency` *id* `{` … `}` — *id* is a `LIBRETTO_ID`.
- **Typical required fields (validation):** `target_spec` only. The `dependencies` section is **architectural edges only**; **authoring conventions** belong in **`references`** (e.g. `type: conventions`, `context: "Conventions"`), not here.
- **Optional in grammar:** `notes`.

---

## References

```text
references {
  reference REF-001 {
    title: "Some title"
    type: conventions
    citation: "path or free text"
    locator: "optional"
    authority_notes: "optional"
    metadata: "optional"
    context: "optional"
  }
}
```

- **Header:** `reference` *id* `{` … `}` — *id* must match **`REF-` + three digits** (`REF-001`).
- **Commonly required:** `title`, `type`, `citation`.
- **Optional:** `locator`, `authority_notes`, `metadata` (keyword is `metadata` in the grammar), `context`.

---

## Prose (`section_context` / `subsection_context`)

Used to pin narrative fragments to template sections.

**Section-level:**

```text
prose {
  section_context {
    section: "Architecture Metadata"
    text: "…"
  }
}
```

**Subsection-level:**

```text
subsection_context {
  section: "Architecture Metadata"
  subsection: "module"
  text: "account"
}
```

---

## Out of scope

```text
out_of_scope {
  out_of_scope_item OOS-001 {
    statement: "…"
  }
}
```

- Item id: **`OOS-` + three digits**.

---

## Behaviors

```text
behaviors {
  behavior B-001 {
    source {
      section: "H2 Title"
      subsection: "optional"
    }
    actor: system
    action: return
    objects: [ id1, id2 ]
    reads: []
    writes: []
    conditions: [ "…" ]
    outcomes: [ "…" ]
    label: "optional"
    references: [ REF-001 ]
    notes: "optional"
    context: "optional"
    dependencies: [ dep_001 ]
  }
}
```

- **Header:** `behavior` *id* — *id* is **`B-` + three digits** (`B-001`).
- **Required (validation):** `source` (with inner `section`), `actor`, `action`, `objects`, `reads`, `writes`, `conditions`, `outcomes`.
- **Lists:** `IdentifierList` uses `[ a, b ]` (commas between identifiers). `TextList` uses quoted text entries. `ReferenceIdList` uses `REF-xxx` entries.

### `source` block

```text
source {
  section: "Required section title"
  subsection: "Optional"
}
```

At least **`section`** is required by validation; **`subsection`** is optional. Only one `section` / `subsection` pair should appear per `source` block (duplicate nested fields are errors).

---

## Operation surface

Declares named operations for deterministic coherence (linking behaviors ↔ API-style surface ↔ tests).

```text
operation_surface {
  operation my_op_id {
    operation_expression: "expression text"
    outcome_class: returns
  }
}
```

- **`outcome_class`:** `returns` or `rejects` (enum `OutcomeClassValue`).

---

## Implements surface

```text
implements_surface {
  implements target_spec: "SomeSpec"
  implements target_spec: "OtherSpec"
}
```

Each line is **`implements`** followed by **`target_spec:`** and a text value. Validation ties targets to `dependencies` and expects consistency with `operation_surface` when applicable.

---

## Boundary exports / imports

```text
boundary_exports {
  boundary {
    spec_id: "ConsumerSpec"
    operation_id: "some_operation"
    profile_id: "optional"
    raw: "optional"
  }
}
```

Same shape for `boundary_imports`. Validation checks `spec_id`, `operation_id`, known operations, and duplicate targets.

---

## Acceptance tests

```text
acceptance_tests {
  acceptance_test AT-001 {
    source { section: "…" }
    validates: [ B-001, B-002 ]
    preconditions: [ "…" ]
    actions: [ "…" ]
    assertions: [ "…" ]
    title: "optional"
    references: [ REF-001 ]
    notes: "optional"
    context: "optional"
  }
}
```

- **Header:** **`AT-` + three digits**.
- **Required (validation):** `source`, `validates`, `preconditions`, `actions`, `assertions`.
- **`validates`:** list of **behavior ids** (`B-xxx`).

---

## Implementation directives

```text
implementation_directives {
  implementation_directive ID-001 {
    source { section: "…" }
    applies_to: [ layer1, layer2 ]
    strength: required
    directive: "…"
    category: optional_id
    constraints: [ "…" ]
    allowed_flexibility: [ "…" ]
    references: [ REF-001 ]
    rationale: "optional"
    context: "optional"
  }
}
```

- **Header:** **`ID-` + three digits**.
- **`strength`:** one of `required`, `strongly_preferred`, `preferred`, `advisory`.

---

## Shared value types

| Syntax | Meaning |
|--------|---------|
| `[ ]` | Empty list |
| `[ a, b.c, d ]` | Identifier list (elements are ids or dotted ids) |
| `[ "a", "b" ]` | Text list |
| `[ B-001, B-002 ]` | Behavior id list |
| `[ REF-001 ]` | Reference id list |

---

## Condition hints (behaviors)

For tooling that analyzes **operation surface coherence**, behavior `conditions` entries may use patterns understood by the validator, e.g. text containing:

```text
operation = <expression>
```

so that behavior conditions align with `operation_expression` values in `operation_surface`. Exact rules are enforced by `LibrettoSpecValidator` / `LibrettoTextValidator` in the toolchain.

---

## Validation and tooling

- **Xtext / Eclipse / LSP:** built from `libretto.spec.parent` (see root `README.md`).
- **CLI / ANTLR tree:** `libretto` project mirrors grammar and applies aligned checks.
- Diagnostics for **missing** or **duplicate** structure are generally **anchored on the parent grammar keyword** (e.g. `behavior`, `dependency`, `spec`) for clearer editing UX.

---

## Minimal skeleton

```text
spec Example {
  metadata {
    spec_id: "Example"
    title: "Example"
    status: draft
  }
  dependencies { }
  references { }
  prose { }
  out_of_scope { }
  operation_surface { }
  implements_surface { }
  boundary_exports { }
  boundary_imports { }
  behaviors { }
  acceptance_tests { }
  implementation_directives { }
}
```

Omit sections you do not use; your validator profile may still require metadata and other fields for publication.

---

## See also

- `libretto.spec/src/com/robenglander/libretto/spec/LibrettoSpec.xtext` — canonical grammar
- `libretto.spec/src/com/robenglander/libretto/spec/validation/LibrettoSpecValidator.java` — issue codes and coherence rules
