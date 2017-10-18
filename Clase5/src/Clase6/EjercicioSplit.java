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
public class EjercicioSplit {

    static String mensaje = "Jeinsson/Andres/Castillo/Lucumi";
    static String nombre;
    static String nombreDos;
    static String apellido;
    static String apellidoDos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] split = metodoSplitEjercicio(mensaje);

        nombre = split[0];
        nombreDos = split[1];
        apellido = split[2];
        apellidoDos = split[3];

        StringBuilder completo = new StringBuilder();

        for (int i = 0; i < split.length; i++) {
            completo.append(split[i]+" ");
        }
        
        System.out.println("El texto en mayuscula es: " + completo.toString().toUpperCase());
        System.out.println("El texto en minuscula es: " + completo.toString().toLowerCase());

    }

    private static String[] metodoSplitEjercicio(String mensaje) {
        String[] split;
        split = mensaje.split("/");
        return split;
    }

}
