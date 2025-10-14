package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;
import java.util.Comparator;
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

        //realizaremos un paralelismo entre código sql y API Stream

        System.out.println("\n -- select * from personas; --");
        personas.forEach(System.out::println);

        //Stream provee métodos para poder filtrar
        //el método .stream() devuelve una implementación de la interface Stream
        //el método .filter() permite sobreescribir un predicado de expresión lambda
        //un predicado es una interface funcional que define una condición que un objeto determinado
        //debe cumplir.

        System.out.println("\n-- select * from personas where nombre='Ana'; --");
        personas
                .stream() //devuelve una secuencia de elementos para procesarlos (no los guarda)
                .filter(p->p.getNombre().equals("Ana")) //obtenemos un objeto del tipo Persona
                //luego evaluamos con una expresión booleana
                //si el resultado es verdadero, el objeto formará parte de los resultados
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas where nombre='Ana' or nombre='Juan'; --");
        personas
                .stream()
                .filter(p->p.getNombre().equals("Ana") || p.getNombre().equals("Juan"))
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas where nombre like 'ja%'; --");
        personas    
                .stream()
                .filter(p->p.getNombre().toLowerCase().startsWith("ja"))
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas where nombre like '%a'; --");
        personas
                .stream()
                .filter(p->p.getNombre().toLowerCase().endsWith("a"))
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas where nombre like '%ar%'; --");
        personas
                .stream()
                .filter(p->p.getNombre().toLowerCase().contains("ar"))
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas where edad >= 30; -- ");
        personas
                .stream()
                .filter(p->p.getEdad()>=30)
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas where nombre='Juan' and edad>=30; --");
        personas
                .stream()
                .filter(p->p.getNombre().equals("Juan") && p.getEdad()>=30)
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas order by nombre; --");
        personas
                .stream()
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(System.out::println);
        //si solo llamamos al método sorted(), la clase Persona tendría que implementar la interfaz
        //Comparable, sobreescribiendo el método compareTo().
        //El método compareTo() es parte de la interfaz Comparable y se utiliza para definir el orden
        //natural de los objetos.
        //Eso no termina siendo una solución flexible, ya que si tuviésemos que cambiar el ordenamiento
        //deberíamos cambiar la implementación del compareTo() y eso sería costoso.
        //La interfaz Comparator permite definir criterios de comparación entre objetos, es decir,
        //especifica cómo se debe ordenar un conjunto de elementos. No se trata de ordenar según el 
        //orden natural de los objetos (como lo haría la interfaz Comparable) si no de definir un 
        //criterio personalizado para compararlos.

        System.out.println("\n-- select * from personas order by edad; --");
        personas
                .stream()
                .sorted(Comparator.comparing(Persona::getEdad))
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas order by nombre, edad; --");
        personas
                .stream()
                .sorted(Comparator.comparing(Persona::getNombre)
                .thenComparing(Persona::getEdad))
                .forEach(System.out::println);
        //thenComparing se usa para definir criterios de ordenamiento adicionales

        System.out.println("\n-- select * from personas order by nombre desc, edad; --");
        personas
                .stream()
                .sorted(Comparator.comparing(Persona::getNombre)
                .reversed()
                .thenComparing(Persona::getEdad))
                .forEach(System.out::println);

        System.out.println("\n-- select * from personas order by id; --");
        personas
                .stream()
                .sorted(Comparator.comparingInt(Persona::getId))
                .forEach(System.out::println);
        //comparingInt() trabaja la comparación sobre números enteros.
        //Hace que se mejore la performance. 

        System.out.println("\n-- select * from personas where edad between 30 and 40 order by nombre; --");
        personas
                .stream()
                .filter(p->p.getEdad()>=30 && p.getEdad()<=40)
                .sorted(Comparator.comparing(Persona::getNombre))
                .forEach(System.out::println);
        
        System.out.println("\n-- select max(edad) from personas; --");
        int edadMaxima = personas
                                .stream()
                                .max(Comparator.comparingInt(Persona::getEdad))
                                .get()
                                .getEdad();
        System.out.println(edadMaxima);
        //el max devuelve un objeto de Optional, no devuelve una lista.
        //contiene una persona con la mayor edad
        //con .get() obtenemos el valor del objeto Optional, o sea, un objeto de la clase Persona
        //con .getEdad() obtenemos la edad del objeto Persona que vino del Optional.

        System.out.println("\n-- select * from personas where edad=(select max(edad) from personas);");
        personas
                .stream()
                .filter(p->p.getEdad()==(
                    personas
                            .stream()
                            .max(Comparator.comparingInt(Persona::getEdad))
                            .get()
                            .getEdad()
                ))
                .forEach(System.out::println);

        //lo más performante sería depender de una variable que almacene el valor de la edad máxima
        //ya que en este ejemplo, se estaría ejecutando una consulta dentro de otra por cada iteración
        //en cada recorrido va a ir ejecutando nuevamente la consulta para obtener el mayor, con lo 
        //cual se vuelve muy lento.
        //el siguiente ejemplo es mucho más performante
        System.out.println("\n-- select * from personas where edad=(select max(edad) from personas);");
        personas
                .stream()
                .filter(p->p.getEdad() == edadMaxima)
                .forEach(System.out::println);

    }
}
