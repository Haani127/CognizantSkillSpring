# PL/SQL Hands-on Exercises

This repository contains the PL/SQL hands-on exercises completed as part of the **Cognizant Digital Nurture Program**. The exercises demonstrate the use of Oracle PL/SQL to implement banking-related operations using control structures and stored procedures.

## Project Structure

```
PLSQL/
│
├── database/
│   ├── 01_create_tables.sql
│   └── 02_insert_sample_data.sql
│
├── Exercise1_ControlStructures/
│   ├── scenario1_loan_discount.sql
│   ├── scenario2_vip_customer.sql
│   └── scenario3_loan_reminder.sql
│
├── Exercise3_StoredProcedures/
│   ├── process_monthly_interest.sql
│   ├── update_employee_bonus.sql
│   └── transfer_funds.sql
│
└── README.md
```

---

## Database Schema

The project uses the following tables:

- **Customers**
- **Loans**
- **Accounts**
- **Employees**

The database schema is created using `01_create_tables.sql`, and sample data is inserted using `02_insert_sample_data.sql`.

---

## Exercises

### Exercise 1 – Control Structures

- Apply a 1% loan interest discount for customers above 60 years of age.
- Promote customers with a balance greater than 10,000 to VIP status.
- Display reminders for loans due within the next 30 days.

### Exercise 3 – Stored Procedures

- **ProcessMonthlyInterest** – Applies 1% monthly interest to savings accounts.
- **UpdateEmployeeBonus** – Updates employee salaries based on department and bonus percentage.
- **TransferFunds** – Transfers money between accounts after validating sufficient balance.

---

## Concepts Covered

- PL/SQL Blocks
- Variables
- IF-THEN Conditions
- FOR Loops
- Cursor FOR Loops
- Stored Procedures
- Parameters
- Transactions (`COMMIT`)
- Exception Handling
- SQL DML Operations (`SELECT`, `UPDATE`)

---

## Technologies Used

- Oracle Database 23ai (Oracle FreeSQL)
- Oracle PL/SQL
- VS Code
- Git & GitHub

---

## How to Run

1. Execute `database/01_create_tables.sql`.
2. Execute `database/02_insert_sample_data.sql`.
3. Run the required PL/SQL exercise scripts.
4. Verify the results using `SELECT` queries.

---

## Learning Outcomes

- Understand Oracle PL/SQL programming fundamentals.
- Implement business logic using control structures.
- Create reusable stored procedures.
- Perform database transactions and exception handling.
- Practice real-world banking scenarios using Oracle Database.

---

**Author:** Mohammed Haani H  
**Program:** Cognizant Digital Nurture – Java FSE