package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.Data;

@Data
public class EmpleadoAgregaciones {
    //Las agregaciones, son un tipo de relación un poco más fuerte entre clases
    //son de las más utilizadas
    //la reconocemos con las palabras "tiene un/a"
    //por ejemplo en este caso, un empleado tiene un auto

    private int legajo;
    private String nombre;
    private String apellido;
    private Auto auto;

    public EmpleadoAgregaciones(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //creamos el constructor sin el auto, ya que el auto puede ser opcional en un principio
    
    //con el set de auto, le asignamos el auto al empleado y también lo podemos cambiar
}
