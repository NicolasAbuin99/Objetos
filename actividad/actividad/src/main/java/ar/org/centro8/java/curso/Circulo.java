package ar.org.centro8.java.curso;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double Perimetro()
    {
        return 2 * Math.PI * radio;
    }

    public double Superficie()
    {
        return Math.PI * radio  *radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + "]";
    }

    
}
