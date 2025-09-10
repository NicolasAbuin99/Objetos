package ar.org.centro8.java.curso.interfaces.implementaciones;

import ar.org.centro8.java.curso.interfaces.I_Archivo;

public class ArchivoNube implements I_Archivo{
    private String texto;

    @Override
    public void setText(String texto) {
        System.out.printf("Escribiendo '%s' en archivo de nube", texto);
        this.texto = texto;
    }

    @Override
    public String getText() {
        return this.texto;
    }

    @Override
    public String getTipo() {
        return "Archivo nube";
    }
}
