DROP database if EXISTS colegio;
CREATE database IF NOT EXISTS colegio;
USE colegio;

DROP TABLE if EXISTS alumnos;
DROP TABLE if EXISTS cursos;

CREATE TABLE cursos(
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL CHECK(LENGH(titulo)>=3),
    profesor VARCHAR(100) NOT NULL CHECK(LENGH(titulo)>=3),
    dia ENUM("lunes","martes","miercoloes","jueves","viernes") NOT NULL,
    turno ENUM("Mañana","Tarde","Noche") NOT NULL,
    activo BOOLEAN DEFAULT TRUE
);