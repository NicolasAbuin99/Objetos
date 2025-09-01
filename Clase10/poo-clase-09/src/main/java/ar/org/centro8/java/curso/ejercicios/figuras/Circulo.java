package ar.org.centro8.java.curso.ejercicios.figuras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circulo {
    private double radio;

    public double getPerimetro(){
        // return 2 * 3.1416 * radio;
        return 2 * Math.PI * radio;
    }

    public double getSuperficie(){
        return Math.PI * Math.pow(radio, 2);
    }

}
