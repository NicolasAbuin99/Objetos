package ar.org.centro8.java.curso.tests;

import java.io.StringReader;
import java.util.Scanner;

import ar.org.centro8.java.curso.Interfaces.I_archivo;

public class TestInterfaces {
    public static void main(String []args){
        I_archivo archivo;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa una oracion");
        String mensaje = teclado.nextLine();
        System.out.println("seleccione en que tipo de archivo guardas");
        System.out.println("BINARIO-TEXTO-NUBE");
        String opcion = teclado.nextLine();
        teclado.close();

        archivo = I_archivo.crerArchivo(opcion);
        archivo.info();
        archivo.getTipo();
        System.out.println(archivo.getText());
    }
}
