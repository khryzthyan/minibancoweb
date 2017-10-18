/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Capacitaciones_pc30
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[];
        
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo");
        int tam=entrada.nextInt();
        arr = new int[tam];
        int v=50;
        int i=0;
        while (v!=0 && i<tam){
            System.out.println("Ingrese el valor");
            v=entrada.nextInt();
            arr[i++]=v;

        }
        for (int j=0;j<i;j++){
            System.out.println(arr[j]);
        }
    }
    
}
