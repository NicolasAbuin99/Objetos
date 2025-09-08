package ar.org.centro8.java.curso.Interfaces;

public interface IPagos {
    void pagarConTarjetaDebito(double monto);
    void pagarConTarjetaCredito(double monto);
    void pagarConTransferencia(double monto);
    void pagarConEfectivo(double monto);
    void pagarConQR(double monto);

    default double montoFormatear(double monto){
        return Math.round(monto*100.0)/100.0;
    }

    default double aplicarDescuento(double monto,double descuento){
        return monto -(monto/100.0*descuento);
    }
}
