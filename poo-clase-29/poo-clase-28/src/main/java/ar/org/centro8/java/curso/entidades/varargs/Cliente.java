package ar.org.centro8.java.curso.entidades.varargs;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Cliente {
    private String nombre;
    private List<Factura> facturas = new ArrayList<>();


    public Cliente(String nombre) {
        this.nombre = nombre;
    }

/*     public void agregarFacturas(Factura f){
        facturas.add(f);
    } */

    public void agregarFacturas(Factura... f){
        for (int i = 0; i < f.length; i++) {
            facturas.add(f[i]);
        }
    }

    //Los métodos varargs se identifican por contener los 3 puntos (...)
    //permiten pasar varios argumentos del mismo tipo
    //una vez construido el método, se pueden añadir distintas cantidades de objetos de Factura.
    //Cuando hay varios parámetros en un método, el argumento variable, debe ir a lo último.
    //Solo puede haber un único argumento variable como parámetro de un método.

}
