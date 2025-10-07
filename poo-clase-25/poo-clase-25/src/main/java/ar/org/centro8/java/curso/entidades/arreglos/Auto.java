package ar.org.centro8.java.curso.entidades.arreglos;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Auto implements Comparable<Auto>{
    private String marca;
    private String modelo;
    private String color;

    @Override
    public int compareTo(Auto auto2) {
        String autoOriginal = this.marca + this.modelo + this.color;
        String autoNuevo = auto2.marca + auto2.modelo + auto2.color;
        return autoOriginal.compareTo(autoNuevo);
        //utilizamos el método compareTo() de la clase String para comparar ambas representaciones
    }

    //este método no es muy performante porque utiliza String, pero ahorra mucho código y es de
    //fácil mantenimiento. Luego veremos otras opciones más avanzadas y simples de implementar.

    /*
     * El método compareTo() se utiliza para realizar un ordenamiento natural en una cadena.
     * El ordenamiento natural significa el orden de clasificación que se aplica al objeto.
     * Por ejeplo, el orden léxico para una cadena, orden numérico para ordenar enteros, etc.
     * Este método compara al objeto de la clase con el objeto que ingresa como parámetro.
     * Decuelve:
     *  0 sin son iguales
     *  -1 si el objeto de la clase es menor que el que entró como parámetro
     *  1 si el objeto de la clase es mayor que el que entró como parámetro.
     * 
     * Si al resultado lo multiplico por -1 le estoy cambiando el signo, por lo tanto, el orden
     * será el inverso.
     */

}
