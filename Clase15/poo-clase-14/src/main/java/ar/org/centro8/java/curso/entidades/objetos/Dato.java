package ar.org.centro8.java.curso.entidades.objetos;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Dato {
    public int dato;

/*     @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + dato;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dato other = (Dato) obj;
        if (dato != other.dato)
            return false;
        return true;
    } */

    
}
