package ar.org.centro8.java.curso;

public class Circulo extends Formas {
    private double radio;
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public Circulo(double perimetro, double superficie, double radio) {
        super(perimetro, superficie);
        this.radio = radio;
    }
    @Override
    public void calcular(){
        perimetro =  2 * Math.PI * radio;
        superficie = Math.PI * radio  *radio; 
    }
    
    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    
}
