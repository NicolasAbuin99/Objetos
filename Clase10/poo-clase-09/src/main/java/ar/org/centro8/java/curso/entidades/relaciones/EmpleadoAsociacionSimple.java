package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpleadoAsociacionSimple {
    //La asociación simple es la relación menos acoplada
    //la reconocemos con las palabras "usa un/a"
    //por ejemplo, en este caso, un empleado usa un auto

    private int legajo;
    private String nombre;
    private String apellido;

    public void usarAuto(Auto auto){
        System.out.println("El empleado " + this.nombre + " " + this.apellido + " está utilizando " +
        "el auto " + auto);
    }
}
