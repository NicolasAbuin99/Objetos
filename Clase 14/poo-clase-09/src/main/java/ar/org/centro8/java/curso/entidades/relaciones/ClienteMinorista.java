package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ClienteMinorista {
    private int nro;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;
}
