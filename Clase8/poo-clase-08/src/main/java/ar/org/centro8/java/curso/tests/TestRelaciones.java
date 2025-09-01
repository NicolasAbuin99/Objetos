package ar.org.centro8.java.curso.tests;

import ar.org.centro8.java.curso.entidades.relaciones.ClienteMinorista;
import ar.org.centro8.java.curso.entidades.relaciones.Cuenta;

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


    }
}
