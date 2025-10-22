package ar.org.centro8.java.curso.repositoriee;

import java.sql.SQLException;
import java.util.List;

import ar.org.centro8.java.curso.entities.Alumno;


public interface IAlumnoDAO {
    //estos metodos pueden lanzar una SQLExcepcion que es una cheked exception
    //el compilador obliga a que la capturemos
    //DAO Me permite accedes a los datos de la base de datos hoy en dia se usa mas repositorie
    
    void create(Alumno alumno) throws SQLException;
    Alumno findById (int id) throws SQLException;
    List<Alumno> findAll() throws SQLException;
    int update (Alumno alumno) throws SQLException;
    int delete (int id) throws  SQLException;
    List<Alumno> findByCurso (int idCurso) throws SQLException;
    
}
