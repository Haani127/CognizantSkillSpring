# Week 1 - Design Patterns

## Overview

This directory contains the **Week 1 Design Pattern** hands-on exercises completed as part of the **Cognizant Java Full Stack Engineer (FSE) Skill Program**. The objective is to understand and implement commonly used **Creational Design Patterns** in Java.

---

## Exercises

### 1. Singleton Pattern

#### Objective
Implement the Singleton Design Pattern to ensure that only one instance of the `Logger` class exists throughout the application's lifecycle.

#### Scenario
A logging utility should maintain a single instance so that all modules in the application use the same logger, ensuring consistent logging and efficient resource utilization.

#### Project Structure

```text
SingletonPattern/
├── Logger.java
├── LoggerClient.java
└── README.md
```

#### Expected Output

```text
Logger initialized.
Logging: Application started.
Logging: User logged in.

Logger1 HashCode: 12345678
Logger2 HashCode: 12345678

Both objects are the same instance.
```

---

### 2. Factory Method Pattern

#### Objective
Implement the Factory Method Design Pattern to create different document types (Word, PDF, and Excel) without exposing the object creation logic to the client.

#### Scenario
A document management system should be able to create different document types dynamically. Using the Factory Method Pattern makes the system flexible, maintainable, and easy to extend with new document types.

#### Project Structure

```text
FactoryMethodPattern/
├── Document.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── DocumentFactory.java
├── WordDocumentFactory.java
├── PdfDocumentFactory.java
├── ExcelDocumentFactory.java
├── FactoryMethodTest.java
└── README.md
```

#### Expected Output

```text
Creating Word Document...
Opening Word Document...

Creating PDF Document...
Opening PDF Document...

Creating Excel Document...
Opening Excel Document...
```

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- IntelliJ IDEA / Eclipse
- Git & GitHub

---

## Learning Outcomes

- Understand the Singleton Design Pattern.
- Implement the Factory Method Design Pattern.
- Apply object-oriented design principles.
- Improve code maintainability through design patterns.
- Learn how creational patterns simplify object creation.

---

## Author

**Mohammed Haani H**

Java Full Stack Engineer Trainee  
Cognizant Java FSE Skill Program