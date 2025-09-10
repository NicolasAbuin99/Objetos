package ar.org.centro8.java.curso.ejercicios.interfaces.implementaciones;

import ar.org.centro8.java.curso.ejercicios.interfaces.IPagos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Subscripcion implements IPagos{
    private String plan;
    private double costoMensual;

    @Override
    public void pagarConTarjetaDebito(double monto) {
        // acá va toda la lógica de pago con tarjeta de débito
        System.out.println("Se realizó el pago con tarjeta de débito");
    }

    @Override
    public void pagarConTarjetaCredito(double monto) {
        // acá va toda la lógica de pago con tarjeta de crédito
        System.out.println("Se aplica un recargo del 10%");
        System.out.println("Total cobrado = " + montoFormateado(aplicarRecargo(monto, 10)));
    }

    @Override
    public void pagarConTransferencia(double monto) {
        // acá va toda la lógica de pago con transferencia
        System.out.println("Se realizó el pago con transferencia");
    }

    @Override
    public void pagarConEfectivo(double monto) {
        // se anula el comportamiento del método
        System.out.println("Método de pago no válido para una subscripción");
    }

    @Override
    public void pagarConQR(double monto) {
        // se anula el comportamiento del método
        System.out.println("Método de pago no válido para una subscripción");
    }

    @Override
    public double aplicarDescuento(double monto, double descuento) {
        System.out.println("No se aplican descuentos para este coso");
        return monto;
    }
    //se pueden modificar comportamientos de un método deafault.

    

}
