package ar.org.centro8.java.curso.tests;

import java.util.Scanner;

import ar.org.centro8.java.curso.interfaces.I_Archivo;

public class TestInterfaces {
    public static void main(String[] args) {
        //creamos una referencia a la interfaz
        I_Archivo archivo;

        //inicialización:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una oración:");
        String mensaje = teclado.nextLine();
        System.out.println("Seleccione en qué tipo de archivo quiere guardar su texto:");
        System.out.println("BINARIO - TEXTO - NUBE");
        String opcion = teclado.nextLine();
        teclado.close();
        //en programas pequeños o en contexto de enseñanza, cerrar el Scanner no es crítico,
        //pero en aplicaciones reales es buena práctica liberar recursos
        
        archivo = I_Archivo.crearArchivo(opcion);

        archivo.setText(mensaje);
        archivo.info();
        archivo.getTipo();
        System.out.println(archivo.getText());
    }
}
