package ar.org.centro8.java.curso.repositoriee;

import java.sql.SQLException;
import java.util.List;

import ar.org.centro8.java.curso.entities.Curso;
import ar.org.centro8.java.curso.enums.Dia;
import ar.org.centro8.java.curso.enums.Turno;

public interface ICursoDAO {
    //estos métodos podrían lanzar una SQLException que es una checked exception, por lo tanto,
    //el compilador nos obliga a que capturemos o declaremos la exception

    /**
     * Método para crear un nuevo curso en la base. Recibe un objeto de la clase Curso.
     * Y lo guarda como un registro en la base.
     */
    void create(Curso curso) throws SQLException;

    /*
     * Método que busca un Curso por su id. Se pasa como parámetro un id y retorna un objeto
     * de Curso.
     */
    Curso findById(int id) throws SQLException;

    /**
     * Método que retorna una lista de todos los cursos.
     */
    List<Curso> findAll() throws SQLException;

    /*
     * Método que actualiza un curso. Recibe un objeto de Curso y actualiza su información en la base.
     */
    int update(Curso curso) throws SQLException;

    /**
     * Método para eliminar un registro de curso. Recibe un id del curso como parámetro y elimina
     * el registro en la base.
     */
    int delete(int id) throws SQLException;

    /**
     * Método que retorna una lista de cursos que sean de un dia y turno determinado.
     * Como parámetro recibe un objeto del enumerado Dia y un objeto del enumerado Turno.
     */
    List<Curso> findByDiaAndTurno(Dia dia, Turno turno) throws SQLException;
}
