package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EmpleadoComposicion {
    //las composiciones son de las relaciones más fuertes entre clases
    //una clase no tiene sentido sin la instancia de la otra clase que la compone
    //la reconocemos con las palabras "siempre tiene un/a"
    //en este caso, un empleado siempre tiene un auto

    private int legajo;
    private String nombre;
    private String apellido;
    @NonNull //anotación de Lombok que indica que el valor no puede ser nulo
    private Auto auto;
    //si se quisiera ingresar un auto nulo, va a dar error en tiempo de ejecución
    //de esta manera nos aseguramos que un empleado siempre tenga un auto.

    //un ejemplo de una relación de composición más fuerte, se podría dar cuando al crear
    //el objeto de la clase EmpleadoComposicion, creemos un nuevo objeto del tipo Auto en ese momento
    public EmpleadoComposicion(int legajo, String nombre, String apellido, String marca,
    String modelo, String color) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto = new Auto(marca, modelo, color);
    }
    //no podemos crear un objeto de EmpleadoComposicion sin asignarle un auto.

    //también podríamos hacer que el setAuto() le asigne un nuevo auto en vez de uno existente
    public void setAuto(String marca, String modelo, String color){
        this.auto = new Auto(marca, modelo, color);
    }


}
