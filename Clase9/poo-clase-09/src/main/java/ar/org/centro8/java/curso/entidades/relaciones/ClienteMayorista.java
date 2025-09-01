package ar.org.centro8.java.curso.entidades.relaciones;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ClienteMayorista {
    private final int nro;
    private String razonSocial;
    private String direccion;
    private List<Cuenta> cuentas;
    //no utilizamos Arreglos porque son estáticos, no se puede modificar la cantidad de elementos
    //es decir, que se crea una cantidad fija de cuentas, no se podría modificar
    //es por eso, que necesitamos una lista dinámica, por eso utilizamos la interface List<>
    
    public ClienteMayorista(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
        //ArrayList<> es una clase que implementa la interfaz de List<>
    }
    //al crear un objeto de la clase, se inicializa con un List de cuentas vacío,
    //luego se van agregando cuentas a esa lista.
    

}
