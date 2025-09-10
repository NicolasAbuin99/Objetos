package ar.org.centro8.java.curso.interfaces.implementaciones;

import ar.org.centro8.java.curso.interfaces.I_Archivo;

public class ArchivoBinario implements I_Archivo {
    private String texto;

    @Override
    public void setText(String texto) {
        System.out.printf("Escribiendo '%s' en archivo binario\n", texto);
        this.texto = texto;
    }

    @Override
    public String getText() {
        return this.texto;
    }

    @Override
    public String getTipo() {
        return "Archivo binario";
    }


}
