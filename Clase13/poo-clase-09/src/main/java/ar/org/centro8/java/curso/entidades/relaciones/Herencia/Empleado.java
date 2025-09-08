package ar.org.centro8.java.curso.entidades.relaciones.Herencia;

public class Empleado extends Persona {

    private int legajo;
    private float sueldo;
    @Override
    public void saludar() {
        System.out.println("Soy un empleado");
    }

    public Empleado(String nombre, String apellido, int edad, Direccion direccion, int legajo, float sueldo) {
        super(nombre, apellido, edad, direccion);
        this.legajo = legajo;
        this.sueldo = sueldo;
    }

    
}
