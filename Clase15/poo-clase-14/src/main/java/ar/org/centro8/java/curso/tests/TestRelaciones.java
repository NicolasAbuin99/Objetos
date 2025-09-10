package ar.org.centro8.java.curso.tests;

import java.util.List;

import ar.org.centro8.java.curso.entidades.relaciones.Auto;
import ar.org.centro8.java.curso.entidades.relaciones.ClienteMayorista;
import ar.org.centro8.java.curso.entidades.relaciones.ClienteMinorista;
import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;
import ar.org.centro8.java.curso.entidades.relaciones.EmpleadoAgregaciones;
import ar.org.centro8.java.curso.entidades.relaciones.EmpleadoAsociacionSimple;
import ar.org.centro8.java.curso.entidades.relaciones.EmpleadoComposicion;

public class TestRelaciones {
    public static void main(String[] args) {
        System.out.println("** Test de la clase Cuenta **");

        Cuenta cuenta1 = new Cuenta(1, "pesos argentinos");
        System.out.println(cuenta1);

        cuenta1.depositar(100000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.depositar(200000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.debitar(123.46f);
        System.out.println(cuenta1.getSaldo());

        Cuenta cuenta2 = new Cuenta(2, "dólares");
        System.out.println(cuenta2);
        cuenta2.depositar(7500);
        cuenta2.debitar(10000);
        System.out.println(cuenta2.getSaldo());
        

        System.out.println("** Clase Cuenta funcionando correctamente **");

        System.out.println("\n//////////////////////////////////////////////////\n");

        System.out.println("\n** Test de la clase ClienteMinorista **");

        ClienteMinorista cliente1 = new ClienteMinorista(1, "Carlos", "Noguera", cuenta1);
        System.out.println(cliente1);
        // cliente1.depositar(10000); 
        //error, porque el método depositar no es del ClienteMinorista, es un método de la clase Cuenta
        cliente1.getCuenta().depositar(10000);
        System.out.println(cliente1);

        ClienteMinorista cliente2 = new ClienteMinorista(2, "Romina", "Villegas", new Cuenta(3, "reales"));
        System.out.println(cliente2);

        ClienteMinorista nuevoClienteMinorista3 = new ClienteMinorista(3, "Federico", "Castañeda", cuenta2);
        //creamos un apuntador
        Cuenta cta3 = nuevoClienteMinorista3.getCuenta();
        //significa que cta3 es la cuenta del objeto nuevoClienteMinorista3
        //no es un nuevo objeto
        System.out.println(nuevoClienteMinorista3);
        System.out.println(nuevoClienteMinorista3.getCuenta());
        System.out.println(cta3);
        cta3.depositar(1000);
        System.out.println(nuevoClienteMinorista3);

        System.out.println("** Clase ClienteMinorista funcionando correctamente **");

        System.out.println("\n//////////////////////////////////////////////////\n");

        System.out.println("\n** Test de la clase ClienteMayorista **");

        ClienteMayorista cliente4 = new ClienteMayorista(12, "Supermercados Júpiter", "Jujuy 132");
        System.out.println(cliente4);

        //creamos un apuntador para facilitar el manejo de las cuentas
        List<Cuenta> cuentas4 = cliente4.getCuentas();

        Cuenta cuenta3 = new Cuenta(4, "Libras esterlinas");
        //con el método add() agregamos cuentas a la lista
        cuentas4.add(cuenta3);
        cuentas4.add(new Cuenta(5, "Euros"));
        cuentas4.add(new Cuenta(6, "Patacones"));

        //con get() obtenemos el elemento de la posición indicada como parámetro
        cuentas4.get(0).depositar(7500);
        cuentas4.get(1).depositar(12000);
        cuentas4.get(2).depositar(75000000);
        cuentas4.get(1).debitar(12000);
        System.out.println(cliente4);
        
        System.out.println("** Clase ClienteMayorista funcionando correctamente **");

        System.out.println("\n//////////////////////////////////////////////////\n");

        System.out.println("\n** Test de la clase Auto **");

        Auto auto1 = new Auto("Chevrolet", "Corsa", "Fucsia");
        System.out.println(auto1);

        System.out.println("\n** Test de la clase EmpleadoAsociacionSimple **");
        EmpleadoAsociacionSimple empleado1 = new EmpleadoAsociacionSimple(123, "Esteban", "Quito");
        System.out.println(empleado1);
        empleado1.usarAuto(auto1);

        System.out.println("\n** Test de la clase EmpleadoAgregaciones **");
        EmpleadoAgregaciones empleado2 = new EmpleadoAgregaciones(124, "Elsa", "Vor de Lencuentro");
        System.out.println(empleado2);
        empleado2.setAuto(auto1);
        System.out.println(empleado2);

        System.out.println("\n** Test de la clase EmpleadoComposicion **");
        EmpleadoComposicion empleado3 = new EmpleadoComposicion(222, "Jorge", "Latina", auto1);
        System.out.println(empleado3);
        EmpleadoComposicion empleado4 = new EmpleadoComposicion(333, "Facundo", "Gomez", "Ford",
         "Falcon", "negro");
        System.out.println(empleado4);
        Auto autoNuevo = empleado4.getAuto();       


    }
}
