package ar.org.centro8.java.curso.Test;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;



import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
public class TestConnecion {

    public static void main(String[]args) throws IOException{

        Properties props = new Properties();
        //se crea un objeto de properties para cargar el fichero

        try (InputStream in = TestConnecion.class
                             .getClassLoader() //obtenemos el ClassLoader que es el responsable
                                                  //de cargar clases y recursos en tiempo de ejecución
                                .getResourceAsStream("application.properties")) {//busca el archivo que
                                    //le pasamos como parámetro y lo devuelve como un flujo de bytes
            if(in==null){
                System.err.println("No se encontro el application.properties");
                return;
            }
            props.load(in);
        } catch (Exception e) {
            System.err.println("error cargado propiedad"+e.getMessage());
            return;
        }

        HikariConfig config = new HikariConfig();
        //leemos la url de la db
        config.setJdbcUrl(props.getProperty("spring.datasourse.url"));
        config.setUsername(props.getProperty("spring.datasourse.username"));
        config.setUsername(props.getProperty("spring.datasourse.password"));
        //creamos el datasourse con el pool de conexiones y probamos
        try (HikariDataSource ds= new HikariDataSource(config);
        Connection conn = ds.getConnection()) {//con esto se obtiene la conexion
            if(conn.isValid(2)){
                //comprueba si la conexion es valida, el 2 indiica el tiempo que se tarda en conectar
                System.out.println("Conexion exitosa a:"
                +conn.getMetaData().getURL());
                //con getMetaData tenemos la info sobre la conexion activa
                //getURL retorna la url de la conexion usada
                //lo imprimimos para verificar a que base de datos no conectamos
            }else{
                System.err.println("Conexion establecida no valida");
            }
        } catch (Exception e) {
            System.err.println("No se conecto"+e.getMessage());
        }
    }
}
