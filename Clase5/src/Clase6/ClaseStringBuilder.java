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
public class ClaseStringBuilder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(ClaseString.mensaje);
        sb.append(ClaseString.mensaje2);
        sb.append(ClaseString.mensaje3);
        System.out.println("Impresion de la cadena StringBuilder: "+sb);
        //El problema es que es de tipo StringBuilder y no de String y puede generar problemas con otros metodos.
        sb.toString();
        System.out.println("Impresion de la cadena String: "+sb);
    }
    
}
