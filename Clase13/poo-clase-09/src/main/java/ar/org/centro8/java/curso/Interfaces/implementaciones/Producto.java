package ar.org.centro8.java.curso.Interfaces.implementaciones;

import ar.org.centro8.java.curso.Interfaces.IPagos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Producto implements IPagos {

    private String nombre;
    private double precio;

    @Override
    public void pagarConTarjetaDebito(double monto) {
        System.out.println("Se realizo el pago con debito");
    }

    @Override
    public void pagarConTarjetaCredito(double monto) {
        System.out.println("Se realizo una recarga del 10%");
        System.out.println("Total: "+montoFormatear(aplicarDescuento(monto, 10)));
    }

    @Override
    public void pagarConTransferencia(double monto) {
        System.out.println("Se realizo el pago con Transferencia");
    }

    @Override
    public void pagarConEfectivo(double monto) {
        System.out.println("Se realizo el pago con efectivo");
    }

    @Override
    public void pagarConQR(double monto) {
        System.out.println("Se realizo el pago con QR");
    }
}
