package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.objetos.Dato;
import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.ClientePersona;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Direccion;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Empleado;
import ar.org.centro8.java.curso.entidades.relaciones.herencia.Persona;

public class TestObjetos {
    public static void main(String[] args) {
        
        /*
        * En Java existe la clase Class, y Java, internamente, toma a todas las clases que nosotros
        * creamos como objetos de la clase Class, en tiempo de ejecución.
        * Los atributos son tratados en Java como objetos de la clase Field, que se encuentra en el
        * paquete java.lang.reflect.Field
        * Los métodos son tratados internamente como objetos de la clase Method que se encuentra en
        * el paquete java.lang.reflect.Method
        * Esta es la base del API de reflexión de Java, la cual nos permite inspeccionar y manipular
        * información de clases, métodos y atributos en tiempo de ejecución.
        * Aunque nosotros no creemos los objetos de Field o Method directamente, el compilador y la
        * JVM generan estos objetos internamente para gestionar la información de nuestras clases.
        * Las clases públicas de java.lang son accesibles de manera global.
        */

        Direccion direccion1 = new Direccion("Av. Medrano", 162, "2", "8");
        Cuenta cuenta1 = new Cuenta(1, "Pesos argentinos");
        Persona persona1 = new Empleado("Saul", "Hudson", 51, direccion1, 65, 1_500_000);
        //el guión bajo es estético, no modifica el comportamiento, solo sirve para 
        //separar visualmente las unidades 
        System.out.println(persona1);
        Persona persona2 = new ClientePersona("Franco", "Colapinto", 22, direccion1, 10, cuenta1);

        //si queremos guardar persona1 dentro de un objeto de Empleado, tenemos un error
        //ya que persona1 está guardada dentro de un contenedor mayor, que es del tipo Persona
        // Empleado empleado1 = persona1;
        //para resolver esta situación, tenemos que castear la asignación
        //castear significa convertir una variable de un tipo a otro
        //es una forma de indicarle al compilador que trate a un objeto o valor como si fuera de otro tipo
        //Empleado empleado1 = (Empleado) persona1;
        //si pasáramos otro tipo de dato, Java lo va a intentar asignar igual, pero va a arrojar una
        //java.lang.ClassCastException y detendrá el programa.
        //para salvar esta situación podríamos utilizar el instanceOf junto con el operador ternario
        Empleado empleado1 = (persona1 instanceof Empleado) ? (Empleado) persona1 : null;
        System.out.println(empleado1);
        
        //Los objetos tienen acceso a los miembros de su clase más todo lo heredado de la clase
        //padre y de la clase Object (clase padre de todas las clases).
        //El objeto de una clase padre, no puede tener acceso a los miembros de sus clases hijas. 

        System.out.println();

        Dato d1 = new Dato(2);
        Dato d2 = d1; //es un apuntador al mismo espacio de memoria
        Dato d3 = new Dato(d1.dato); //es un nuevo objeto, en un nuevo espacio de memoria
        Dato d4 = new Dato(4);
        String st = "2";

        //El método hashCode() es un método heredado de la clase Object
        //El código hash es un valor entero calculado por Java a partir del estado o la identidad
        //del objeto. Este valor se utiliza principalmente en estructuras de datos hash para 
        //facilitar la búsqueda y el almacenamiento eficiente de objetos. No es la dirección de 
        //memoria del objeto.

        System.out.println("d1.hashCode(): " + d1.hashCode()); //122883338  - 33
        System.out.println("d2.hashCode(): " + d2.hashCode()); //122883338  - 33
        System.out.println("d3.hashCode(): " + d3.hashCode()); //1028214719 - 33
        System.out.println("d4.hashCode(): " + d4.hashCode()); //500977346  - 35
        System.out.println("st.hashCode(): " + st.hashCode()); //50         - 50
        //vemos que d1 y d2 tienen el mismo hashCode porque son considerados el mismo objeto
        System.out.println();
        //el método equals() también está definido en la clase Object
        //compara objetos por medio del hashCode, devuelve un booleano
        System.out.println("d1.equals(d1): " + d1.equals(d1)); //true  - true
        System.out.println("d1.equals(d2): " + d1.equals(d2)); //true  - true
        System.out.println("d1.equals(d3): " + d1.equals(d3)); //false - true
        System.out.println("d1.equals(d4): " + d1.equals(d4)); //false - false
        System.out.println("d1.equals(st): " + d1.equals(st)); //false - false

        //puede darse la situación de que debamos considerar que dos objetos con el mismo estado
        //sean tomados como el mismo objeto.
        //Esto pasa con la clase String por ejemplo.
        //Si comparamos dos objetos del tipo String con el método .equals() por más que sean dos
        //objetos con distinto lugar de memoria, van a ser considerados el mismo objeto si tienen
        //el mismo estado, porque en la clase String los métodos .equals() y hashCode() están 
        //sobreescritos.

        //vamos a sobreescribir esos métodos en la clase Dato para que los objetos con el mismo
        //estado, sean considerados el mismo objeto.


    }
}
