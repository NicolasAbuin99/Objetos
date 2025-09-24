package ar.org.centro8.java.curso.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

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

        // .add() método para agregar elementos a un List
        lista.add(new Auto("Peugeot", "308", "Negro"));
        lista.add(new Auto("Chevrolet", "Corsa", "Rojo"));
        //esta lista no especifica un tipo de dato
        //queda definido como lista de la clase object
        //y adentro puedo guardar cualquier cosa
        lista.add("hola");
        lista.add(83);

        //para ver lo que tengo dentro lo recorro por indice
        System.out.println("recorrido");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //eliminar elemento

        lista.remove(3); //elimina el elemento del indice 3
        
        System.out.println("recorrido for-each");
        for(Object o:lista){
            System.out.println(o);
        }

        /*
         * interface iterable
         * Iterable es el padre de todas las interfaces del framwork collection
         * dentro esta el metodo for-each, es un metodo default
         * este metodo realiza un recorrido sobre la lista
         */

         System.out.println("recorrido del foreach()");
         lista.forEach(item -> System.out.println(item));
         //el foreach() recibe como parametro un lamba expression
         //item presenta cada elemento de la lista
         //la flecha seria para indicar el parametro qu realiza la accion
         //en este caso es imprimir por consola el mismo elemento que recibio que seria la lista

         lista.forEach(item ->{
            System.out.println(item);
            System.out.println(" - ");
         });

         System.out.println();

         //refencia de metodos
         System.out.println("recorrido con foreach() mas simplificado");
         lista.forEach(System.out::println); //es exactamente lo mismo pero con una linea mas simplificada
         //los :: le dice que imprima todo lo que esta dentro de lista
         //si solo escribimos una unica sentencia, podemos omitir el uso de parametro y la flecha
         //ej:item ->
         //con el :: le idnicamos a java que el indice implicito lo ponga como argumento
         //es una sintaxis mucho mas moderna, comoda, prolija.

         System.out.println("ListItereitor");
         //es una interfaz que sirve para recorrer colecciones que implementan list
         //a diferencia del iterator simple o del metood foreach()
         //listIterrator ofrece: recorrido bidireccional, permite avanzar y retroceder en la lista
         //se puede acceder a los indices
         //permite eliminar, reemplazar y agregar elemennto durante la itercion

         List nombres = new ArrayList();
         nombres.add("Ricardo");
         nombres.add("Jenny");
         nombres.add("Carlos");
         nombres.add("Ana");
         nombres.add("Marcelo");

         //obtener el ListIterator de la lista

         ListIterator<String> li=nombres.listIterator();

         //recorrido hacia adelante

         System.out.println("recorrido hacia adelante");
         while(li.hasNext()){
            int indice = li.nextIndex();
            String nombre = li.next();
            System.out.println("indicie "+indice+": "+nombre);
            //devuelve un boolean porque indica que hacia adelante hay algo
         }
    }
}
