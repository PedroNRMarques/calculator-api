# Calculator API

A RESTful API for basic calculator operations (sum, subtraction, multiplication, division) with support for arbitrary-precision decimal numbers.

---

## Table of Contents

- [Features](#features)
- [Technologies](#technologies)
- [Prerequisites](#prerequisites)
- [Build and Run](#build-and-run)
  - [1. Run Locally](#1-run-locally)
  - [2. Run with Docker Compose](#2-run-with-docker-compose)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)

---

## Features

- REST endpoints for:
  - Sum (`/sum`)
  - Subtraction (`/subtract`)
  - Multiplication (`/multiply`)
  - Division (`/divide`)
- Supports 2 operands (`a` and `b`) with arbitrary-precision decimal numbers.
- Embedded Kafka for inter-module communication (used in integration tests).
- Dockerized modules for easy deployment.
- Gradle-based multi-module project (`rest` and `calculator`).

---

## Technologies

- Java 17
- Spring Boot 3
- Gradle 8.x
- Apache Kafka (for inter-module messaging)
- Docker & Docker Compose
- JUnit 5 for unit and integration tests

---

## Prerequisites

To build and run the project locally:

- Java 17 JDK
- Git
- Gradle (optional if using the Gradle wrapper)
- Docker & Docker Compose (for containerized version)
- Internet connection (for Gradle dependencies and Docker images)

---

## Build and Run

### 1. Run Locally

1. Clone the repository:

2. Build the project with Gradle:
./gradlew clean build
./gradlew bootRun

3. Run with Docker Compose
docker-compose build
docker-compose up

4.Test the API:
http://localhost:8080/sum?a=1&b=2

Expected response:
{
  "result": 3
}

API Endpoints:
/sum	GET	Returns sum of a and b	a, b
/subtract	GET	Returns difference a - b	a, b
/multiply	GET	Returns multiplication a * b	a, b
/divide	GET	Returns division a / b	a, b


Testing

Unit tests are in calculator/src/test/java and rest/src/test/java.

Kafka integration tests use the @EmbeddedKafka annotation in rest/src/test/java.

To run tests:
./gradlew test
