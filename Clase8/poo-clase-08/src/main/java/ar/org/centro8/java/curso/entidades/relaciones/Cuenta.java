package ar.org.centro8.java.curso.entidades.relaciones;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public class Cuenta {
    private final int nro;
    private final String moneda;
    //las declaramos final, porque no queremos que se modifique su valor
    private float saldo;
    //en este caso, el atributo no es final porque necesitamos que sí cambie su valor
    //no está incluido en el constructor, y su valor inicial es de 0.0 ya que los
    //tipos de dato primitivos, no pueden ser nulos y tienen un proceso de inizialización automático

    public void depositar(float monto){
        this.saldo += monto;
    }

    public void debitar(float monto){
        if(this.saldo-monto < 0) System.out.println("No es posible descontar ese monto.");
        else this.saldo -= monto;
    }

}
