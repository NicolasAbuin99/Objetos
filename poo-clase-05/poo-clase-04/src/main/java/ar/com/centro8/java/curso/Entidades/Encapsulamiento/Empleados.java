package ar.com.centro8.java.curso.Entidades.Encapsulamiento;

public class Empleados {

    private int id;
    private String nombre;
    private String apellido;
    private String estadoCivil;
    private double sueldoBase;

    public Empleados(String apellido, String estadoCivil, int id, String nombre, double sueldoBase) {
        this.apellido = apellido;
        this.estadoCivil = estadoCivil;
        this.id = id;
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }


    @Override
    public String toString() {
        return "Empleados [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil
                + ", sueldoBase=" + sueldoBase + "]";
    }

    
}
