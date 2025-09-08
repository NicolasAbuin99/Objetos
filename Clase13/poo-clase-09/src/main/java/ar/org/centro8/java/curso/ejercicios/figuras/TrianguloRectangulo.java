package ar.org.centro8.java.curso.ejercicios.figuras;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TrianguloRectangulo {
    private double base;
    private double altura;

    public double getPerimetro(){
        // return base + altura + Math.sqrt((base * base) + (altura * altura));
        // return base + altura + Math.sqrt((Math.pow(base, 2)) + Math.pow(altura, 2));
        return base + altura + Math.hypot(base, altura);
    }

    public double getSuperficie(){
        return base * altura / 2;
    }
}
