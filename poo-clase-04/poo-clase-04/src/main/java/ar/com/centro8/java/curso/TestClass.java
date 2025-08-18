package ar.com.centro8.java.curso;

public class TestClass {
    public static void main(String[] args) { //pongo main y hago enter
        System.out.println("Test Clase Auto ");

        //Constructos

        Auto auto1 = new Auto();

        auto1.marca="Rimac";
        auto1.modelo="Nevera";
        auto1.color="Azul";
        auto1.velocidad=0;

        System.out.println(auto1.marca);
        System.out.println(auto1.modelo);
        System.out.println(auto1.color);
        System.out.println(auto1.velocidad);
        auto1.Acelerar();
        System.out.println(auto1.velocidad);

        auto1.Acelerar();
        auto1.Acelerar();
        auto1.Acelerar();
        System.out.println(auto1.velocidad);
    }
}
