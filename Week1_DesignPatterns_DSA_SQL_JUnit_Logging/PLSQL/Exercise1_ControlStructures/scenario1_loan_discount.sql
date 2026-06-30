DECLARE
    v_age NUMBER;
BEGIN
    FOR c IN (
        SELECT c.CustomerID,
               l.LoanID,
               l.InterestRate,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB)/12) AS Age
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF c.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = c.LoanID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to Loan ID: ' || c.LoanID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

SELECT * FROM Loans;