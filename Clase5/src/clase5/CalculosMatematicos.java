/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

import java.util.Scanner;

/**
 *
 * @author Capacitaciones_pc30
 */
public class CalculosMatematicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int numero1,numero2;
        String Operacion;
        OperacionesBasicas operacionesBasicas=new OperacionesBasicas();
        
        System.out.println("Digite el numero 1");
        numero1=entrada.nextInt();
        System.out.println("Digite el numero 2");
        numero2=entrada.nextInt();
        System.out.println("Digite la operacion que desea hacer");
        Operacion=entrada.next();
        
        switch (Operacion){
            case "+": 
                operacionesBasicas.sumar(numero1, numero2);
                break;
            case "-":
                operacionesBasicas.restar(numero1, numero2);
                break;
            case "*":
                operacionesBasicas.multiplicar(numero1, numero2);
                break;    
            case "/":
                operacionesBasicas.dividir(numero1, numero2);
                break;
            default:
                System.out.println("Operacion invalida");
                 
        }
        
        
    }
    
}
