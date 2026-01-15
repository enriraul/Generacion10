-- DML Data Manipulation Lenguage

/*
    INSERT -- ingresar/insertar elementos a una tabla dentro de una base de datos
    UPDATE -- Actualizar los valores dentro de la base de datos
    DELETE -- Eliminar elementos
*/


/*
    Sintáxis insert:
    INSERT INTO tabla(atributo1, atributo2, atributo3,...) VALUES (valor1, valor2, valor3, ...);

*/

INSERT INTO alumno (
    matricula, nombre_completo, edad, fecha_alta, sancionado
)
VALUES(
    'A001','Pedro Peréz',18,'2026-01-14', FALSE
);

INSERT INTO alumno(
    matricula, edad
)
VALUES(
    'A002',20
);

-- Ejemplo que genera un error, dado que ya exista la llave primaria 

INSERT INTO alumno(
    matricula, edad
)
VALUES(
    'A002',22
);

-- Ejemplo donde se ocasiona un fallo por no cumplir con la edad minima
INSERT INTO alumno(
    matricula, edad
)
VALUES(
    'A003',17
);

--Ejemplo donde se ocasiona un fallo por no cumplir con los atributos
-- necesarios
INSERT INTO alumno(
    matricula
)
VALUES(
    'A004'
);


/*
    Sintáxis update:
    UPDATE nombre_tabla
    SET columna(s)= valor(es)
    WHERE columna = valor_condicion;

*/

UPDATE alumno
SET nombre_completo = 'Mario Martinez'
WHERE matricula = 'A002';

UPDATE alumno
SET nombre_completo = 'Miguel Martinez',
    sancionado = TRUE,
    edad = 21
WHERE matricula = 'A002';

DELETE FROM alumno
WHERE matriculo = 'A003';