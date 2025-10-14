package ar.org.centro8.java.curso.excepciones;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NoHayMasPasajesException extends Exception{

    /*
     * Imaginemos la situación de una aerolínea que tiene la clase Vuelo.
     * La clase Vuelo tiene un método llamado venderPasajes(), el riesgo que puede ocurrir
     * es que se quieran vender más pasajes de los disponibles para ese vuelo.
     * Por eso, vamos a intentar controlar la situación con una excepción.
     */

    //con esta clase estamos creando una Exception que se va a lanzar en el caso de que
    //no existan los pasajes que hagan falta.

    //para que la clase sea una excepción, tiene que extender de Exception
    //al extender de Exception es una checked Exception

    private String nombreVuelo;
    private int cantidadPasajes;
    private int cantidadInvalidaPasajes;

    //modificamos el toString() para tener el mensaje que recibirá el usuario al momento de lanzarse la excepción
    @Override
    public String toString(){
        return "El vuelo " + nombreVuelo + " no tiene " + cantidadInvalidaPasajes + " pasajes. Solo " +
                "tiene " + cantidadPasajes + " pasajes disponibles.";
    }

}
