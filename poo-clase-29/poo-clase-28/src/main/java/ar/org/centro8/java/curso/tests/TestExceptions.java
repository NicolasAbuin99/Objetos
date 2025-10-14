package ar.org.centro8.java.curso.tests;

import java.io.File;
import java.io.FileInputStream;

import ar.org.centro8.java.curso.excepciones.GeneradorDeExcepciones;
import ar.org.centro8.java.curso.excepciones.NoHayMasPasajesException;
import ar.org.centro8.java.curso.excepciones.Vuelo;

public class TestExceptions {
    public static void main(String[] args) {
        //si ejecutamos el siguiente código se va a generar un error
        // System.out.println(10/0);
        // System.out.println("Esta sentencia no se ejecuta");
        //Este error va a detener la JVM dando una devolución de 1, lo que signfica que el 
        //programa finalizó con errores.
        //El programa se detiene de forma incorrecta.

        //Manejo de excepciones
        //Estructura try-catch-finally -> mecanismo para el manejo de excepciones
        try { //obligatorio
            /*
             * En este bloque se colocan todas las sentencias que puedan lanzar una excepción.
             * Si no se produce ningún error el bloque se ejecuta normalmente y salta al bloque
             * finally (si es que existe).
             * Si se lanza una excepción, la ejecución del bloque try se detiene inmediatamente
             * y se transfiere el control al bloque catch
             */
        } catch (Exception e) { //obligatorio (la mayoría de las veces)
            /*
             * En este bloque se definen las acciones a realizar cuando se produce una Exception.
             * Se captura la excepción mediante un objeto del tipo Exception que contiene información
             * del error.
             * El programa continúa su ejecución después de este bloque, sin detenerse abruptamente.
             * Salta al bloque finally si es que existe.
             */
        } finally { //opcional
            /*
             * Este bloque se ejecuta siempre, independientemente de que se haya lanzado o no una
             * excepción.
             * Se utiliza para liberar recursos o realizar tareas de limpieza. Como cerrar archivos,
             * conexiones a bases de datos, etc.
             * Las variables declaradas dentro de los bloques try o catch no son accesibles desde
             * este bloque, ya que el alcance (scope) es local a esos bloques.
             */
        }

        //ejemplo
        try {
            System.out.println(10/0);
            //el error no detiene el programa
            System.out.println("Esta sentencia no se ejecuta si salta una exepción");
        } catch (Exception e) {
            System.out.println("Mensaje del bloque catch: Ocurrió un error");
            // System.out.println(e); //imprimo el objeto del error.
            // System.out.println(e.getMessage()); //mensaje corto con la descripción
            // System.out.println(e.getLocalizedMessage()); //similar a getMessage() pero devuelve
            //un mensaje traducido según la configuración regional si es que fue sobreescrita
            // System.out.println(e.getCause()); //retorna la causa (otra Exception) que provocó la 
            //excepción actual
            e.printStackTrace(); //imprime la traza completa de la pila. Lo que facilita la depuración
            //al mostrar la secuencia de llamadas que condujeron a la excepción.
        } finally {
            System.out.println("Mensaje del boque finally: Este bloque se ejecuta siempre");
        }

        System.out.println("Mensaje fuera del bloque try-catch-finally: Esta sentencia se "+
        "ejecuta sin problemas, haya habido o no una excepción.");

        System.out.println("El programa finaliza normalmente.");

        /*
         * La clase raíz de las excepciones es Throwable que extiende de Object. Esta clase
         * representa todo lo que puede "lanzarse" (throw) y que puede interrumpir el flujo
         * normal del programa.
         * 
         * Throwable tiene dos clases principales: Error y Exception.
         * 
         * Error: 
         *  - representa errores graves, generalmente relacionados con la JVM o fallos críticos
         * del hardware (por ejemplo, OutOfMemory, StackOverFlowError, etc.).
         *  - estos errores no están diseñados para ser capturados ni manejados, ya que indican
         * condiciones de las que la aplicación en la mayoría de los casos no puede recuperarse.
         *  - dentro de Error se encuentra AssertionError que se lanza cuando falla una aserción
         * (assert). Las aserciones se utilizan principalmente para pruebas y diagnóstico, y se 
         * pueden habilitar o deshabilitar en tiempo de ejecución, mediante las opciones -ea 
         * (enable assertions) y -da (disable assertions).
         *  
         * Exception:
         *  - representa condiciones anómalas que pueden ocurrir durante la ejecución del programa
         * y que, en muchos casos, pueden ser manejadas o recuperadas.
         *  - dentro de Exception existen dos tipos:
         *      - **Checked exceptions**: son aquellas que el compilador obliga a capturar o declarar
         * en la firma de los métodos (por ejemplo IOException, SQLException, etc.). Estas excepciones
         * heredan directamente de Exception.
         *      -**Unchecked exceptions**: son aquellas que no es obligatorio capturar o declarar, ya
         * que generalmente indican errores de lógica o condiciones inesperadas (por ejemplo NullPointerException,
         * ArithmeticException, ArrayIndexOutOfBoundsException, etc.). Estas sentencias extienden de 
         * RuntimeException.
         * 
         * throwable -> raíz de todos los objetos "lanzables" en Java
         * Error -> errores graves que no deben o no se pueden manejar.
         * Exception -> condiciones de error que se pueden manejar, divididas en:
         *      Checked exceptions -> obligatorias de capturar o declarar.
         *      Unchecked exceptions -> no son obligatorias de capturar.
         */

        //las excepciones del tipo checked estamos obligados a controlarla, por ejemplo:
        //FileInputStream in = new FileInputStream(new File("texto.txt"));

        try {
            FileInputStream in = new FileInputStream(new File("texto.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
         * new File("archivo.txt") crea un objeto de la clase File que representa la ruta o ubicación
         * del archivo llamado "texto.txt". No abre ni crea el archivo en el sistema de archivos, 
         * simplemente representa su ruta.
         * La ruta es relativa al directorio de trabajo actual (el cual depende de dónde se esté ejecutando
         * la aplicación) o puede ser una ruta absoluta si se especifica. 
         * new FileInputStream() utiliza el objeto File creado en el paso anterior para abrir el archivo
         * para una lectura en forma de flujo de bytes. El constructor de FileInputStream busca y abre
         * el archivo "texto.txt". Si el archivo no existe o no se puede abrir (por ejemplo por problemas
         * de permisos), se lanzará una excepción del tipo FileNotFoundExeption (una checked exception).
         * Asignación a la variable in: la referencia al objeto FileInputStream se asigna a la variable in,
         * lo que permite usar in para leer los datos del archivo o cerrarlo cuando ya no se necesite.
         */

        //las excepciones del tipo unchecked no son obligatorias de capturar
        //pero en el caso de lanzar el error, detienen el programa
        try {
            // GeneradorDeExcepciones.generar(); //ArrayIndexOutOfBoundsException
            // GeneradorDeExcepciones.generar("10f"); //NumberFormatException
            // GeneradorDeExcepciones.generar(true); //ArithmeticException
            GeneradorDeExcepciones.generar("hola", 10); //StringIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println(e);
        }

        //captura personalizada de exceptions
        //vamos a generar varios catch para poder personalizar la salida, de acuerdo al tipo de error
        //la excepción va ir viendo en qué catch entra, como si fuese un switch case
        //las excepciones padre deben ir al final de todo.
        try {
            // GeneradorDeExcepciones.generar();
            // GeneradorDeExcepciones.generar("hola", 10);
            // GeneradorDeExcepciones.generar("10t");
            GeneradorDeExcepciones.generar(true);
        } catch (ArithmeticException e) { System.out.println("Error de división por cero.");
        } catch (NumberFormatException e) { System.out.println("Error de formato de número incorrecto");
        } catch (NullPointerException e) { System.out.println("Error de puntero nulo");
        //} catch (ArrayIndexOutOfBoundsException e) { System.out.println("Índice fuera de rango");
        //} catch (StringIndexOutOfBoundsException e) { System.out.println("Índice fuera de rango");
        //multicatch
        // } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) { System.out.println("Índice fuera de rango");
        } catch (IndexOutOfBoundsException e) { System.out.println("Índice fuera de rango"); 
        } catch (Exception e) { System.out.println("Ocurrió un error inesperado");
        }

        //El multicatch aparece a partir del JDK 7 para capturar varios tipos de excepciones en
        //un solo bloque, lo que simplifica la redundancia del código cuando la acción a tomar es
        //la misma. El operador | no es el OR tradicional, es un operador que sirve para separar
        //los distintos tipos de excepciones.
        //Otra opción que podríamos utilizar es la de capturar ambas excepciones por medio de la
        //clase padre. 

        System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");

        //excepciones para validar reglas de negocio

        Vuelo vuelo1 = new Vuelo("AER123", 100);

        try {
            vuelo1.venderPasajes(10);
            vuelo1.venderPasajes(40);
            vuelo1.venderPasajes(40);
            vuelo1.venderPasajes(30);
            vuelo1.venderPasajes(30);
        } catch (NoHayMasPasajesException e) {
            System.out.println(e);
        }

        System.out.println("Vuelo1: " + vuelo1);
        
        /* 
        try {
            FileInputStream in = new FileInputStream(new File("texto.txt"));
            in.read();//intento leer
            in.close();//intento cerrar
        } catch (Exception e) {
            //in.close();esto ponerlo dentro de otro try
            try {
                if(in!=null)in.close();
            } catch (Exception ee) {
                System.out.println(ee);
            }
        }
        */

        try (FileInputStream inNew = new FileInputStream(new File("texto.txt"))) {
            //dentro de los parametros del try se declaran los objetos que implementan la interfa<
        } catch (Exception e) {
            System.out.println(e);
        }
        //de esta manera despreocupamos de cerrar los recursos closeables, no usamos un bloque finally
        //queda un codigo mas claro y limpio, es mejor lectura para otros programadores y son buenas practicas.
    }
}
