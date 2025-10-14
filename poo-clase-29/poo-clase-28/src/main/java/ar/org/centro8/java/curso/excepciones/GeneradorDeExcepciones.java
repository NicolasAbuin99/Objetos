package ar.org.centro8.java.curso.excepciones;

public class GeneradorDeExcepciones {
    //vamos a crear métodos estáticos para no tener que crear objetos de la clase para llamarlos.
    //Estos métodos van a lanzar excepciones

    public static void generar(){
        int[] vector = new int[5];
        vector[10] = 20;
    }

    public static void generar(boolean x){
        if(x) System.out.println(10/0);
    }

    public static void generar(String numero){
        Integer.parseInt(numero); 
    }

    public static void generar(String texto, int index){
        System.out.println(texto.charAt(index));
    }
}
