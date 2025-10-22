package ar.org.centro8.java.curso.enums;

public enum Dia {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES
}

/*
 * Un enum es como una lsita de pociones fijas, en vez de pasar a texto el lunes usa dia.LUNES
 * y java impide poner cualquier otro valor que no este en la lista
 * en este caso objetos de la clase dia
 * Estos objetos pueden poseer atributos, para eso se crea un constructor privado que le permite asignar
 * un valor como estado
 * Es privado para que desde afuera no se crea mas objetos
 * No dependen de otra clase, permiten interfaces y el ToString se puede sobreescribir
 */
