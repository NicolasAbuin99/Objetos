package ar.org.centro8.java.curso.repositoriee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import ar.org.centro8.java.curso.entities.Alumno;

public class AlumnoRepository implements IAlumnoDAO{

    private final DataSource dataSourse;
    //definimos otros atributos, son estaticos para ahorrar memoria y constantes que garantiza que no se
    //cambie en tiempo de ejecucion

    private static final String SQL_CREATE =
    "INSERT INTO alumnos(nombre,apellido,edad,idCurso,activo) VALUES(?,?,?,?,?)";
    //los sginos de pregunta son marcadores de posicion para los valores que vamos a establecer

    private static final String SQL_FIND_BY_ID =
    "SELECT * FROM alumnos WHERE id =?";
    private static final String SQL_FIND_ALL =
    "SELECT * FROM alumnos";
    private static final String SQL_UPDATE =
    "UDATE alumnos SET nombre=?,apellido=?,edad=?,idCurso=?,activo? WHERE id=?";
    private static final String SQL_FIND_BY_CURSO =
    "SELECT * FROM alumnos WHERE idCurso=?";

    public AlumnoRepository(DataSource dataSource){
        this.dataSourse=dataSource;
    }
    /*
     * de esta manera el repositorio queda configurado con la fuente de conexiones que se va a usar
     * siempre. El repositorio no crea su propio DataSourse si no que le proporciona uno configurado
     * con hikariCP, mantiene un diseño limpio y testeable, ya que se pueden crear varias instancias
     * con distintos tipos de DataSourse, esto representa distintas bases como producto, desarrollo,testing etc
     * sin necesidad de tocar codigo interno.
     */
    @Override
    public void create(Alumno alumno) throws SQLException {
        try (Connection conn= dataSourse.getConnection(); //obtenemos la coneccion
        PreparedStatement ps = conn.prepareStatement(SQL_CREATE,java.sql.Statement.RETURN_GENERATED_KEYS)){
            //PrepareddStatement es una interfaz de java que representa una plantilla de consulta SQL
            //sirve para ejecutar consulat SQL de forma segura
            //Statement.RETURN_GENERATED_KEYS le indiica a la base de datos que despues de ejecutar
            //el insert, debe volver las claves generadas automaticamente
            ps.setString(1, alumno.getNombre()); //el 1 representa la primera posicion
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();//ejecuta la sentencia del isnert
            try (ResultSet keys =ps.getGeneratedKeys()){
                if(keys.next()){
                    alumno.setId(keys.getInt(1));
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
    }

    @Override
    public Alumno findById(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Alumno> findAll() throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public int update(Alumno alumno) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete(int id) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public List<Alumno> findByCurso(int idCurso) throws SQLException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCurso'");
    }
    
}
