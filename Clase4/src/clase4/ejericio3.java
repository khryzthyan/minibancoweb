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
public class ejericio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int tam;
        int[] arrNumerosUno;
        int[] arrNumerosDos;
        int[] arrNumerosResultados;
        
        System.out.println("Digite el tamaño de los arreglos");
        tam=entrada.nextInt();
        
        arrNumerosUno=new int[tam];
        arrNumerosDos=new int[tam];
        arrNumerosResultados=new int[tam];
        
        for (int i=0;i<tam;i++){
            arrNumerosUno[i]= (int)(Math.random()*100)+1;
            arrNumerosDos[i]= (int)(Math.random()*100)+1;
            arrNumerosResultados[i]= arrNumerosUno[i]+arrNumerosDos[i];
            System.out.println("El resultado del indice "+(i+1)+" es: "+arrNumerosResultados[i]);
        }
        

    }
    
}
