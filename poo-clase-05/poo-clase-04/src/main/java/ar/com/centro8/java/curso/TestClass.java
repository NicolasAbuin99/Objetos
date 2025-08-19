package ar.com.centro8.java.curso;

public class TestClass {
    public static void main(String[] args) { //pongo main y hago enter
        System.out.println("Test Clase Auto ");

        //Constructos

        Auto auto1 = new Auto();
        Auto auto2 = new Auto();

        auto1.marca="Rimac";
        auto1.modelo="Nevera";
        auto1.color="Azul";
        auto1.velocidad=0;

        auto2.marca="Genty";
        auto2.modelo="Akylone";
        auto2.color="Azul";
        auto2.velocidad=0;

        System.out.println(auto1.marca);
        System.out.println(auto1.modelo);
        System.out.println(auto1.color);
        System.out.println(auto1.velocidad);

        System.out.println(auto2.marca);
        System.out.println(auto2.modelo);
        System.out.println(auto2.color);
        System.out.println(auto2.velocidad);

        System.out.println(auto1.marca);
        
        auto1.Acelerar();
        System.out.println(auto1.velocidad);

        auto1.Acelerar();
        auto1.Acelerar();
        auto1.Acelerar();
        System.out.println(auto1.velocidad);

        for(int i=0;i<5;i++) auto2.Acelerar();{
            System.out.println(auto2.velocidad);
        }
        auto2.Acelerar(20);
        auto2.Acelerar(15,true);
        auto2.Frenar();
        System.out.println(auto2.obtenerVelocidad());

        Auto auto3 = new Auto("Mclaren","F1","Naranja",0);
        Auto auto4 = new Auto ("Porsche","Carrera GT","Negro");
        System.out.println(auto3);
        System.out.println(auto4);
    }
}
