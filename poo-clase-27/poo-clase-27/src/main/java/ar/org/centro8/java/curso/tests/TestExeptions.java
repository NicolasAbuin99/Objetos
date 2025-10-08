package ar.org.centro8.java.curso.tests;

public class TestExeptions {

    public static void main(String[] args) {
        
        //ecepciones
        //basicamente lo que hace es mostrarte el aerror en alguna parte de tu codigo
        //sin que se rompa
        //ej

        try {
            //aca se coloco el codigo a ejecutar
            //si no hay error no pasa nada y se va al finally
            //pero si lanza una excepcion el try se detiene
        } catch (Exception e) { //obligatorio
            /*
             * en este bloque irira la excepcion, las acciones 
             * basicamente un mensaje
             * se captura la excepcion mediante un objeto mediante el tipo Exception
             * el programa sigue su ejecucion despues del bloque y no se cierra abruptamente
             */
        } finally{
            /*
             * es opcional y se ejecuta independientemente si se realizo la excepcion o no
             * se lo uso para liberar recursos, limpieza
             * cerrar archivos o base de datos etc
             * las variables declaradas dentro del try-catch no se pueden acceder en este bloque
             * ya que el alcanze es local
             */
        }

        //ejemplo

        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.err.println("ERROR, NO SE PUEDE DIVIDIR POR 0");
            //System.out.println(e);
            //System.out.println(e.getMessage()); //mensaje mas corto
            //System.out.println(e.getLocalizedMessage()); //similar al anterior pero devuelve un mensaje traducido segun la regio
            //System.out.println(e.getCause()); //retoma la causa que provoco (otra excepcion) que provoco la excepcion actual
            e.printStackTrace();//traza completa de la pila, lo que facilita la depuracion al mostrar la secuencia de llamadas de la excepcion
        }finally{
            System.out.println("Mensaje del finally");
        }

        System.out.println("menaje fuera del try-catch");

        /*
         * la clase raiz de la excepciones es Throwable que extiende de Object. esta clase
         * representa todo lo que puede lanzarse(throw) y se puede interrumpir el flujo
         * normal del programa
         * throwable tiene 2 clases principales:
         * Error y Excepcion
         * 
         * Error:representa errores graves, generalmente relacionados con los fallos criticos del hardware
         * EJ: UotOfMemory, StackOverFlowError etc.
         * dentro del error se encuntra AssertionError que se lanza cuando falla la asecion
         * las aserciones se usa para prueba y diagnostico y se pueden habilitar o deshabilitar en tiempo de ejecucion
         * mediante -ea y -da.
         * 
         * Excepcion: representa condiciones anomalaes que ocurren durante el programa y en muchos casos
         * son manejadas o recuperarse
         * dentro de excepcion tiene 2 tipos de excepciones:
         * **Checked excepcions** son las que el compilador obliga a capturar o declarar en la firma de los metodos
         * ej: IOExcepcion, SQLExcepcion, etc. Estas excepciones vienen de excepcion
         *  **Uncheked excepciones** son que no es obligatorio declarar o capturar ya que indican errores generalmente
         * de logica o condiciones inesperadas
         * ej: NullPoinerExcepcion, ArithmeticExcepcion, ArrayIndexOfExcepcion, etc. Estas sentencias extienden de
         * RuntimeExcepcion.
         * 
         * throwable->raiz de todos los objetos lanzables en java
         * Error->errores graves que no deben manejar
         * Excepcion-> Condiciones de error que se pueden manejar divididas en:
         * Checked excepcions->obligatorias de capturar o declarar
         * Uncheked excepciones-> no son obligatorias de capturar
         */
    }
}
