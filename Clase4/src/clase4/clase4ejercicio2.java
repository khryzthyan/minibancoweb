/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Capacitaciones_pc30
 */
public class clase4ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double PromedioPares=0, PromedioImpares=0, ContPares=0, ContImpares=0, SumaPosPar=0,SumaPosImpar=0;
        double arrNumeros[];
        Scanner entrada=new Scanner(System.in);
        int Tamano;
        Random rnd= new Random();

        System.out.println("Digite el tamaño del vector");
        Tamano=entrada.nextInt();
        arrNumeros=new double[Tamano];
        
        for (int i=0;i<arrNumeros.length;i++){
            arrNumeros[i]= (int)((Math.random()*100)+1);
        }
        for (int i=0;i<arrNumeros.length;i++){
            if (arrNumeros[i]%2==0){
                ContPares++;
                PromedioPares+=arrNumeros[i];
            }else{
                ContImpares++;
                PromedioImpares+=arrNumeros[i];
            }
            if (i%2==0){
                SumaPosPar+=i;     
            }else{
                SumaPosImpar+=i;
            }
        }
        
        PromedioPares/=ContPares;
        PromedioImpares/=ContImpares;
        System.out.println("La suma de pares es: "+SumaPosPar);
        System.out.println("La suma de impares es: "+SumaPosImpar);
        System.out.println("El promedio de los pares es: "+PromedioPares);
        System.out.println("El promedio de los impares es: "+PromedioImpares);
    }
    
}
