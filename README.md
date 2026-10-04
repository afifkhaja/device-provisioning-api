# Device Provisioning API

The Device Provisioning API is a Java 21 Spring Boot REST API for managing devices throughout a provisioning lifecycle. The project is designed to explore the backend architecture and engineering patterns involved in building a device provisioning service.

The API currently allows clients to register a device and retrieve an existing device by its device ID. Devices are persisted using Spring Data JPA with an H2 in-memory database for local development. Newly registered devices begin in the `REGISTERED` state.

The provisioning lifecycle is designed around four states: `REGISTERED`, `PROVISIONING`, `PROVISIONED`, and `FAILED`. As the project develops, the service will enforce valid transitions between these states so that devices move through the provisioning process in a predictable and controlled manner.

The project uses a layered architecture consisting of a REST controller, service layer, repository layer, and persistence layer. Spring Boot handles the HTTP API and dependency injection, while Spring Data JPA provides the interface between the application and the database.

An important goal of the project is to support safe retries through idempotency. Device registration will be designed so that repeating the same request does not accidentally create or modify resources, while conflicting requests can be detected and rejected appropriately.

Future development will replace the local H2 database with PostgreSQL and add stronger HTTP error handling, automated testing, containerization, metrics, and observability. The application will ultimately be deployed to the cloud so that the same REST API can run against a persistent production-style database.

The project currently uses Java 21, Spring Boot, Spring Web, Spring Data JPA, H2, and Maven. PostgreSQL and cloud infrastructure will be introduced in later stages.