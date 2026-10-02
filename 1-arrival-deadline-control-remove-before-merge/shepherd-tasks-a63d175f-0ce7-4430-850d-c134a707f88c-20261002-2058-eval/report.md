# Shepherd Campaign Evaluation

- **Arm:** `treatment`
- **Campaign:** `a63d175f-0ce7-4430-850d-c134a707f88c`
- **Evaluator:** `0.4.2` at `2087de454b90ed4f0cba03d836512c86a00c47c4`
- **Evaluator worktree dirty:** false
- **Generated:** 2026-10-02T22:53:21.293493Z

## Headline findings

| Task | PR | First product-defect detection | Product defects | Nonzero exits | CCRA rounds | CCRA comments | Flaky tests |
|---:|---:|---|---:|---:|---:|---:|---:|
| 6 | 11 | none detected | 0 | 1 | 1 | 0 | 0 |

## Cost and timing

- Campaign wall clock: 0h 12m 25s
- Recorded session time: 0h 10m 01s
- JSONL exact session time: 601409 ms (409 ms above second-truncated Markdown headers)
- Orchestration overhead: 0h 02m 24s
- CCA wait proxy: 0 polls / 0h 00m 00s elapsed; 0h 00m 00s configured ceiling
- AIU: 117.26074
- Premium requests: 2

## Evidence and run invariants

- CI tests run: unavailable (`unavailable`)
- Partial output: 1439103 Unicode code points / 1439112 UTF-16 code units
- Skill content verification: `unverified`; telemetry hashes identify skill names, not content

## Acceptance checks

| Check | Status | Observed |
|---|---|---|
| maven_project_root_recorded | **pass** | `{"f586a46fdbe252b57b2cf473361256cc8e225361":"demo","f3214c3e56cb2cf55c9d2d78dad9920812640b8d":"demo","0f9cebb0aed65a80c215270ee73fa2d584a9e0ef":"demo"}` |
| cross_repo_start_equivalence | **pass** | `` |
| ci_and_build_gates_classified | **pass** | `{"formatting":{"status":"present","entryCount":4},"static_analysis":{"status":"present","entryCount":5},"compiler":{"status":"present","entryCount":2},"unit_tests":{"status":"present","entryCount":8},"container_tests":{"status":"present","entryCount":2},"ci_other":{"status":"present","entryCount":73}}` |
| product_defect_gate_and_class_non_null | **pass** | `true` |
| guardrail_failures_not_unclassified | **pass** | `[]` |
| ci_test_log_availability_semantics | **pass** | `{"availability":"unavailable","testsExecuted":null,"testsRun":null,"reason":"No conclusive CI test execution evidence was found."}` |
| combined_attempts_preserved | **pass** | `["/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-20261002-2058"]` |

## Start equivalence and confounds

Cross-repository start comparison was not requested.

## Defect interpretation

See `defects.csv` for one row per deduplicated defect, including defect class, item count, local/CI location, timestamp source, ancestry-verified fix, and anomalies.

Style and static-analysis findings are detectable only where the corresponding gate exists; they are excluded from arm-comparison conclusions when either arm reports that gate as `not_present`.

## Post-mortem agent cost

- AIU: 94.20882
- Premium requests: 1
- Tokens: unavailable

## Reference reconciliation

No built-in acceptance profile applies to this campaign.

## Trust assessment

- **Trustworthy:** manifest timing, session counts, transcript durations, exact JSONL durations, nonzero exit counts, JSONL AIU/premium/model/tool counts, JSONL partial-output cross-checks, run invariants, and cumulative OTEL tokens.
- **Approximate:** command-to-head correlation when a transcript does not emit a full SHA, agent-action labels, rule-based defect deduplication, and CCA wait as a latency proxy.
- **Manual review:** all entries in `unclassified.md`, confirmed evidence gaps, and remote CCA/CCRA internal cost because those internals are absent.

## Experiment interpretation

- Detection stage should be presented per defect and descriptively; a small number of product defects per run does not support significance claims.
- Local AIU and tokens include Shepherd waiting/polling activity; CCA wait is reported separately because remote CCA internals are unavailable.
- Enabling tests in the treatment is a disclosed intervention, not evaluator-detected control-arm tampering.
- If the treatment raises the Java release level, disclose that it also removes the JDK-25/source-7 operational failure mode.
- Test-tampering metrics are comparable only within an arm where tests run by default; the control arm is `not_meaningful`, so this is not a between-arm tampering comparison.

## Remaining unclassified

- None.
