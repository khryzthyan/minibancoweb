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
public class MaindeClasesyMetodos {
    static String variable2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Los metodos estaticos (static) no son accequibles de ninuna manera desde otra clase
        */
        String var1="ooohh otra vez no me lo van a creer ";
        String var2="pero funciona.";
        
        ClasesyMetodos objClasesyMetodos = new ClasesyMetodos();
        objClasesyMetodos.metodoUno();
        String Variable=objClasesyMetodos.metodoDos();
        System.out.println("Valor de retorno del metodo 2 es: "+Variable);
        variable2=objClasesyMetodos.metodoTres("No me lo van a creer ", "pero funciona.");
        System.out.println("Valor de retorno del metodo 3 es: "+variable2);
        variable2=objClasesyMetodos.metodoTres(var1, var2);
        System.out.println("Valor de retorno del metodo 3 es: "+variable2);
        System.out.println("Este es el valor del atributo 1 antes de ejecutar el metodo 4: "+objClasesyMetodos.Atributo1);
        variable2=objClasesyMetodos.metodoCuatro("Texto Manual");
        System.out.println("Valor de retorno del metodo 4 es: "+variable2);
        System.out.println("Este es el valor del atributo 1 despues de ejecutar el metodo 4: "+objClasesyMetodos.Atributo1);
        variable2=objClasesyMetodos.metodoDePeso("Texto nuevo");
        System.out.println("Este es el valor del metodo de paso: "+variable2);
        //Cuando destruyo el objeto instanciado todos los atributos de las clases se eliminan y se reinician, es decir si borro
        //objClasesyMetodos colocandole objClasesyMetodos=null; -> entonces se reiniciara el atributo 1 de la clase Clases y Metodos
        
    }
    
}
