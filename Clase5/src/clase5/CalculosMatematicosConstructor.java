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
public class CalculosMatematicosConstructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Asignar valores a los atributos de manera individual

        OperacionesBasicasConstructor operacionesBasicasConstructor = new OperacionesBasicasConstructor();
        operacionesBasicasConstructor.num1 = 6;
        operacionesBasicasConstructor.num2 = 76;
        operacionesBasicasConstructor.sumar();
        //Asignar valores directamente a los atributos al instanciar el objeto
        OperacionesBasicasConstructor objoperacionesBasicasConstructor = new OperacionesBasicasConstructor(78, 20);
        objoperacionesBasicasConstructor.sumar();
        /* 4 pilares de la programacion orientada a objetos
        Herencia
        Poliformismo
        Abstraccion
        Encapsulamiento
        
        
        1)Encapsulamiento: Proteccion de atributos de clase con el objetivo de proteger o restringir la variablidad
        de dicho atributo, la forma de acceder a un atributo encapsulado, es mediante metodos publicos que contengan dicho 
        atributo. Dos metodos definen el encapsulamiento:
        get que es para obtener valores.
        set que es para asignar o modificarlos.
        
        private tipo_dato nombreAtributo;
        //Obtener Valor
        Publi tipo_retorno getNombreAtributo(){
            return this.nombreAtributo;
        }
        //Asignar Valores
        public void setNombreAtributo(tipo_dato nombreParam){
            this.nombreAtributo=nombreParam;
        }
        
        ----->ver prueba de encapsulamiento
        */
        
       
    }

}
