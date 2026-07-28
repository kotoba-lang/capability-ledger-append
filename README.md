# capability-ledger-append

Atomic authority package for `ledger/append`.

- imports: `#{:host-i64-roundtrip}`
- effects: `#{:integrity-record :storage-write}`
- default policy: `:autonomous`
- provider status: `contract-only`

Importing this package does not grant runtime authority. Tamaki must
request it explicitly and Kototama must admit the sealed envelope.

```sh
clojure -M:test
```
