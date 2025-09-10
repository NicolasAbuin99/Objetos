package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Persona {
    //al agregar la palabra reservada abstract, estamos declarando que la clase es abstracta
    //no se pueden crear objetos de una clase abstracta
    //Una clase abstracta sirve como molde o plantila para otras clases
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion;

    // public void saludar(){
    //     System.out.println("Hola! Soy una persona.");
    // }

    //creamos un método abstracto
    public abstract void saludar();
    //un método abstracto es un método que no tiene implementación, es decir, que no tiene cuerpo
    //las subclases deben implementar el método dándole comportamiento

    public void comer(){
        System.out.println("Estoy comiendo...");
    }

}
