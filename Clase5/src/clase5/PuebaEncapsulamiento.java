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
public class PuebaEncapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PClaseEncapsulamiento pClaseEncapsulamiento=new PClaseEncapsulamiento();
        //para el valor encapsulado
        pClaseEncapsulamiento.setEdad(17);
        System.out.println("Impresion valor atributo edad "+pClaseEncapsulamiento.getEdad());
    }
    
}
