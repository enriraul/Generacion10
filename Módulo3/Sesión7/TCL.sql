/*
    TRANSACTION CONTROL LENGUAGE

    Sintaxis:
    BEGIN;
        instrucciones/query

    ACTION;

*/


BEGIN; --Inicio de control de transacciones

START TRANSACTION; --Iniciar una transacción, previo a una revisión
COMMIT; -- Confirmar los cambios efectuados
ROLLBACK; --Deshacer los cambios

/*
BEGIN;
START TRANSACTION;

BEGIN;
COMMIT;

BEGIN;
ROLLBACK;
*/

-- SAVEPOINT creaciondb;
-- ROLLBACK TO SAVEPOINT creaciondb; 

BEGIN;

-- DDL, DML, DQL, DCL

--SAVEPOINT tag;

-- DDL, DML, DQL, DCL

--ROLLBACK TO SAVEPOINT tag;