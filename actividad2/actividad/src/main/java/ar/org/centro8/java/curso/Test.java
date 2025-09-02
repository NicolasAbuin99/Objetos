package ar.org.centro8.java.curso;

public class Test {

    public static void main(String[]args)
    {
        Circulo circulo1 = new Circulo(0,0,6);
        Triangulo triangulo1 = new Triangulo(0,0,3.0, 4.0);
        Rectangulo rectangulo1 = new Rectangulo(0,0,4.0, 5.0);
        //Circulo
        System.out.println(circulo1.toString());
        circulo1.calcular();
        //Triangulo
        System.out.println(triangulo1.toString());
        triangulo1.calcular();

        //Rectangulo
        System.out.println(rectangulo1.toString());
        rectangulo1.calcular();

    }
}
