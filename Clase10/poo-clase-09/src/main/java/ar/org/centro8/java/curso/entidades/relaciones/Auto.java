package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Auto {
    private String marca;
    private String modelo;
    private String color;
}
