package ar.com.centro8.java.curso;

public class Auto {
    String marca;
    String modelo;
    String color;
    int velocidad;


    void Acelerar(){
        velocidad +=10;
    }

    void frenar(){
        velocidad -=10;
    }
//sobrecarga
    void Acelerar(int kilometros){
        velocidad +=kilometros;
    }

    /**
     * Si el turbo es true incrementa el doble
     * @param kilometros = son kilometros que se van a incrementar
     * @param turbo = true si tiene turbo
     * 
    */
    void Acelerar(int kilometros,boolean  turbo){
        if(turbo) velocidad += kilometros*2;
        else velocidad +=kilometros;
    }
}

