/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase6;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Atributosfinal {
    public static int CONSTANTE_UNO=5;
    public static int CONSTANTE_DOS=10;
    //Los static final no se pueden cambiar de valor y tiene que inicializarse con uno
    public static final int CONSTANTE_TRES=20;
    public static final int CONSTANTE_CUATRO=30;
    
    public static int sumaConstantes(){
        return CONSTANTE_UNO + CONSTANTE_DOS;
}
    
    
}
