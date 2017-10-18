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
public class ClasesyMetodos {
    public String Atributo1;

    
    public ClasesyMetodos() {
    }
    /*
    Este es mi primer metodo
     */
    public void metodoUno() {
        System.out.println("Entre en el metodo 1");
    }
    //Esto de abajo sale cuando quiera llamar este metodo en algun otro lado
    /**
     * Este es mi segundo metodo
     * @return retorna mi primera cadena
     */
    public String metodoDos(){
        return "este es mi primer retorno metodo 2 sin parametros";
    }
    /**
     * Este es mi tercer metodo, recibo dos parametros y los retorno concatenados.
     * @param Param1 Cadena de texto1
     * @param Param2 Cadena de texto2
     * @return Concatenar los dos parametros
     */
    public String metodoTres(String Param1,String Param2){
        System.out.println("Entre al metodo 3");
        return Param1+""+Param2;
    }
    
    public String metodoCuatro(String paramUno){
        System.out.println("Entre al metodo cuatro");
        Atributo1=paramUno;
        return Atributo1;
    }
    public String metodoDePeso(String paramUno){
        System.out.println("Entre al metodo de Paso");
        return metodoCuatro(paramUno);
    }
}
