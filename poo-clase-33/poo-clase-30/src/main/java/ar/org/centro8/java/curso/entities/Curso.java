package ar.org.centro8.java.curso.entities;

import ar.org.centro8.java.curso.enums.Dia;
import ar.org.centro8.java.curso.enums.Turno;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    private int id;
    private String titulo;
    private String profesor;
    private Dia dia;
    private Turno turno;
    private boolean activo;
}
