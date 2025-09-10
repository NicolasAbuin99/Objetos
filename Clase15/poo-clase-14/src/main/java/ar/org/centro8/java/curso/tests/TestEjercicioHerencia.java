package ar.org.centro8.java.curso.tests;

import java.time.LocalDate;

import ar.org.centro8.java.curso.ejercicios.interfaces.implementaciones.Producto;
import ar.org.centro8.java.curso.ejercicios.interfaces.implementaciones.ProductoAlimenticio;

public class TestEjercicioHerencia {
    public static void main(String[] args) {
        Producto producto1 = new Producto("servilleta", 123.12);
        System.out.println(producto1);
        ProductoAlimenticio producto2 = new ProductoAlimenticio("chocolate", 1000, "golosina", LocalDate.of(2025, 9, 20));
        System.out.println(producto2);

        producto1.pagarConEfectivo(100);
        producto2.pagarConEfectivo(100);
    }
}
