# Shepherd Campaign Evaluation

- **Arm:** `treatment`
- **Campaign:** `a63d175f-0ce7-4430-850d-c134a707f88c`
- **Evaluator:** `0.4.2` at `2087de454b90ed4f0cba03d836512c86a00c47c4`
- **Evaluator worktree dirty:** false
- **Generated:** 2026-10-02T22:52:34.897340Z

## Headline findings

| Task | PR | First product-defect detection | Product defects | Nonzero exits | CCRA rounds | CCRA comments | Flaky tests |
|---:|---:|---|---:|---:|---:|---:|---:|
| 2 | 7 | formatting | 4 | 3 | 1 | 0 | 0 |
| 3 | 8 | formatting | 8 | 4 | 1 | 0 | 0 |
| 4 | 9 | formatting | 9 | 5 | 2 | 1 | 0 |
| 5 | 10 | formatting | 3 | 6 | 1 | 0 | 0 |
| 6 | unavailable | stage_30_gate | 1 | 1 | 0 | 0 | 0 |

## Cost and timing

- Campaign wall clock: 5h 18m 10s
- Recorded session time: 4h 03m 10s
- JSONL exact session time: 14595016 ms (5016 ms above second-truncated Markdown headers)
- Orchestration overhead: 1h 15m 00s
- CCA wait proxy: 5 polls / 0h 22m 29s elapsed; 0h 50m 00s configured ceiling
- AIU: 933.82312
- Premium requests: 9

## Evidence and run invariants

- CI tests run: unavailable (`measured`)
- Partial output: 4604076 Unicode code points / 4604101 UTF-16 code units
- Skill content verification: `unverified`; telemetry hashes identify skill names, not content

## Acceptance checks

| Check | Status | Observed |
|---|---|---|
| maven_project_root_recorded | **pass** | `{"a6c5a1dd5b71372279741aa220794b59d01d6755":"demo","8570382224bc143d17aaac1534558f478fd20e91":"demo","e74be0ea977570bf607db4d623203a2a31b7c049":"demo","a5f22af5a81acd6ebce718625642ae23efde00eb":"demo","fd68cb3bd80da15cd982cba2980b40a00ca61c48":"demo","a4ed0b3dde3676f5880052db65fe2e729d32e7f0":"demo"}` |
| cross_repo_start_equivalence | **pass** | `` |
| ci_and_build_gates_classified | **pass** | `{"formatting":{"status":"present","entryCount":4},"static_analysis":{"status":"present","entryCount":5},"compiler":{"status":"present","entryCount":2},"unit_tests":{"status":"present","entryCount":8},"container_tests":{"status":"present","entryCount":2},"ci_other":{"status":"present","entryCount":73}}` |
| product_defect_gate_and_class_non_null | **pass** | `true` |
| guardrail_failures_not_unclassified | **pass** | `[]` |
| ci_test_log_availability_semantics | **pass** | `{"availability":"measured","testsExecuted":null,"testsRun":null,"source":"CI logs were captured but contained no Surefire/Failsafe summary."}` |
| combined_attempts_preserved | **pass** | `["/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-20261002-1414"]` |

## Start equivalence and confounds

Cross-repository start comparison was not requested.

## Defect interpretation

See `defects.csv` for one row per deduplicated defect, including defect class, item count, local/CI location, timestamp source, ancestry-verified fix, and anomalies.

Style and static-analysis findings are detectable only where the corresponding gate exists; they are excluded from arm-comparison conclusions when either arm reports that gate as `not_present`.

## Post-mortem agent cost

- AIU: 84.46766
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

- `event-0037`: No deterministic product, operational, or infrastructure rule matched.
- `event-0005`: No deterministic product, operational, or infrastructure rule matched.
- `event-0006`: No deterministic product, operational, or infrastructure rule matched.
- `event-0007`: No deterministic product, operational, or infrastructure rule matched.
- `event-0014`: No deterministic product, operational, or infrastructure rule matched.
