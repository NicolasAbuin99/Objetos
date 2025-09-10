package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.ClientePersona;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Direccion;
// import ar.org.centro8.java.curso.entidades.relaciones.herencia.Persona;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Empleado;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Persona;

public class TestHerencia {
    public static void main(String[] args) {
        /*
         * Herencia
         * Es un mecanismo para reutilizar miembros de una clase.
         * Esto favorece la extensión y especialización de comportamientos.
         * Representa la relación más fuerte entre clases.
         * La reconocemos con las palabras "es un/a".
         * En este caso, las clases pueden derivar de otras clases.
         * A la clase derivada se la considera una subclase y a la clase de la que deriva,
         * se la considera superclase.
         * También se las conoce como clases hijas y clase padre.
         * Una clase en Java solo puede tener una única superclase directa.
         * Java no soporta la herencia múltiple.
         */

        System.out.println("** Test de la clase Direccion **");
        Direccion direccion1 = new Direccion("Jujuy", 132, "2", "B");
        System.out.println(direccion1);

        Direccion direccion2 = new Direccion("Belgrano", 66, "PB", "C");
        System.out.println(direccion2);

        /* System.out.println("\n** Test de la clase Persona **");

        Persona persona1 = new Persona("Alvaro", "Solis", 34, direccion1);
        System.out.println(persona1);

        Persona persona2 = new Persona("Mariana", "Gutierrez", 26, direccion2);
        System.out.println(persona2);

        persona1.saludar();
        persona2.saludar(); */

        System.out.println("\n** Test de la clase Empleado **");
        Empleado empleado1 = new Empleado("Mariano", "Mendoza", 25, direccion2, 6, 1500000);
        System.out.println(empleado1);
        empleado1.saludar();
        empleado1.comer();

        System.out.println("\n** Test de la clase ClientePersona **");
        ClientePersona cliente1 = new ClientePersona(
                                                        "Chester", "Benington", 35, 
                                                        new Direccion("Linkin Park", 123, "1", "B"),
                                                        10, new Cuenta(12, "Dólares"));
        System.out.println(cliente1);
        cliente1.saludar();
        cliente1.comer();

        ///////////////////////////////////////////////////////////////////////////////
        
        /*
         * Polimorfismo
         * Es la capacidad de un objeto para tomar muchas formas, lo que permite que el mismo
         * método pueda comportarse de distintas formas dependiendo del contexto.
         * 
         * Hay 2 clases de polimorfismo:
         * 
         * 1. Polimorfismo sin redefinición, es en tiempo de compilación (sobrecarga de métodos):
         *  Se produce cuando en una misma clase existen varios métodos con el mismo nombre, pero con
         *  diferentes parámetros (diferentes firmas). Esto permite ejecutar acciones similares sobre
         *  distintos tipos o números de argumentos.
         * 
         * 2. Polimorfismo con redefinición, es en tiempo de ejecución (sobreescritura de métodos):
         *  Se produce cuando una subclase redefine un método heredado de la subclase (usando @Override).
         *  Esto permite que una variable de tipo de la superclase pueda referenciar objetos de diferentes
         *  subclases, comportándose de manera distinta según la instancia concreta.
         */

        /*
         * Persona es una clase abstracta, no se pueden crear objetos de esa clase.
         * Lo que si puedo hacer es crear una variable de referencia del tipo Persona.
         * Utilizamos para eso, los constructores de las clases hijas.
         * Porque dentro de la variable del tipo Persona, podemos almacenar objetos de las clases hijas.
         */

        Persona persona1 = new Empleado("Ariel", "Menendez", 41, direccion2, 10, 1000000);
        Persona persona2 = new ClientePersona("Mauro", "Fonseca", 30, direccion2, 100, 
                                                new Cuenta(12, "Dólares"));

        System.out.println("** Polimorfismo **");
        //polimorfismo con redefinición, el mismo método tiene distintos comportamientos
        persona1.saludar();                                        
        persona2.saludar();

        //Ejercicio
        //modificar el ejercicio de las figuras geométricas para que cumplan con el concepto de herencia


    }
}
