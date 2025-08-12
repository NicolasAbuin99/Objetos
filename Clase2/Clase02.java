public class Clase02 {
    public static void main(String[] args){
        /*Tipos de escritura
        camel case -> frasecamelcase (variables y metodos)
        pascal case -> frasepascalcase (clases e interfaces)
        snake case -> frase_snake_case (sql)
        kebab case -> frase-kebab-case (nombre de proyectos o carpetas)
        Repositorio:https://github.com/Francisco-Acuna/2025_2C_POO_TURNO_MANANA
        */
        /*Software
          JDK 21 -> https://www.oracle.com/java/technologies/downloads/#java21
          Extension para vsc -> extension pack for java
          cuando aprendemos un nuevo lenguaje siempre primero comentarios
          //TODO: indica tareas pendientes por implementar
          //FIXME: señala errores que se deben corregir
          //comentario javaDOC viene antes de una clase, metodo, interfaz etc
          //instalar TODO TREE
         */
        System.out.println("¡Hola!");
        //DECLARACION
        int Numero;
        int Numero2;
        char Caracter;
        float Numero3=12.54f;
        double Numero4=3244.45;
        System.out.println(Numero3);
        System.out.println(Numero4);
        //DATOS PRIMITIVOS
        byte variableByte = 100;
        System.out.println(variableByte);
        //para los DNI usar string porque como no lo vamos a usar para una cuenta, va a ser fijo pues lo dejamos como string
        short variableShort= 32500;
        System.out.println(variableShort);
        int variableInt = 900;
        System.out.println(variableInt);
        //boolean
        boolean bool=true;
        System.out.println(bool);
        char num=65;
        System.out.println(num);
        String palabra="ESCENCIA";
        System.out.println(palabra);
        var var1 =100;  //lo guarda como int
        var var2 = 'd'; //lo guarda como char
        var var3 = "ESCENCIA"; //lo guarda como string
        var var4 = true; //lo guarda como boolean
        var var5 = 12.50; //lo guarda como double
        //este dato se usa SOLAMENTE en variables locales
        
    }    
}