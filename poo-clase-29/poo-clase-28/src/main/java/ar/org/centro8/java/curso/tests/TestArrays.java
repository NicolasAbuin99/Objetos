package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.arreglos.Auto;

public class TestArrays {
    public static void main(String[] args) {
        System.out.println("** Arrays o vectores **");

        /*
         * Un array es una estructura de datos en Java que permite almacenar múltiples valores
         * del mismo tipo de dato en una ubicación contínua de memoria.
         * Se utiliza cuando necesitamos manejar un conjunto fijo de elementos.
         */

        /*
         * tipoDeDato[] identificador; -> declaración
         * tipoDeDato identificador[]; -> declaración
         * identificador = new tipoDeDato[n]; -> cantidad de elementos que va a tener
         */

        //creamos un arreglo de autos
        Auto[] autos;
        //solo se pueden guardar objetos del tipo Auto
        autos = new Auto[4];
        //la longitud del vector es de 4, es decir, que solo se podrán guardar 4 objetos de Auto
        //Los vectores son estáticos, esto quiere decir que no lo puedo achicar ni agrandar.
        //Si necesito otro tamaño de vector, lo tengo que eliminar y volver a crear.
        
        //Los vectores o arreglos tienen un proceso de inicialización automático

        //los tipos de datos referenciados se inicializan en null
        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }

        //los tipos de datos numéricos se inicializan en 0
        int numeros[] = new int[4];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //los tipos de datos char se inicializan con el caracter nulo '\u0000'
        int caracteres[] = new int[4];
        for (int i = 0; i < caracteres.length; i++) {
            System.out.println(caracteres[i]);
        }

        //asignación de valores
        autos[0] = new Auto("Fiat", "Palio", "Verde");
        // autos[1] = "hola"; error, no se puede guardar otro tipo de dato que no sea Auto
        autos[1] = new Auto("VolskWagen", "Gol", "Gris");
        autos[2] = new Auto("Renault", "Clío", "Rojo");
        autos[3] = new Auto("Fiat", "Uno", "Blanco");
        // autos[4] = new Auto("Ford", "Taunus", "Negro");
        //error porque no existe el índice 4 para una longitud de 4

        //mostrar todos los elementos de un arreglo
        //la estructura for, realiza un recorrido por índices
        /*for  (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        } */
        //el for tradicional, tiene ciertas desventajas, ya que transfiere al programador muchas
        //responsabilidades. Hay que darle un valor inicial, hay que saber la longitud, hay que 
        //determinar la condición, y se tiene que poner correctamente el incremento.

        //A partir del JDK 5 aparece la estructura for-each
        //La palabra clave o estructura for-each no está definida como palabra clave del lenguaje.
        //Es el mismo for, el que se comporta como un foreach
        for(Auto auto:autos){
            System.out.println(auto);
        }
        //Esto dice que del conjunto de autos, por cada elemento del conjunto, vamos a tener
        //un objeto del tipo Auto.
        //El for-each funciona tanto con Arrays como con colecciones que implementan la interfaz
        //Iterable.
        //No sirve para agregar o eliminar elementos durante la iteración.
        //No tiene acceso a los índices.






    }
}
