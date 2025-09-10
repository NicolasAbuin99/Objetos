package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.ejercicios.herencia.Circulo;
import ar.org.centro8.java.curso.ejercicios.herencia.Figura;
import ar.org.centro8.java.curso.ejercicios.herencia.Rectangulo;
import ar.org.centro8.java.curso.ejercicios.herencia.TrianguloRectangulo;

public class TestHerenciaFiguras {
    public static void main(String[] args) {
        System.out.println("** Test de herencia con figuras **");

        Figura figura1 = new Rectangulo(12, 24);
        System.out.println(figura1.getPerimetro());
        System.out.println(figura1.getSuperficie());

        figura1 = new TrianguloRectangulo(15,25);
        System.out.println(figura1.getPerimetro());
        System.out.println(figura1.getSuperficie());

        figura1 = new Circulo(15);
        System.out.println(figura1.getPerimetro());
        System.out.println(figura1.getSuperficie());
    }
}
