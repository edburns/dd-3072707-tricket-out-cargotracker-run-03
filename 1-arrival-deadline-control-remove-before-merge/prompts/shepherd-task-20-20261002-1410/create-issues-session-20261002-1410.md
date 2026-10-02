# Copilot CLI Session

> [!NOTE]
> - **Session ID:** `42f9477b-feee-427b-b075-75797ae3b8f3`  
> - **Started:** 10/2/2026, 2:10:05 PM  
> - **Duration:** 2m 28s  
> - **Exported:** 10/2/2026, 2:12:33 PM  

---

<sub>2s</sub>

### User

Invoke skill `shepherd-task-20-create-issues-from-plan` with these inputs:

- CAMPAIGN_ID: a63d175f-0ce7-4430-850d-c134a707f88c
- LESSON_PROPAGATION: off
- REPO: edburns/dd-3072707-tricket-out-cargotracker-run-03
- BASE_BRANCH: edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control
- PARENT_ISSUE: 1
- PLAN_DIRECTORY: 1-arrival-deadline-control-remove-before-merge
- PLAN_FILE_NAME: add-change-arrival-deadline-feature-ignorance-reduction-plan.md
- QUESTIONS_SECTION: ## Phase 3 — Ignorance reduction: questions to answer before writing code
- IMPLEMENTATION_SECTION: ## Phase 4 — Implementation (five serial issues)
- EXPECTED_TASK_COUNT: 5
- BASE_REMOTE: origin
- LOG_DIRECTORY: /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410
- DRAFT_VALIDATOR: /home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh
- ISSUE_BODY_VERIFIER: /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh
- CHILD_LINK_VERIFIER: /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh

Fixture pagination response contract (mandatory):

- `gh api ... --paginate --slurp` returns a JSON array of page payloads, so a
  one-page response has the shape `[[{...}]]`, not `[{...}]`.
- Before indexing child issue fields such as `.id`, normalize the response to
  one flat issue array exactly once.
- In Bash, use:
  `jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end'`.
- In PowerShell, capture the `gh` output and `$LASTEXITCODE` first, then pass
  the complete JSON through the same `jq` normalization before
  `ConvertFrom-Json`.
- Use the normalized flat array for the pre-creation baseline, final child
  count/order checks, and failure reconciliation. Do not apply `add` a second
  time to an already-flat array.

---

<sub>4s</sub>

### `skill`

**shepherd-task-20-create-issues-from-plan**

<details>
<summary>Arguments</summary>

```json
{
  "skill": "shepherd-task-20-create-issues-from-plan"
}
```

</details>

```
Skill "shepherd-task-20-create-issues-from-plan" loaded successfully. Follow the instructions in the skill context.
```


---

<sub>10s</sub>

### Copilot

I’m validating the campaign inputs, extracting the plan’s resolved decisions and ordered tasks, and checking the repository’s issue-type and parent-issue state before any mutation.

---

<sub>16s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/01-1682-java-tool-ergonomics.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/01-1682-java-tool-ergonomics.md (lines 1--1)

<details>
<summary>15 lines</summary>

```
# Example 01: 1682-java-tool-ergonomics-prompts-remove-before-merge

Read `copilot-sdk/1682-java-tool-ergonomics-prompts-remove-before-merge/dd-3018003-ignorance-reduction-for-implementation-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 3 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating issues of type **Task** as children of Epic https://github.com/github/copilot-sdk/issues/1682 . These issues correspond to the sub-sections in `## Phase 4 — Implementation (the build order)`.

I want you to use `gh` to create issues as sub-issues of 1682.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Set the type to **Task**.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `upstream`: `edburns/1682-java-tool-ergonomics`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `1682-java-tool-ergonomics-prompts-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 4 — Implementation (the build order)` have essential details for each corresponding **Task**, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>16s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/02-1810-java-tool-as-lambda.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/02-1810-java-tool-as-lambda.md (lines 1--1)

<details>
<summary>12 lines</summary>

```
# Example 02: 1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge

Carefully read the plan `copilot-sdk/1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`.

We have completed Phases 1 - 3. We are now on Phase 4.

For each sub item in Phase 4, file a child issue of Feature #1810.

Use `gh` to look at Epic #1682 and its child issues for the standard of verbosity and concreteness for issue descriptions.

The issue should be assignable to a coding agent and there must be sufficient detail in the description for the agent to proceed to completion.

Pull out the specific relevant content from Phase 3 as it applies to this current issue in Phase 4.

Tell the agent to take `edburns/1810-java-tool-ergonomics-tool-as-lambda` as the base branch. When I assign the issue to the coding agent, I will set this as the base branch.

Tell the agent to read `1810-java-tool-ergonomics-tool-as-lambda-remove-before-merge/1810-ignorance-reduction-for-implementation-plan.md`, which is present on the branch, for context.

Tell the agent which sub-item within Phase 4 they are solving.

Tell the agent that each issue will be assigned, resolved and merged to the base branch in the order in which they appear in the plan.

No work is to start until I assign each issue to the coding agent, in turn.
```

</details>


---

<sub>16s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/03-dd-3017826-java-real-estate-demo.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/03-dd-3017826-java-real-estate-demo.md (lines 1--1)

<details>
<summary>14 lines</summary>

```
# Example 03: dd-3017826-java-real-estate-demo-remove-before-merge

Read `dd-3017826-java-real-estate-demo-remove-before-merge\dd-3017826-java-real-estate-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/2 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #2.

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/2-build-out-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `dd-3017826-java-real-estate-demo-remove-before-merge`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>16s</sub>

### `view`

**view the file at /home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/04-28-python-agent-demo.md.**

/home/edburns/.copilot/skills/shepherd-task-20-create-issues-from-plan/examples/04-28-python-agent-demo.md (lines 1--1)

<details>
<summary>16 lines</summary>

```
# Example 04: 28-python-agent-demo-remove-before-merge

Read `28-python-agent-demo-remove-before-merge/28-python-agent-demo-ignorance-reduction-plan.md` (the plan) to get the context.

✅✅Pay very close attention to each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`. These pertain to the implementation tasks in Phase 3. ✅✅✅ Include relevant spike findings as self-contained prose in the issue description; do not direct the agent to spike directories or source files.

In this session, we are creating sub-issues as children of https://github.com/edburns/Build26-BRK206-your-agent-anywhere-multiclient-multidevice-with-github-copilot-sdk/issues/28 . These issues correspond to the sub-sections in `## Phase 3 — Implementation (build order)`.

I want you to use `gh` to create issues as sub-issues of #28

- I will dispatch these issues by assigning them to an agent. Leave them unassigned for now.

- The description you put in the issues you create is the specification for the work the agent assigned to the issue must do. Therefore, you need to be very specific and targeted when writing the description.

- Again, ✅✅For each **Resolution:** to the questions in `Phase 2 — Ignorance reduction: questions to answer before writing code`, include the relevant Resolution values in the issue description. These pertain to the implementation tasks in Phase 3. ✅✅✅ State relevant spike findings directly in the issue body with enough detail to implement them without reading spike code.

- For tasks dealing with the UI, make sure to refer to the relevant screengrabs, but only ones within `28-python-agent-demo-remove-before-merge/`.

- Each issue will be worked on and resolved in serial. You can assume:
  - All issues will operate in this topic branch of `origin`: `edburns/28-python-agent-demo`.

  - The assignee agent has access to the topic branch and, most importantly, to the prompts in the directory `28-python-agent-demo-remove-before-merge/`, which includes the plan. Therefore, you can instruct the agent to access the plan by reference, you don't need to reference it by value directly in the issue.

- The sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue.

- Instruct the agent to read the entire plan before working.

- Instruct the agent to carefully re-read the relevant sections of the plan. ❌❌You can't just say, "read the relevant sections of the plan". ✅✅In the description of the issue, list exactly what sections of the plan apply to this particular issue.
- Though the sub-sections of `## Phase 3 — Implementation (build order)` have essential details for each corresponding sub-issue, I want you to carefully consider if there are additional gating tests you can add so that as the agent proceeds from one task to the next, the likelihood of rework is reduced.
```

</details>


---

<sub>16s</sub>

### `bash`

**Validate inputs and capture plan sources**

$ set -euo pipefail
REPO='edburns/dd-3072707-tricket-out-cargotracker-run-03'
BRANCH='edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control'
REMOTE='origin'
LOG='/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410'
PLAN='1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md'
CAMPAIGN='1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json'
LESSONS='1-arrival-deadline-control-remove-before-merge/campaign-lessons.md'
DRAFT='/home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh'
BODY='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh'
LINK='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh'
[ -d "$LOG" ] && [ -w "$LOG" ]
mkdir -p "$LOG/issue-bodies"
for f in "$DRAFT" "$BODY" "$LINK"; do [ -f "$f" ] && [ -x "$f" ]; done
git remote get-url "$REMOTE"
git show-ref --verify --quiet "refs/remotes/$REMOTE/$BRANCH" || git show-ref --verify --quiet "refs/heads/$BRANCH"
default_branch="$(gh api "repos/$REPO" --jq '.default_branch')"
printf 'default_branch=%s\n' "$default_branch"
git show "$REMOTE/$BRANCH:$PLAN" > "$LOG/plan-source.md"
git show "$REMOTE/$BRANCH:$CAMPAIGN" > "$LOG/campaign-source.json"
git show "$REMOTE/$BRANCH:$LESSONS" > "$LOG/campaign-lessons-source.md"
printf 'campaign='; jq -c '{campaignId,lessonPropagation}' "$LOG/campaign-source.json"
gh api "repos/$REPO/issues/1" --jq '{number,state,title,repository_url}'
gh api "repos/$REPO" --jq '{owner:.owner.login,owner_type:.owner.type,default_branch}'
owner_type="$(gh api "repos/$REPO" --jq '.owner.type')"
owner="$(gh api "repos/$REPO" --jq '.owner.login')"
if [ "$owner_type" = Organization ]; then gh api "orgs/$owner/issue-types" --jq '[.[]|{name,is_enabled}]'; fi
printf 'artifacts=%s\n' "$LOG"

<details>
<summary>7 lines</summary>

```
git@github.com:edburns/dd-3072707-tricket-out-cargotracker-run-03.git
default_branch=edburns/dd-3016202-cargotracker-devoxx-be-2026-experiment
campaign={"campaignId":"a63d175f-0ce7-4430-850d-c134a707f88c","lessonPropagation":"off"}
{"number":1,"repository_url":"https://api.github.com/repos/edburns/dd-3072707-tricket-out-cargotracker-run-03","state":"open","title":"[Campaign][off] Cargo Tracker arrival-deadline control"}
{"default_branch":"edburns/dd-3016202-cargotracker-devoxx-be-2026-experiment","owner":"edburns","owner_type":"User"}
artifacts=/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410
<shellId: 0 completed with exit code 0>
```

</details>


---

<sub>20s</sub>

### Copilot

Validation passed: the base branch exists and is neither `main` nor the default branch, the parent is open, the campaign manifest matches, and this user-owned repository does not support organization issue types, so children will be created **without an issue type**. I’m now building the traceability map and preserving the normalized child baseline.

---

<sub>25s</sub>

### `view`

**view the file at /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md.**

/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md

<details>
<summary>689 lines</summary>

````
# Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)

Human DRI: Ed Burns
Starting commit: `89e107c3ed6dd3655c2ffdf638b57d6c47099dab` (feature-free baseline with an extensible integration-test gate)
Working directory: repository root of the current campaign worktree
Cargo Tracker Maven application: `demo/`
Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0
Baseline run instructions: `demo/README.md`
Baseline preparation: fixed source branch and immutable SHA validated by the campaign fixture
Historical issue: `eclipse-ee4j/cargotracker#64`

Related directories and files:

- `demo/src/main/java/org/eclipse/cargotracker/application/`
- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
- `demo/src/main/webapp/admin/dialogs/`
- `demo/src/main/webapp/admin/tables/listNotRouted.xhtml`
- `demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

---

## Goal

Add an Administration dashboard operation that lets a shipping administrator
change the arrival deadline of a cargo listed in the **Not Routed Cargo** table.
The operation must preserve Cargo Tracker's layered architecture:

1. The application service owns the domain mutation.
2. The booking facade shields the web layer from domain types.
3. A JSF backing bean loads and submits the editable date.
4. A PrimeFaces dynamic dialog presents the editor.
5. The existing Not Routed Cargo table opens the dialog and refreshes after a
   successful update.

### User-visible acceptance behavior

Using the stable sample cargo `DEF789`:

1. Start the application with Java 17:

   ```bash
   cd demo && ./mvnw clean package -Popenliberty liberty:run
   ```

2. Open `http://localhost:8080/cargo-tracker/`.
3. Select **Administration**.
4. Find `DEF789` in the **Not Routed Cargo** table.
5. The Deadline cell displays its date together with an edit icon.
6. Hovering over the deadline displays:
   `Click to change cargo arrival deadline date.`
7. Selecting the deadline opens a modal dialog titled **Change Deadline**.
8. The dialog displays the cargo's origin and destination as read-only
   context.
9. The date editor is initialized to the cargo's current arrival deadline.
10. Selecting a different date and pressing **Update** closes the dialog and
    refreshes the Administration view.
11. The new date is shown in the Not Routed Cargo table.
12. Reloading the page continues to show the new date for the lifetime of the
    running in-memory sample application.
13. Pressing **Cancel** closes the dialog without changing the deadline.

### Domain acceptance behavior

Changing the deadline must:

- locate the cargo by `TrackingId`;
- preserve its existing origin;
- preserve its existing destination;
- replace only the arrival deadline in its `RouteSpecification`;
- apply the specification through `Cargo.specifyNewRoute(...)`;
- preserve the currently assigned itinerary rather than silently discarding
  it;
- allow the domain model to recalculate routing status and delivery-derived
  values against the new route specification;
- persist the changed cargo through `CargoRepository.store(...)`.

### Hard scope constraints

- Begin from commit `89e107c3ed6dd3655c2ffdf638b57d6c47099dab`.
- Preserve Java EE 7 and the `javax.*` namespace.
- Preserve the Java 7 source/target level used by this historical codebase.
- Run the application on JDK 17 using the existing Open Liberty profile.
- Do not migrate the application to Jakarta EE 8+, Jakarta EE 9+, Spring, or a
  different UI framework.
- Do not replace the in-memory Derby configuration or the Open Liberty runtime.
- Do not redesign unrelated cargo booking, routing, destination editing,
  messaging, batch, REST, or persistence behavior.
- Do not copy commits or files from feature-bearing branches. This plan is the
  implementation specification.
- Implement the five build issues below in order. Each issue must be complete
  and gated before the next issue begins.

---

## Completed phases

### Phase 1 ✅ — Establish a runnable feature-absent baseline

- Commit `89e107c3ed6dd3655c2ffdf638b57d6c47099dab` is based on the historical
  feature-absent commit and contains the compatibility work needed to run the
  sample on JDK 17 and Open Liberty plus an extensible integration-test gate
  that preserves the four named baseline methods while permitting valid
  additional tests.
- `cd demo && ./mvnw clean package -Popenliberty liberty:run` starts the application.
- The home page and Administration flows return HTTP 200.
- JSF view metadata is placed at `UIViewRoot` scope for MyFaces compatibility.
- The internal routing REST client works without a Jersey/MOXy classloading
  conflict.
- The scheduled batch job has the local authorization it needs.

### Phase 2 ✅ — Verify the before and after user experience

- Before implementation, `DEF789` appears in the Not Routed Cargo table with a
  plain-text deadline and no edit operation.
- The neighboring Destination column demonstrates the existing PrimeFaces
  dynamic-dialog interaction pattern.
- The desired after behavior has been manually exercised: open the deadline
  editor, choose a new date, update, refresh the table, and observe the
  persisted value.
- The historical architectural boundaries and affected files have been
  identified.

---

## Phase 3 — Ignorance reduction: questions to answer before writing code

Resolve these questions before production implementation begins. The
recommendations intentionally define the desired design closely enough that an
implementing agent should not need to invent a different architecture.

### 3.1 — Which cargos expose the edit operation?

**Question:** Should deadline editing be exposed for all cargos or only for
cargos displayed in the Not Routed Cargo table?

The requested feature originates in the Administration dashboard's Not Routed
Cargo table. Other tables represent routed, misrouted, claimed, or otherwise
progressed cargo. Adding the affordance to every table would expand the feature
and require additional business rules about changing deadlines after handling
has begun.

| Option | UI scope | Trade-off |
|--------|----------|-----------|
| A | Not Routed Cargo table only | Matches the requested feature and the established destination-edit affordance. |
| B | Every Administration cargo table | Broader capability, but introduces lifecycle and authorization questions outside the request. |
| C | Cargo details page only | Avoids table complexity but does not meet the requested dashboard interaction. |

The application-service operation itself does not need to encode a UI-table
restriction. It should accept a tracking ID and apply the domain mutation to
the located cargo. The presentation layer determines where the operation is
offered.

**Recommendation:** Option A. Add the edit affordance only to
`demo/src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
operation generally usable for a valid cargo.

**Resolution:**

Select Option A. Expose the edit affordance only in
`demo/src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
operations remain generally callable for any cargo that can be found by
tracking ID; they do not encode knowledge of dashboard table membership.

### 3.2 — What is the exact domain mutation?

**Question:** Should the feature mutate the existing `RouteSpecification`, add
a setter to `Cargo`, or replace the specification using the existing domain
operation?

`RouteSpecification` is a value object describing origin, destination, and
arrival deadline. The existing `changeDestination(...)` implementation already
establishes the correct pattern: create a replacement specification, call
`Cargo.specifyNewRoute(...)`, and store the aggregate.

Proposed application-service shape:

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

Proposed implementation:

```java
Cargo cargo = cargoRepository.find(trackingId);
RouteSpecification specification = new RouteSpecification(
        cargo.getOrigin(),
        cargo.getRouteSpecification().getDestination(),
        deadline);

cargo.specifyNewRoute(specification);
cargoRepository.store(cargo);
```

Calling `specifyNewRoute(...)` is significant. It lets the aggregate recalculate
delivery and routing status relative to the new specification. Direct field
mutation or a persistence-only update would bypass that behavior.

**Recommendation:** Replace the `RouteSpecification` through
`Cargo.specifyNewRoute(...)`. Preserve origin, destination, and itinerary.
Persist using the existing repository. Do not add a deadline setter to the
domain model.

**Resolution:**

Use the same aggregate-update pattern as `changeDestination(...)`. Add
`BookingService.changeDeadline(TrackingId, Date)` and implement it by loading
the cargo, constructing a new `RouteSpecification` from the existing origin,
existing destination, and supplied deadline, calling
`cargo.specifyNewRoute(...)`, and storing the cargo through
`cargoRepository.store(...)`. Do not add mutable deadline setters to the domain
objects.

### 3.3 — What should happen to an existing itinerary and delivery state?

**Question:** When a routed cargo's deadline changes, should its itinerary be
cleared, retained, or recomputed?

Although the UI initially exposes the feature only for unrouted cargo, the
application operation should have deterministic domain behavior if invoked for
a routed cargo. The existing `changeDestination(...)` behavior preserves the
assigned itinerary and lets `Cargo.specifyNewRoute(...)` recalculate whether
that itinerary still satisfies the new specification.

The core application test should deliberately invoke the operation after:

1. booking a cargo;
2. requesting route candidates;
3. assigning an itinerary;
4. changing its destination;
5. changing its deadline.

This sequence verifies that the feature uses the aggregate correctly rather
than assuming the cargo always has an empty itinerary.

**Recommendation:** Preserve the itinerary. Let the domain model recompute
routing and delivery-derived state. Assert all unaffected fields explicitly in
`BookingServiceTest`.

**Resolution:**

Retain the existing itinerary. Do not clear, replace, or reroute it as part of
the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery
snapshot and routing status against the replacement specification. In the
established sequential application test, the assigned itinerary remains
unchanged and the cargo remains `MISROUTED` after the deadline changes.

### 3.4 — What type crosses the facade boundary?

**Question:** Should the booking facade accept a `Date`, a formatted string, or
a newly introduced request DTO?

The existing facade already uses `java.util.Date` for
`bookNewCargo(...)`. Introducing another representation for this one operation
would create unnecessary conversion code and depart from the historical
application style.

Proposed facade shape:

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

The implementation converts only the identifier:

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

**Recommendation:** Use `String` for the tracking ID and `java.util.Date` for
the deadline. Do not expose `TrackingId`, `Cargo`, or `RouteSpecification` to
the JSF layer and do not introduce a new DTO solely for this command.

**Resolution:**

Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to
`BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to
`new TrackingId(trackingId)` and passes the same `Date` to
`BookingService.changeDeadline(...)`. No new command DTO or formatted-string
service parameter is introduced.

### 3.5 — How is the DTO's formatted deadline converted for editing?

**Question:** `CargoRoute` exposes its deadline as formatted strings, while
`p:datePicker` binds naturally to `java.util.Date`. How should the backing bean
initialize the editor?

At the starting commit:

- `CargoRoute.getArrivalDeadline()` returns
  `MM/dd/yyyy hh:mm a z`.
- `CargoRoute.getArrivalDeadlineDate()` returns only the date component.
- The table displays `getArrivalDeadlineDate()`.

Options:

| Option | Approach | Trade-off |
|--------|----------|-----------|
| A | Parse `cargo.getArrivalDeadlineDate()` with `MM/dd/yyyy` | Small, localized change; preserves the existing DTO contract. |
| B | Add a `Date` property to `CargoRoute` | Cleaner typing, but broadens a DTO used throughout the application. |
| C | Reload the domain object in the backing bean | Violates the facade boundary. |

The formatter/parser must be created per operation or per view bean; do not add
a shared mutable `SimpleDateFormat`.

**Recommendation:** Option A. Load `CargoRoute` through
`BookingServiceFacade.loadCargoForRouting(trackingId)` and parse
`cargo.getArrivalDeadlineDate()` using `new SimpleDateFormat("MM/dd/yyyy")`.
Surface an explicit failure if the existing DTO value cannot be parsed; do not
silently submit a null date.

**Resolution:**

Use Option A and keep date conversion inside the view-scoped editor bean. The
existing implementation loads the `CargoRoute`, creates
`new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of
`cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`,
`SimpleDateFormat.parse(...)` obtains the same date that
`getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared
mutable formatter is added.

### 3.6 — Which JSF bean scopes and interaction pattern should be used?

**Question:** Should deadline editing introduce a new navigation page, use an
inline editor, or mirror the existing Change Destination dynamic-dialog
pattern?

The baseline already contains:

- `ChangeDestination`, a CDI `@Named` and JSF `@ViewScoped` editor bean;
- `ChangeDestinationDialog`, a session-scoped JSF managed bean that opens and
  closes a PrimeFaces dynamic dialog;
- `changeDestination.xhtml`, a dialog view;
- a `dialogReturn` Ajax listener that refreshes `tableNotRouted`.

Using the same pattern minimizes changes and provides a consistent user
experience.

Proposed bean names:

```text
changeArrivalDeadlineDate
changeArrivalDeadlineDateDialog
```

**Recommendation:** Add a serializable CDI `@Named @ViewScoped`
`ChangeArrivalDeadlineDate` editor and a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped`
launcher. Mirror the existing destination-dialog lifecycle rather than
introducing a new navigation or inline-edit framework.

**Resolution:**

Mirror the existing Change Destination interaction. Implement
`ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and
`ChangeArrivalDeadlineDateDialog` as a serializable
`@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean.
Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline
cell editing.

### 3.7 — What is the dynamic-dialog contract?

**Question:** What path, request parameters, dimensions, and close result should
the PrimeFaces dialog use?

The launcher needs one parameter, `trackingId`, supplied as a
`Map<String, List<String>>`. The dialog metadata binds the parameter and invokes
the editor bean's `load()` action.

Proposed launcher contract:

```java
PrimeFaces.current().dialog().openDynamic(
        "/admin/dialogs/changeArrivalDeadlineDate.xhtml",
        options,
        params);
```

Required options:

| Option | Value |
|--------|-------|
| `modal` | `true` |
| `draggable` | `true` |
| `resizable` | `false` |
| `contentWidth` | `410` |
| `contentHeight` | `280` |

Required completion behavior:

- successful update: `closeDynamic("DONE")`;
- cancel: `closeDynamic("")`;
- caller listens for `dialogReturn` and updates `tableNotRouted`.

Because Open Liberty uses MyFaces, `<f:metadata>` must be a direct child of the
view root, before `<h:head>` and `<h:body>`. It must not be nested inside
`<h:body>`.

**Recommendation:** Use the contract above and preserve the metadata placement
required by the prepared baseline.

**Resolution:**

Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single
`trackingId` request parameter and these options: modal and draggable are
`true`, resizable is `false`, content width is `410`, and content height is
`280`. Successful submission closes with `"DONE"`; cancellation closes with
the empty string. The caller handles `dialogReturn` and updates
`tableNotRouted`. Place the dialog's `<f:metadata>` directly under the root
`<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces
`UIViewRoot` requirement is satisfied.

### 3.8 — What date validation is required?

**Question:** Must the new deadline be non-null, in the future, after the
current date, or after itinerary completion?

The requested feature is an administrative correction to an existing arrival
deadline. No new domain policy about future dates is part of the request.
Inventing such a rule could reject dates accepted by existing cargo booking or
`RouteSpecification` behavior.

The UI must nevertheless prevent a null submission because the operation
requires a concrete replacement deadline.

**Recommendation:** Require a date value in the JSF form and display a normal
Faces validation message when it is absent. Do not add a new minimum-date,
future-date, or itinerary-date business rule. Continue to rely on the existing
domain model for its established invariants.

**Resolution:**

Require a non-null date selection, but add no new chronological business rule.
In particular, do not require the replacement deadline to be after today,
after the old deadline, or after every itinerary leg. Pass the selected
`java.util.Date` to the existing domain construction path and let the current
`RouteSpecification` invariants apply.

### 3.9 — How will the feature be tested on the prepared historical baseline?

**Question:** Which automated and runtime tests are mandatory on the prepared
JDK 17/Open Liberty baseline?

The prepared baseline executes the sequential `BookingServiceTest` under Open
Liberty with:

```bash
cd demo && ./mvnw -Popenliberty -Dtest=BookingServiceTest clean test
```

The feature-free baseline passes four ordered methods with zero failures,
errors, or skipped tests. Its CI gate preserves those four named methods while
allowing the suite to grow when a feature adds another valid test.

The feature still needs layered evidence:

1. Extend `BookingServiceTest` with the domain/application assertions that
   specify the deadline mutation.
2. Run the complete `BookingServiceTest` under Open Liberty and require all
   five ordered methods to pass with zero failures, errors, or skipped tests.
3. Run `cd demo && ./mvnw clean package -Popenliberty` and require the complete
   package gate to pass.
4. Add focused JUnit tests for facade and backing-bean delegation where they
   can run without a container, using hand-written fakes rather than adding a
   mocking framework.
5. Perform mandatory end-to-end verification against the running Open Liberty
   application.

**Resolved evidence:** The prepared baseline runs `BookingServiceTest` in its
managed Open Liberty test environment. The repository's injected
`CargoRepository` is available in that test; a separately introduced
test-level `EntityManager` injection is not. `JpaCargoRepository.find(...)`
already executes the `Cargo.findByTrackingId` named query.

**Recommendation:** Use the existing injected repository to reload the cargo,
run the dedicated Open Liberty integration tier, run the complete package
gate, and retain HTTP/UI acceptance as the final user-visible proof. Do not add
a second persistence access path or modernize the test runtime.

**Resolution:**

Extend the existing sequential Arquillian `BookingServiceTest` with
`testChangeDeadline()` after `testChangeDestination()`. The test changes the
deadline by one month, reloads the cargo through the injected
`CargoRepository`, and asserts the complete set of preserved and recalculated
domain state described above. Require five passing `BookingServiceTest`
methods, a successful JDK 17 Open Liberty package gate, direct HTTP checks, and
the complete `DEF789` browser acceptance flow. No test-runtime modernization,
second persistence access path, or new mocking dependency is part of this
feature.

---

## Phase 4 — Implementation (five serial issues)

Implement these issues in order. Each issue should be a separate commit. Do not
start an issue until the previous issue's gating criteria are satisfied.

### 4.1 — Issue 1: Add the application-layer deadline change operation

**What to build**

Add the core use case to the application layer. This issue must contain no JSF
or PrimeFaces changes.

**Files to modify**

- `demo/src/main/java/org/eclipse/cargotracker/application/BookingService.java`
- `demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
- `demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`

**Required API**

```java
void changeDeadline(TrackingId trackingId, Date deadline);
```

**Required implementation behavior**

1. Load the cargo using `cargoRepository.find(trackingId)`.
2. Obtain the current destination from
   `cargo.getRouteSpecification().getDestination()`.
3. Construct a replacement `RouteSpecification` from:
   - `cargo.getOrigin()`;
   - the current destination;
   - the new deadline.
4. Apply it using `cargo.specifyNewRoute(routeSpecification)`.
5. Persist using `cargoRepository.store(cargo)`.
6. Log the tracking ID and new deadline at `Level.INFO`, following the style of
   `changeDestination(...)`.

Do not:

- add a setter to `Cargo` or `RouteSpecification`;
- modify the origin or destination;
- clear or replace the itinerary directly;
- update persistence entities behind the aggregate's back.

**Tests to write first**

Append a sequential `testChangeDeadline()` case to `BookingServiceTest` after
`testChangeDestination()`. Build a new deadline one month after the test's
original `deadline`, invoke the service, reload the cargo with the existing
injected `cargoRepository.find(trackingId)` path, and assert:

- origin remains Chicago;
- destination remains Helsinki;
- stored deadline is the same calendar day as the requested new deadline;
- assigned itinerary remains unchanged;
- transport status remains `NOT_RECEIVED`;
- last known location remains `Location.UNKNOWN`;
- current voyage remains `Voyage.NONE`;
- cargo is not marked misdirected;
- estimated time of arrival is `Delivery.ETA_UNKOWN`;
- next expected activity is `Delivery.NO_ACTIVITY`;
- cargo is not unloaded at destination;
- routing status reflects the domain model's recalculation and remains
  `MISROUTED` for the established test sequence.

**Gating criteria**

- `cd demo && ./mvnw -Popenliberty -Dtest=BookingServiceTest clean test`
  executes five tests with zero failures, errors, or skipped tests.
- `cd demo && ./mvnw clean package -Popenliberty` succeeds on JDK 17.
- No web, facade, REST, Liberty, or persistence configuration files change in
  this issue.
- The repository's extensible integration-test CI gate passes without a
  workflow change in this issue.

### 4.2 — Issue 2: Expose deadline changes through the booking facade

**What to build**

Expose the use case to presentation clients without leaking domain identifier
types into the web layer.

**Files to modify**

- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`

**Optional focused test file**

- `demo/src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`

**Required API**

```java
void changeDeadline(String trackingId, Date arrivalDeadline);
```

**Required implementation**

```java
bookingService.changeDeadline(
        new TrackingId(trackingId),
        arrivalDeadline);
```

The facade must not:

- load and mutate `Cargo` itself;
- call `CargoRepository.store(...)`;
- parse a formatted date;
- introduce JSF or PrimeFaces types.

**Tests**

Where a container-free test is added, use a hand-written `BookingService` fake
or spy and prove that:

- the same `Date` object/value reaches the application service;
- the tracking-ID string is converted to an equivalent `TrackingId`;
- the facade delegates exactly once;
- no repository work is duplicated in the facade.

Do not add Mockito or another dependency solely for this test.

**Gating criteria**

- Existing facade consumers still compile.
- `cd demo && ./mvnw clean package -Popenliberty` succeeds on JDK 17.
- The application-layer test added in Issue 1 remains unchanged and compiling.

### 4.3 — Issue 3: Implement the deadline editor backing model

**What to build**

Add the view-scoped backing bean that loads a cargo's current deadline and
submits a replacement deadline through the booking facade. Do not add the
dialog launcher or XHTML in this issue.

**File to create**

- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`

**Required bean shape**

```java
@Named
@ViewScoped
public class ChangeArrivalDeadlineDate implements Serializable {
    private static final long serialVersionUID = 1L;

    private String trackingId;
    private CargoRoute cargo;
    private Date arrivalDeadlineDate;

    @Inject
    private BookingServiceFacade bookingServiceFacade;
}
```

Required properties and methods:

- `getTrackingId()` / `setTrackingId(String)`
- `getCargo()`
- `getArrivalDeadlineDate()` / `setArrivalDeadlineDate(Date)`
- `load()`
- `changeArrivalDeadline()`

**Load behavior**

1. Call `bookingServiceFacade.loadCargoForRouting(trackingId)`.
2. Store the returned `CargoRoute`.
3. Parse `cargo.getArrivalDeadlineDate()` using `MM/dd/yyyy`.
4. Store the resulting `Date` in `arrivalDeadlineDate`.
5. Do not query a repository or domain object directly.
6. Do not ignore a parsing failure or merely print its stack trace. Surface a
   clear application/view error consistent with existing JSF behavior.

**Submit behavior**

1. Refuse a null date through JSF validation or explicit bean validation.
2. Call
   `bookingServiceFacade.changeDeadline(trackingId, arrivalDeadlineDate)`.
3. Close the dynamic dialog with:

   ```java
   PrimeFaces.current().dialog().closeDynamic("DONE");
   ```

4. Do not close the dialog if the facade call fails.

**Tests to write**

Add a container-free JUnit test if practical, using a hand-written fake facade,
that proves:

- `load()` requests the correct tracking ID;
- `load()` converts an `MM/dd/yyyy` DTO date into the editable `Date`;
- `changeArrivalDeadline()` delegates the selected date and tracking ID;
- a malformed DTO deadline is surfaced rather than converted to null;
- a null selected date is rejected.

Do not add a mocking framework solely for these tests.

**Gating criteria**

- The bean is serializable and uses the established CDI/JSF annotations.
- The bean references only facade DTOs, not domain model classes.
- `cd demo && ./mvnw clean package -Popenliberty` succeeds on JDK 17.

### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog

**What to build**

Add the session-scoped dialog launcher and the dynamic dialog view. The dialog
must work when addressed directly with a `trackingId` query parameter, but it
is not yet linked from the dashboard in this issue.

**Files to create**

- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
- `demo/src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`

**Launcher requirements**

Use:

```java
@ManagedBean(name = "changeArrivalDeadlineDateDialog")
@SessionScoped
```

Implement:

- `showDialog(String trackingId)`
- `handleReturn(SelectEvent event)`
- `cancel()`

`showDialog(...)` must:

- set the options documented in Question 3.7;
- pass `trackingId` as a dynamic-dialog request parameter;
- open `/admin/dialogs/changeArrivalDeadlineDate.xhtml`.

`cancel()` must close the dialog without invoking the facade.

**XHTML requirements**

The page title must be:

```xhtml
<title>Change Deadline</title>
```

Place metadata directly beneath the root `<html>` element and before
`<h:head>`:

```xhtml
<f:metadata>
    <f:viewParam name="trackingId"
                 value="#{changeArrivalDeadlineDate.trackingId}"/>
    <f:viewAction action="#{changeArrivalDeadlineDate.load}"/>
</f:metadata>
```

The form must display:

- `Origin:` and `changeArrivalDeadlineDate.cargo.originName`;
- `Destination:` and
  `changeArrivalDeadlineDate.cargo.finalDestinationName`;
- `Deadline:` and a `p:datePicker` bound to
  `changeArrivalDeadlineDate.arrivalDeadlineDate`;
- **Cancel**, invoking
  `changeArrivalDeadlineDateDialog.cancel()`;
- **Update**, invoking
  `changeArrivalDeadlineDate.changeArrivalDeadline()`.

The date picker must require a value. The Update action must reload or refresh
the calling Administration view after a successful dialog close, following the
existing destination-dialog behavior.

**Runtime tests**

With the application running, request:

```text
http://localhost:8080/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789
```

Verify:

- HTTP 200;
- title is **Change Deadline**;
- origin and destination render;
- the existing deadline is selected;
- no `TagException`, `Parent UIComponent`, `FacesException`, or server error is
  present;
- Cancel does not change the persisted deadline;
- Update changes the deadline.

**Gating criteria**

- `cd demo && ./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
- Direct dialog loading and both actions work.
- Destination editing continues to work.
- Stop Liberty cleanly before completing the issue.

### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard

**What to build**

Replace the plain deadline text in the Not Routed Cargo table with the
PrimeFaces command-link affordance that opens the completed dialog and refreshes
the table after return.

**File to modify**

- `demo/src/main/webapp/admin/tables/listNotRouted.xhtml`

**Required UI shape**

Within the existing Deadline column, add a `p:commandLink` that:

- calls
  `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;
- retains the displayed
  `cargoNotRouted.arrivalDeadlineDate`;
- adds the existing Font Awesome edit icon style;
- uses a stable component ID such as `arrivalDeadlineToUpdate`;
- listens for `dialogReturn`;
- invokes
  `changeArrivalDeadlineDateDialog.handleReturn`;
- updates `tableNotRouted`;
- provides the tooltip:
  `Click to change cargo arrival deadline date.`

Follow the adjacent Destination column's established structure and styling. Do
not alter tracking-ID routing or destination editing.

**End-to-end acceptance test**

1. Start from a clean build on JDK 17:

   ```bash
   cd demo && ./mvnw clean package -Popenliberty liberty:run
   ```

2. Confirm the home page returns HTTP 200.
3. Open Administration and locate `DEF789`.
4. Record the original deadline.
5. Confirm the deadline now has an edit icon and tooltip.
6. Open the deadline dialog.
7. Confirm origin and destination identify the same cargo.
8. Choose a visibly different date.
9. Press **Update**.
10. Confirm the dialog closes and the Not Routed Cargo table refreshes.
11. Confirm the table shows the selected date.
12. Reload the browser and confirm the selected date remains.
13. Reopen the dialog and confirm the editor initializes to the changed date.
14. Press **Cancel** and confirm no additional change occurs.
15. Verify the Destination edit dialog still opens.
16. Verify selecting `DEF789` for routing still loads without an error page.

**Log acceptance**

The final run must contain none of:

- `<f:metadata> Parent UIComponent`;
- `TagException`;
- `VerifyError`;
- `FacesException`;
- `CWWKZ0002E` or `CWWKZ0003E`;
- recurring batch authorization failures;
- new FFDC files attributable to this feature.

Transient JMS activation-order warnings are acceptable only if all message
endpoints subsequently activate, as established by the prepared baseline.

**Final regression and scope checks**

- `cd demo && ./mvnw clean package -Popenliberty` succeeds.
- The dedicated Open Liberty `BookingServiceTest` tier executes all five
  ordered tests with zero failures, errors, or skipped tests.
- No Java EE namespace migration occurred.
- No Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST
  compatibility fix from the starting commit was reverted.
- The feature affects only the intended application, facade, web, dialog,
  table, and test surfaces.
- Stop Liberty cleanly.

---

## Phase 5 — Documentation and implementation handoff

- Update `demo/README.md` only if user-facing Administration capabilities are
  enumerated there; add one concise sentence that administrators can change an
  unrouted cargo's arrival deadline.
- Record the exact JDK 17 run command in the final issue or pull-request
  description:

  ```bash
  cd demo && ./mvnw clean package -Popenliberty liberty:run
  ```

- Include `DEF789` and the before/after deadline values in the acceptance
  evidence.
- State explicitly that data is in-memory and resets when the application is
  rebuilt/restarted.

---

## Cross-cutting concerns

| Concern | Required handling |
|---------|--------------------|
| Domain-driven design | Mutate the aggregate through `Cargo.specifyNewRoute(...)`; do not bypass it with persistence-level field updates. |
| Layering | Web bean → booking facade → booking service → cargo repository. |
| Date handling | Use `java.util.Date` at service/facade boundaries and `MM/dd/yyyy` for the date-only editor representation. |
| Time zones | Acceptance compares the calendar date displayed by the application; do not introduce a new timezone policy in this feature. |
| Error handling | Do not silently swallow parse, lookup, validation, or persistence failures. A failed update must not look successful. |
| JSF compatibility | Keep `<f:metadata>` at view-root scope for MyFaces. |
| Bean lifecycle | Editor is CDI `@ViewScoped`; dynamic-dialog launcher mirrors the existing session-scoped JSF managed bean. |
| Accessibility | Preserve visible labels; the date editor must have an associated label and validation feedback. |
| Backward compatibility | Existing destination editing, routing, tracking, REST, messaging, batch, and startup behavior must remain intact. |
| Test discipline | Add tests before production code where practical; every issue must preserve all prior gates. |
| Experiment integrity | Implement from this specification starting at `89e107c3ed6dd3655c2ffdf638b57d6c47099dab`; do not cherry-pick or inspect feature-bearing commits. |
````

</details>


---

<sub>25s</sub>

### `glob`

**1-arrival-deadline-control-remove-before-merge/****

"1-arrival-deadline-control-remove-before-merge/**"

<details>
<summary>13 matches</summary>

```
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/.stage20-before.1550157
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/shepherd-test-experiment.json
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/20261002-1410-invoke-shepherd-task-20-create-issues-from-plan-skill.sh
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/.stage20-after.1550157
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/create-issues-session-20261002-1410.jsonl
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/20261002-1410-invoke-shepherd-task-20-create-issues-from-plan-skill.md
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/campaign-lessons.md
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/create-issues-otel-20261002-1410.jsonl
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/campaign-lessons-source.md
/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/campaign-source.json
```

</details>


---

<sub>25s</sub>

### `rg`

**^(#{2,5} |\*\*Resolution:\*\*|Resolution:)**

"^(#{2,5} |\*\*Resolution:\*\*|Resolution:)" (1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md)

<details>
<summary>36 matches</summary>

```
[grep content: 34 matches across 1 file(s) under /home/edburns/workareas]

dd (34 match(es)):
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:23:## Goal
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:36:### User-visible acceptance behavior
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:63:### Domain acceptance behavior
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:78:### Hard scope constraints
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:96:## Completed phases
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:98:### Phase 1 ✅ — Establish a runnable feature-absent baseline
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:112:### Phase 2 ✅ — Verify the before and after user experience
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:126:## Phase 3 — Ignorance reduction: questions to answer before writing code
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:132:### 3.1 — Which cargos expose the edit operation?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:158:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:165:### 3.2 — What is the exact domain mutation?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:204:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:214:### 3.3 — What should happen to an existing itinerary and delivery state?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:240:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:248:### 3.4 — What type crosses the facade boundary?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:276:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:284:### 3.5 — How is the DTO's formatted deadline converted for editing?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:314:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:324:### 3.6 — Which JSF bean scopes and interaction pattern should be used?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:354:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:363:### 3.7 — What is the dynamic-dialog contract?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:404:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:415:### 3.8 — What date validation is required?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:433:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:441:### 3.9 — How will the feature be tested on the prepared historical baseline?
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:482:**Resolution:**
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:496:## Phase 4 — Implementation (five serial issues)
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:501:### 4.1 — Issue 1: Add the application-layer deadline change operation
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:572:### 4.2 — Issue 2: Expose deadline changes through the booking facade
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:627:### 4.3 — Issue 3: Implement the deadline editor backing model
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:706:### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:803:### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:888:## Phase 5 — Documentation and implementation handoff
  3072707- tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/plan-source.md:907:## Cross-cutting concerns
```

</details>


---

<sub>25s</sub>

### `bash`

**Capture normalized child baseline**

$ set -euo pipefail
REPO='edburns/dd-3072707-tricket-out-cargotracker-run-03'
PARENT=1
LOG='/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410'
raw="$(gh api "repos/$REPO/issues/$PARENT/sub_issues" --paginate --slurp)"
normalized="$(printf '%s' "$raw" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end')"
tmp="$LOG/.pre-creation-children.json.tmp"
printf '%s\n' "$normalized" > "$tmp"
mv "$tmp" "$LOG/pre-creation-children.json"
printf 'children=%s\n' "$(jq 'length' "$LOG/pre-creation-children.json")"
jq '[.[]|{id,number,title}]' "$LOG/pre-creation-children.json"
find "$LOG/issue-bodies" -maxdepth 1 -type f -name '*-body.md' -print

```
children=0
[]
<shellId: 1 completed with exit code 0>
```


---

<sub>33s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh.**

/home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh (lines 1--1)

<details>
<summary>65 lines</summary>

```
#!/usr/bin/env bash
# shepherd-task-version: 1.0.4

set -euo pipefail

[[ $# -eq 3 ]] || {
    echo "Usage: $0 <body-directory> <expected-count> <off|campaign>" >&2
    exit 1
}

body_directory="$1"
expected_count="$2"
lesson_propagation="$3"

[[ -d "$body_directory" ]] || {
    echo "Stage-20 body directory does not exist: $body_directory" >&2
    exit 1
}
[[ "$expected_count" =~ ^[1-9][0-9]*$ ]] || {
    echo "Expected count must be a positive integer." >&2
    exit 1
}
[[ "$lesson_propagation" == "off" || "$lesson_propagation" == "campaign" ]] || {
    echo "Lesson propagation must be off or campaign." >&2
    exit 1
}

body_files=()
for body_file in "$body_directory"/*-body.md; do
    [[ -f "$body_file" ]] || continue
    [[ "$body_file" != *-observed-body.md ]] || continue
    body_files+=("$body_file")
done
[[ ${#body_files[@]} -eq $expected_count ]] || {
    echo "Expected $expected_count persisted stage-20 body files; found ${#body_files[@]}." >&2
    exit 1
}

required_headings=(
    '## Campaign context and required reading'
    '## Branch and execution order'
    '## Implement'
    '## Completion gates'
    '## Out of scope'
)

for body_file in "${body_files[@]}"; do
    [[ -s "$body_file" && "$(awk 'END { print NR }' "$body_file")" -gt 1 ]] || {
        echo "Persisted issue body must contain physical Markdown lines: $body_file" >&2
        exit 1
    }
    first_nonblank="$(awk 'NF { print; exit }' "$body_file")"
    [[ "$first_nonblank" =~ ^##[[:space:]]+[^[:space:]] ]] || {
        echo "Persisted issue body must begin with a level-two heading: $body_file" >&2
        exit 1
    }
    for heading in "${required_headings[@]}"; do
        grep -Fqx -- "$heading" "$body_file" || {
            echo "Persisted issue body is missing the physical heading '$heading': $body_file" >&2
            exit 1
        }
    done
    if [[ "$lesson_propagation" == "campaign" ]]; then
        grep -Fqx -- '## Campaign lessons (REQUIRED)' "$body_file" || {
            echo "Treatment issue body is missing its campaign-lessons heading: $body_file" >&2
            exit 1
        }
    elif grep -Fqx -- '## Campaign lessons (REQUIRED)' "$body_file"; then
        echo "Control issue body unexpectedly contains a campaign-lessons heading: $body_file" >&2
        exit 1
    fi
done
```

</details>


---

<sub>33s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh.**

/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh (lines 1-260)

<details>
<summary>131 lines</summary>

```
#!/usr/bin/env bash
# shepherd-task-version: 1.0.4
set -euo pipefail

fail() {
    printf 'verify-github-issue-body: %s\n' "$*" >&2
    exit 1
}

[[ $# -ge 3 && $# -le 6 ]] ||
    fail "usage: $0 OWNER/REPO ISSUE_NUMBER EXPECTED_BODY_PATH [MAX_ATTEMPTS] [DELAY_SECONDS] [DIAGNOSTIC_PATH]"

repository="$1"
issue_number="$2"
expected_body_path="$3"
max_attempts="${4:-6}"
delay_seconds="${5:-5}"
diagnostic_path="${6:-}"
gh_command="${GH_COMMAND:-gh}"

[[ "$repository" =~ ^[A-Za-z0-9_.-]+/[A-Za-z0-9_.-]+$ ]] ||
    fail "invalid repository: $repository"
[[ "$issue_number" =~ ^[1-9][0-9]*$ ]] ||
    fail "invalid issue number: $issue_number"
[[ "$max_attempts" =~ ^[1-9][0-9]*$ ]] ||
    fail "MAX_ATTEMPTS must be a positive integer"
[[ "$delay_seconds" =~ ^[0-9]+$ ]] ||
    fail "DELAY_SECONDS must be a non-negative integer"
[[ -f "$expected_body_path" ]] ||
    fail "expected issue body file not found: $expected_body_path"

temp_directory="$(mktemp -d)"
trap 'rm -rf "$temp_directory"' EXIT
response_path="$temp_directory/response.json"
actual_path="$temp_directory/actual.txt"
actual_normalized="$temp_directory/actual-normalized.txt"
expected_normalized="$temp_directory/expected-normalized.txt"

normalize_file() {
    jq -b -Rsj 'gsub("\r\n|\r"; "\n")' "$1" >"$2"
}

equivalent_files() {
    local actual="$1"
    local expected="$2"
    local candidate="$temp_directory/candidate.txt"

    cmp -s -- "$actual" "$expected" && return 0
    cp "$actual" "$candidate"
    printf '\n' >>"$candidate"
    cmp -s -- "$candidate" "$expected" && return 0
    cp "$expected" "$candidate"
    printf '\n' >>"$candidate"
    cmp -s -- "$actual" "$candidate"
}

sha256_file() {
    if command -v sha256sum >/dev/null 2>&1; then
        sha256sum "$1" | awk '{print $1}'
    else
        shasum -a 256 "$1" | awk '{print $1}'
    fi
}

write_diagnostic() {
    local reason="$1"
    local attempts="$2"
    [[ -n "$diagnostic_path" ]] || return 0

    mkdir -p "$(dirname "$diagnostic_path")"
    local expected_length actual_length expected_hash actual_hash first_offset
    expected_length="$(wc -c <"$expected_normalized" | tr -d ' ')"
    actual_length="$(wc -c <"$actual_normalized" | tr -d ' ')"
    expected_hash="$(sha256_file "$expected_normalized")"
    actual_hash="$(sha256_file "$actual_normalized")"
    first_offset="$( (cmp -l -- "$actual_normalized" "$expected_normalized" 2>/dev/null || true) | awk 'NR == 1 { print $1 - 1 }')"
    [[ -n "$first_offset" ]] || first_offset="null"

    jq -n \
        --arg repository "$repository" \
        --argjson issueNumber "$issue_number" \
        --arg endpoint "repos/$repository/issues/$issue_number" \
        --argjson attempts "$attempts" \
        --arg observedAt "$(date -u +%Y-%m-%dT%H:%M:%SZ)" \
        --arg reason "$reason" \
        --argjson expectedLength "$expected_length" \
        --argjson actualLength "$actual_length" \
        --arg expectedSha256 "$expected_hash" \
        --arg actualSha256 "$actual_hash" \
        --argjson firstDifferenceOffset "$first_offset" \
        '{
            schemaVersion: 1,
            repository: $repository,
            issueNumber: $issueNumber,
            endpoint: $endpoint,
            attempts: $attempts,
            observedAt: $observedAt,
            reason: $reason,
            expectedLength: $expectedLength,
            actualLength: $actualLength,
            expectedSha256: $expectedSha256,
            actualSha256: $actualSha256,
            firstDifferenceOffset: $firstDifferenceOffset
        }' >"$diagnostic_path"
}

normalize_file "$expected_body_path" "$expected_normalized"
last_reason=""

for ((attempt = 1; attempt <= max_attempts; attempt++)); do
    set +e
    "$gh_command" api "repos/$repository/issues/$issue_number" >"$response_path" 2>"$temp_directory/error.txt"
    exit_code=$?
    set -e

    if [[ $exit_code -ne 0 ]]; then
        last_reason="GitHub REST request failed with exit code $exit_code."
        error_message="$(cat "$temp_directory/error.txt")"
        authentication_error_pattern='HTTP[[:space:]]+(401|403)|[Aa]uthentication|[Nn][Oo][Tt][[:space:]]authorized|[Rr]esource[[:space:]]not[[:space:]]accessible'
        if [[ "$error_message" =~ $authentication_error_pattern ]]; then
            : >"$actual_normalized"
            write_diagnostic "$last_reason" "$attempt"
            fail "unable to fetch issue #$issue_number from $repository: $error_message"
        fi
    elif ! jq -e 'type == "object" and has("body")' "$response_path" >/dev/null 2>&1; then
        last_reason="GitHub REST response was invalid JSON."
    else
        jq -b -j '.body // ""' "$response_path" >"$actual_path"
        normalize_file "$actual_path" "$actual_normalized"
        if equivalent_files "$actual_normalized" "$expected_normalized"; then
            cat "$response_path"
            exit 0
        fi
        last_reason="GitHub issue body differs from the persisted draft."
    fi

    if [[ $attempt -lt $max_attempts ]]; then
        printf 'verify-github-issue-body: %s Retrying issue #%s body verification (%s/%s).\n' \
            "$last_reason" "$issue_number" "$attempt" "$max_attempts" >&2
        ((delay_seconds > 0)) && sleep "$delay_seconds"
    fi
done

[[ -f "$actual_normalized" ]] || : >"$actual_normalized"
write_diagnostic "$last_reason" "$max_attempts"
diagnostic_suffix=""
[[ -z "$diagnostic_path" ]] || diagnostic_suffix=" Diagnostic: $diagnostic_path"
fail "issue #$issue_number body verification failed after $max_attempts attempts. $last_reason$diagnostic_suffix"
```

</details>


---

<sub>33s</sub>

### `view`

**view the file at /home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh.**

/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh (lines 1-260)

<details>
<summary>30 lines</summary>

```
#!/usr/bin/env bash
# shepherd-task-version: 1.0.4

set -euo pipefail

if [[ $# -ne 3 ]]; then
    echo "Usage: $0 <PRE_CREATION_CHILDREN_JSON> <FINAL_CHILDREN_JSON> <CREATION_LEDGER_JSON>" >&2
    exit 2
fi

for command_name in jq; do
    command -v "$command_name" >/dev/null 2>&1 || {
        echo "Error: Required command '$command_name' was not found." >&2
        exit 1
    }
done

script_dir="$(cd "$(dirname "$0")" && pwd)"
filter_path="$script_dir/verify-stage20-child-links.jq"
[[ -f "$filter_path" ]] || {
    echo "Error: Stage-20 child-link verification filter was not found: $filter_path" >&2
    exit 1
}

for input_path in "$@"; do
    [[ -f "$input_path" ]] || {
        echo "Error: Stage-20 child-link verification input was not found: $input_path" >&2
        exit 1
    }
done

jq -n \
    --slurpfile baseline "$1" \
    --slurpfile final "$2" \
    --slurpfile ledger "$3" \
    -f "$filter_path"
```

</details>


---

<sub>38s</sub>

### Copilot

All nine gating questions have substantive resolution blocks: UI exposure is limited to the Not Routed table; mutation replaces the route specification through the aggregate while preserving itinerary; the facade uses `String` plus `Date`; the editor parses the date-only DTO value; the established view/session bean and dynamic-dialog contracts apply; only non-null validation is added; and the five-test Open Liberty/package/runtime evidence is required. No blocking decision is unresolved, so I’m persisting all five complete issue specifications before running the mandatory draft validator.

---

<sub>1m 24s</sub>

### `apply_patch`

<details>
<summary>Arguments</summary>

````json
"*** Begin Patch\n*** Add File: /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/01-4-1-body.md\n+## Campaign context and required reading\n+\n+On the `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, including `### Domain acceptance behavior` and `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.3 — What should happen to an existing itinerary and delivery state?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.1 — Issue 1: Add the application-layer deadline change operation`\n+- `## Cross-cutting concerns`\n+\n+The resolved design is to load the cargo by `TrackingId`, construct a replacement `RouteSpecification` from the cargo's existing origin, existing destination, and supplied deadline, call `Cargo.specifyNewRoute(...)`, and persist with `CargoRepository.store(...)`. Preserve the assigned itinerary and let the aggregate recalculate delivery and routing state; in the established sequential test the itinerary remains unchanged and routing remains `MISROUTED`.\n+\n+Research established that the existing injected `CargoRepository` is available in `BookingServiceTest`; do not introduce a second persistence access path or test-level `EntityManager`.\n+\n+## Branch and execution order\n+\n+Target `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` from remote `origin`. This is task 1 of 5. Tasks are assigned, completed, and merged serially in plan order. Do not start until assigned; later tasks must not begin until this task's gates pass and its PR is merged.\n+\n+Use Java 17, Java EE 7 and `javax.*`, the existing Maven compiler configuration, Open Liberty, and the `cargo-tracker.war` deployment. Run Maven Wrapper commands from `demo/` with the repository-required Java 17 environment.\n+\n+## Implement\n+\n+Add `void changeDeadline(TrackingId trackingId, Date deadline)` to:\n+\n+- `demo/src/main/java/org/eclipse/cargotracker/application/BookingService.java`\n+- `demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`\n+\n+The implementation must:\n+\n+1. Load with `cargoRepository.find(trackingId)`.\n+2. Retain `cargo.getOrigin()` and `cargo.getRouteSpecification().getDestination()`.\n+3. Construct a replacement `RouteSpecification` with those values and the supplied deadline.\n+4. Apply it through `cargo.specifyNewRoute(...)`.\n+5. Store through `cargoRepository.store(cargo)`.\n+6. Log the tracking ID and deadline at `Level.INFO` consistently with `changeDestination(...)`.\n+\n+Extend `demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java` with the ordered `testChangeDeadline()` method immediately after `testChangeDestination()`. Advance the original deadline by one month, invoke the service, reload through the injected repository, and assert:\n+\n+- origin remains Chicago and destination remains Helsinki;\n+- the stored deadline is the same calendar day requested;\n+- the assigned itinerary is unchanged;\n+- transport status is `NOT_RECEIVED`;\n+- last known location is `Location.UNKNOWN`;\n+- current voyage is `Voyage.NONE`;\n+- the cargo is not misdirected;\n+- ETA is `Delivery.ETA_UNKOWN`;\n+- next expected activity is `Delivery.NO_ACTIVITY`;\n+- the cargo is not unloaded at destination;\n+- routing status is `MISROUTED`.\n+\n+Write the test first where practical. Preserve all four existing ordered methods.\n+\n+## Completion gates\n+\n+- From `demo/`, `./mvnw -Popenliberty -Dtest=BookingServiceTest clean test` runs five tests with zero failures, errors, or skipped tests.\n+- From `demo/`, `./mvnw clean package -Popenliberty` succeeds with Java 17.\n+- The extensible integration-test CI gate passes without workflow changes.\n+- The diff is limited to the two application files and `BookingServiceTest`; no web, facade, REST, Liberty, persistence configuration, namespace, or dependency change is present.\n+- Tests prove the replacement deadline and every preserved/recalculated field listed above, preventing a persistence-only mutation from passing.\n+\n+## Out of scope\n+\n+- No JSF, PrimeFaces, facade, DTO, dialog, or dashboard work.\n+- No mutable deadline setter on `Cargo` or `RouteSpecification`.\n+- No direct persistence-field update, itinerary clearing/replacement, rerouting, or new chronological policy.\n+- No Jakarta migration, runtime replacement, dependency modernization, or feature-bearing commit/file reuse.\n*** Add File: /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/02-4-2-body.md\n+## Campaign context and required reading\n+\n+On the `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, including `### Hard scope constraints`\n+- `### 3.2 — What is the exact domain mutation?`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.2 — Issue 2: Expose deadline changes through the booking facade`\n+- `## Cross-cutting concerns`\n+\n+The resolved boundary is `void changeDeadline(String trackingId, Date arrivalDeadline)`. `DefaultBookingServiceFacade` converts only the identifier with `new TrackingId(trackingId)` and passes the same `Date` to the application service. No command DTO, formatted-string service parameter, domain object, or repository operation belongs in the web-facing facade.\n+\n+Research established that a focused container-free delegation test may use a hand-written fake or spy; adding a mocking dependency for this operation is rejected.\n+\n+## Branch and execution order\n+\n+Target `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` from remote `origin`. This is task 2 of 5 and depends on task 1 being merged. Tasks are assigned, completed, and merged serially in plan order. Do not start until assigned and task 1's gates are satisfied.\n+\n+Use Java 17, Java EE 7 and `javax.*`, the existing Maven compiler configuration, and Open Liberty. Run Maven Wrapper commands from `demo/` with the repository-required Java 17 environment.\n+\n+## Implement\n+\n+Modify:\n+\n+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`\n+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`\n+\n+Add:\n+\n+```java\n+void changeDeadline(String trackingId, Date arrivalDeadline);\n+```\n+\n+Delegate exactly once:\n+\n+```java\n+bookingService.changeDeadline(\n+        new TrackingId(trackingId),\n+        arrivalDeadline);\n+```\n+\n+If practical within the existing test conventions, add `demo/src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java` with a hand-written `BookingService` fake/spy proving:\n+\n+- the string becomes an equivalent `TrackingId`;\n+- the same `Date` object/value reaches the application service;\n+- delegation occurs exactly once;\n+- the facade performs no repository work.\n+\n+Preserve all existing facade consumers and the application behavior merged in task 1.\n+\n+## Completion gates\n+\n+- From `demo/`, `./mvnw clean package -Popenliberty` succeeds with Java 17.\n+- Existing facade consumers compile unchanged.\n+- The task-1 `BookingServiceTest` remains unchanged and compiling.\n+- Any focused test uses only existing test dependencies and discriminates identifier conversion, date forwarding, and exactly-once delegation.\n+- The facade contains no cargo loading/mutation, repository access, date parsing, or JSF/PrimeFaces type.\n+- The diff is confined to facade API/implementation and, if added, the focused facade test.\n+\n+## Out of scope\n+\n+- No application-layer redesign or changes to task 1's domain test.\n+- No backing bean, XHTML, dialog launcher, dashboard integration, date parsing, or UI validation.\n+- No new DTO, mocking framework, dependency upgrade, Jakarta namespace migration, or server/configuration change.\n*** Add File: /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/03-4-3-body.md\n+## Campaign context and required reading\n+\n+On the `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, including `### User-visible acceptance behavior` and `### Hard scope constraints`\n+- `### 3.4 — What type crosses the facade boundary?`\n+- `### 3.5 — How is the DTO's formatted deadline converted for editing?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.3 — Issue 3: Implement the deadline editor backing model`\n+- `## Cross-cutting concerns`\n+\n+The resolved editor is a serializable CDI `@Named @ViewScoped` bean. It loads only through `BookingServiceFacade`, keeps `CargoRoute` as its DTO, and parses the DTO's date representation with a per-load `SimpleDateFormat(\"MM/dd/yyyy\")`; no shared mutable formatter or domain access is allowed. A selected date is required, but no future-date, after-old-deadline, or itinerary chronology rule is added.\n+\n+Research established that the DTO exposes a date-only value suitable for `MM/dd/yyyy` parsing and that parse/lookup/update failures must be surfaced explicitly rather than converted to null, printed, swallowed, or followed by a success-shaped dialog close.\n+\n+## Branch and execution order\n+\n+Target `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` from remote `origin`. This is task 3 of 5 and depends on tasks 1 and 2 being merged. Tasks are assigned, completed, and merged serially in plan order. Do not start until assigned and all preceding gates pass.\n+\n+Use Java 17, Java EE 7 and `javax.*`, the established JSF/CDI APIs, the existing Maven compiler configuration, and Open Liberty.\n+\n+## Implement\n+\n+Create:\n+\n+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`\n+\n+Implement a serializable CDI `@Named @ViewScoped` bean with `serialVersionUID = 1L` and:\n+\n+- `String trackingId`;\n+- `CargoRoute cargo`;\n+- `Date arrivalDeadlineDate`;\n+- injected `BookingServiceFacade bookingServiceFacade`;\n+- tracking ID getter/setter;\n+- cargo getter;\n+- arrival-deadline getter/setter;\n+- `load()`;\n+- `changeArrivalDeadline()`.\n+\n+`load()` must call `bookingServiceFacade.loadCargoForRouting(trackingId)`, retain the returned DTO, parse `cargo.getArrivalDeadlineDate()` using a newly created `SimpleDateFormat(\"MM/dd/yyyy\")`, and retain the parsed `Date`. Surface malformed data as a clear application/view error consistent with existing JSF behavior.\n+\n+`changeArrivalDeadline()` must reject null, delegate `trackingId` and `arrivalDeadlineDate` to `bookingServiceFacade.changeDeadline(...)`, and only after successful delegation call:\n+\n+```java\n+PrimeFaces.current().dialog().closeDynamic(\"DONE\");\n+```\n+\n+Add a focused container-free test where practical using a hand-written fake facade. Prove the correct tracking ID is loaded, an `MM/dd/yyyy` value becomes the editable date, submit forwards the selected date and ID, malformed DTO data is surfaced, null is rejected, and a failed facade call cannot reach the close step. Follow existing repository patterns for injecting the fake without weakening production visibility.\n+\n+## Completion gates\n+\n+- From `demo/`, `./mvnw clean package -Popenliberty` succeeds with Java 17.\n+- The bean is serializable and has the established CDI `@Named @ViewScoped` lifecycle.\n+- Production code references facade DTOs only and has no domain or repository imports.\n+- Date parsing uses a per-load formatter and failures are explicit.\n+- Null submission is rejected; no chronological business rule is introduced.\n+- Focused tests, if practical under current conventions, discriminate successful loading/delegation from malformed, null, and facade-failure paths without a new mocking dependency.\n+- No dialog launcher or XHTML is added in this task.\n+\n+## Out of scope\n+\n+- No dialog launcher, dynamic-dialog XHTML, dashboard link, table refresh, or destination-dialog change.\n+- No `CargoRoute` contract expansion, command DTO, repository query, domain mutation, shared formatter, or formatted-string service API.\n+- No new date business policy, dependency, namespace migration, runtime change, or unrelated modernization.\n*** Add File: /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/04-4-4-body.md\n+## Campaign context and required reading\n+\n+On the `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, including `### User-visible acceptance behavior` and `### Hard scope constraints`\n+- `### Phase 1 ✅ — Establish a runnable feature-absent baseline`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog`\n+- `## Cross-cutting concerns`\n+\n+The resolved interaction mirrors Change Destination: a serializable session-scoped JSF managed launcher opens a PrimeFaces dynamic dialog, while task 3's view-scoped editor owns load/submit state. The dialog takes one `trackingId`; options are modal `true`, draggable `true`, resizable `false`, width `410`, and height `280`. Success closes with `\"DONE\"` and cancel with `\"\"`.\n+\n+Research established that Open Liberty's MyFaces requires `<f:metadata>` directly under the root `<html>`, before `<h:head>` and `<h:body>`; nesting it in the body causes runtime failures. Implement from the production contract rather than adapting research code.\n+\n+## Branch and execution order\n+\n+Target `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` from remote `origin`. This is task 4 of 5 and depends on tasks 1-3 being merged. Tasks are assigned, completed, and merged serially in plan order. Do not start until assigned and preceding gates pass.\n+\n+Use Java 17, Java EE 7 and `javax.*`, PrimeFaces 8, the existing Maven compiler configuration, and Open Liberty.\n+\n+## Implement\n+\n+Create:\n+\n+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`\n+- `demo/src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`\n+\n+The launcher must be serializable and use:\n+\n+```java\n+@ManagedBean(name = \"changeArrivalDeadlineDateDialog\")\n+@SessionScoped\n+```\n+\n+Implement `showDialog(String trackingId)`, `handleReturn(SelectEvent event)`, and `cancel()`. `showDialog` passes `trackingId` as a `Map<String, List<String>>` parameter and opens `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with the exact resolved options. `cancel()` closes with an empty string and never calls the facade. Preserve the existing destination-dialog return/refresh conventions.\n+\n+The XHTML must:\n+\n+- set `<title>Change Deadline</title>`;\n+- place `<f:metadata>` directly below root `<html>` and before `<h:head>`;\n+- bind `trackingId` to `#{changeArrivalDeadlineDate.trackingId}`;\n+- invoke `#{changeArrivalDeadlineDate.load}` through `<f:viewAction>`;\n+- display labeled, read-only origin and destination values;\n+- bind a required `p:datePicker` to `#{changeArrivalDeadlineDate.arrivalDeadlineDate}` with associated validation feedback;\n+- provide Cancel through `changeArrivalDeadlineDateDialog.cancel()`;\n+- provide Update through `changeArrivalDeadlineDate.changeArrivalDeadline()`.\n+\n+The direct URL `/cargo-tracker/admin/dialogs/changeArrivalDeadlineDate.xhtml?trackingId=DEF789` must render independently before dashboard integration.\n+\n+## Completion gates\n+\n+- From `demo/`, `./mvnw clean package -Popenliberty liberty:run` starts successfully with Java 17; stop Liberty cleanly after verification.\n+- The direct `DEF789` dialog URL returns HTTP 200, title **Change Deadline**, correct origin/destination, and the selected existing deadline.\n+- Required-value validation leaves the dialog open and shows normal Faces feedback.\n+- Cancel leaves the persisted deadline unchanged; Update changes it and closes only after success.\n+- Runtime output contains no `TagException`, `Parent UIComponent`, `FacesException`, application server error, or feature-attributable FFDC.\n+- Existing destination editing still works.\n+- Metadata placement and all five dialog options exactly match the resolved contract.\n+\n+## Out of scope\n+\n+- No modification to `listNotRouted.xhtml`; dashboard wiring is task 5.\n+- No alternate navigation page, inline editing framework, domain/repository access, new date policy, or facade redesign.\n+- No Jakarta migration, runtime replacement, dependency modernization, or unrelated UI redesign.\n*** Add File: /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/05-4-5-body.md\n+## Campaign context and required reading\n+\n+On the `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` branch, the directory `1-arrival-deadline-control-remove-before-merge` contains the plan (`add-change-arrival-deadline-feature-ignorance-reduction-plan.md`) and supporting resources (diagrams, decision records). Spike subdirectories are research artifacts — read the plan's Resolution sections for findings, not the spike source code.\n+\n+Read the entire plan before working. Then re-read these exact sections:\n+\n+- `## Goal`, including `### User-visible acceptance behavior`, `### Domain acceptance behavior`, and `### Hard scope constraints`\n+- `### 3.1 — Which cargos expose the edit operation?`\n+- `### 3.6 — Which JSF bean scopes and interaction pattern should be used?`\n+- `### 3.7 — What is the dynamic-dialog contract?`\n+- `### 3.8 — What date validation is required?`\n+- `### 3.9 — How will the feature be tested on the prepared historical baseline?`\n+- `### 4.5 — Issue 5: Integrate deadline editing into the Administration dashboard`\n+- `## Phase 5 — Documentation and implementation handoff`\n+- `## Cross-cutting concerns`\n+\n+The resolved UI scope is only the Not Routed Cargo table. The application/facade remain generally callable, but do not add the affordance to routed, misrouted, claimed, details, or other tables. The caller listens for `dialogReturn`, invokes the launcher return handler, and updates `tableNotRouted`.\n+\n+Research established that the adjacent Destination column is the production interaction pattern: retain visible table text, add a command-link/edit icon and tooltip, open the dynamic dialog, and refresh the table after successful return. Existing destination editing and routing navigation are regression contracts, not templates to replace.\n+\n+## Branch and execution order\n+\n+Target `edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control` from remote `origin`. This is task 5 of 5 and depends on tasks 1-4 being merged. Tasks are assigned, completed, and merged serially in plan order. Do not start until assigned and all preceding gates pass.\n+\n+Use Java 17, Java EE 7 and `javax.*`, PrimeFaces 8, the existing Maven compiler configuration, Open Liberty, and the in-memory Derby sample data.\n+\n+## Implement\n+\n+Modify:\n+\n+- `demo/src/main/webapp/admin/tables/listNotRouted.xhtml`\n+\n+Within the existing Deadline column, replace plain text with a `p:commandLink` that:\n+\n+- calls `changeArrivalDeadlineDateDialog.showDialog(cargoNotRouted.trackingId)`;\n+- continues to display `cargoNotRouted.arrivalDeadlineDate`;\n+- includes the existing Font Awesome edit-icon style;\n+- uses a stable component ID such as `arrivalDeadlineToUpdate`;\n+- includes a `dialogReturn` listener invoking `changeArrivalDeadlineDateDialog.handleReturn`;\n+- updates `tableNotRouted`;\n+- has the exact tooltip `Click to change cargo arrival deadline date.`\n+\n+Follow the adjacent Destination column's established structure and styling without changing destination editing, tracking-ID routing, or other tables.\n+\n+If `demo/README.md` enumerates user-facing Administration capabilities, add one concise sentence that administrators can change an unrouted cargo's arrival deadline; otherwise leave it unchanged.\n+\n+Record runtime evidence using stable cargo `DEF789`, including before/after displayed dates and the exact run command:\n+\n+```bash\n+cd demo && ./mvnw clean package -Popenliberty liberty:run\n+```\n+\n+State in the PR evidence that sample data is in memory and resets after rebuild/restart.\n+\n+## Completion gates\n+\n+- From `demo/`, `./mvnw clean package -Popenliberty` succeeds with Java 17.\n+- `./mvnw -Popenliberty -Dtest=BookingServiceTest clean test` executes all five ordered tests with zero failures, errors, or skipped tests.\n+- Start the clean application, confirm home and Administration return HTTP 200, and stop Liberty cleanly afterward.\n+- For `DEF789`, verify the edit icon and exact tooltip, correct dialog context/current date, update/close/table refresh, changed value after browser reload, changed value on dialog reopen, and Cancel causing no further change.\n+- Verify Destination editing still opens and selecting `DEF789` for routing does not produce an error page.\n+- Runtime logs contain none of `<f:metadata> Parent UIComponent`, `TagException`, `VerifyError`, `FacesException`, `CWWKZ0002E`, `CWWKZ0003E`, recurring batch authorization failures, or new feature-attributable FFDC. Transient JMS activation-order warnings are acceptable only when all endpoints subsequently activate.\n+- No Java EE namespace migration or reversal of the prepared Liberty, Derby, Jackson, JSF metadata, batch authorization, REST, messaging, or startup compatibility behavior occurred.\n+- The final diff affects only intended application/facade/web/dialog/table/test surfaces plus the conditional one-line README update.\n+\n+## Out of scope\n+\n+- No deadline affordance outside the Not Routed Cargo table.\n+- No redesign of destination editing, routing, tracking, messaging, batch, REST, persistence, or unrelated Administration UI.\n+- No new chronological rule, timezone policy, runtime, database, framework, dependency modernization, or Jakarta migration.\n*** End Patch\n"
````

</details>

```
Added 5 file(s): /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/01-4-1-body.md, /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/02-4-2-body.md, /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/03-4-3-body.md, /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/04-4-4-body.md, /home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410/issue-bodies/05-4-5-body.md
```


---

<sub>1m 29s</sub>

### `bash`

**Validate persisted issue drafts**

$ set -euo pipefail
LOG='/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410'
VALIDATOR='/home/edburns/.copilot/plugins/shepherd-task/scripts/validate-stage20-drafts.sh'
"$VALIDATOR" "$LOG/issue-bodies" 5 off
for f in "$LOG"/issue-bodies/*-body.md; do
  printf '%s lines=%s bytes=%s first=%s\n' "$(basename "$f")" "$(wc -l < "$f")" "$(wc -c < "$f")" "$(awk 'NF {print; exit}' "$f")"
done

<details>
<summary>6 lines</summary>

```
01-4-1-body.md lines=69 bytes=4691 first=## Campaign context and required reading
02-4-2-body.md lines=67 bytes=3716 first=## Campaign context and required reading
03-4-3-body.md lines=68 bytes=4651 first=## Campaign context and required reading
04-4-4-body.md lines=69 bytes=4669 first=## Campaign context and required reading
05-4-5-body.md lines=70 bytes=5166 first=## Campaign context and required reading
<shellId: 2 completed with exit code 0>
```

</details>


---

<sub>1m 40s</sub>

### Copilot

The persisted drafts passed the mandatory validator with all required physical headings and multiline content. I’m starting the one-shot mutation now: each issue will be created, body-verified against its persisted file, linked, and ledgered before moving to the next; any failure will stop creation and trigger read-only reconciliation without rollback.

---

<sub>2m 11s</sub>

### `bash`

**Create, verify, and link child issues**

$ set -uo pipefail
REPO='edburns/dd-3072707-tricket-out-cargotracker-run-03'
PARENT=1
LOG='/home/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03-shepherd-control/1-arrival-deadline-control-remove-before-merge/prompts/shepherd-task-20-20261002-1410'
BODY_VERIFIER='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-github-issue-body.sh'
LINK_VERIFIER='/home/edburns/.copilot/plugins/shepherd-task/scripts/verify-stage20-child-links.sh'
LEDGER="$LOG/creation-ledger.json"
RESULT="$LOG/stage-20-result.json"
FINAL="$LOG/final-children.json"

atomic_write() {
  local path="$1" content="$2" tmp
  tmp="${path}.tmp.$$"
  printf '%s\n' "$content" > "$tmp" && mv "$tmp" "$path"
}

update_ledger_flag() {
  local number="$1" field="$2" value="$3" updated
  updated="$(
    jq \
      --argjson number "$number" \
      --arg field "$field" \
      --argjson value "$value" \
      'map(if .number == $number then .[$field] = $value else . end)' \
      "$LEDGER"
  )" || return 1
  atomic_write "$LEDGER" "$updated"
}

reconcile_and_fail() {
  local operation="$1" detail="$2" raw normalized reconciled result_json
  if raw="$(gh api "repos/$REPO/issues/$PARENT/sub_issues" --paginate --slurp 2>&1)"; then
    if normalized="$(printf '%s' "$raw" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end')"; then
      reconciled="$(jq --argjson children "$normalized" '
        map(. as $entry | .linked = ([$children[] | select(.id == $entry.id)] | length == 1))
      ' "$LEDGER")" && atomic_write "$LEDGER" "$reconciled"
    else
      detail="$detail; reconciliation normalization failed"
    fi
  else
    detail="$detail; reconciliation query failed: $raw"
  fi
  result_json="$(jq -n --arg error "$operation: $detail" '{schemaVersion:1,status:"failed",ledgerFile:"creation-ledger.json",operationError:$error}')"
  atomic_write "$RESULT" "$result_json"
  printf 'FAILED_OPERATION=%s\nERROR=%s\n' "$operation" "$detail" >&2
  jq -r '.[] | "LEDGER issue #\(.number) | \(.title) | \(.url) | \(.bodyFile) | body_verified=\(.body_verified) | linked=\(.linked)"' "$LEDGER" >&2
  jq -r '.[] | "gh issue delete \(.number) --repo \"edburns/dd-3072707-tricket-out-cargotracker-run-03\" --yes"' "$LEDGER" >&2
  exit 1
}

atomic_write "$LEDGER" '[]'
atomic_write "$RESULT" '{"schemaVersion":1,"status":"in_progress","ledgerFile":"creation-ledger.json","operationError":null}'

titles=(
  '4.1 — Add the application-layer deadline change operation'
  '4.2 — Expose deadline changes through the booking facade'
  '4.3 — Implement the deadline editor backing model'
  '4.4 — Implement the PrimeFaces deadline dialog'
  '4.5 — Integrate deadline editing into the Administration dashboard'
)
subsections=('4.1' '4.2' '4.3' '4.4' '4.5')
files=('01-4-1-body.md' '02-4-2-body.md' '03-4-3-body.md' '04-4-4-body.md' '05-4-5-body.md')

for i in 0 1 2 3 4; do
  title="${titles[$i]}"
  subsection="${subsections[$i]}"
  rel="issue-bodies/${files[$i]}"
  body="$LOG/$rel"
  set +e
  created="$(gh api "repos/$REPO/issues" -X POST -f title="$title" -F "body=@$body" --jq '{id,number,node_id,html_url,title}' 2>&1)"
  create_ec=$?
  set -e
  [[ $create_ec -eq 0 ]] || reconcile_and_fail "create issue for $subsection" "$created"
  if ! printf '%s' "$created" | jq -e 'type=="object" and (.id|type=="number") and (.number|type=="number") and (.html_url|type=="string")' >/dev/null; then
    reconcile_and_fail "parse created issue for $subsection" "Unexpected response: $created"
  fi
  id="$(printf '%s' "$created" | jq -r '.id')"
  number="$(printf '%s' "$created" | jq -r '.number')"
  url="$(printf '%s' "$created" | jq -r '.html_url')"
  actual_title="$(printf '%s' "$created" | jq -r '.title')"
  appended="$(jq \
    --arg implementationSubsection "$subsection" \
    --arg bodyFile "$rel" \
    --argjson id "$id" \
    --argjson number "$number" \
    --arg title "$actual_title" \
    --arg url "$url" \
    '. + [{implementationSubsection:$implementationSubsection,bodyFile:$bodyFile,id:$id,number:$number,title:$title,url:$url,body_verified:false,linked:false}]' \
    "$LEDGER")" || reconcile_and_fail "append ledger for issue #$number" "jq ledger update failed"
  atomic_write "$LEDGER" "$appended" || reconcile_and_fail "persist ledger for issue #$number" "atomic ledger write failed"

  set +e
  issue_json="$("$BODY_VERIFIER" "$REPO" "$number" "$body" 6 5 "$LOG/issue-$number-body-verification-failure.json" 2>&1)"
  verify_ec=$?
  set -e
  [[ $verify_ec -eq 0 ]] || reconcile_and_fail "verify body for issue #$number" "$issue_json"
  update_ledger_flag "$number" body_verified true || reconcile_and_fail "persist body verification for issue #$number" "ledger flag update failed"

  linked_ok=false
  link_errors=''
  for attempt in 1 2 3; do
    set +e
    link_output="$(printf '{"sub_issue_id": %s}' "$id" | gh api "repos/$REPO/issues/$PARENT/sub_issues" -X POST --input - 2>&1)"
    link_ec=$?
    set -e
    if [[ $link_ec -eq 0 ]]; then linked_ok=true; break; fi
    link_errors="attempt $attempt: $link_output"
    [[ $attempt -eq 3 ]] || sleep 2
  done
  [[ $linked_ok == true ]] || reconcile_and_fail "link issue #$number to parent #$PARENT" "$link_errors"
  update_ledger_flag "$number" linked true || reconcile_and_fail "persist link for issue #$number" "ledger flag update failed"
  printf 'CREATED_LINKED #%s %s\n' "$number" "$url"
done

set +e
final_raw="$(gh api "repos/$REPO/issues/$PARENT/sub_issues" --paginate --slurp 2>&1)"
final_ec=$?
set -e
[[ $final_ec -eq 0 ]] || reconcile_and_fail 'fetch final child snapshot' "$final_raw"
set +e
final_normalized="$(printf '%s' "$final_raw" | jq 'if length == 0 then [] elif all(.[]; type == "array") then add else . end' 2>&1)"
normalize_ec=$?
set -e
[[ $normalize_ec -eq 0 ]] || reconcile_and_fail 'normalize final child snapshot' "$final_normalized"
atomic_write "$FINAL" "$final_normalized" || reconcile_and_fail 'persist final child snapshot' 'atomic write failed'

set +e
link_check="$("$LINK_VERIFIER" "$LOG/pre-creation-children.json" "$FINAL" "$LEDGER" 2>&1)"
link_check_ec=$?
set -e
[[ $link_check_ec -eq 0 ]] || reconcile_and_fail 'verify child links and order' "$link_check"

while IFS=$'\t' read -r number rel; do
  set +e
  final_issue="$("$BODY_VERIFIER" "$REPO" "$number" "$LOG/$rel" 6 5 "$LOG/issue-$number-final-body-verification-failure.json" 2>&1)"
  body_ec=$?
  set -e
  [[ $body_ec -eq 0 ]] || reconcile_and_fail "final body verification for issue #$number" "$final_issue"
  if ! printf '%s' "$final_issue" | jq -e '.state == "open" and (.assignees | type == "array" and length == 0)' >/dev/null; then
    reconcile_and_fail "verify state and assignees for issue #$number" "Issue is not open and unassigned"
  fi
done < <(jq -r '.[] | [.number,.bodyFile] | @tsv' "$LEDGER")

atomic_write "$RESULT" '{"schemaVersion":1,"status":"complete","ledgerFile":"creation-ledger.json","operationError":null}'
printf 'FINAL_STATUS=complete\n'
jq -r '.[] | [.implementationSubsection,(.number|tostring),.title,.url] | @tsv' "$LEDGER"

<details>
<summary>12 lines</summary>

```
CREATED_LINKED #2 https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/2
CREATED_LINKED #3 https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/3
CREATED_LINKED #4 https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/4
CREATED_LINKED #5 https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/5
CREATED_LINKED #6 https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/6
FINAL_STATUS=complete
4.1	2	4.1 — Add the application-layer deadline change operation	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/2
4.2	3	4.2 — Expose deadline changes through the booking facade	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/3
4.3	4	4.3 — Implement the deadline editor backing model	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/4
4.4	5	4.4 — Implement the PrimeFaces deadline dialog	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/5
4.5	6	4.5 — Integrate deadline editing into the Administration dashboard	https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/6
<shellId: 3 completed with exit code 0>
```

</details>


---

<sub>2m 21s</sub>

### Copilot

Created and linked all five ordered child issues to #1. They are open, unassigned, body-verified, and were created **without an issue type** because the repository is user-owned.

| Subsection | Issue | Title |
|---|---:|---|
| 4.1 | [#2](https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/2) | Add the application-layer deadline change operation |
| 4.2 | [#3](https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/3) | Expose deadline changes through the booking facade |
| 4.3 | [#4](https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/4) | Implement the deadline editor backing model |
| 4.4 | [#5](https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/5) | Implement the PrimeFaces deadline dialog |
| 4.5 | [#6](https://github.com/edburns/dd-3072707-tricket-out-cargotracker-run-03/issues/6) | Integrate deadline editing into the Administration dashboard |

**Ordered child list:** `2,3,4,5,6`

**Suggested stage 25 handoff:** Invoke `shepherd-task-25-given-list` for campaign `a63d175f-0ce7-4430-850d-c134a707f88c`, repository `edburns/dd-3072707-tricket-out-cargotracker-run-03`, parent #1, plan directory `1-arrival-deadline-control-remove-before-merge`, and ordered issues `2,3,4,5,6`. Stage 25 should derive lesson propagation from the campaign manifest.

**Resolution validation:** All nine blocking questions contained substantive resolution blocks:

- **3.1:** “Select Option A. Expose the edit affordance only in `demo/src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade operations remain generally callable for any cargo that can be found by tracking ID; they do not encode knowledge of dashboard table membership.”
- **3.2:** “Use the same aggregate-update pattern as `changeDestination(...)`. Add `BookingService.changeDeadline(TrackingId, Date)` and implement it by loading the cargo, constructing a new `RouteSpecification` from the existing origin, existing destination, and supplied deadline, calling `cargo.specifyNewRoute(...)`, and storing the cargo through `cargoRepository.store(...)`. Do not add mutable deadline setters to the domain objects.”
- **3.3:** “Retain the existing itinerary. Do not clear, replace, or reroute it as part of the deadline change. `Cargo.specifyNewRoute(...)` recalculates the delivery snapshot and routing status against the replacement specification. In the established sequential application test, the assigned itinerary remains unchanged and the cargo remains `MISROUTED` after the deadline changes.”
- **3.4:** “Add `void changeDeadline(String trackingId, Date arrivalDeadline)` to `BookingServiceFacade`. `DefaultBookingServiceFacade` converts the string to `new TrackingId(trackingId)` and passes the same `Date` to `BookingService.changeDeadline(...)`. No new command DTO or formatted-string service parameter is introduced.”
- **3.5:** “Use Option A and keep date conversion inside the view-scoped editor bean. The existing implementation loads the `CargoRoute`, creates `new SimpleDateFormat("MM/dd/yyyy")`, and parses the leading date portion of `cargo.getArrivalDeadline()`. Because that value begins with `MM/dd/yyyy`, `SimpleDateFormat.parse(...)` obtains the same date that `getArrivalDeadlineDate()` displays. A per-load formatter is used, so no shared mutable formatter is added.”
- **3.6:** “Mirror the existing Change Destination interaction. Implement `ChangeArrivalDeadlineDate` as a serializable CDI `@Named @ViewScoped` bean and `ChangeArrivalDeadlineDateDialog` as a serializable `@ManagedBean(name = "changeArrivalDeadlineDateDialog") @SessionScoped` bean. Use a PrimeFaces dynamic dialog rather than navigation to a full page or inline cell editing.”
- **3.7:** “Open `/admin/dialogs/changeArrivalDeadlineDate.xhtml` with a single `trackingId` request parameter and these options: modal and draggable are `true`, resizable is `false`, content width is `410`, and content height is `280`. Successful submission closes with `"DONE"`; cancellation closes with the empty string. The caller handles `dialogReturn` and updates `tableNotRouted`. Place the dialog’s `<f:metadata>` directly under the root `<html>` element, before `<h:head>` and `<h:body>`, so the known MyFaces `UIViewRoot` requirement is satisfied.”
- **3.8:** “Require a non-null date selection, but add no new chronological business rule. In particular, do not require the replacement deadline to be after today, after the old deadline, or after every itinerary leg. Pass the selected `java.util.Date` to the existing domain construction path and let the current `RouteSpecification` invariants apply.”
- **3.9:** “Extend the existing sequential Arquillian `BookingServiceTest` with `testChangeDeadline()` after `testChangeDestination()`. The test changes the deadline by one month, reloads the cargo through the injected `CargoRepository`, and asserts the complete set of preserved and recalculated domain state described above. Require five passing `BookingServiceTest` methods, a successful JDK 17 Open Liberty package gate, direct HTTP checks, and the complete `DEF789` browser acceptance flow. No test-runtime modernization, second persistence access path, or new mocking dependency is part of this feature.”

---

<sub>Generated by [GitHub Copilot CLI](https://github.com/features/copilot/cli)</sub>
