package ar.org.centro8.java.curso.ejercicios.herencia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Rectangulo extends Figura {
    private double lado1;
    private double lado2;

    @Override
    public double getPerimetro(){
        return 2 * (lado1 + lado2);
    }

    @Override
    public double getSuperficie(){
        return lado1 * lado2;
    }


}
