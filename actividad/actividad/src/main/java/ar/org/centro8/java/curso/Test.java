package ar.org.centro8.java.curso;

public class Test {

    public static void main(String[]args)
    {
        Circulo circulo1 = new Circulo(6);
        Triangulo triangulo1 = new Triangulo(3.0, 4.0);
        Rectangulo rectangulo1 = new Rectangulo(4.0, 5.0);
        //Circulo
        System.out.println(circulo1.toString());
        System.out.println(circulo1.Perimetro());
        System.out.println(circulo1.Superficie());

        //Triangulo
        System.out.println(triangulo1.toString());
        System.out.println(triangulo1.getPerimetro());
        System.out.println(triangulo1.getSuperficie());

        //Rectangulo
        System.out.println(rectangulo1.toString());
        System.out.println(rectangulo1.getPemimetro());
        System.out.println(rectangulo1.getSuperficie());

    }
}
