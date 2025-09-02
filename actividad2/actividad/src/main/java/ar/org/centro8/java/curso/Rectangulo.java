package ar.org.centro8.java.curso;

public abstract  class Rectangulo extends Formas {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double perimetro, double superficie, double ladoA, double ladoB) {
        super(perimetro, superficie);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    @Override
    public void calcular()
    {
        perimetro = 2*(ladoA+ladoB);
        superficie = ladoA * ladoB;
    }

    @Override
    public String toString() {
        return "Rectangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
    }
}
