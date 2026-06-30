BEGIN
    FOR c IN (SELECT CustomerID, Balance FROM Customers)
    LOOP
        IF c.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'Y'
            WHERE CustomerID = c.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'VIP Status Updated for Customer: ' || c.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

select * from Customers;