package ar.org.centro8.java.curso.tests;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        System.out.println("** Clase String **");

        //podemos crear un objeto de la clase String de varias maneras
        String texto1 = "Cadena de Texto!";
        String texto2 = new String("Hola");
        String texto3 = "hola";

        //métodos para comparar
        //al comparar con el operador == va a comparar que sean el mismo objeto en memoria
        System.out.println(texto2 == "Hola"); //false
        //hay una oportunidad en la que la comparación podría darnos true
        System.out.println(texto3 == "hola"); //true
        //existe un comportamiento especial denominado "intering"
        //lo que sucede es que las cadenas creadas con comillas dobles se almacenan en un pool
        //de cadenas internas para ahorrar memoria, es decir, que de manera interna, ocuparían
        //el mismo espacio en memoria. Por eso se las considera iguales.
        //Comparar contenidos de cadenas con el == no brinda un comportamiento garantizado.

        //Para comparar cadenas de caracteres teniendo en cuenta su contenido, se utilizan
        //.equals() .equalsIgnoreCase()
        System.out.println(texto2.equals("hola")); //false
        System.out.println(texto2.equalsIgnoreCase("hola")); //true
        //IgnoreCase ignora las minúsculas y mayúsculas

        //pasar una cadena a minúsculas o mayúsculas
        //.toLowerCase() .toUpperCase()
        System.out.println(texto1.toLowerCase());
        System.out.println(texto1.toUpperCase());

        //.contains()
        //devuelve un booleano indicando si contiene la subcadena ingresada como parámetro
        System.out.println(texto1.contains("hola")); //false
        System.out.println(texto3.contains("hola")); //true

        //.length()
        //devuelve la longitud del vector, es decir, cuántos caracteres tiene
        System.out.println(texto1.length()); //16
        System.out.println(texto2.length()); //4

        //.isEmpty()
        //indica si la cadena está vacía, es decir, si su longitud es igual a 0
        System.out.println(texto1.isEmpty()); //false

        //.isBlank() aparece a partir del JDK 11
        //indica si una cadena está en blanco o si consiste únicamente en espacios en blanco
        //como por ejemplo si solo contiene espacios, tabulaciones y/o saltos de línea
        String texto4 = "   ";
        System.out.println(texto4.isEmpty()); //falso
        System.out.println(texto4.isBlank()); //true

        //charAt()
        //devuelve el caracter del índice indicado como parámetro
        System.out.println(texto1.charAt(3)); //e
        System.out.println(texto2.charAt(3)); //a

        //indexOf()
        //devuelve ek indice de la primer ocurrencia de la subcadena
        //si no esta devuelve -1

        System.out.println(texto1.indexOf("texto"));
        System.out.println(texto1.indexOf("Texto"));

        //trim()
        //quita los espacio de adelante y atras
        System.out.println("   Buenas Noches    ");
        System.out.println("     Buenas noches     ".trim());

        //startwith() y endwith()
        //devuekve un booleano si la cadena empieza o termina con un texto determinado

        System.out.println(texto1.startsWith("hola"));
        System.out.println(texto2.startsWith("Hola"));
        System.out.println(texto1.endsWith("exto"));
        System.out.println(texto1.endsWith("exto!"));

        //substring()
        //extrae la subcadena desde la posicion que le indiquemos

        System.out.println(texto1.substring(10)); //Texto
        //con 2 parametros, le indicamos la poscion de iniciio y la posicion de la subcadena
        //la posicion final, no se incluye

        System.out.println(texto1.substring(0,6));//cadena

        //metodos replace

        //reemplaza un caracter por otro
        System.out.println(texto1.replace("e", "i")); //reemplazo todas las letras e por i
        //Reemplaza una cadena por otra
        System.out.println(texto1.replace("Texto", "caracteres"));

        texto3 = "manzana,manzana,naranja";
        System.out.println(texto3);
        //reemplazar la primera vezs que aparezca la cadena
        System.out.println(texto3.replaceFirst("manzana", "banana"));
        //reemplazar todas las veces que aparezca la cadena
        System.out.println(texto3.replaceAll("manzana", "banana"));
        System.out.println(texto3.replace("manzana", "banana"));

        String texto5 = "Mi numero de telefono es 11-4487-7747";
        System.out.println(texto5.replaceAll("\\d{3}-\\d{4}-\\d{4}", "############"));
        //repeat()
        //repite la cadena la cantidad de veces que se indique
        System.out.println(texto2.repeat(2));

        //caracteres de escape
        //secuencias especiales que se usan en cadenas de texto
        //representan caracters especiales que no se representan directamente
        //comienzan con la barra invertida \ seguida de un caracter
        //ejemplo
        // \\n salto de linea
        System.out.println("Hola\nMundo");
        // \t tabulacion
        System.out.println("Hola\tMundo");
        // \" comillas doble
        System.out.println("\"Hola mundo\"");
        // \\ barra invertida
        System.out.println("\\Hola Mundo\\");

        Scanner teclado = new Scanner(System.in);
        System.out.println("Pone tu nombre y apellido");
        String nombreCompleto = teclado.nextLine();
        int espacio = nombreCompleto.indexOf(" ");
        String nombre = nombreCompleto.substring(0,espacio);
        String apellido = nombreCompleto.substring(espacio+1);
        System.out.println(nombre.toUpperCase().charAt(0)+nombre.substring(1));
        System.out.println(apellido.toUpperCase().charAt(0)+apellido.substring(1));

        String cadena ="";
        for(int i=0;i<100000;i++){
            cadena+="x";
        }
        System.err.println(cadena);
    }
    
    StringBuilder sb = new StringBuilder();
    StringBuffer sf = new StringBuffer();

    System.out.println(sf);
}
