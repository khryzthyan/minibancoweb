/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tam = 3;
        int[][] MatrizA = new int[tam][tam];
        int[][] MatrizB = new int[tam][tam];
        int[][] MatrizS = new int[tam][tam];

        for (int f = 0; f < MatrizA.length; f++) {
            for (int c = 0; c < MatrizA[f].length; c++) {
                MatrizA[f][c]=(int)(Math.random()*10+1);
                MatrizB[f][c]=(int)(Math.random()*10+1);
            }
        }
        for (int f = 0; f < MatrizA.length; f++) {
            for (int c = 0; c < MatrizA[f].length; c++) {
                MatrizS[f][c]=MatrizA[f][c]+MatrizB[f][c];
            }
        }
        System.out.println("La matriz A es:");
        for (int f = 0; f < MatrizA.length; f++) {
            for (int c = 0; c < MatrizA[f].length; c++) {
                System.out.print(MatrizA[f][c]+ " ");
            }
            System.out.println("");
        }
        System.out.println("La matriz B es:");
        for (int f = 0; f < MatrizB.length; f++) {
            for (int c = 0; c < MatrizB[f].length; c++) {
                System.out.print(MatrizB[f][c]+ " ");
            }
            System.out.println("");
        }
        System.out.println("La matriz S es:");
        for (int f = 0; f < MatrizS.length; f++) {
            for (int c = 0; c < MatrizS[f].length; c++) {
                System.out.print(MatrizS[f][c]+ " ");
            }
            System.out.println("");
        }
        
    }

}
