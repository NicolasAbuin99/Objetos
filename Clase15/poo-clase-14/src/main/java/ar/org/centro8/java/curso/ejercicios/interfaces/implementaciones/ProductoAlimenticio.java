package ar.org.centro8.java.curso.ejercicios.interfaces.implementaciones;

import java.time.LocalDate;

import lombok.ToString;

@ToString(callSuper = true)
public class ProductoAlimenticio extends Producto{
    private String tipoAlimento;
    private LocalDate fechaVencimiento;

    public ProductoAlimenticio(String nombre, double precioBase, String tipoAlimento, LocalDate fechaVencimiento) {
        super(nombre, precioBase);
        this.tipoAlimento = tipoAlimento;
        this.fechaVencimiento = fechaVencimiento;
    }

    
}
