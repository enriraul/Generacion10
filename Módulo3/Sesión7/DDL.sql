-- Comandos DDL: DATA DEFINITION LENGUAGE
-- CREATE 
    -- USER
    -- DATABASE
    -- ROLE
    -- TABLE
-- DROP
-- ALTER

-- TRUNCATE
-- COMMENT



-- Creación de usuarios
-- CREATE USER nombre_usuario WITH PASSWORD 'contraseña';
CREATE USER admin WITH PASSWORD 'root';

DROP USER admin;

CREATE DATABASE dbtest;
ALTER DATABASE dbtest OWNER  to admin;

\c dbtest

-- Crear tabla estudiante

CREATE TABLE estudiante(
    matricula TEXT PRIMARY KEY,
    nombre TEXT,
    edad INTEGER NOT NULL CHECK (edad>=18),
    fecha_alta DATE DEFAULT CURRENT_DATE,
    sancionado BOOLEAN DEFAULT FALSE
);
-- Eliminar tabla
DROP TABLE estudiante;

-- Agregar atributos a la tabla

ALTER TABLE  estudiante
ADD COLUMN carrera TEXT;

-- Cambiar nombre de atributos 
ALTER TABLE estudiante
RENAME COLUMN nombre TO nombre_completo;

-- Cambiar nombre de tabla
ALTER TABLE estudiante
RENAME TO alumno;

-- Elimninar atributo de una tabla
ALTER TABLE alumno
DROP COLUMN carrera;

-- Cambiar tipo de dato
ALTER TABLE alumno
ALTER COlUMN matricula type VARCHAR(20);