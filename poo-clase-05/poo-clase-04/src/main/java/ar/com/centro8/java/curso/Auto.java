package ar.com.centro8.java.curso;

public class Auto {
    String marca;
    String modelo;
    String color;
    int velocidad;

    //constructor
    Auto() {};

    //otra forma (como lo aprendi yo)

    Auto(String marca, String modelo, String color, int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
    }

    //mas

    public Auto (String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = 0;
    }
    public Auto(String marca, String modelo){
        this.marca ="Ferrari";
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    void Acelerar(){
        velocidad +=10;
    }

    void Frenar(){
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

    int obtenerVelocidad(){
        return velocidad;
    }

    @Override
        public String toString(){
            return "El "+marca+" "+modelo+" Tiene una velocidad de "+velocidad;
        }
}

