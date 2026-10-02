# Shepherd Campaign Evaluation

- **Arm:** `control`
- **Campaign:** `a63d175f-0ce7-4430-850d-c134a707f88c`
- **Evaluator:** `0.3.1` at `6f14b5b41c74aea438c50794ee01ef6d496c922e`
- **Evaluator worktree dirty:** true
- **Generated:** 2026-10-02T22:06:40.678169Z

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
