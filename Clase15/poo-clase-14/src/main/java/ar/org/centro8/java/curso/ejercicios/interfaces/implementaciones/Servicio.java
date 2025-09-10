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
public class Servicio implements IPagos{
    private String descripcion;
    private double tarifa;

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
        // acá va toda la lógica de pago con efectivo
        System.out.println("Se aplica un descuento del 10%");
        System.out.println("Total cobrado = " + montoFormateado(aplicarDescuento(monto, 10)));
    }

    @Override
    public void pagarConQR(double monto) {
        // acá va toda la lógica de pago con QR
        System.out.println("Se realizó el pago con QR");
    }


}
