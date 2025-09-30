package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import ar.org.centro8.java.curso.entidades.arreglos.Auto;

public class TestCollection {
    public static void main(String[] args) {
        System.out.println("** Interface List **");

        /*
         * La interface List representa una lista con índices, que emula a un Array.
         * List es la única que tiene métodos definidos con índices.
         * De esta interfaz se pueden elegir distintas implementaciones con distintas tecnologías.
         * ArrayList es una lista tipo vector que tiene por dentro un comportamiento similar a
         * un Array, pero que no es un Array, ya que es completamente dinámico.
         * LinkedList tiene todo el comportamiento heredado de List, pero internamente es una lista
         * enlazada.
         * La clase Vector también implementa List, no son los vectores que hemos visto anteriormente.
         * No se recomienda su uso, es una tecnología antigua. Tiene una sincronización excesiva, lo 
         * que la hace demasiado lenta.
         * ArrayList es una lista tipo vector y LinkedList es una lista enlazada.
         * Hay una mínima diferencia entre las dos y tiene que ver con la perfomance:
         * ArrayList es más veloz para recorrer elementos.
         * LinkedList es más veloz para agregar y eliminar elementos. 
         */

         //creo una referencia a la interfaz

        List lista;

        lista = new ArrayList<>();
        lista = new LinkedList<>();
        lista = new Vector<>();

        // .add() método para agregar elementos a un List
        lista.add(new Auto("Peugeot", "308", "Negro"));
        lista.add(new Auto("Chevrolet", "Corsa", "Rojo"));
        //esta lista no tiene especificado un tipo de dato en particular
        //en ese caso queda definida como una lista de la clase Object, por lo tanto, dentro
        //puedo guardar cualquier elemento.
        lista.add("Hola");
        lista.add(83);
        lista.add(23.45);

        System.out.println();

        //recorrido por índices
        System.out.println("-- recorrido por índices de un ArrayList --");
        for (int i = 0; i < lista.size(); i++) { //el método size indica la longitud de la lista
            System.out.println(lista.get(i));
            //con el método .get() obtengo el valor de la posición de índice que pase como parámetro
        }

        // eliminar un elemento
        lista.remove(3); //elimina el elemento del índice 3

        System.out.println("-- recorrido con for-each --");
        for(Object o:lista){
            System.out.println(o);
        }

        System.out.println();

        /*
         * Interface Iterable
         * Iterable es el padre de todas las interfaces del framework Collections.
         * Dentro de Iterable se ecuentra definido el método foreach(), es un método default.
         * Este método realiza un recorrido sobre la lista. No realizamos nosotros una estructura
         * repetitiva, si no que es la misma lista la que se autorecorre.
         * Apareció a apartir del JDK 8.
         * El método foreach() estará presente para todas las colecciones. 
         */

        System.out.println("-- recorrido con método foreach() --");
        lista.forEach(item -> System.out.println(item));
        //el foreach() recibe como parámetro una Lambda Expression
        //en este caso, item representa a cada elemento de la lista, luego con el operador flecha
        //le indico que para ese parámetro (el elemento de la lista) realiza la o las acciones que
        //siguen. En este caso, la acción es imprimir por consola el mismo elemento que se recibió
        //como parámetro.

        //si quisiéramos definir más de una sentencia tenemos que abrir llaves
        lista.forEach(item -> {
            System.out.println(item);
            System.out.println(" - ");
        });

        System.out.println();

        //Referencia de métodos (Method references)
        System.out.println("-- recorrido con foreach() simplificado --");
        lista.forEach(System.out::println);
        //si solo vamos a escribir una única sentencia, podemos omitir el uso del párametro y la flecha
        //con el operador de :: le estamos indicando a Java que el ítem implícito lo coloque como
        //argumento del método.
        //Esta es una sintaxis moderna, cómoda, prolija y abreviada.

        System.out.println("\n** ListIterator **");
        /*
         * ListIterator es una interfaz especializada para recorrer colecciones que implementan List.
         * A diferencia del iterador simple (Iterator) o del método foreach() de Iterable, ListIterator
         * ofrece funcionalidades adicionales:
         * - recorrido bidireccional: permite avanzar y retroceder sobre las listas
         * - tiene acceso a índices
         * - permite eliminar, reemplazar y agregar elementos durante la iteración.
         */

        List nombres = new ArrayList<>();
        nombres.add("Ricardo");
        nombres.add("Jenny");
        nombres.add("Carlos");
        nombres.add("Ana");
        nombres.add("Marcelo");

        //obtener el ListIterator de la lista
        ListIterator<String> li = nombres.listIterator();
        
        //recorrido hacia adelante
        System.out.println("\n-- recorrido hacia adelante --");
        while(li.hasNext()){ //comprueba si queda al menos un elemento más por recorrer en adelante
            int indice = li.nextIndex(); //nexIndex() devuelve el índice del elemento que se devolverá
            String nombre = li.next(); //next() devuelve el siguiente elemento
            System.out.println("Índice " + indice + ": " + nombre);
        }

        //recorrido hacia atrás
        System.out.println("\n-- recorrido hacia atrás --");
        while(li.hasPrevious()){
            int indice = li.previousIndex();
            String nombre = li.previous();
            System.out.println("Índice " + indice + ": " + nombre);
        }
        
        //reemplazar elementos
        while(li.hasNext()){
            String nombre = li.next();
            if(nombre.equals("Carlos")) li.set("David"); //reemplazar el nombre Carlos, por David
        }

        System.out.println("\nLista después de reemplazar a Carlos por David: " + nombres);

        //reinicio la posición del puntero del ListIterator
        li = nombres.listIterator();

        //agregar elementos
        while(li.hasNext()) {
            String nombre = li.next();
            if(nombre.equals("Ana")) li.add("Juan"); //agrega a Juan después de Ana
        }
        System.out.println("\nLista después de agregar a Juan luego de Ana: " + nombres);

        //eliminar elementos
        while(li.hasPrevious()){
            String nombre = li.previous();
            if(nombre.equals("Jenny")) li.remove(); //elimina el elemento actual
        }

        System.out.println("\nLista después de eliminar el elemento 'Jenny': " + nombres);

        //Generics
        /*
         * Para especificar el tipo de dato de una colección lo hacemos a través de los Generics.
         * Los Generics aparecieron a apartir del JDK5 y son una característica que permite crear
         * clases, interfaces o métodos con tipos de datos parametrizados.
         * Esto signicifca que podemos definir esturcturas de datos y métodos que funcionen con
         * cualquier tipo de dato, pero manteniendo la seguridad de tipos en tiempo de compilación.
         * Los Generics permiten que una clase o método trabaje con diferentes tipoos de datos sin
         * tener que escribir varias versiones del mismo código. 
         */

        List<Auto> listaAuto = new ArrayList<>(); 
        //no se pueden crear colecciones de tipos de datos primitivos, es decir, no se pueden 
        //poner tipos de datos primitivos en los Generics, para eso se utilizan los wrappers
        //int -> Integer, double -> Double, float -> Float, char -> Character, boolean -> Boolean
        
        listaAuto.add(new Auto("Renault", "Clio", "Verde fuego"));
        // listaAuto.add("Hola"); ERROR, no puedo agregar otro tipo de dato a la lista

        //si quiero asignar a una variable del tipo Auto un elemento de la lista de Object, que
        //sea un Auto, lo voy a tener que castear primero.
        Auto auto1 = (Auto) lista.get(0);

        //si asignamos un elemento de listaAuto no hace falta castear, porque la lista ya es del 
        //tipo Auto
        Auto auto2 = listaAuto.get(0);

        //copiar los autos de lista a listaAuto
        //para copiar, tenemos que tener en cuenta que no todos los elementos de lista son autos.
        lista.forEach(item -> {
            if(item instanceof Auto){
                listaAuto.add((Auto) item);
            }
        });

        System.out.println("\nrecorrido de listaAuto:");
        listaAuto.forEach(System.out::println);

        //////////////////////////////////////////////////////////////////////////////////
        
        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        System.out.println("\n ** Interface Set **");

        /*
         * La interface Set implementa Collection y tiene 3 implementaciones. 
         * La interfaz Set provee una lista sin índices. El mismo objeto contenido en la lista, 
         * es el índice. Por esa misma razón, no se admiten valores duplicados. 
         */

        // HashSet
        //La implementación HashSet es la más veloz de todas las implementaciones de Set.
        
        //creamos una referencia a la interfaz
        Set<String> setSemana;

        setSemana = new HashSet<>();
        setSemana = new LinkedHashSet<>();
        setSemana = new TreeSet<>();

        //agregamos elementos al set
        setSemana.add("lunes");
        setSemana.add("lunes");
        setSemana.add("martes");
        setSemana.add("miércoles");
        setSemana.add("jueves");
        setSemana.add("jueves");
        setSemana.add("viernes");
        setSemana.add("sábado");
        setSemana.add("domingo");
        setSemana.add("domingo");

        // no podemos hacer un recorrido por índices, justamente porque no tiene índices.
        //Podemos saber la longitud, pero no tiene índices.
        System.out.println("\n recorrido del set:");
        setSemana.forEach(System.out::println);
        //HashSet no brinda un ordenamiento específico. Lo recorre de la manera más rápida posible.

        //LinkedHashSet
        /*
         * Es otra implementación de Set. Por lo tanto, no permite valores duplicados y no hay índices.
         * No es tan rápida como HashSet, aunque ese comportamiento no se va a notar en proyectos chicos.
         * Almacena los elementos en una lista enlazada, esto quiere decir que cuando recorremos la lista, 
         * vamos a ver los elementos por orden de entrada.
         */

        //TreeSet
        /*
         * La clase TreeSet implementa SortedSet, que extiende de Set.
         * Al usar TreeSet, la clase del Generic debe implementar la interfaz Comparable.
         * Es una implementación que almacena en un árbol de orden natural.
         * Esto quiere decir que los elementos van a aparecer ordenados. En este caso, al ser 
         * elementos del tipo String, el ordenamiento va a ser alfabético.
         * No necesitamos un código de ordenamiento específico. 
         */

        //creamos un Set de Auto
        Set<Auto> setAutos;

        //setAutos = new HashSet<>();
        //setAutos = new LinkedHashSet<>();
        setAutos= new TreeSet<>();

        //agregamos los autos de listaAuto a setAutos
        //lo recorremos con foreach y agregamos con expresión lambda
        // listaAuto.forEach(setAutos::add);
        // listaAuto.forEach(auto -> setAutos.add(auto));
        //esta sería la forma más larga de la misma sentencia.
        //también podemos utilizar el método definido en la interfaz Collection, addAll()
        setAutos.addAll(listaAuto); //puedo agregar cualquier collection y evitamos hacer un recorrido

        System.out.println("\n-- recorrido de setAutos --");
        setAutos.forEach(System.out::println);
        
        setAutos.add(new Auto("Chevrolet", "Corsa", "Rojo"));

        setAutos.forEach(System.out::println);

    }
}
