/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstraccionClase6;

/**
 *
 * @author Capacitaciones_pc30
 */
public interface ClaseInterface {
    /*
        En una interface todos los metodos son abstractos, es decir tienen firma pero no tienen cuerpo:
        public abstract void sumar();
        public void sumar(); Tambien funciona
        Para hacer uso de los metodos de una tnterface, se debe implementar dicha interface con Implements.
    */
    public void sumar(int num1, int num2);
    public void restar(int num1, int num2);
    
    
}
