-- Facultad 1 -> N alumno
-- Alumno 1 -> 1 Expediente
-- Alumno N -> N materias

CREATE TABLE facultad(
    idFacultad TEXT PRIMARY KEY,
    nombre_facultad TEXT NOT NULL
);

CREATE TABLE materia(
    idMateria TEXT PRIMARY KEY,
    nombre TEXT NOT NULL
);

CREATE TABLE alumno(
    matricula TEXT PRIMARY KEY,
    nombre_completo TEXT NOT NULL,
    idFacultad TEXT,
    FOREIGN KEY (idFacultad) REFERENCES facultad(idFacultad)
);

CREATE TABLE expediente(
    idExpediente int PRIMARY KEY,
    matricula TEXT UNIQUE,
    FOREIGN KEY (matricula) REFERENCES alumno(matricula);
);

-- Alumno - Materia:  N-N
CREATE TABLE inscripcion(
    -- idInscripcion int PRIMARY KEY,
    matricula TEXT,
    idMateria TEXT,
    fecha_alta DATE DEFAULT CURRENT DATE,
    PRIMARY KEY (matricula, idMateria),
    FOREIGN KEY (matricula) REFERENCES alumno(matricula);
    FOREIGN KEY (idMateria) REFERENCES materia(idMateria);
);