package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.keywords.Automovil;

public class TestKeywords {
    public static void main(String[] args) {
        System.out.println("** Test de Automovil (keywords) **");

        Automovil auto1 = new Automovil("Chevrolet", "Spin", "Blanco");
        System.out.println(auto1);
        System.out.println(auto1.getVelocidad()); //0
        System.out.println(Automovil.getVelocidad()); //0
        auto1.acelerar(20);
        System.out.println(auto1.getVelocidad()); //20
        System.out.println(Automovil.getVelocidad()); //20

        Automovil auto2 = new Automovil("Ford", "Focus", "Violeta");
        System.out.println(auto2);
        System.out.println(auto2.getVelocidad()); //20
        Automovil.frenar(5);
        System.out.println(auto1.getVelocidad()); //15
        System.out.println(auto2.getVelocidad()); //15
        System.out.println(Automovil.getVelocidad()); //15 

    }
}
