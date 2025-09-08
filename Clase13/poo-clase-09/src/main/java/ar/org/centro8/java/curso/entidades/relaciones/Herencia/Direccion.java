package ar.org.centro8.java.curso.entidades.relaciones.Herencia;

import lombok.Data;

@Data
public class Direccion {
    private String Calle;
    private int numero;
    private String piso;
    private String departamento;
    private String ciudad;


    public Direccion(String calle, int numero, String piso, String departamento, String ciudad) {
        Calle = calle;
        this.numero = numero;
        this.piso = piso;
        this.departamento = departamento;
        this.ciudad = "CABA";
    }  
}
