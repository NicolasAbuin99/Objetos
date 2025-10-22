DROP database IF EXISTS colegio;
CREATE database colegio;
USE colegio;

DROP TABLE IF EXISTS alumnos;
DROP TABLE IF EXISTS cursos;

CREATE TABLE cursos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL CHECK(LENGTH(titulo)>=3),
    profesor VARCHAR(100) NOT NULL CHECK(LENGTH(profesor)>=3),
    dia ENUM('LUNES', 'MARTES', 'MIERCOLES', 'JUEVES', 'VIERNES') NOT NULL,
    turno ENUM('MAÑANA', 'TARDE', 'NOCHE') NOT NULL,
    activo BOOLEAN DEFAULT TRUE
);

CREATE TABLE alumnos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL CHECK(LENGTH(nombre)>=3),
    apellido VARCHAR(100) NOT NULL CHECK(LENGTH(apellido)>=3),
    edad INT NOT NULL CHECK(edad>=18 AND edad<=110),
    id_curso INT NOT NULL,
    activo BOOLEAN DEFAULT TRUE
);

ALTER TABLE alumnos ADD CONSTRAINT FK_alumnos_id_curso
FOREIGN KEY (id_curso) REFERENCES cursos(id);