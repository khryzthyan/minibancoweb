/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase5;

/**
 *
 * @author Capacitaciones_pc30
 */
public class OperacionesBasicas {
    /**
     * Con este metodos podras sumar
     * @param num1 Primer numero
     * @param num2 Segundo numero
     */
    public void sumar(int num1, int num2){
        int suma=num1+num2;
        System.out.println("La suma de "+num1+" + "+num2+" = "+suma);
    }
    /**
     * Con este metodo podras restar
     * @param num1 Primer numero
     * @param num2 Segundo numero
     */
    public void restar(int num1, int num2){
        int resta=num1-num2;
        System.out.println("La resta de "+num1+" - "+num2+" = "+resta);
    }
    /**
     * Con este metodo podras multiplicar
     * @param num1 Primer numero
     * @param num2 Segundo numero 
     */
    public void multiplicar(double num1, double num2){
        double Multiplicar=num1*num2;
        System.out.println("La Multiplicacion de "+num1+" * "+num2+" = "+Multiplicar);
    }
    /**
     * Con este metodo podras dividir
     * @param num1 Primer numero
     * @param num2 Segundo numero
     */
    public void dividir(double  num1, double num2){
        double Dividir=num1/num2;
        System.out.println("La Division de "+num1+" / "+num2+" = "+Dividir);
    }

}
