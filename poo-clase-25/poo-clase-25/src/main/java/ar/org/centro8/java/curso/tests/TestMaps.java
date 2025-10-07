package ar.org.centro8.java.curso.tests;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMaps {
    public static void main(String[] args) {
        /*
         * Interface Map
         * La interfaz Map permite representar un diccionario o una estructura de datos de
         * pares clave-valor. En un Map, cada clave (key) se asocia a un valor (value), y las
         * claves no tienen por qué ser números ni consecutivas. Pueden ser de cualquier tipo de
         * objeto (por ejemplo String, Integer, etc.). Esto permite representar relaciones o
         * asociaciones en las que el índice es una clave arbitraria.
         * Un Map no extiende de Collection, aunque forma parte del framework Collections, es una
         * interfaz independiente.
         * Cada clave es única dentro del mapa, si se agrega un valor con una clave ya existente,
         * se reemplaza el valor anterior.
         * A partir del JDK 8, Map incorpora un método foreach que recibe un BiConsumer (una 
         * expresión Lambda que acepta clave-valor) para recorrer de forma automática todos sus pares).
         */

        System.out.println("** Interfaz Map **");

        Map<String, String> mapaSemana;
        //el primer valor es la K (key/llave) y el segundo es V (value/valor)
        //en este caso tomamos a la clase String como tipo de dato para la llave y el valor
        //no se pueden declarar ni llaves ni valores de tipos de datos primitivos, se deben
        //utilizar los wrappers

        //implementaciones de Map

        //HashMap: implementa un mapa sin ningún orden garantizado, es una de las implementaciones
        //más eficientes para operaciones de inserción y búsqueda
        mapaSemana = new HashMap<>();

        //LinkedHashMap: Mantiene le orden de inserción, lo que permite recorrer el mapa en el 
        //orden en que se agregaron los elementos.
        mapaSemana = new LinkedHashMap<>();

        //TreeMap: Implementa NavigableMap que implementa SortedMap. Ordena las claves, según
        //su orden natural o mediante un Comparator. Para ello requiere que la clase de la clave
        //implemente la interfaz Comparable, similar a como funciona TreeSet
        mapaSemana = new TreeMap<>();

        //HashTable: es una clase legacy (antigua) que implementa la interfaz Map, similar a HashMap
        //ya que su orden es aleatorio.
        //No está deprecada, pero su uso no es recomendado en proyectos nuevos.
        //Sus métodos están sincronizados, lo que la hace thread-safe, pero a costa de menor performance.
        //Se mantiene para soporte a proyectos antiguos, pero en desarrollo moderno se prefiere utilizar
        //HashMap
        mapaSemana = new Hashtable<>();

        //con el método .put() agrego un elemento
        mapaSemana.put("lu", "lunes");
        mapaSemana.put("ma", "martes");
        mapaSemana.put("mi", "miércoles");
        mapaSemana.put("ju", "jueves");
        mapaSemana.put("vi", "viernes");
        mapaSemana.put("sa", "sábado");
        mapaSemana.put("do", "domingo");
        //se pueden repetir los valores, pero no las llaves.

        //con el método .get() obtengo un elemento
        System.out.println(mapaSemana.get("lu"));

        System.out.println("\n-- recorrido de mapaSemana --");
        mapaSemana.forEach((k,v)->System.out.println(k + " -> " + v));




    }

}
