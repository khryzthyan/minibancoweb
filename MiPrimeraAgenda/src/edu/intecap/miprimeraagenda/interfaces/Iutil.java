/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intecap.miprimeraagenda.interfaces;

import java.util.ArrayList;

/**
 *
 * @author Capacitaciones_pc30
 */
public interface Iutil <T>{
    //metodo encargado de guardar
    public boolean guardar(T t);
    //metodo encargado de eliminar
    
    public boolean eliminar(T t);

    //metodo encargado de actualizar
    public boolean actualizar(T t);
    //metodo encargado de consultar
    
    public ArrayList<T> consultar();
}
