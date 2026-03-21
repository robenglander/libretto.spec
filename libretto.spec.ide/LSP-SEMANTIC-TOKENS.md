# LSP semantic tokens (VS Code / Cursor)

`textDocument/semanticTokens/full` is implemented by Xtext’s `SemanticTokensService`, which reads positions from `ISemanticHighlightingCalculator`.

This project binds **`LibrettoSpecSemanticHighlightingCalculator`** in `LibrettoSpecIdeModule` via a public **`bindISemanticHighlightingCalculator()`** method (no `@Override`: it is not declared on `DefaultIdeModule`; Xtext’s `AbstractGenericModule` discovers `bind*` methods by reflection). It maps LibrettoSpec AST features to **LSP semantic token type names** (same strings as `org.eclipse.lsp4j.SemanticTokenTypes`), for example:

| Model area            | LSP token type   |
|-----------------------|------------------|
| `spec` id             | `namespace`      |
| Record `id` attributes | `enumMember`    |
| `BehaviorIdList.values` | `enumMember`  |
| Field label keyword (first token before `:` on `*Field` rules) | `property` |
| `ReferenceIdList.values` | `variable`   |
| `TextList.values`     | `string`         |

The Cursor/VS Code extension sets **`property`** to green (`#3fb950`) for `[librettospec]` only so field names stand out while section keywords stay on the TextMate grammar colors.

**No MWE2 fragment is required** — highlighting is plain Java in `src/`, shipped inside the shaded `*-ls.jar`.

After changing the calculator, rebuild:

```bash
mvn -pl libretto.spec.ide package -DskipTests
```

In the editor, enable semantic highlighting for `[librettospec]` (the Cursor/VS Code extension sets this by default) and use **Developer: Inspect Editor Tokens and Scopes** to see semantic token types.
