package ar.org.centro8.java.curso.Interfaces;

public interface I_archivo {
    /*
     * interfaces: no hay objetos, solo atributos y metodos
     * public static final.
     * pueden tener metodos abstractos
     * todos los metodos son publicos pero a partir del JDK 9, se pueden definir como abstractos
     * los metodos de una interfaz son por defecto abstractos y no tienen cuerpo
     * clas clases implementadas en la interfaz se le tienen que poner un cuerpo
     * a partir del JDK 8 se pueden definir metodos default y estaticos
     * los metodos se pueden sobreescribir si se requieren
     * una clase puede implemetar todas la interfaces
     * @param texto -> texto a escribir
     */
     void setText(String texto);

     /*
      * @return -> retorna un archvio
      */
      String getText();

      /*
       * metodo que retorna la cadena de texo
       * @return
       */

       String getTipo();

       default  void info(){
        System.out.println();
       }

       public static I_archivo crerArchivo(String tipo){
        switch(tipo,toLowerCase()){
            case  "texto": return new ArchivoTexto();
            case "Binario": return new ArchivoBinario();
            case "nube": return new ArchivoNube();
            default: throw IllegalArgumentException("Tipo de archivo no soportado "+tipo);
        }
       }

}
