package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;
import ar.org.centro8.java.curso.entidades.relaciones.Herencia.Direccion;
import ar.org.centro8.java.curso.entidades.relaciones.Herencia.Empleado;
import ar.org.centro8.java.curso.entidades.relaciones.Herencia.Persona;

public class objetos {
    Direccion direccion1 = new Direccion("Av medrano", 162, "2","8","");
    Cuenta cuenta1 = new Cuenta(1, "Pesos Argentinos");
    Persona persona1 = new Empleado("Saul", "Hudson", 65, direccion1, 65, 1_500_000);
    //Si queremos guardar persona1 dentro de empleado no se puede
    //poque? porque persona1 esta guardada dentro de un contenedor mayor que seria Persona
    //Para resolver esto se debe castear
    //le indicas al compilador que trate un objeto o valor como si fuera de otro tipo
    //Empleado empleado1 = persona1; NO VA
    Empleado empleado1 = (Empleado)persona1;
}
