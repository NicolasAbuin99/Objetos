package ar.org.centro8.java.curso.entidades.relaciones.herencia;

import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class ClientePersona extends Persona{
    private int numero;
    private Cuenta cuenta;

    public ClientePersona(String nombre, String apellido, int edad, Direccion direccion, int numero, Cuenta cuenta) {
        super(nombre, apellido, edad, direccion);
        this.numero = numero;
        this.cuenta = cuenta;
    }

    @Override
    public void saludar() {
        System.out.println("Hola! soy un cliente");
    }    
    
}
