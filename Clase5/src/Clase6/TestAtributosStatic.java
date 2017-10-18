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
public class TestAtributosStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Clase 6
            *Cuando un metodo(como el static void main class) o atributo es static(estatico), no se puede 
            instanciar en un objeto en otra clase.
            Para obtener el metodo o atributo static en otra clase, se llama directo asi:
                *NombreClase.Atributo;
                *NombreClase.nombreMetodo();
            Tambiern sirve para cambiar el atributo;
            *Tipo final->Cuando un atributo es final , no se puede cambiar su valor en tiempo de ejecucion:
             NivelAcceso(ejemp private) Static Final tipoDato nombreAtributoOVariable
            Para una clase final:
                NiveLaCCESO final class NombreClase{
        */
        Atributosfinal.CONSTANTE_UNO=4;
        int resultado=Atributosfinal.sumaConstantes();
        System.out.println("La suma de las constantes es: "+resultado);
        
    }
    
}
