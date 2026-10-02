# Unclassified Campaign Evidence

- **Arm:** `treatment`
- **Evaluator:** `0.3.1` at `6f14b5b41c74aea438c50794ee01ef6d496c922e`

## event-0016 — task #2, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-141418-2.md:773`

```text
<details>
<summary>19 lines</summary>

```
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37019709398/job/110879713507	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37019709124/job/110879724559	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37019709398/job/110879713507	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37019709124/job/110879724559	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37019709398/job/110879713507	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37019709124/job/110879724559	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

formatting	fail	24s	https://github.com
…
```

## event-0017 — task #2, stage 30

- Kind: `build_failure`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-141418-2.md:831`

```text
<details>
<summary>88 lines</summary>

```diff
formatting	Check formatting	﻿2026-10-02T14:26:12.8027297Z ##[group]Run ./mvnw spotless:check
formatting	Check formatting	2026-10-02T14:26:12.8027695Z ^[[36;1m./mvnw spotless:check^[[0m
formatting	Check formatting	2026-10-02T14:26:12.8256059Z shell: /usr/bin/bash -e {0}
formatting	Check formatting	2026-10-02T14:26:12.8256349Z env:
formatting	Check formatting	2026-10-02T14:26:12.8256632Z   JAVA_HOME: /opt/hostedtoolcache/Java_Microsoft_jdk/17.0.19/x64
formatting	Check formatting	2026-10-02T14:26:12.8257229Z   JAVA_HOME_17_X64: /opt/hostedtoolcache/Java_Microsoft_jdk/17.0.19/x64
formatting	Check formatting	2026-10-02T14:26:12.8257561Z   MAVEN_ARGS: -ntp
formatting	Check formatting	2026-10-02T14:26:12.8257795Z ##[endgroup]
formatting	Check formatting	2026-10-02T14:26:14.2021682Z [INFO] Scanning for projects...
formatting	Check formatting	2026-10-02T14:26:15.9160453Z [INFO] 
formatting	Check formatting	2026-10-02T14:26:15.9161377Z [INFO] -------------------< org.eclipse.ee4j:cargo-tracker >-------------------
formatting	Check formatting	2026-10-02T14:26:15.9162027Z [INFO] Building Eclipse Cargo Tracker 1.0-SNAPSHOT
formatting	Check formatti
…
```

## event-0019 — task #2, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-141418-2.md:1341`

```text
<details>
<summary>14 lines</summary>

```
Bot comments require inspection:
[
  {
    "author": "Copilot",
    "body": "\n> @copilot Please fix the following issue:\n> \n> ## Issue completion gate: diff scope violation...\n\nReverted the four unintended Maven Wrapper changes; only the three intended Java files remain in the feature diff. Fix committed as `bf4a280`.",
    "html_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/pull/7#issuecomment-5954593483"
  },
  {
    "author": "Copilot",
    "body": "\n> @copilot Please fix the following issue:\n> \n> ## CI Failure: Main Build / formatting...\n\nRan `./mvnw spotless:apply` and verified `./mvnw spotless:check` passes. Only the three permitted Java files were changed; the focused five-test Open Liberty suite passes. Formatting fix committed as `e74be0e`.",
    "html_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/pull/7#issuecomment-5954686395"
  }
]
<shellId: 25 completed with exit code 1>
```

</details>
```

## event-0025 — task #3, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-145748-3.md:824`

```text
<details>
<summary>27 lines</summary>

```
[
  {
    "name": "build",
    "status": "completed",
    "conclusion": "skipped",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37024901644/job/110897629481"
  },
  {
    "name": "source-gates",
    "status": "completed",
    "conclusion": "skipped",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37024901644/job/110897627603"
  },
  {
    "name": "formatting",
    "status": "completed",
    "conclusion": "failure",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37024901644/job/110897430500"
  },
  {
    "name": "Shepherd task Cargo Tracker",
    "status": "completed",
    "conclusion": "success",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37024901014/job/110897429765"
  }
]
<shellId: 12 completed with exit code 7>
```

</details>
```

## event-0027 — task #3, stage 30

- Kind: `build_failure`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-145748-3.md:902`

```text
<details>
<summary>89 lines</summary>

```diff
=== RUN 37024901644 ===
formatting	Check formatting	﻿2026-10-02T15:10:25.6423744Z ##[group]Run ./mvnw spotless:check
formatting	Check formatting	2026-10-02T15:10:25.6424145Z ^[[36;1m./mvnw spotless:check^[[0m
formatting	Check formatting	2026-10-02T15:10:25.6604856Z shell: /usr/bin/bash -e {0}
formatting	Check formatting	2026-10-02T15:10:25.6605159Z env:
formatting	Check formatting	2026-10-02T15:10:25.6605455Z   JAVA_HOME: /opt/hostedtoolcache/Java_Microsoft_jdk/17.0.19/x64
formatting	Check formatting	2026-10-02T15:10:25.6605899Z   JAVA_HOME_17_X64: /opt/hostedtoolcache/Java_Microsoft_jdk/17.0.19/x64
formatting	Check formatting	2026-10-02T15:10:25.6606243Z   MAVEN_ARGS: -ntp
formatting	Check formatting	2026-10-02T15:10:25.6606485Z ##[endgroup]
formatting	Check formatting	2026-10-02T15:10:27.1350980Z [INFO] Scanning for projects...
formatting	Check formatting	2026-10-02T15:10:28.6367023Z [INFO] 
formatting	Check formatting	2026-10-02T15:10:28.6368030Z [INFO] -------------------< org.eclipse.ee4j:cargo-tracker >-------------------
formatting	Check formatting	2026-10-02T15:10:28.6369181Z [INFO] Building Eclipse Cargo Tracker 1.0-SNAPSHOT
f
…
```

## event-0028 — task #3, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-145748-3.md:1144`

```text
<details>
<summary>27 lines</summary>

```
[
  {
    "name": "build",
    "status": "completed",
    "conclusion": "failure",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37025616663/job/110900663192"
  },
  {
    "name": "source-gates",
    "status": "completed",
    "conclusion": "success",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37025616663/job/110900148370"
  },
  {
    "name": "Shepherd task Cargo Tracker",
    "status": "completed",
    "conclusion": "success",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37025616732/job/110899945195"
  },
  {
    "name": "formatting",
    "status": "completed",
    "conclusion": "success",
    "details_url": "https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37025616663/job/110899936447"
  }
]
<shellId: 18 completed with exit code 7>
```

</details>
```

## event-0034 — task #3, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-145748-3.md:1760`

```text
```
jq: error: $sub is not defined at <top-level>, line 1:
{head:$head,state:$state,draft:$draft,base:$base,latestWorkStarted:$start,latestWorkFinished:$finish,changedFiles:$changed,fileCount:$files,reviewDecision:$decision,unresolvedThreads:$unresolved,pendingChecks:$pending,failingChecks:$failing,substantiveSuccessfulChecks:$sub,headStable:true}                                                                                                                                                                                                                                                                             
jq: 1 compile error
<shellId: 32 completed with exit code 3>
```
```

## event-0007 — task #4, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-155708-4.md:1697`

```text
<details>
<summary>68 lines</summary>

```
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37031874286/job/110921056475	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37031874226/job/110921050813	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37031874286/job/110921056475	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37031874226/job/110921050813	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37031874286/job/110921056475	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37031874226/job/110921050813	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	
…
```

## event-0021 — task #4, stage 40

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase2-task-20261002-164228-4.md:1567`

```text
<details>
<summary>25 lines</summary>

```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.eclipse.ee4j:cargo-tracker >-------------------
[INFO] Building Eclipse Cargo Tracker 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- spotless:2.43.0:apply (default-cli) @ cargo-tracker ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.224 s
[INFO] Finished at: 2026-10-02T16:46:28Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply (default-cli) on project cargo-tracker: Execution default-cli of goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply failed: Cannot find git repository in any parent directory -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more inf
…
```

## event-0022 — task #4, stage 40

- Kind: `build_failure`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase2-task-20261002-164228-4.md:1567`

```text
<details>
<summary>25 lines</summary>

```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.eclipse.ee4j:cargo-tracker >-------------------
[INFO] Building Eclipse Cargo Tracker 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- spotless:2.43.0:apply (default-cli) @ cargo-tracker ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.224 s
[INFO] Finished at: 2026-10-02T16:46:28Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply (default-cli) on project cargo-tracker: Execution default-cli of goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply failed: Cannot find git repository in any parent directory -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more inf
…
```

## event-0023 — task #4, stage 40

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase2-task-20261002-164228-4.md:1808`

```text
<details>
<summary>25 lines</summary>

```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.eclipse.ee4j:cargo-tracker >-------------------
[INFO] Building Eclipse Cargo Tracker 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- spotless:2.43.0:apply (default-cli) @ cargo-tracker ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.498 s
[INFO] Finished at: 2026-10-02T16:46:49Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply (default-cli) on project cargo-tracker: Execution default-cli of goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply failed: Cannot find git repository in any parent directory -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more inf
…
```

## event-0024 — task #4, stage 40

- Kind: `build_failure`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase2-task-20261002-164228-4.md:1808`

```text
<details>
<summary>25 lines</summary>

```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------------< org.eclipse.ee4j:cargo-tracker >-------------------
[INFO] Building Eclipse Cargo Tracker 1.0-SNAPSHOT
[INFO]   from pom.xml
[INFO] --------------------------------[ war ]---------------------------------
[INFO] 
[INFO] --- spotless:2.43.0:apply (default-cli) @ cargo-tracker ---
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.498 s
[INFO] Finished at: 2026-10-02T16:46:49Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply (default-cli) on project cargo-tracker: Execution default-cli of goal com.diffplug.spotless:spotless-maven-plugin:2.43.0:apply failed: Cannot find git repository in any parent directory -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more inf
…
```

## event-0001 — task #5, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-171627-5.md:1159`

```text
<details>
<summary>68 lines</summary>

```
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37042014289/job/110954847705	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37042014142/job/110954844377	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37042014289/job/110954847705	
formatting	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37042014142/job/110954844377	
Refreshing checks status every 10 seconds. Press Ctrl+C to quit.

source-gates	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37042014142/job/110955023267	
formatting	pass	24s	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs/37042014142/job/110954844377	
Shepherd task Cargo Tracker	pending	0	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/actions/runs
…
```

## event-0004 — task #5, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-171627-5.md:2168`

```text
```
Traceback (most recent call last):
  File "<stdin>", line 20, in <module>
AssertionError
<shellId: 36 completed with exit code 1>
```
```

## event-0005 — task #5, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-171627-5.md:2363`

```text
```
Traceback (most recent call last):
  File "<stdin>", line 20, in <module>
AssertionError
<shellId: 43 completed with exit code 1>
```
```

## event-0006 — task #5, stage 30

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase1-task-20261002-171627-5.md:3171`

```text
```

<shellId: 66 completed with exit code 1>
```
```

## event-0012 — task #5, stage 40

- Kind: `nonzero_tool_exit`
- Detection gate: `null`
- Reason: No deterministic product, operational, or infrastructure rule matched.
- Artifact: `phase2-task-20261002-182521-5.md:1214`

```text
```
{"baseRefName":"edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control","headRefOid":"a4ed0b3dde3676f5880052db65fe2e729d32e7f0","isDraft":false,"mergeable":"MERGEABLE","state":"OPEN"}
unresolved_threads=0
no required checks reported on the 'copilot/44-implement-primefaces-deadline-dialog' branch
<shellId: 5 completed with exit code 1>
```
```

