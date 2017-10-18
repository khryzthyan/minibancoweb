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
public class OperacionesBasicasConstructor {
    public double num1;
    public double num2;

    public OperacionesBasicasConstructor(double num1, double num2) {
        /*
        La palabra reservada this, especifica que el atributo que va despues de el punto pertenece a la clase que lo contiene
        
        La sobrecarga de metodos es contner muchos metodos con el mismo nombre pero con distintos atributos
        */
        this.num1 = num1;
        this.num2 = num2;
    }

    public OperacionesBasicasConstructor() {
    }
    /**
     * Metodo sin parametros que realizara la suma de los dos numeros de la clase
     */
    public void sumar(){
        double suma=(num1+num2);
        System.out.println("La suma de "+num1+" + "+num2+" = "+suma);
    }
    
}
