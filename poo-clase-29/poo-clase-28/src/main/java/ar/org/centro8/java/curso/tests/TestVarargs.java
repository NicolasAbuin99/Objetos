package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.varargs.Cliente;
import ar.org.centro8.java.curso.entidades.varargs.Factura;

public class TestVarargs {
    public static void main(String[] args) {
        /*
         * varargs -> argumentos variables
         * aparecen a partir del JDK 5
         * sirven para crear métodos que permitan variar el número de parámetros que reciben
         */

        Cliente cliente1 = new Cliente("Mario Barakus");

        Factura factura1 = new Factura(1);
        Factura factura2 = new Factura(2);
        Factura factura3 = new Factura(3);
        Factura factura4 = new Factura(4);
        Factura factura5 = new Factura(5);

/*         cliente1.agregarFacturas(factura1);
        cliente1.agregarFacturas(factura2); */

        cliente1.agregarFacturas(factura1, factura2, factura3, factura4, factura5);

        System.out.println(cliente1);
    }
}
