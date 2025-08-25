package ar.org.centro8.java.curso;

public class Rectangulo {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
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

    public double getPemimetro()
    {
        return 2*(ladoA+ladoB);
    }

    public double getSuperficie()
    {
        return ladoA * ladoB;
    }

    @Override
    public String toString() {
        return "Rectangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + "]";
    }
}
