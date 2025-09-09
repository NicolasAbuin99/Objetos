package ar.org.centro8.java.curso.entidades.relaciones.Herencia;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract  class Persona {

    private String nombre;
    private String apellido;
    private  int edad;
    private Direccion direccion;

    /*public void saludar(){
        System.out.println("Hola soy un random");
    }*/

    public abstract void saludar();
}
