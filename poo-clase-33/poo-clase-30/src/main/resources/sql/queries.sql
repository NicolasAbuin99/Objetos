USE colegio;

-- 1. Listar todos los alumnos junto con el título de su curso.
SELECT  a.id,
        a.nombre, 
        a.apellido, 
        c.titulo 
FROM    alumnos a 
JOIN    cursos c ON a.id_curso = c.id;

-- 2. Obtener la cantidad de alumnos por curso.
SELECT      c.id,
            c.titulo, 
            COUNT(a.id) AS cantidad_alumnos 
FROM        cursos c 
LEFT JOIN   alumnos a ON c.id = a.id_curso 
GROUP BY    c.id;
    
-- 3. Mostrar alumnos activos y sus respectivos profesores.
SELECT  a.id,
        a.nombre, 
        a.apellido, 
        c.profesor 
FROM    alumnos a 
JOIN    cursos c ON a.id_curso = c.id 
WHERE   a.activo = true;

-- 4. Listar títulos de cursos que tienen alumnos mayores de 25 años.
SELECT  DISTINCT c.titulo 
FROM    cursos c 
JOIN    alumnos a ON c.id = a.id_curso 
WHERE   a.edad > 25;

-- 5. Mostrar todos los cursos que no tienen alumnos inscriptos.
SELECT      c.id,
            c.titulo 
FROM        cursos c 
LEFT JOIN   alumnos a ON c.id = a.id_curso 
WHERE       a.id IS NULL;

-- 6. Obtener el nombre de los alumnos y el día de su curso.
SELECT  a.id,
        a.nombre,
        a.apellido,
        a.edad,
        c.id, 
        c.dia 
FROM    alumnos a 
JOIN    cursos c ON a.id_curso = c.id;

-- 7. Listar alumnos de los cursos que se imparten en la mañana.
SELECT  a.id,
        a.nombre, 
        a.apellido, 
        c.titulo 
FROM    alumnos a 
JOIN    cursos c ON a.id_curso = c.id 
WHERE   c.turno = 'MAÑANA';

-- 8. Contar los cursos activos y sus respectivos profesores.
SELECT      c.profesor, 
            COUNT(c.id) AS cantidad_cursos 
FROM        cursos c 
WHERE       c.activo = true 
GROUP BY    c.profesor;

-- 9. Mostrar los alumnos con el título de su curso y su edad.
SELECT  a.id,
        a.nombre, 
        a.apellido, 
        a.edad, 
        c.titulo 
FROM    alumnos a 
JOIN    cursos c ON a.id_curso = c.id;

-- 10. Obtener los cursos y la cantidad de alumnos activos en cada uno.
SELECT      c.id,
            c.titulo, 
            COUNT(a.id) AS cantidad_alumnos_activos 
FROM        cursos c 
LEFT JOIN   alumnos a ON c.id = a.id_curso AND a.activo = true 
GROUP BY    c.id;