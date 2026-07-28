(ns kotoba.capability.ledger.append
  "Importable contract for ledger/append.")

(def manifest
  {:schema "kotoba.capability.repository.v1", :capability/version 1, :capability/dependencies #{}, :capability/imports #{:host-i64-roundtrip}, :authority "kotoba-lang/kotoba-core-contracts", :capability/default-policy :autonomous, :capability/artifact {:format :wasm-component, :digest-required? true, :signature-required? true}, :capability/radicle-rid nil, :capability/repository "kotoba-lang/capability-ledger-append", :capability/id "ledger/append", :capability/effects #{:integrity-record :storage-write}, :capability/provider-status :contract-only})
