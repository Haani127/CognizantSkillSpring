# Spring Data JPA Hands-On

This module contains practice exercises for understanding:
- The conceptual difference between JPA, Hibernate, and Spring Data JPA.
- A working Spring Boot + Spring Data JPA example using MySQL.


## Exercise 1: Conceptual Comparison

Location: `Difference_JPA_Hibernate_SpringDataJPA/README.md`

This exercise explains:
- JPA as a specification.
- Hibernate as a JPA implementation.
- Spring Data JPA as a higher-level abstraction that reduces boilerplate through repository interfaces.

## Exercise 2: ORM Learn (Spring Data JPA + MySQL)

Location: `Orm-Learn/`

### What this project does

- Connects a Spring Boot app to a MySQL database (`ormlearn`).
- Maps the `country` table to a `Country` entity.
- Uses `CountryRepository extends JpaRepository<Country, String>`.
- Fetches all countries via service method `getAllCountries()`.
- Logs SQL and bind parameters for learning/debugging.

### Tech Stack

- Java 21
- Spring Boot 3.5.3
- Spring Data JPA
- Hibernate ORM
- MySQL Connector/J
- Maven

## Prerequisites

Install and verify:
- JDK 21
- Maven (or use Maven Wrapper provided in `Orm-Learn/`)
- MySQL 8+

## Database Setup

1. Create the database:

```sql
CREATE DATABASE ormlearn;
```

2. Create the table:

```sql
USE ormlearn;

CREATE TABLE country (
	code VARCHAR(2) PRIMARY KEY,
	name VARCHAR(50) NOT NULL
);
```

3. Insert sample data:

```sql
INSERT INTO country (code, name) VALUES
('IN', 'India'),
('US', 'United States'),
('JP', 'Japan'),
('DE', 'Germany');
```

## Configuration

Database and logging configuration is available in:
- `Orm-Learn/src/main/resources/application.properties`

Default credentials currently set:
- URL: `jdbc:mysql://localhost:3306/ormlearn`
- Username: `root`
- Password: `root`

Update these values based on your local MySQL setup.

## How to Run

From the `Orm-Learn` directory:

### Windows (PowerShell)

```powershell
.\mvnw.cmd spring-boot:run
```

### macOS/Linux

```bash
./mvnw spring-boot:run
```

Alternative with installed Maven:

```bash
mvn spring-boot:run
```

## Expected Output

On successful run, you should see:
- Spring Boot application startup logs.
- Hibernate SQL query logs for selecting from `country`.
- A debug print of country records.
- Console message:

```text
testGetAllCountries() executed successfully
```

## Useful Commands

Run tests:

```bash
mvn test
```

Build the project:

```bash
mvn clean package
```

## Learning Outcome

By completing this hands-on, you will understand:
- Where JPA, Hibernate, and Spring Data JPA fit in the persistence stack.
- How entity mapping works using annotations.
- How repository-based data access reduces boilerplate code.
- How transaction boundaries are defined in service methods.
