package ar.org.centro8.java.curso.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Alumno {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int idCurso;
    private boolean activo;
}
