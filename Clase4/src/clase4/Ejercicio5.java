/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Scanner;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        matriz = new int[3][3];
        int Contador = 9, fila=0, columna=0, numero;
        
        boolean validacion = false;

        while (Contador >= 0) {
            while (validacion == false) {
                System.out.println("Digite la fila 0, 1 o 2");
                fila = entrada.nextInt();
                System.out.println("Digite la columna 0, 1 o 2");
                columna = entrada.nextInt();
                if (matriz[fila][columna] != 0) {
                    System.out.println("Esta combinacion ya ha sido digitada, intente de nuevo");
                    
                }else{
                    validacion=true;
                }
            }
            System.out.println("Digite el valor para la posicion");
            numero = entrada.nextInt();
            matriz[fila][columna] = numero;

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println("");
            }
            Contador--;
            validacion=false;
        }

    }

}
