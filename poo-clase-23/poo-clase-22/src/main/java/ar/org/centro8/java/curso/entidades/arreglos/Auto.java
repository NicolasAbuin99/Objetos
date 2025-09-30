package ar.org.centro8.java.curso.entidades.arreglos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Auto implements Comparable<Auto>{
    private String marca;
    private String modelo;
    private String color;

    @Override
    public int compareTo(Auto auto2) {
        String autoOriginal = this.marca + this.modelo + this.color;
        String autoNuevo = auto2.marca + auto2.modelo + auto2.color;
        return autoOriginal.compareTo(autoNuevo);
        //lo usamo para comparar ambas representaciones
    }
    
    //este metodo no es muy performante porque usa string, pero ahorra codigo y se mantiene facil

    /*
     * compareTo se usa para un ordenamiento natural en una cadena
     * el ordenamiento natural significa el orden de clasificacion que se le apilca al obj
     * ej: orden lexico de una cadena, orden numero para enteros etc
     * este metodo compara al obj de la clase con el obj que se ingresa como parametro y devuelve
     * 0 si son iguales
     * -1 si el obj de la clase es menor al obj parametro
     * 1 si el obj de la clase es mayor al obj de parametro
     * si el resultado lo multiplico por -1
     * le cambio el signo, el orden seria inverso
     */

}
