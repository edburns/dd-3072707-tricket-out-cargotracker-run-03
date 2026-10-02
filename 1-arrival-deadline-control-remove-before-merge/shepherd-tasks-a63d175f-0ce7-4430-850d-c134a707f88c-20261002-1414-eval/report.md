# Shepherd Campaign Evaluation

- **Arm:** `control`
- **Campaign:** `a63d175f-0ce7-4430-850d-c134a707f88c`
- **Evaluator:** `0.3.1` at `6f14b5b41c74aea438c50794ee01ef6d496c922e`
- **Evaluator worktree dirty:** true
- **Generated:** 2026-10-02T22:05:56.476018Z

## Headline findings

| Task | PR | First product-defect detection | Product defects | Nonzero exits | CCRA rounds | CCRA comments | Flaky tests |
|---:|---:|---|---:|---:|---:|---:|---:|
| 2 | 7 | ci | 1 | 3 | 1 | 0 | 0 |
| 3 | 8 | ci | 5 | 4 | 1 | 0 | 0 |
| 4 | 9 | stage_30_gate | 3 | 5 | 2 | 1 | 0 |
| 5 | 10 | stage_30_gate | 1 | 6 | 1 | 0 | 0 |
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

- CI tests run: unavailable (`unavailable`)
- Partial output: 4604076 Unicode code points / 4604101 UTF-16 code units
- Skill content verification: `unverified`; telemetry hashes identify skill names, not content

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
