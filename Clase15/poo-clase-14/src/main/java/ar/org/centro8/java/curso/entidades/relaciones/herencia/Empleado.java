package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
/*
 * El parámetro callSuper = true le indica a Lombok que, además de incluir los campos de la clase
 * atual, también llame al toString() de la superclase (clase padre). Esto permite que la 
 * representación en cadena, incluya también los campos heredados
 */
public class Empleado extends Persona{
    private int legajo;
    private float sueldoBasico;

    public Empleado(String nombre, String apellido, int edad, Direccion direccion, int legajo, float sueldoBasico) {
        super(nombre, apellido, edad, direccion); //constructor de la clase padre
        this.legajo = legajo;
        this.sueldoBasico = sueldoBasico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola! soy un empleado");
    }    
    
}
