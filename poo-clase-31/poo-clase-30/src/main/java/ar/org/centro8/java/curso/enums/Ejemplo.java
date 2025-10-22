package ar.org.centro8.java.curso.enums;

public enum Ejemplo {
    PENDIENTE ("pendiente"),
    EN_PROCESO ("en proceso de prepararacion"),
    ENTREGADO ("Entregado");

    private final String descripcion;

    private Ejemplo(String descripcion){
        this.descripcion = descripcion;
    }

    @Override
    public String toString(){
        return descripcion;
    }
}
