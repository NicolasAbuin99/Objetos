package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;
import java.util.List;

import ar.org.centro8.java.curso.entidades.arreglos.Persona;

public class TestApiStream {
    public static void main(String[] args) {
        //Api Stream
        /*
         * Permite procesar flujos de datos de manera uniforme, independientemente de la fuente
         * (archivo, BD, web service, etc.), usando un enfoque declarativo con expresiones lambda.
         * API (Application Programming Interface): conjunto de métodos e interfaces que facilitan
         * el acceso a funcionalidades sin conocer su implementación interna.
         * Una API podría decirse que es como un conjunto de reglas y herramientas que permite que
         * dos programas se comuniquen entre sí.
         */

        //creamos una lista de personas
        List<Persona> personas = new ArrayList<>();

        //agregamos elementos a la lista
        personas.add(new Persona(1, "Ana", 32));
        personas.add(new Persona(2, "Javier", 41));
        personas.add(new Persona(3, "Carlos", 22));
        personas.add(new Persona(4, "Estela", 55));
        personas.add(new Persona(5, "Raul", 27));
        personas.add(new Persona(6, "Miguel", 37));
        personas.add(new Persona(7, "Monica", 47));
        personas.add(new Persona(8, "Marcela", 57));
        personas.add(new Persona(9, "Ricardo", 67));
        personas.add(new Persona(10, "Juan", 45));
        personas.add(new Persona(11, "Juan", 23));
        
        
    }
}
