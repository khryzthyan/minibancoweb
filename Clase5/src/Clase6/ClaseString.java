/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6;

/**
 *
 * @author Capacitaciones_pc30
 */
public class ClaseString {
    static String mensaje="Este es mi primer Split";
    static String mensaje2="TEXTO INICIAL EN MAYUSCULAS";
    static String mensaje3="hola caserola";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Clase String:
        .Split(); Permite romper cadenas segun el valor definido
        Hola,Mundo
        Retorna un arreglo
        .ToUpperCase(); Todo en mayuscula
        .ToLowerCase(); Todo a minuscula
        .Concut(); Concatenar, equivalente al (+)
        variable1.concat(variable2)
        */
        
        metodoSplit();
        metodoUpperCase();
        metodoLowerCase();       
        metodoSubString();
        metodoCompareTO();
        metodoConcatenar();
        
        
        
        
    }
    /**
     * Este metodo sirve para dar ejemplo del metodo split
     */
    public static void metodoSplit() {
        
        String[] arrMensaje=mensaje.split(" ");
        for (int i = 0; i < arrMensaje.length; i++) {
            System.out.println("pos "+i+" valor "+arrMensaje[i]);
        }
    }

    private static void metodoUpperCase() {
        System.out.println("*************************");
        System.out.println("Texto original: "+mensaje);
        System.out.println("*************************");
        System.out.println("Texto completo en Mayuscula: "+mensaje.toUpperCase());
    }

    private static void metodoLowerCase() {
        System.out.println("*************************");
        System.out.println("Texto original: "+mensaje2);
        System.out.println("*************************");
        System.out.println("Texto completo en Mayuscula: "+mensaje2.toLowerCase());
    }

    private static void metodoSubString() {
        System.out.println("*************************");
        System.out.println(""+mensaje3.substring(0, 4));
        System.out.println(""+mensaje3.substring(5, 13));
    }

    private static void metodoCompareTO() {
        System.out.println("*************************");
        System.out.println(mensaje.compareTo(mensaje2));
        //Si las cadenas de textos son iguales arroja un 0, sino, arroja otro valor.
        if (mensaje.compareTo(mensaje2)==0) {
            System.out.println("Los textos son iguales");
        }else{
            System.out.println("Los textos son distintos");
        }
    }

    private static void metodoConcatenar() {
        String prueba=mensaje.concat(mensaje2.concat(mensaje3));
        System.out.println("*************************");
        System.out.println(prueba);
        prueba=mensaje.concat(", "+mensaje2.concat(", "+mensaje3));
        System.out.println("*************************");
        System.out.println("Mas bonita: "+prueba);
    }
    
}
