package ar.org.centro8.java.curso.ejercicios.herencia;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circulo extends Figura{
    private double radio;

    @Override
    public double getPerimetro(){
        // return 2 * 3.1416 * radio;
        return 2 * Math.PI * radio;
    }

    @Override
    public double getSuperficie(){
        return Math.PI * Math.pow(radio, 2);
    }

}
