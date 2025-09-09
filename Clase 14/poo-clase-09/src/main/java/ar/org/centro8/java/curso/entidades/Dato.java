package ar.org.centro8.java.curso.entidades;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
public class Dato {
    private int dato;

    @Override
    @EqualsAndHashCode
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.dato;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dato other = (Dato) obj;
        return this.dato == other.dato;
    }

    
}
