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
public class Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        El for each es una variacion del for que recorre todos los valores de un arreglo o coleccion
        Para hacer el for each, se hace for(int[] diego:arreglodiego){, es decir
        for(tipo de dato+(llaves si es arreglo([]))+nombre de una nueva variable+(:)+nombre del arreglo 
        o coleccion.
        
        
        Niveles de acceso:
        
        + public = Permite el acceso donde cualquier parte del codigo y/o proyecto-->Clases, atributos, metodos.
        - private = Solo permite el acceso desde el elemento o clase que lo contiene --> atributos, metodo, para los atributos
        # protected = Solo permite el acceso por medio de la Herencia -->atributos,metodos.
          package = Solo permite el acceso a clases dentro del mismo paquete.
        
        *Clase: Abstraccion de lña vida real-Elemento Fundamental de la Programacion-Contenedor de atributos y metodos.
        *Atributos: Caracteristicasparticulares de una clase
        *Metodo: Bloque de codigo que realiza una accion u operaciones especificas estos, se nombran en verbo
        
        public class NombreClase{
            //atributo
            nivel_acceso Tipo_dato nombreAtributo;
            
            //Metodo sin retorno
            Nivel_acceso void NombreMetodo(){
        
            }//Metodo sin retorno con parametros
            Nivel_acceso void NombreMetodo(tipo_dato NombreParametro){
        
            }
            //Metodo con retorno
            Nivel_acceso Tipo_Retorno NombreMetodo(){
        
                return tipo_retorno;
            }
            //Constructor= ERs un metodo que sirve para inicializar todos los atributos de la clase, siempre es publico, no tiene tipo de retorno
            
        }
        
        *objeto --> Instancia de una clase, desde este puedo acceder a los atributos y metodos y de la clase instanciada.
        NombreClase nombreObjeto=new NombreClase ();
        //Acceder a un atributo
        nombreObjeto.atributo
        
        //Acceder a un metodo sin parametros
        nombreobjeto.nombreMetodo();
        
        //Acceder a un metodo sin parametros
        nombreobjeto.nombreMetodo(Param1,Param2);
        
         */
               
        //Ejercicio del ahorcado
        Scanner entrada = new Scanner(System.in);
        String[] CadenaOriginal = {"i", "n", "t", "e", "c", "a", "p"};
        String[] CadenaValidadora = new String[CadenaOriginal.length];
        String Caracter;
        int ContCaracteres = 0, ContTotal = 0, ContFallas = 0, TotalFallasMax = 7, FallasTotales = 0;
        
        for (int i = 0; i < CadenaValidadora.length; i++) {
            CadenaValidadora[i]="_";
        }
        
        while (ContCaracteres != CadenaOriginal.length && FallasTotales < TotalFallasMax) {
            ContFallas = 0;
            System.out.println("Digite un caracter");
            Caracter = entrada.next();
            for (int i = 0; i < CadenaOriginal.length; i++) {
                if (CadenaOriginal[i].equals(Caracter)) {
                    System.out.println("");
                    System.out.println("El caracter si existe");
                    CadenaValidadora[i] = Caracter;
                    ContCaracteres++;
                } else {
                    ContFallas++;
                }
            }
            for (String CadenaValidadora1 : CadenaValidadora) {
                System.out.print(" " + CadenaValidadora1);
            }
            if (ContFallas == CadenaOriginal.length) {
                FallasTotales++;
                System.out.println("\nLLevas " + FallasTotales + " Errores te quedan " + (TotalFallasMax - FallasTotales) + " oportunidades");
            }

        }
        System.out.println("");
        if (FallasTotales == TotalFallasMax) {
            System.out.println("Usted ha perdido");
        } else {
            System.out.println("Caracteres Validos, la palabra es: ");
            for (int i = 0; i < CadenaValidadora.length; i++) {
                System.out.print(" " + CadenaValidadora[i]);
            }
            System.out.println("\nFelicidades usted ha ganado");
        }

    }

}
