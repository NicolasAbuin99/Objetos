package ar.org.centro8.java.curso.interfaces;

import ar.org.centro8.java.curso.interfaces.implementaciones.ArchivoBinario;
import ar.org.centro8.java.curso.interfaces.implementaciones.ArchivoNube;
import ar.org.centro8.java.curso.interfaces.implementaciones.ArchivoTexto;

public interface I_Archivo {
    /*
     * No tienen constructores, ya que no se pueden crear objetos de una interfaz.
     * Todas las variables declaradas (atributos) en una interfaz son implícitamente
     * public static final.
     * Pueden tener métodos abstractos.
     * Por defecto, los métodos de una interfaz son públicos, pero a partir del JDK 9, se pueden
     * definir métodos privados para uso interno.
     * Los métodos de una interfaz son por defecto abstractos y por lo tanto, no tienen cuerpo.
     * Las clases que implementen la interfaz deben ponerle el cuerpo al método.
     * A partir del JDK 8 se pueden definir métodos default y estáticos. Estos métodos incluyen
     * implementación. Ese código será compartido por todas las clases que implementen la interfaz.
     * Se pueden sobreescribir los métodos si requieren una implementación específica.
     * Una clase puede implementar todas las interfaces que desee.
     * Como una clase puede implementar varias interfaces, se da una situación similar a lo que sería
     * una herencia múltiple, que no existe en Java.
     * No llega a ser una herencia múltiple porque no hereda constructores.
     */

    //no hace falta escribir las palabras public y abstract, se puede evitar su uso normalmente
    //o se puede declarar para una mayor claridad en el código, como se desee
    /**
     * Método para escribir en el archivo
     * @param texto -> texto a escribir
     */
    void setText(String texto);

    /**
     * Método para leer un archivo
     * @return -> retorna el texto del archivo
     */
    String getText();

    /**
     * Método que retorna en forma de cadena el tipo del archivo.
     * @return
     */
    String getTipo();

    default void info(){
        System.out.println("I_Archivo: Interfaz para la gestión de archivos. Define el comportamiento común para todas las implementaciones");
    }

    //Factory Methods (métodos de fábrica)
    //Permiten centralizar la creación de instancias de las clases que implementan la interfaz.
    //Esto sirve para ocultar la lógica de instanciación y decidir, en función de los parámetros
    //qué implementación devolver
    public static I_Archivo crearArchivo(String tipo){
        switch (tipo.toLowerCase()) {
            case "texto": return new ArchivoTexto();
            case "binario": return new ArchivoBinario();
            case "nube": return new ArchivoNube();
            default: throw new IllegalArgumentException("Tipo de archivo no soportado: " + tipo);
        }
    }
    //esto es un polimorfismo por interfaz
    //aunque el método retorne un objeto del tipo I_Archivo, la instancia concreta puede ser de
    //cualquiera de las clases que implementen la interfaz. Por lo tanto, el objeto retornado
    //puede comportarse de distintas maneras según la implementación concreta que se devuelva.


}
