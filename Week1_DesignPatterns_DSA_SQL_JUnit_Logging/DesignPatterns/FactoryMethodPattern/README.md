# Factory Method Pattern

## Problem Statement

A document management system needs to create different types of documents such as **Word**, **PDF**, and **Excel**.

Instead of creating document objects directly using the `new` keyword, implement the **Factory Method Design Pattern** so that the appropriate document is created through a factory class.

---

### Project Structure

```text
FactoryMethodPattern/
├── Document.java
├── DocumentFactory.java
├── WordDocument.java
├── PdfDocument.java
├── ExcelDocument.java
├── WordDocumentFactory.java
├── PdfDocumentFactory.java
├── ExcelDocumentFactory.java
├── FactoryMethodTest.java
└── README.md
```

---

### Output

```text
Creating Word Document...
Opening Word Document...

Creating PDF Document...
Opening PDF Document...

Creating Excel Document...
Opening Excel Document...
```
