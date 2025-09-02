package ar.org.centro8.java.curso;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract  class Formas {
    protected  double perimetro;
    protected  double superficie;

    public abstract void calcular();
}
