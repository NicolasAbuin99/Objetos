package ar.org.centro8.java.curso;

public class Triangulo {
    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double getBase() {
        return base;
    }


    public void setBase(double base) {
        this.base = base;
    }


    public double getAltura() {
        return altura;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double getPerimetro()
    {
        return base + altura + Math.hypot(base, altura);
    }

    public double getSuperficie()
    {
        return (base*altura)/2;
    }


    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
}
