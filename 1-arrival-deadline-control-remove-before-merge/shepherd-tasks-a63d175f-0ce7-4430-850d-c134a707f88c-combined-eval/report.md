# Shepherd Campaign Evaluation

- **Arm:** `treatment`
- **Campaign:** `a63d175f-0ce7-4430-850d-c134a707f88c`
- **Evaluator:** `0.4.2` at `5a9844592d40f24dd040fe8cb7a98bed00021975`
- **Evaluator worktree dirty:** false
- **Generated:** 2026-10-02T22:42:31.423350Z

## Headline findings

| Task | PR | First product-defect detection | Product defects | Nonzero exits | CCRA rounds | CCRA comments | Flaky tests |
|---:|---:|---|---:|---:|---:|---:|---:|
| 2 | 7 | formatting | 4 | 3 | 1 | 0 | 0 |
| 3 | 8 | formatting | 8 | 4 | 1 | 0 | 0 |
| 4 | 9 | formatting | 9 | 5 | 2 | 1 | 0 |
| 5 | 10 | formatting | 3 | 6 | 1 | 0 | 0 |
| 6 | 11 | stage_30_gate | 1 | 2 | 1 | 0 | 0 |

## Cost and timing

- Campaign wall clock: 6h 57m 06s
- Recorded session time: 4h 13m 11s
- JSONL exact session time: 15196425 ms (5425 ms above second-truncated Markdown headers)
- Orchestration overhead: 1h 17m 24s
- CCA wait proxy: 5 polls / 0h 22m 29s elapsed; 0h 50m 00s configured ceiling
- AIU: 1051.08386
- Premium requests: 11

## Evidence and run invariants

- CI tests run: unavailable (`measured`)
- Partial output: 6043179 Unicode code points / 6043213 UTF-16 code units
- Skill content verification: `unverified`; telemetry hashes identify skill names, not content

## Acceptance checks

| Check | Status | Observed |
|---|---|---|
| maven_project_root_recorded | **pass** | `{"a6c5a1dd5b71372279741aa220794b59d01d6755":"demo","f3214c3e56cb2cf55c9d2d78dad9920812640b8d":"demo","e74be0ea977570bf607db4d623203a2a31b7c049":"demo","a5f22af5a81acd6ebce718625642ae23efde00eb":"demo","fd68cb3bd80da15cd982cba2980b40a00ca61c48":"demo","a4ed0b3dde3676f5880052db65fe2e729d32e7f0":"demo","0f9cebb0aed65a80c215270ee73fa2d584a9e0ef":"demo"}` |
| cross_repo_start_equivalence | **pass** | `{"guardrail_infrastructure":{"count":4,"paths":[".github/copilot-instructions.md",".github/workflows/main.yml",".github/workflows/shepherd-task-cargotracker.yml","demo/scripts/ci/run-openliberty-acceptance.sh"]},"relocation_only":{"count":155,"paths":["src/main/java/org/eclipse/cargotracker/application/ApplicationEvents.java -> demo/src/main/java/org/eclipse/cargotracker/application/ApplicationEvents.java","src/main/java/org/eclipse/cargotracker/application/BookingService.java -> demo/src/main/j
…` |
| ci_and_build_gates_classified | **pass** | `{"formatting":{"status":"present","entryCount":4},"static_analysis":{"status":"present","entryCount":5},"compiler":{"status":"present","entryCount":2},"unit_tests":{"status":"present","entryCount":8},"container_tests":{"status":"present","entryCount":2},"ci_other":{"status":"present","entryCount":73}}` |
| product_defect_gate_and_class_non_null | **pass** | `true` |
| guardrail_failures_not_unclassified | **pass** | `[]` |
| ci_test_log_availability_semantics | **pass** | `{"availability":"measured","testsExecuted":null,"testsRun":null,"source":"CI logs were captured but contained no Surefire/Failsafe summary."}` |
| combined_attempts_preserved | **pass** | `["/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-20261002-1414","/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-20261002-2058"]` |

## Start equivalence and confounds

| Classification | Count | Paths |
|---|---:|---|
| guardrail_infrastructure | 4 | [".github/copilot-instructions.md",".github/workflows/main.yml",".github/workflows/shepherd-task-cargotracker.yml","demo/scripts/ci/run-openliberty-acceptance.sh"] |
| relocation_only | 155 | ["src/main/java/org/eclipse/cargotracker/application/ApplicationEvents.java -> demo/src/main/java/org/eclipse/cargotracker/application/ApplicationEvents.java","src/main/java/org/eclipse/cargotracker/application/BookingService.java -> demo/src/main/java/org/eclipse/cargotracker/application/BookingService.java","src/main/java/org/eclipse/cargotracker/application/CargoInspectionService.java -> demo/src/main/java/org/eclipse/cargotracker/application/CargoInspectionService.java","src/main/java/org/eclipse/cargotracker/application/HandlingEventService.java -> demo/src/main/java/org/eclipse/cargotracker/application/HandlingEventService.java","src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java -> demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java","src/main/java/org/eclipse/cargotracker/application/internal/DefaultCargoInspectionService.java -> demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultCargoInspectionService.java","src/main/java/org/eclipse/cargotracker/application/internal/DefaultHandlingEventService.java -> demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultHandlingEventService.java","src/main/java/org/eclipse/cargotracker/application/internal/package.html -> demo/src/main/java/org/eclipse/cargotracker/application/internal/package.html","src/main/java/org/eclipse/cargotracker/application/package.html -> demo/src/main/java/org/eclipse/cargotracker/application/package.html","src/main/java/org/eclipse/cargotracker/application/util/DateUtil.java -> demo/src/main/java/org/eclipse/cargotracker/application/util/DateUtil.java","src/main/java/org/eclipse/cargotracker/application/util/LocationUtil.java -> demo/src/main/java/org/eclipse/cargotracker/application/util/LocationUtil.java","src/main/java/org/eclipse/cargotracker/application/util/SampleDataGenerator.java -> demo/src/main/java/org/eclipse/cargotracker/application/util/SampleDataGenerator.java","src/main/java/org/eclipse/cargotracker/application/util/package.html -> demo/src/main/java/org/eclipse/cargotracker/application/util/package.html","src/main/java/org/eclipse/cargotracker/domain/model/cargo/Cargo.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Cargo.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/CargoRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/CargoRepository.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/Delivery.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Delivery.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/HandlingActivity.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/HandlingActivity.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/Itinerary.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Itinerary.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/Leg.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Leg.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/RouteSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/RouteSpecification.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/RoutingStatus.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/RoutingStatus.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/TrackingId.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/TrackingId.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/TransportStatus.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/TransportStatus.java","src/main/java/org/eclipse/cargotracker/domain/model/cargo/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/package.html","src/main/java/org/eclipse/cargotracker/domain/model/handling/CannotCreateHandlingEventException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/CannotCreateHandlingEventException.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEvent.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEvent.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventFactory.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventFactory.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventRepository.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingHistory.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingHistory.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownCargoException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownCargoException.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownLocationException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownLocationException.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownVoyageException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownVoyageException.java","src/main/java/org/eclipse/cargotracker/domain/model/handling/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/package.html","src/main/java/org/eclipse/cargotracker/domain/model/location/Location.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/Location.java","src/main/java/org/eclipse/cargotracker/domain/model/location/LocationRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/LocationRepository.java","src/main/java/org/eclipse/cargotracker/domain/model/location/SampleLocations.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/SampleLocations.java","src/main/java/org/eclipse/cargotracker/domain/model/location/UnLocode.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/UnLocode.java","src/main/java/org/eclipse/cargotracker/domain/model/location/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/package.html","src/main/java/org/eclipse/cargotracker/domain/model/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/package.html","src/main/java/org/eclipse/cargotracker/domain/model/voyage/CarrierMovement.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/CarrierMovement.java","src/main/java/org/eclipse/cargotracker/domain/model/voyage/Schedule.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/Schedule.java","src/main/java/org/eclipse/cargotracker/domain/model/voyage/Voyage.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/Voyage.java","src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageNumber.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageNumber.java","src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageRepository.java","src/main/java/org/eclipse/cargotracker/domain/model/voyage/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/package.html","src/main/java/org/eclipse/cargotracker/domain/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/package.html","src/main/java/org/eclipse/cargotracker/domain/service/RoutingService.java -> demo/src/main/java/org/eclipse/cargotracker/domain/service/RoutingService.java","src/main/java/org/eclipse/cargotracker/domain/service/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/service/package.html","src/main/java/org/eclipse/cargotracker/domain/shared/AbstractSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/AbstractSpecification.java","src/main/java/org/eclipse/cargotracker/domain/shared/AndSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/AndSpecification.java","src/main/java/org/eclipse/cargotracker/domain/shared/DomainObjectUtils.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/DomainObjectUtils.java","src/main/java/org/eclipse/cargotracker/domain/shared/NotSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/NotSpecification.java","src/main/java/org/eclipse/cargotracker/domain/shared/OrSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/OrSpecification.java","src/main/java/org/eclipse/cargotracker/domain/shared/Specification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/Specification.java","src/main/java/org/eclipse/cargotracker/domain/shared/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/package.html","src/main/java/org/eclipse/cargotracker/infrastructure/events/cdi/CargoInspected.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/events/cdi/CargoInspected.java","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/CargoHandledConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/CargoHandledConsumer.java","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/DeliveredCargoConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/DeliveredCargoConsumer.java","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/HandlingEventRegistrationAttemptConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/HandlingEventRegistrationAttemptConsumer.java","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/MisdirectedCargoConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/MisdirectedCargoConsumer.java","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/RejectedRegistrationAttemptsConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/RejectedRegistrationAttemptsConsumer.java","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/package.html -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/package.html","src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaCargoRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaCargoRepository.java","src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaHandlingEventRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaHandlingEventRepository.java","src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaLocationRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaLocationRepository.java","src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaVoyageRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaVoyageRepository.java","src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/package.html -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/package.html","src/main/java/org/eclipse/cargotracker/infrastructure/routing/package.html -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/routing/package.html","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/Location.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/Location.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/package.html","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/CargoRouteDtoAssembler.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/CargoRouteDtoAssembler.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/LocationDtoAssembler.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/LocationDtoAssembler.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/package.html","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/package.html","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/package.html","src/main/java/org/eclipse/cargotracker/interfaces/booking/rest/CargoMonitoringService.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/rest/CargoMonitoringService.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoAdmin.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoAdmin.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoDetails.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoDetails.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeDestination.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeDestination.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ItinerarySelection.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ItinerarySelection.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ListCargo.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ListCargo.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/Registration.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/Registration.java","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/package.html","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemReader.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemReader.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemWriter.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemWriter.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/FileProcessorJobListener.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/FileProcessorJobListener.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/LineParseExceptionListener.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/LineParseExceptionListener.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/UploadDirectoryScanner.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/UploadDirectoryScanner.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/package.html","src/main/java/org/eclipse/cargotracker/interfaces/handling/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/package.html","src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReport.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReport.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReportService.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReportService.java","src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/package.html","src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/Track.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/Track.java","src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/package.html","src/main/java/org/eclipse/pathfinder/api/GraphTraversalService.java -> demo/src/main/java/org/eclipse/pathfinder/api/GraphTraversalService.java","src/main/java/org/eclipse/pathfinder/api/package.html -> demo/src/main/java/org/eclipse/pathfinder/api/package.html","src/main/java/org/eclipse/pathfinder/internal/package.html -> demo/src/main/java/org/eclipse/pathfinder/internal/package.html","src/main/java/org/eclipse/pathfinder/package.html -> demo/src/main/java/org/eclipse/pathfinder/package.html","src/main/liberty/config/bootstrap.properties -> demo/src/main/liberty/config/bootstrap.properties","src/main/resources/META-INF/batch-jobs/EventFilesProcessorJob.xml -> demo/src/main/resources/META-INF/batch-jobs/EventFilesProcessorJob.xml","src/main/resources/META-INF/beans.xml -> demo/src/main/resources/META-INF/beans.xml","src/main/resources/META-INF/persistence.xml -> demo/src/main/resources/META-INF/persistence.xml","src/main/resources/handling_events.csv -> demo/src/main/resources/handling_events.csv","src/main/resources/org/eclipse/cargotracker/messages.properties -> demo/src/main/resources/org/eclipse/cargotracker/messages.properties","src/main/webapp/WEB-INF/beans.xml -> demo/src/main/webapp/WEB-INF/beans.xml","src/main/webapp/WEB-INF/faces-config.xml -> demo/src/main/webapp/WEB-INF/faces-config.xml","src/main/webapp/WEB-INF/templates/common/admin.xhtml -> demo/src/main/webapp/WEB-INF/templates/common/admin.xhtml","src/main/webapp/WEB-INF/templates/common/public.xhtml -> demo/src/main/webapp/WEB-INF/templates/common/public.xhtml","src/main/webapp/WEB-INF/web.xml -> demo/src/main/webapp/WEB-INF/web.xml","src/main/webapp/admin/about.xhtml -> demo/src/main/webapp/admin/about.xhtml","src/main/webapp/admin/dashboard.xhtml -> demo/src/main/webapp/admin/dashboard.xhtml","src/main/webapp/admin/dialogs/changeDestination.xhtml -> demo/src/main/webapp/admin/dialogs/changeDestination.xhtml","src/main/webapp/admin/route.xhtml -> demo/src/main/webapp/admin/route.xhtml","src/main/webapp/admin/selectItinerary.xhtml -> demo/src/main/webapp/admin/selectItinerary.xhtml","src/main/webapp/admin/show.xhtml -> demo/src/main/webapp/admin/show.xhtml","src/main/webapp/admin/tables/listClaimed.xhtml -> demo/src/main/webapp/admin/tables/listClaimed.xhtml","src/main/webapp/admin/tables/listNotRouted.xhtml -> demo/src/main/webapp/admin/tables/listNotRouted.xhtml","src/main/webapp/admin/tables/listRouted.xhtml -> demo/src/main/webapp/admin/tables/listRouted.xhtml","src/main/webapp/admin/tracking/map.xhtml -> demo/src/main/webapp/admin/tracking/map.xhtml","src/main/webapp/admin/tracking/mapFrame.xhtml -> demo/src/main/webapp/admin/tracking/mapFrame.xhtml","src/main/webapp/admin/tracking/track.xhtml -> demo/src/main/webapp/admin/tracking/track.xhtml","src/main/webapp/booking/booking-date.xhtml -> demo/src/main/webapp/booking/booking-date.xhtml","src/main/webapp/booking/booking-destination.xhtml -> demo/src/main/webapp/booking/booking-destination.xhtml","src/main/webapp/booking/booking-flow.xml -> demo/src/main/webapp/booking/booking-flow.xml","src/main/webapp/booking/booking.xhtml -> demo/src/main/webapp/booking/booking.xhtml","src/main/webapp/eventLogger/eventLogger.xhtml -> demo/src/main/webapp/eventLogger/eventLogger.xhtml","src/main/webapp/index.xhtml -> demo/src/main/webapp/index.xhtml","src/main/webapp/mobile.xhtml -> demo/src/main/webapp/mobile.xhtml","src/main/webapp/public/about.xhtml -> demo/src/main/webapp/public/about.xhtml","src/main/webapp/public/track.xhtml -> demo/src/main/webapp/public/track.xhtml","src/main/webapp/resources/css/app.css -> demo/src/main/webapp/resources/css/app.css","src/main/webapp/resources/css/dd.css -> demo/src/main/webapp/resources/css/dd.css","src/main/webapp/resources/css/jquery-jvectormap.css -> demo/src/main/webapp/resources/css/jquery-jvectormap.css","src/main/webapp/resources/css/title.css -> demo/src/main/webapp/resources/css/title.css","src/main/webapp/resources/images/CTlogo128.png -> demo/src/main/webapp/resources/images/CTlogo128.png","src/main/webapp/resources/images/CTlogobadge128.png -> demo/src/main/webapp/resources/images/CTlogobadge128.png","src/main/webapp/resources/images/calendarTrigger.gif -> demo/src/main/webapp/resources/images/calendarTrigger.gif","src/main/webapp/resources/images/cargo-tracker-banner-small.png -> demo/src/main/webapp/resources/images/cargo-tracker-banner-small.png","src/main/webapp/resources/images/cargo-tracker-banner.png -> demo/src/main/webapp/resources/images/cargo-tracker-banner.png","src/main/webapp/resources/images/cargo-tracker-logo.png -> demo/src/main/webapp/resources/images/cargo-tracker-logo.png","src/main/webapp/resources/images/cargoTug.jpg -> demo/src/main/webapp/resources/images/cargoTug.jpg","src/main/webapp/resources/images/cross.png -> demo/src/main/webapp/resources/images/cross.png","src/main/webapp/resources/images/error.png -> demo/src/main/webapp/resources/images/error.png","src/main/webapp/resources/images/tick.png -> demo/src/main/webapp/resources/images/tick.png","src/main/webapp/resources/js/vendor/jquery-jvectormap-world-mill-en.js -> demo/src/main/webapp/resources/js/vendor/jquery-jvectormap-world-mill-en.js","src/main/webapp/resources/js/vendor/jquery-jvectormap.js -> demo/src/main/webapp/resources/js/vendor/jquery-jvectormap.js","src/test/java/org/eclipse/cargotracker/application/BookingServiceTestDataGenerator.java -> demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTestDataGenerator.java","src/test/java/org/eclipse/cargotracker/application/HandlingEventServiceTest.java -> demo/src/test/java/org/eclipse/cargotracker/application/HandlingEventServiceTest.java","src/test/resources/handling_events.csv -> demo/src/test/resources/handling_events.csv","src/test/resources/test-web.xml -> demo/src/test/resources/test-web.xml","src/test/soapui/CargoTracker_soapUI_project.xml -> demo/src/test/soapui/CargoTracker_soapUI_project.xml","src/test/soapui/report_json_sample.txt -> demo/src/test/soapui/report_json_sample.txt"] |
| formatting_only | 0 | [] |
| substantive_production | 43 | ["demo/src/main/java/org/eclipse/cargotracker/application/util/RestConfiguration.java","demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/BookingBackingBean.java","demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/SampleVoyages.java","demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/JmsApplicationEvents.java","demo/src/main/java/org/eclipse/cargotracker/infrastructure/routing/ExternalRoutingService.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/CargoRoute.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/Leg.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/RouteCandidate.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/ItineraryCandidateDtoAssembler.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/socket/RealtimeCargoTrackingService.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeDestinationDialog.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/DashboardView.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/HandlingEventRegistrationAttempt.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventFilesCheckpoint.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventLineParseException.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/mobile/EventWizard.java","demo/src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/CargoTrackingViewAdapter.java","demo/src/main/java/org/eclipse/pathfinder/api/TransitEdge.java","demo/src/main/java/org/eclipse/pathfinder/api/TransitPath.java","demo/src/main/java/org/eclipse/pathfinder/internal/GraphDao.java","demo/src/main/liberty/config/server.xml","src/main/java/org/eclipse/cargotracker/application/util/RestConfiguration.java -> null","src/main/java/org/eclipse/cargotracker/domain/model/cargo/BookingBackingBean.java -> null","src/main/java/org/eclipse/cargotracker/domain/model/voyage/SampleVoyages.java -> null","src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/JmsApplicationEvents.java -> null","src/main/java/org/eclipse/cargotracker/infrastructure/routing/ExternalRoutingService.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/CargoRoute.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/Leg.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/RouteCandidate.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/ItineraryCandidateDtoAssembler.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/socket/RealtimeCargoTrackingService.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeDestinationDialog.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/booking/web/DashboardView.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/handling/HandlingEventRegistrationAttempt.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventFilesCheckpoint.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventLineParseException.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/handling/mobile/EventWizard.java -> null","src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/CargoTrackingViewAdapter.java -> null","src/main/java/org/eclipse/pathfinder/api/TransitEdge.java -> null","src/main/java/org/eclipse/pathfinder/api/TransitPath.java -> null","src/main/java/org/eclipse/pathfinder/internal/GraphDao.java -> null","src/main/liberty/config/server.xml -> null","src/main/webapp/WEB-INF/glassfish-web.xml -> null"] |
| campaign_inputs | 2 | ["1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md","1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json"] |
| other | 57 | [".gitignore","1-arrival-deadline-control-remove-before-merge/shepherd-test-experiment.json","README.md -> null","dd-3032592-10-boring-reasons-abstract.md","dd-3058828-cargotracker-remove-before-merge/20260902-make-e7b651f-run-with-production-baseline.md -> null","demo/README.md","demo/config/spotbugs-exclude.xml","demo/mvnw","demo/mvnw.cmd","demo/observability/README.md","demo/observability/otel-collector-config.yaml","demo/observability/versions.properties","demo/performance/README.md","demo/performance/collect-process-metadata.sh","demo/performance/run-liberty-java.sh","demo/performance/run-liberty-jaz.sh","demo/performance/run-negative-controls.sh","demo/performance/run-workload.sh","demo/pom.xml","demo/scripts/ci/redact-artifacts.sh","demo/scripts/ci/run-dependency-security-gate.sh","demo/scripts/ci/run-negative-controls.sh","demo/scripts/ci/run-observability-check.sh","demo/scripts/ci/run-observability-negative-controls.sh","demo/scripts/ci/run-safety-net-negative-controls.sh","demo/scripts/ci/verify-build-contract.sh","demo/scripts/ci/verify-compatibility-contract.sh","demo/scripts/ci/verify-observability.py","demo/scripts/ci/verify-source-gates.sh","demo/scripts/ci/write-build-metadata.sh","demo/scripts/ci/write-observability-metadata.py","demo/scripts/ci/write-test-inventory.sh","demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java","demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTestRestConfiguration.java","demo/src/test/java/org/eclipse/cargotracker/architecture/LayeringTest.java","demo/src/test/java/org/eclipse/cargotracker/domain/model/cargo/CargoTest.java","demo/src/test/java/org/eclipse/cargotracker/domain/model/cargo/ItineraryTest.java","demo/src/test/java/org/eclipse/cargotracker/domain/model/cargo/RouteSpecificationTest.java","demo/src/test/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventTest.java","demo/src/test/java/org/eclipse/cargotracker/domain/model/handling/HandlingHistoryTest.java","demo/src/test/java/org/eclipse/cargotracker/infrastructure/routing/ExternalRoutingServiceTest.java","demo/src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingFacadeDtoTest.java","demo/src/test/java/org/eclipse/cargotracker/scenario/CargoLifecycleScenarioTest.java","demo/src/test/resources/arquillian.xml","mvnw -> null","mvnw.cmd -> null","pom.xml -> null","src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java -> null","src/test/java/org/eclipse/cargotracker/application/BookingServiceTestRestConfiguration.java -> null","src/test/java/org/eclipse/cargotracker/domain/model/cargo/CargoTest.java -> null","src/test/java/org/eclipse/cargotracker/domain/model/cargo/ItineraryTest.java -> null","src/test/java/org/eclipse/cargotracker/domain/model/cargo/RouteSpecificationTest.java -> null","src/test/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventTest.java -> null","src/test/java/org/eclipse/cargotracker/domain/model/handling/HandlingHistoryTest.java -> null","src/test/java/org/eclipse/cargotracker/infrastructure/routing/ExternalRoutingServiceTest.java -> null","src/test/java/org/eclipse/cargotracker/scenario/CargoLifecycleScenarioTest.java -> null","src/test/resources/arquillian.xml -> null"] |

### Campaign-input line differences

- **1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md**: 909 control lines vs 921 treatment lines. This is a campaign-input confound.

```diff
diff --git a/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/control-start/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md b/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/treatment-start/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md
index d2d8f36..06d8021 100644
--- a/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/control-start/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md
+++ b/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/treatment-start/1-arrival-deadline-control-remove-before-merge/add-change-arrival-deadline-feature-ignorance-reduction-plan.md
@@ -1,21 +1,22 @@
 # Implementation plan: Change Arrival Deadline Date (`eclipse-ee4j/cargotracker#64`)
 
 Human DRI: Ed Burns
-Starting commit: `9b9f311b2a3a2854bdac947593950d9edb6bca7d` (`Make the system ready for implementation`)
+Starting commit: `89e107c3ed6dd3655c2ffdf638b57d6c47099dab` (feature-free baseline with an extensible integration-test gate)
 Working directory: repository root of the current campaign worktree
+Cargo Tracker Maven application: `demo/`
 Runtime baseline: Java 17, Java EE 7 (`javax.*`), Open Liberty 26.0.0.8, PrimeFaces 8.0
-Baseline run instructions: `README.md`
+Baseline run instructions: `demo/README.md`
 Baseline preparation: fixed source branch and immutable SHA validated by the campaign fixture
 Historical issue: `eclipse-ee4j/cargotracker#64`
 
 Related directories and files:
 
-- `src/main/java/org/eclipse/cargotracker/application/`
-- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
-- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
-- `src/main/webapp/admin/dialogs/`
-- `src/main/webapp/admin/tables/listNotRouted.xhtml`
-- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`
+- `demo/src/main/java/org/eclipse/cargotracker/application/`
+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/`
+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/`
+- `demo/src/main/webapp/admin/dialogs/`
+- `demo/src/main/webapp/admin/tables/listNotRouted.xhtml`
+- `demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`
 
 ---
 
@@ -39,7 +40,7 @@ Using the stable sample cargo `DEF789`:
 1. Start the application with Java 17:
 
    ```bash
-   ./mvnw clean package -Popenliberty liberty:run
+   cd demo && ./mvnw clean package -Popenliberty liberty:run
    ```
 
 2. Open `http://localhost:8080/cargo-tracker/`.
@@ -76,7 +77,7 @@ Changing the deadline must:
 
 ### Hard scope constraints
 
-- Begin from commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d`.
+- Begin from commit `89e107c3ed6dd3655c2ffdf638b57d6c47099dab`.
 - Preserve Java EE 7 and the `javax.*` namespace.
 - Preserve the Java 7 source/target level used by this historical codebase.
 - Run the application on JDK 17 using the existing Open Liberty profile.
@@ -96,10 +97,12 @@ Changing the deadline must:
 
 ### Phase 1 ✅ — Establish a runnable feature-absent baseline
 
-- Commit `9b9f311b2a3a2854bdac947593950d9edb6bca7d` is based on the historical
-  feature-absent commit and contains only the compatibility work needed to run
-  the sample on JDK 17 and Open Liberty.
-- `./mvnw clean package -Popenliberty liberty:run` starts the application.
+- Commit `89e107c3ed6dd3655c2ffdf638b57d6c47099dab` is based on the historical
+  feature-absent commit and contains the compatibility work needed to run the
+  sample on JDK 17 and Open Liberty plus an extensible integration-test gate
+  that preserves the four named baseline methods while permitting valid
+  additional tests.
+- `cd demo && ./mvnw clean package -Popenliberty liberty:run` starts the application.
 - The home page and Administration flows return HTTP 200.
 - JSF view metadata is placed at `UIViewRoot` scope for MyFaces compatibility.
 - The internal routing REST client works without a Jersey/MOXy classloading
@@ -149,13 +152,13 @@ the located cargo. The presentation layer determines where the operation is
 offered.
 
 **Recommendation:** Option A. Add the edit affordance only to
-`src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
+`demo/src/main/webapp/admin/tables/listNotRouted.xhtml`. Keep the application
 operation generally usable for a valid cargo.
 
 **Resolution:**
 
 Select Option A. Expose the edit affordance only in
-`src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
+`demo/src/main/webapp/admin/tables/listNotRouted.xhtml`. The application and facade
 operations remain generally callable for any cargo that can be found by
 tracking ID; they do not encode knowledge of dashboard table membership.
 
@@ -437,51 +440,56 @@ after the old deadline, or after every itinerary leg. Pass the selected
 
 ### 3.9 — How will the feature be tested on the prepared historical baseline?
 
-**Question:** Which automated and runtime tests are mandatory, given that the
-historical JUnit/Arquillian suite is configured for a remote Payara 4
-container, while the prepared production baseline runs on JDK 17/Open Liberty?
+**Question:** Which automated and runtime tests are mandatory on the prepared
+JDK 17/Open Liberty baseline?
 
-The starting POM deliberately leaves `skipTests=true`. The Open Liberty profile
-builds and compiles all test sources but does not provide a Liberty Arquillian
-adapter. Modernizing the entire integration-test runtime is outside this
-feature's scope.
+The prepared baseline executes the sequential `BookingServiceTest` under Open
+Liberty with:
+
+```bash
+cd demo && ./mvnw -Popenliberty -Dtest=BookingServiceTest clean test
+```
+
+The feature-free baseline passes four ordered methods with zero failures,
+errors, or skipped tests. Its CI gate preserves those four named methods while
+allowing the suite to grow when a feature adds another valid test.
 
 The feature still needs layered evidence:
 
 1. Extend `BookingServiceTest` with the domain/application assertions that
    specify the deadline mutation.
-2. Ensure all test sources compile as part of
-   `./mvnw clean package -Popenliberty`.
-3. Add focused JUnit tests for facade and backing-bean delegation where they
+2. Run the complete `BookingServiceTest` under Open Liberty and require all
+   five ordered methods to pass with zero failures, errors, or skipped tests.
+3. Run `cd demo && ./mvnw clean package -Popenliberty` and require the complete
+   package gate to pass.
+4. Add focused JUnit tests for facade and backing-bean delegation where they
    can run without a container, using hand-written fakes rather than adding a
    mocking framework.
-4. Perform mandatory end-to-end verification against the running Open Liberty
+5. Perform mandatory end-to-end verification against the running Open Liberty
    application.
-5. Preserve the existing Payara Arquillian test path; do not delete, disable,
-   or rewrite it to manufacture a passing result.
 
-**Spike needed:** Before Issue 1 implementation, run the starting commit's
-standard Open Liberty package command and record whether tests are compiled but
-skipped. Confirm the new `BookingServiceTest` method can be added without
-expanding the runtime modernization scope.
+**Resolved evidence:** The prepared baseline runs `BookingServiceTest` in its
+managed Open Liberty test environment. The repository's injected
+`CargoRepository` is available in that test; a separately introduced
+test-level `EntityManager` injection is not. `JpaCargoRepository.find(...)`
+already executes the `Cargo.findByTrackingId` named query.
 
-**Recommendation:** Treat the JDK 17/Open Liberty build plus HTTP/UI acceptance
-as the mandatory executable gate. Keep the historical Arquillian test as a
-precise application-layer specification and run it only when its documented
-Payara environment is available.
+**Recommendation:** Use the existing injected repository to reload the cargo,
+run the dedicated Open Liberty integration tier, run the complete package
+gate, and retain HTTP/UI acceptance as the final user-visible proof. Do not add
+a second persistence access path or modernize the test runtime.
 
 **Resolution:**
 
 Extend the existing sequential Arquillian `BookingServiceTest` with
 `testChangeDeadline()` after `testChangeDestination()`. The test changes the
-deadline by one month, reloads the cargo through JPA, and asserts the complete
-set of preserved and recalculated domain state described above. The prepared
-Open Liberty build compiles this test but retains the historical default
-`skipTests=true`; executing that Arquillian suite still requires its documented
-remote Payara environment. Therefore the mandatory executable gates are the
-JDK 17 Open Liberty package/start command, direct HTTP checks, and the complete
-`DEF789` browser acceptance flow. No Arquillian-runtime modernization or new
-mocking dependency is part of this feature.
+deadline by one month, reloads the cargo through the injected
+`CargoRepository`, and asserts the complete set of preserved and recalculated
+domain state described above. Require five passing `BookingServiceTest`
+methods, a successful JDK 17 Open Liberty package gate, direct HTTP checks, and
+the complete `DEF789` browser acceptance flow. No test-runtime modernization,
+second persistence access path, or new mocking dependency is part of this
+feature.
 
 ---
 
@@ -499,9 +507,9 @@ or PrimeFaces changes.
 
 **Files to modify**
 
-- `src/main/java/org/eclipse/cargotracker/application/BookingService.java`
-- `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
-- `src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`
+- `demo/src/main/java/org/eclipse/cargotracker/application/BookingService.java`
+- `demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`
+- `demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTest.java`
 
 **Required API**
 
@@ -534,8 +542,8 @@ Do not:
 
 Append a sequential `testChangeDeadline()` case to `BookingServiceTest` after
 `testChangeDestination()`. Build a new deadline one month after the test's
-original `deadline`, invoke the service, reload the cargo with
-`Cargo.findByTrackingId`, and assert:
+original `deadline`, invoke the service, reload the cargo with the existing
+injected `cargoRepository.find(trackingId)` path, and assert:
 
 - origin remains Chicago;
 - destination remains Helsinki;
@@ -553,10 +561,13 @@ original `deadline`, invoke the service, reload the cargo with
 
 **Gating criteria**
 
-- The test source compiles.
-- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
+- `cd demo && ./mvnw -Popenliberty -Dtest=BookingServiceTest clean test`
+  executes five tests with zero failures, errors, or skipped tests.
+- `cd demo && ./mvnw clean package -Popenliberty` succeeds on JDK 17.
 - No web, facade, REST, Liberty, or persistence configuration files change in
   this issue.
+- The repository's extensible integration-test CI gate passes without a
+  workflow change in this issue.
 
 ### 4.2 — Issue 2: Expose deadline changes through the booking facade
 
@@ -567,12 +578,12 @@ types into the web layer.
 
 **Files to modify**
 
-- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
-- `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`
+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`
+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`
 
 **Optional focused test file**
 
-- `src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`
+- `demo/src/test/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacadeTest.java`
 
 **Required API**
 
@@ -610,7 +621,7 @@ Do not add Mockito or another dependency solely for this test.
 **Gating criteria**
 
 - Existing facade consumers still compile.
-- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
+- `cd demo && ./mvnw clean package -Popenliberty` succeeds on JDK 17.
 - The application-layer test added in Issue 1 remains unchanged and compiling.
 
 ### 4.3 — Issue 3: Implement the deadline editor backing model
@@ -623,7 +634,7 @@ dialog launcher or XHTML in this issue.
 
 **File to create**
 
-- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`
+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDate.java`
 
 **Required bean shape**
 
@@ -690,7 +701,7 @@ Do not add a mocking framework solely for these tests.
 
 - The bean is serializable and uses the established CDI/JSF annotations.
 - The bean references only facade DTOs, not domain model classes.
-- `./mvnw clean package -Popenliberty` succeeds on JDK 17.
+- `cd demo && ./mvnw clean package -Popenliberty` succeeds on JDK 17.
 
 ### 4.4 — Issue 4: Implement the PrimeFaces deadline dialog
 
@@ -702,8 +713,8 @@ is not yet linked from the dashboard in this issue.
 
 **Files to create**
 
-- `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
-- `src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`
+- `demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeArrivalDeadlineDateDialog.java`
+- `demo/src/main/webapp/admin/dialogs/changeArrivalDeadlineDate.xhtml`
 
 **Launcher requirements**
 
@@ -784,7 +795,7 @@ Verify:
 
 **Gating criteria**
 
-- `./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
+- `cd demo && ./mvnw clean package -Popenliberty liberty:run` succeeds on JDK 17.
 - Direct dialog loading and both actions work.
 - Destination editing continues to work.
 - Stop Liberty cleanly before completing the issue.
@@ -799,7 +810,7 @@ the table after return.
 
 **File to modify**
 
-- `src/main/webapp/admin/tables/listNotRouted.xhtml`
+- `demo/src/main/webapp/admin/tables/listNotRouted.xhtml`
 
 **Required UI shape**
 
@@ -826,7 +837,7 @@ not alter tracking-ID routing or destination editing.
 1. Start from a clean build on JDK 17:
 
    ```bash
-   ./mvnw clean package -Popenliberty liberty:run
+   cd demo && ./mvnw clean package -Popenliberty liberty:run
    ```
 
 2. Confirm the home page returns HTTP 200.
@@ -862,8 +873,9 @@ endpoints subsequently activate, as established by the prepared baseline.
 
 **Final regression and scope checks**
 
-- `./mvnw clean package -Popenliberty` succeeds.
-- The existing test sources and the new deadline test compile.
+- `cd demo && ./mvnw clean package -Popenliberty` succeeds.
+- The dedicated Open Liberty `BookingServiceTest` tier executes all five
+  ordered tests with zero failures, errors, or skipped tests.
 - No Java EE namespace migration occurred.
 - No Open Liberty, Derby, Jackson, JSF metadata, batch authorization, or REST
   compatibility fix from the starting commit was reverted.
@@ -875,14 +887,14 @@ endpoints subsequently activate, as established by the prepared baseline.
 
 ## Phase 5 — Documentation and implementation handoff
 
-- Update `README.md` only if user-facing Administration capabilities are
+- Update `demo/README.md` only if user-facing Administration capabilities are
   enumerated there; add one concise sentence that administrators can change an
   unrouted cargo's arrival deadline.
 - Record the exact JDK 17 run command in the final issue or pull-request
   description:
 
   ```bash
-  ./mvnw clean package -Popenliberty liberty:run
+  cd demo && ./mvnw clean package -Popenliberty liberty:run
   ```
 
 - Include `DEF789` and the before/after deadline values in the acceptance
@@ -906,4 +918,4 @@ endpoints subsequently activate, as established by the prepared baseline.
 | Accessibility | Preserve visible labels; the date editor must have an associated label and validation feedback. |
 | Backward compatibility | Existing destination editing, routing, tracking, REST, messaging, batch, and startup behavior must remain intact. |
 | Test discipline | Add tests before production code where practical; every issue must preserve all prior gates. |
-| Experiment integrity | Implement from this specification starting at `9b9f311b2a3a2854bdac947593950d9edb6bca7d`; do not cherry-pick or inspect feature-bearing commits. |
+| Experiment integrity | Implement from this specification starting at `89e107c3ed6dd3655c2ffdf638b57d6c47099dab`; do not cherry-pick or inspect feature-bearing commits. |
```
- **1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json**: 16 control lines vs 16 treatment lines. This is a campaign-input confound.

```diff
diff --git a/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/control-start/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json b/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/treatment-start/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json
index 6679bad..cc46891 100644
--- a/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/control-start/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json
+++ b/Users/edburns/workareas/dd-3072707-tricket-out-cargotracker-run-03/1-arrival-deadline-control-remove-before-merge/shepherd-tasks-a63d175f-0ce7-4430-850d-c134a707f88c-combined-eval/.worktrees/treatment-start/1-arrival-deadline-control-remove-before-merge/shepherd-campaign.json
@@ -1,10 +1,10 @@
 {
   "schemaVersion": 1,
-  "campaignId": "cb68d348-f71e-4ce0-a529-ca5a5d5cbc20",
+  "campaignId": "a63d175f-0ce7-4430-850d-c134a707f88c",
   "campaignIssueNumber": 1,
   "campaignShortname": "arrival-deadline-control",
-  "repository": "edburns/dd-3070518-cargotracker-darwin-arm64-01",
-  "baseBranch": "experiment/shepherd-control",
+  "repository": "edburns/dd-3072707-tricket-out-cargotracker-run-03",
+  "baseBranch": "edburns/dd-3016202-cargotracker-devoxx-be-2026-add-feature-control",
   "lessonPropagation": "off",
   "campaignMetadataDirectory": "1-arrival-deadline-control-remove-before-merge",
   "lessonsFile": "campaign-lessons.md",
@@ -12,5 +12,5 @@
     "shepherdTaskVersion": "1.0.4",
     "stageOutcomeProtocolVersion": 1
   },
-  "createdAt": "2026-09-28T23:36:51Z"
+  "createdAt": "2026-10-02T14:10:02Z"
 }
```
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/ApplicationEvents.java -> demo/src/main/java/org/eclipse/cargotracker/application/ApplicationEvents.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/BookingService.java -> demo/src/main/java/org/eclipse/cargotracker/application/BookingService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/CargoInspectionService.java -> demo/src/main/java/org/eclipse/cargotracker/application/CargoInspectionService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/HandlingEventService.java -> demo/src/main/java/org/eclipse/cargotracker/application/HandlingEventService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java -> demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultBookingService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/internal/DefaultCargoInspectionService.java -> demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultCargoInspectionService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/internal/DefaultHandlingEventService.java -> demo/src/main/java/org/eclipse/cargotracker/application/internal/DefaultHandlingEventService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/internal/package.html -> demo/src/main/java/org/eclipse/cargotracker/application/internal/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/package.html -> demo/src/main/java/org/eclipse/cargotracker/application/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/util/DateUtil.java -> demo/src/main/java/org/eclipse/cargotracker/application/util/DateUtil.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/util/LocationUtil.java -> demo/src/main/java/org/eclipse/cargotracker/application/util/LocationUtil.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/util/SampleDataGenerator.java -> demo/src/main/java/org/eclipse/cargotracker/application/util/SampleDataGenerator.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/application/util/package.html -> demo/src/main/java/org/eclipse/cargotracker/application/util/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/Cargo.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Cargo.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/CargoRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/CargoRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/Delivery.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Delivery.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/HandlingActivity.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/HandlingActivity.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/Itinerary.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Itinerary.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/Leg.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/Leg.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/RouteSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/RouteSpecification.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/RoutingStatus.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/RoutingStatus.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/TrackingId.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/TrackingId.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/TransportStatus.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/TransportStatus.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/cargo/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/cargo/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/CannotCreateHandlingEventException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/CannotCreateHandlingEventException.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEvent.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEvent.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventFactory.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventFactory.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingEventRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingHistory.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/HandlingHistory.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownCargoException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownCargoException.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownLocationException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownLocationException.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownVoyageException.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/UnknownVoyageException.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/handling/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/handling/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/location/Location.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/Location.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/location/LocationRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/LocationRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/location/SampleLocations.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/SampleLocations.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/location/UnLocode.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/UnLocode.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/location/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/location/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/voyage/CarrierMovement.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/CarrierMovement.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/voyage/Schedule.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/Schedule.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/voyage/Voyage.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/Voyage.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageNumber.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageNumber.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageRepository.java -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/VoyageRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/model/voyage/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/model/voyage/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/service/RoutingService.java -> demo/src/main/java/org/eclipse/cargotracker/domain/service/RoutingService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/service/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/service/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/AbstractSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/AbstractSpecification.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/AndSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/AndSpecification.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/DomainObjectUtils.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/DomainObjectUtils.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/NotSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/NotSpecification.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/OrSpecification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/OrSpecification.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/Specification.java -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/Specification.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/domain/shared/package.html -> demo/src/main/java/org/eclipse/cargotracker/domain/shared/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/events/cdi/CargoInspected.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/events/cdi/CargoInspected.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/CargoHandledConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/CargoHandledConsumer.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/DeliveredCargoConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/DeliveredCargoConsumer.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/HandlingEventRegistrationAttemptConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/HandlingEventRegistrationAttemptConsumer.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/MisdirectedCargoConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/MisdirectedCargoConsumer.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/RejectedRegistrationAttemptsConsumer.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/RejectedRegistrationAttemptsConsumer.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/package.html -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/messaging/jms/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaCargoRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaCargoRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaHandlingEventRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaHandlingEventRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaLocationRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaLocationRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaVoyageRepository.java -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/JpaVoyageRepository.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/package.html -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/persistence/jpa/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/infrastructure/routing/package.html -> demo/src/main/java/org/eclipse/cargotracker/infrastructure/routing/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/BookingServiceFacade.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/Location.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/Location.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/dto/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/DefaultBookingServiceFacade.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/CargoRouteDtoAssembler.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/CargoRouteDtoAssembler.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/LocationDtoAssembler.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/LocationDtoAssembler.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/assembler/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/internal/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/facade/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/rest/CargoMonitoringService.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/rest/CargoMonitoringService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoAdmin.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoAdmin.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoDetails.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/CargoDetails.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeDestination.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ChangeDestination.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ItinerarySelection.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ItinerarySelection.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ListCargo.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/ListCargo.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/Registration.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/Registration.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/booking/web/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/booking/web/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemReader.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemReader.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemWriter.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/EventItemWriter.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/file/FileProcessorJobListener.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/FileProcessorJobListener.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/file/LineParseExceptionListener.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/LineParseExceptionListener.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/file/UploadDirectoryScanner.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/UploadDirectoryScanner.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/file/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/file/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReport.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReport.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReportService.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/HandlingReportService.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/handling/rest/package.html`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/Track.java -> demo/src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/Track.java`.
- Relocation confound: `src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/package.html -> demo/src/main/java/org/eclipse/cargotracker/interfaces/tracking/web/package.html`.
- Relocation confound: `src/main/java/org/eclipse/pathfinder/api/GraphTraversalService.java -> demo/src/main/java/org/eclipse/pathfinder/api/GraphTraversalService.java`.
- Relocation confound: `src/main/java/org/eclipse/pathfinder/api/package.html -> demo/src/main/java/org/eclipse/pathfinder/api/package.html`.
- Relocation confound: `src/main/java/org/eclipse/pathfinder/internal/package.html -> demo/src/main/java/org/eclipse/pathfinder/internal/package.html`.
- Relocation confound: `src/main/java/org/eclipse/pathfinder/package.html -> demo/src/main/java/org/eclipse/pathfinder/package.html`.
- Relocation confound: `src/main/liberty/config/bootstrap.properties -> demo/src/main/liberty/config/bootstrap.properties`.
- Relocation confound: `src/main/resources/META-INF/batch-jobs/EventFilesProcessorJob.xml -> demo/src/main/resources/META-INF/batch-jobs/EventFilesProcessorJob.xml`.
- Relocation confound: `src/main/resources/META-INF/beans.xml -> demo/src/main/resources/META-INF/beans.xml`.
- Relocation confound: `src/main/resources/META-INF/persistence.xml -> demo/src/main/resources/META-INF/persistence.xml`.
- Relocation confound: `src/main/resources/handling_events.csv -> demo/src/main/resources/handling_events.csv`.
- Relocation confound: `src/main/resources/org/eclipse/cargotracker/messages.properties -> demo/src/main/resources/org/eclipse/cargotracker/messages.properties`.
- Relocation confound: `src/main/webapp/WEB-INF/beans.xml -> demo/src/main/webapp/WEB-INF/beans.xml`.
- Relocation confound: `src/main/webapp/WEB-INF/faces-config.xml -> demo/src/main/webapp/WEB-INF/faces-config.xml`.
- Relocation confound: `src/main/webapp/WEB-INF/templates/common/admin.xhtml -> demo/src/main/webapp/WEB-INF/templates/common/admin.xhtml`.
- Relocation confound: `src/main/webapp/WEB-INF/templates/common/public.xhtml -> demo/src/main/webapp/WEB-INF/templates/common/public.xhtml`.
- Relocation confound: `src/main/webapp/WEB-INF/web.xml -> demo/src/main/webapp/WEB-INF/web.xml`.
- Relocation confound: `src/main/webapp/admin/about.xhtml -> demo/src/main/webapp/admin/about.xhtml`.
- Relocation confound: `src/main/webapp/admin/dashboard.xhtml -> demo/src/main/webapp/admin/dashboard.xhtml`.
- Relocation confound: `src/main/webapp/admin/dialogs/changeDestination.xhtml -> demo/src/main/webapp/admin/dialogs/changeDestination.xhtml`.
- Relocation confound: `src/main/webapp/admin/route.xhtml -> demo/src/main/webapp/admin/route.xhtml`.
- Relocation confound: `src/main/webapp/admin/selectItinerary.xhtml -> demo/src/main/webapp/admin/selectItinerary.xhtml`.
- Relocation confound: `src/main/webapp/admin/show.xhtml -> demo/src/main/webapp/admin/show.xhtml`.
- Relocation confound: `src/main/webapp/admin/tables/listClaimed.xhtml -> demo/src/main/webapp/admin/tables/listClaimed.xhtml`.
- Relocation confound: `src/main/webapp/admin/tables/listNotRouted.xhtml -> demo/src/main/webapp/admin/tables/listNotRouted.xhtml`.
- Relocation confound: `src/main/webapp/admin/tables/listRouted.xhtml -> demo/src/main/webapp/admin/tables/listRouted.xhtml`.
- Relocation confound: `src/main/webapp/admin/tracking/map.xhtml -> demo/src/main/webapp/admin/tracking/map.xhtml`.
- Relocation confound: `src/main/webapp/admin/tracking/mapFrame.xhtml -> demo/src/main/webapp/admin/tracking/mapFrame.xhtml`.
- Relocation confound: `src/main/webapp/admin/tracking/track.xhtml -> demo/src/main/webapp/admin/tracking/track.xhtml`.
- Relocation confound: `src/main/webapp/booking/booking-date.xhtml -> demo/src/main/webapp/booking/booking-date.xhtml`.
- Relocation confound: `src/main/webapp/booking/booking-destination.xhtml -> demo/src/main/webapp/booking/booking-destination.xhtml`.
- Relocation confound: `src/main/webapp/booking/booking-flow.xml -> demo/src/main/webapp/booking/booking-flow.xml`.
- Relocation confound: `src/main/webapp/booking/booking.xhtml -> demo/src/main/webapp/booking/booking.xhtml`.
- Relocation confound: `src/main/webapp/eventLogger/eventLogger.xhtml -> demo/src/main/webapp/eventLogger/eventLogger.xhtml`.
- Relocation confound: `src/main/webapp/index.xhtml -> demo/src/main/webapp/index.xhtml`.
- Relocation confound: `src/main/webapp/mobile.xhtml -> demo/src/main/webapp/mobile.xhtml`.
- Relocation confound: `src/main/webapp/public/about.xhtml -> demo/src/main/webapp/public/about.xhtml`.
- Relocation confound: `src/main/webapp/public/track.xhtml -> demo/src/main/webapp/public/track.xhtml`.
- Relocation confound: `src/main/webapp/resources/css/app.css -> demo/src/main/webapp/resources/css/app.css`.
- Relocation confound: `src/main/webapp/resources/css/dd.css -> demo/src/main/webapp/resources/css/dd.css`.
- Relocation confound: `src/main/webapp/resources/css/jquery-jvectormap.css -> demo/src/main/webapp/resources/css/jquery-jvectormap.css`.
- Relocation confound: `src/main/webapp/resources/css/title.css -> demo/src/main/webapp/resources/css/title.css`.
- Relocation confound: `src/main/webapp/resources/images/CTlogo128.png -> demo/src/main/webapp/resources/images/CTlogo128.png`.
- Relocation confound: `src/main/webapp/resources/images/CTlogobadge128.png -> demo/src/main/webapp/resources/images/CTlogobadge128.png`.
- Relocation confound: `src/main/webapp/resources/images/calendarTrigger.gif -> demo/src/main/webapp/resources/images/calendarTrigger.gif`.
- Relocation confound: `src/main/webapp/resources/images/cargo-tracker-banner-small.png -> demo/src/main/webapp/resources/images/cargo-tracker-banner-small.png`.
- Relocation confound: `src/main/webapp/resources/images/cargo-tracker-banner.png -> demo/src/main/webapp/resources/images/cargo-tracker-banner.png`.
- Relocation confound: `src/main/webapp/resources/images/cargo-tracker-logo.png -> demo/src/main/webapp/resources/images/cargo-tracker-logo.png`.
- Relocation confound: `src/main/webapp/resources/images/cargoTug.jpg -> demo/src/main/webapp/resources/images/cargoTug.jpg`.
- Relocation confound: `src/main/webapp/resources/images/cross.png -> demo/src/main/webapp/resources/images/cross.png`.
- Relocation confound: `src/main/webapp/resources/images/error.png -> demo/src/main/webapp/resources/images/error.png`.
- Relocation confound: `src/main/webapp/resources/images/tick.png -> demo/src/main/webapp/resources/images/tick.png`.
- Relocation confound: `src/main/webapp/resources/js/vendor/jquery-jvectormap-world-mill-en.js -> demo/src/main/webapp/resources/js/vendor/jquery-jvectormap-world-mill-en.js`.
- Relocation confound: `src/main/webapp/resources/js/vendor/jquery-jvectormap.js -> demo/src/main/webapp/resources/js/vendor/jquery-jvectormap.js`.
- Relocation confound: `src/test/java/org/eclipse/cargotracker/application/BookingServiceTestDataGenerator.java -> demo/src/test/java/org/eclipse/cargotracker/application/BookingServiceTestDataGenerator.java`.
- Relocation confound: `src/test/java/org/eclipse/cargotracker/application/HandlingEventServiceTest.java -> demo/src/test/java/org/eclipse/cargotracker/application/HandlingEventServiceTest.java`.
- Relocation confound: `src/test/resources/handling_events.csv -> demo/src/test/resources/handling_events.csv`.
- Relocation confound: `src/test/resources/test-web.xml -> demo/src/test/resources/test-web.xml`.
- Relocation confound: `src/test/soapui/CargoTracker_soapUI_project.xml -> demo/src/test/soapui/CargoTracker_soapUI_project.xml`.
- Relocation confound: `src/test/soapui/report_json_sample.txt -> demo/src/test/soapui/report_json_sample.txt`.

## Defect interpretation

See `defects.csv` for one row per deduplicated defect, including defect class, item count, local/CI location, timestamp source, ancestry-verified fix, and anomalies.

Style and static-analysis findings are detectable only where the corresponding gate exists; they are excluded from arm-comparison conclusions when either arm reports that gate as `not_present`.

## Post-mortem agent cost

- AIU: 178.67648
- Premium requests: 2
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
