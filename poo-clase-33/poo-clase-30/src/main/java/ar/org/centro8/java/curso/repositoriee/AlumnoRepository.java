package ar.org.centro8.java.curso.repositoriee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
     private static final String SQL_DELETE =
     "SELECT * FROM alumnos WHERE id =?";
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
            } 
        } 
    }

    @Override
    public Alumno findById(int id) throws SQLException {
        try (Connection conn = dataSourse.getConnection();
        PreparedStatement ps = conn.prepareStatement(SQL_FIND_BY_CURSO)){
            ps.setInt(1, id);
            try (ResultSet rs =  ps.executeQuery()) {//ejecuta la consulta SQL
                //cuando realizamos consultas devuelven datos (SELECT) que usa executeQuery
                //retorna ResultSet con los resultados de la consulta
                if(rs.next()){
                    return mapRow(rs);
                }
            } 
        } 
        return null;
    }

    @Override
    public List<Alumno> findAll() throws SQLException {
        List<Alumno> alumnos = new ArrayList<>();
        try (Connection conn = dataSourse.getConnection();
        PreparedStatement ps = conn.prepareStatement(SQL_FIND_ALL);
        ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                alumnos.add(mapRow(rs));
            }
        } 
        return alumnos;
    }

    @Override
    public int update(Alumno alumno) throws SQLException {
        try (Connection conn = dataSourse.getConnection();
        PreparedStatement ps = conn.prepareStatement(SQL_UPDATE)) {
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setInt(3, alumno.getEdad());
            ps.setInt(4, alumno.getIdCurso());
            ps.setBoolean(5, alumno.isActivo());
            ps.setInt(6, alumno.getId());
            int filasAfectadas = ps.executeUpdate(); //almacena el resultado de la ejecucion
            return filasAfectadas; //devuelve el numero de filas afectadas
        } 
    }

    @Override
    public int delete(int id) throws SQLException {
        try (Connection conn = dataSourse.getConnection();
        PreparedStatement ps = conn.prepareStatement(SQL_DELETE)) {
            ps.setInt(1, id);
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas;
        } 
    }

    @Override
    public List<Alumno> findByCurso(int idCurso) throws SQLException {
        List<Alumno> alumnos = new ArrayList<>();
        try (Connection conn = dataSourse.getConnection();
        PreparedStatement ps = conn.prepareStatement(SQL_FIND_BY_CURSO)) {
            ps.setInt(1, idCurso);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                alumnos.add(mapRow(rs));
                }
            } 
        } 
        return alumnos;
    }
    

    //creamos un metodo que centraliza la logica de mapeo de Resultset a objeto Java
    //evitando la duplicacion de codigo y haciendo un codigo mas limpio
    private Alumno mapRow(ResultSet rs) throws SQLException{
        Alumno a = new Alumno();
        a.setId(rs.getInt("id"));
        a.setNombre(rs.getString("nombre"));
        a.setApellido(rs.getString("apellido"));
        a.setEdad(rs.getInt("edad"));
        a.setIdCurso(rs.getInt("id_curso"));
        a.setActivo(rs.getBoolean("activo"));
        return a;
    }
}
