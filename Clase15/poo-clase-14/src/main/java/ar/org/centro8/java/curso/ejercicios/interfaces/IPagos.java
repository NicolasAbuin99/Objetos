package ar.org.centro8.java.curso.ejercicios.interfaces;

public interface IPagos {
    //se establece el contrato que puede servir para cualquier clase que lo implemente
    //cada clase deberá definir el comportamiento y la tecnología que se necesite para implementar cada método

    void pagarConTarjetaDebito(double monto);
    void pagarConTarjetaCredito(double monto);
    void pagarConTransferencia(double monto);
    void pagarConEfectivo(double monto);
    void pagarConQR(double monto);

    /**
     * Método que retorna el monto ingresado redondeado a 2 decimales
     * @param monto -> monto inicial
     * @return -> el monto redondeado a 2 decimales
     */
    default double montoFormateado(double monto){
        return Math.round(monto * 100.0) / 100.0;
        //123.45678
        // * 100.0 -> 12345.678
        //round -> 12346
        // / 100.0 -> 123.46 
    }

    /**
     * Método que retorna el resultado de aplicar un descuento del porcentaje que se ingresa como parámetro.
     * @param monto -> monto inicial
     * @param descuento -> porcentaje del descuento
     * @return -> monto final con el descuento aplicado
     */
    default double aplicarDescuento(double monto, double descuento){
        return monto - (monto / 100.0 * descuento);
    }

    /**
     * Método que retorna el resultado de aplicar un recargo del porcentaje que se ingresa como parámetro.
     * @param monto -> monto inicial
     * @param recargo -> porcentaje del recargo
     * @return -> monto final con el recargo aplicado
     */
    default double aplicarRecargo(double monto, double recargo){
        return monto + (monto / 100.0 * recargo);
    }

}
