package ar.org.centro8.java.curso;

public class Triangulo extends Formas {
    private double base;
    private double altura;


    public Triangulo(double perimetro, double superficie, double base, double altura) {
        super(perimetro, superficie);
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
    @Override
    public void calcular()
    {
        perimetro = base + altura + Math.hypot(base, altura);
        superficie = (base*altura)/2;
        System.out.println("Perimetro "+perimetro+" Y Superficie "+superficie);
    }
   
    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
}
