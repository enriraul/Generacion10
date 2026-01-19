/*
    Select - Comando DQL - Data Query Lenguage
*/

-- Sintaxis: Select Columna(s) FROM tabla;

SELECT * FROM alumno;

select matricula from alumno;
select matricula, nombre_completo from alumno;
select matricula, nombre_completo, edad from alumno;
-- WHERE, ORDER

select matricula, nombre_completo,edad from alumno where edad>= 24;   --where condicional/ check
select matricula, nombre_completo from alumno order by nombre_completo ASC;
select matricula, nombre_completo from alumno order by nombre_completo DESC LIMIT 5;

-- Distinción

SELECT DISTINCT edad FROM alumno;


-- Operadores
Select COUNT(*) from alumno;
Select AVG(edad), MAX(edad), MIN(edad) from alumno;
select edad, count(*) from alumno ;
select edad, count(*) from alumno GROUP BY edad HAVING Count(*)>=2;


Select edad FROM alumno WHERE edad BETWEEN 18 and 25;
Select * FROM alumno WHERE fecha_alta BETWEEN '2023-01-20' and '2023-02-08';
Select * FROM alumno WHERE fecha_alta BETWEEN '2023-01-20' and '2023-02-08' and sancionado = true;