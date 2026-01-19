/*

    DATA CONTROL LENGUAGE

Sintaxis:

    GRANT|REVOKE privilegios
    ON objeto
    TO usuario|rol;

Privilegios
    SELECT 
    INSERT 
    UPDATE
    DELETE
    TRUNCATE

*/

--GRANT OTORGAR privilegios


CREATE ROLE desarrollador;
CREATE ROLE admin;
CREATE ROLE becario;


GRANT SELECT, INSERT, UPDATE ON alumno TO desarrollador;
GRANT SELECT alumno TO becario;
GRANT SELECT, INSERT, UPDATE, DELETE, TRUNCATE ON alumno TO admin;+

CREATE USER pepitoBecario;
GRANT becario TO pepitoBecario;


GRANT CONNECT ON DATABASE db TO usuario; 


-- REVOKE  revocar privilegios

REVOKE becario TO pepitoBecario;
REVOKE SELECT, INSERT, UPDATE ON alumno TO desarrollador;