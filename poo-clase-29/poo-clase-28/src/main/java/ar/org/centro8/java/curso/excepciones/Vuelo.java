package ar.org.centro8.java.curso.excepciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class Vuelo {
    private String nombreVuelo;
    private int cantidadDePasajes;

    public synchronized void venderPasajes(int cantidad) throws NoHayMasPasajesException{
        if(cantidad > cantidadDePasajes){
            throw new NoHayMasPasajesException(nombreVuelo, cantidadDePasajes, cantidad);
        } 
        cantidadDePasajes -= cantidad;
    }

    /*
     * La cláusula throws se utiliza en la firma de un método para indicar que éste podría lanzar
     * (throw) una o más excepciones que no se manejan internamente. Es decir, se declara la
     * posibilidad de que se produzca una excepción para que el código que llame a ese método sea
     * consciente de ello y decida cómo manejarla (ya sea capturándola mediante un try-catch o 
     * propagándola a su vez).
     * 
     * En Java, las checked exceptions deben ser gestionadas. Si un método puede lanzar una 
     * excepción verificada y no la maneja dentro de un bloque try-catch, es obligatorio declararlo
     * con throws para que el compilador sepa que quien invoque el método, debe encargarse del manejo
     * de la excepción.
     */

     /*
      * En una situación real de venta de pasajes, por ejemplo, se utililiza la claúsula syncronized
      El modificador syncronized se utiliza en Java para garantizar que solo un hilo a la vez 
      pueda ejecutar un bloque de código o un método que accede a recursos compartidos.
      Esto garantiza la integridad de los datos.
      */
}
