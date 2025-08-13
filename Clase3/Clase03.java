
import java.util.Scanner;

public class Clase03{

    public static void main (String [] args){

        //ESTRUCTURAS

        //IF
        int num1 =33;
        int num2 =44;

        if(num1>num2){
            System.out.println("Es mayor");
        }else{
            System.out.println("Es menor");
        }

        if(num1>num2){
            System.out.println("Es mayor");
        }else if(num1<num2){
            System.out.println("Es menor");
        }else{
            System.out.println("Son iguales");
        }

        //Switch
        int dia =7;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;                
            default:
                System.out.println("Nada");
                break;
        }

        //Rule switch
        /*Se reemplaza los : por ->
         * adios Break
         */

         String diaSemana = switch(dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "No valido";
         };
         System.out.println(diaSemana);

         //Estructuras repetitivas

         //While

         int contador = 1;
         while(contador<=10){
            System.out.println(contador);
            contador++;
         }
         //DO

         int numero = 0;
         int suma = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Se suman numeros enteros");
        System.out.println("Siempre y cuando nu supere el 100");
        do { 
            System.out.println("Ingrese un numero para sumar o 0 para salir");
            numero= teclado.nextInt();
            if(numero %2 !=0) continue;
            if(numero > 0) suma += numero;
            if(suma > 100) break;
        } while (numero !=0);
        System.out.println("La suma es: "+suma);

        //for

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}