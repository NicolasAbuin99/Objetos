package ar.org.centro8.java.curso.interfaces.implementaciones;

import ar.org.centro8.java.curso.interfaces.I_Archivo;

public class ArchivoTexto implements I_Archivo {
    //la clase está obligada a sobreescribir los métodos abstractos.
    //La clase puede heredar de otra clase (extends + nombre de la clase padre).
    //La clase puede implementar varias interfaces (se separan los nombres de cada una con coma).
    //Si una clase implementa múltiples interfaces que continene un método default con la misma
    //firma, la clase debe sobreescribir dicho método para resolver la ambigüedad
    private String texto;

    @Override
    public void setText(String texto) {
        System.out.printf("Guardando '%s' dentro de archivo de texto\n", texto);
        this.texto = texto;
    }

    @Override
    public String getText() {
        return this.texto;
    }

    @Override
    public String getTipo() {
        return "Archivo texto";
    }
}
