BEGIN
    FOR l IN (
        SELECT c.Name,
               loan.LoanID,
               loan.DueDate
        FROM Customers c
        JOIN Loans loan
        ON c.CustomerID = loan.CustomerID
        WHERE loan.DueDate BETWEEN SYSDATE
                              AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Dear ' || l.Name ||
            ', your Loan ID ' || l.LoanID ||
            ' is due on ' || l.DueDate
        );
    END LOOP;
END;
/

