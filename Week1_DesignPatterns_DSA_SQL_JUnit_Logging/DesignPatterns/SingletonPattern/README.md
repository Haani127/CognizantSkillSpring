# Singleton Pattern

## Problem Statement

A logging utility is used throughout an application. Creating multiple logger objects can lead to inconsistent logging and unnecessary resource usage.

Implement the **Singleton Design Pattern** so that only **one instance** of the `Logger` class exists and is shared across the application.

---

### Project Structure

```text
SingletonPattern/
├── Logger.java
├── LoggerClient.java
└── README.md
```

---

### Output

```text
Logger initialized.
[LOG] Application started.
[LOG] User logged in.

Logger1 HashCode : 140435067
Logger2 HashCode : 140435067

Only one Logger instance exists.
```
