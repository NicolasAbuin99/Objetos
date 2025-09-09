package ar.org.centro8.java.curso.tests;

public class TestString {

    public static void main(String[] args) {
        System.out.println("Clase");

        String texto1="Cadena";
        String texto2= new String("Rimac");
        String texto3="rimac";
        //Compara ambos string, es como un STRCMP
        System.out.println(texto2=="Rimac");//falce
        System.out.println(texto3=="rimac");//true
        //pasa que las cadenas creadas con "" se almacenan en un pool de cadenas internas para ahorrar memoria
        //es decir que de forma interna ocupa el mismo espacio
        //pasar una cadena a mayuscula o minuscula
        //toLowerCase() toUpperCase()

        System.out.println(texto1.toUpperCase());

        //contains() devuleve buleano si la subcadena ingresada como parametro
        System.out.println(texto3.contains("hola"));

        //lengh()
        //devuelve el largo como el STRLEN
        System.out.println(texto1.length());

        //isEmpty()
        //indica si la cadena esta vacia, es decir si su longitus es igual a 0
        System.out.println(texto2.isEmpty());

        //isBlanck aparace a partir del JDK 11
        //indica si una cadena esta en blanco o si contiene espacios

        System.out.println(texto3.isBlank());

        //charAT()
        //devuelve el caracter del indice indicado

        System.out.println(texto2.charAt(5));

        System.out.println(texto1.charAt(3));
    }
}
