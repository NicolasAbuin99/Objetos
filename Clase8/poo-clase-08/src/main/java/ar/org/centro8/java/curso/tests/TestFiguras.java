package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.ejercicios.figuras.Circulo;
import ar.org.centro8.java.curso.ejercicios.figuras.Rectangulo;
import ar.org.centro8.java.curso.ejercicios.figuras.TrianguloRectangulo;

public class TestFiguras {
    public static void main(String[] args) {
        //creamos un objeto de Rectangulo
        System.out.println("** Rectángulo: **");
        Rectangulo rectangulo1 = new Rectangulo(125, 32);
        System.out.println(rectangulo1);
        System.out.println("Perímetro: " + rectangulo1.getPerimetro());
        System.out.println("Superficie: " + rectangulo1.getSuperficie());

        System.out.println("\n** Triángulo rectángulo: ** ");
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(45, 12.78);
        System.out.println(triangulo1);
        System.out.println("Perímetro: " + triangulo1.getPerimetro());
        System.out.println("Superficie: " + triangulo1.getSuperficie());

        System.out.println("\n** Círculo: **");
        Circulo circulo1 = new Circulo(23.48);
        System.out.println(circulo1);
        System.out.println("Perímetro: " + circulo1.getPerimetro());
        System.out.println("Superficie: " + circulo1.getSuperficie());

    }
}
