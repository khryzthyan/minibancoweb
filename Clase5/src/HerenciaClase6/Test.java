/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaClase6;

/**
 *
 * @author Capacitaciones_pc30
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Herencia(extends):
        La capacidad que tiene una clase para acceder a los metodos y atributos de otra clase.
            tipos de acceso:
            +Pulica: La clase hija puede acceder a los atributos y metodos del la clase padre.
            -privado: La clase hija no puede acceder a los atributos y metodos del la clase padre.
            #Protegida: La clase hija puede acceder a los atributos y metodos del la clase padre por medio de HERENCIA.
        Por lo cual HERENCIA es util cuando la clase es protegida.
        Estructura:
        public class ClaseHija extends ClasePadre{
        
         */
        ClaseHijo claseHijo = new ClaseHijo();
        claseHijo.setNombre("Diego");
        claseHijo.setApellido("Pardo");
        claseHijo.setEdad(19);
        claseHijo.setTatuajes(true);
        claseHijo.comer();
        claseHijo.correr();
        claseHijo.jugar();
        
    }

}
