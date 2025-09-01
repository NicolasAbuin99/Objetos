package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.relaciones.Herencia.Direccion;
import ar.org.centro8.java.curso.entidades.relaciones.Herencia.Empleado;
//import ar.org.centro8.java.curso.entidades.relaciones.Herencia.Persona;

public class TestHerencia {
    public static void main (String []args){
        /*
         * Herencia
         * relacion entre clases
         * la clase hija hereda atributos y metodos de la clase padre
         */

         System.out.println("teste de direccion");

         Direccion direccion1 = new Direccion("jujuy",132,"2","8","ciudad evita");
         System.out.println(direccion1);

         Direccion direccion2 = new Direccion("Belgrano",150,"7","8","almagro");
         System.out.println(direccion2);
/* 
         Persona persona1 = new Persona("Nico","Abuin",25,"el cardon");
         System.out.println(persona1);

         Persona persona2 = new Persona("Brubo","Cabral",25,"el judio");
         System.out.println(persona2);

         persona1.saludar();
         persona2.saludar(); */

         System.out.println("Hola");
         Empleado empleado1 = new Empleado ("Mariano","Mendoza",45,direccion2,9,1000000);
         System.out.println(empleado1);
         empleado1.saludar();
    }
}
