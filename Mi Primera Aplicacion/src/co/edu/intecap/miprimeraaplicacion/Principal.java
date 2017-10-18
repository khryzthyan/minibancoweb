/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.intecap.miprimeraaplicacion;

import co.appreactor.superteclado.Teclado;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero = 3;
       long numerolargo = 10000L;
       float decimal = 3.5F;
       double decimalGrande = 964.496415;
       boolean exist = true;
       String frase = "Esto no es un Hola Mundo";
        System.out.println(frase+" "+(decimal+decimalGrande));
        
        System.out.println("Escriba un numero");
        double numeroUno = Teclado.leerNumeroDecimal();
        
        System.out.println("Escriba un segundo numero");
        double numeroDos = Teclado.leerNumeroDecimal();
        
        System.out.println("Escriba operacion");
        char op = Teclado.leerCaracter();
        
        
        
        if (op == '+') {
            System.out.println(numeroUno+numeroDos);
                        
        }
        if (op == '-') {
             System.out.println(numeroUno-numeroDos);   
            }
                
         if (op == '*') {
             System.out.println(numeroUno*numeroDos);
                            
            }
         
         if (op == '/') {
             System.out.println(numeroUno/numeroDos);
                                         
            }
       
        
                
        
        
        
        
                
        
        
        
        
        
        
        
       
       
       
    }
    
}
