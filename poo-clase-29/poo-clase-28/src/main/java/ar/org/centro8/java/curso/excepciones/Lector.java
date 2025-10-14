package ar.org.centro8.java.curso.excepciones;

public class Lector {
    public Lector(){
        System.out.println("Se creo un lector");
    }

    public void leer(){
        System.out.println("Se lee el medio");

    }

    @Override
    public void close()throws Exception{
        System.out.println("se cerro");
    }
}
