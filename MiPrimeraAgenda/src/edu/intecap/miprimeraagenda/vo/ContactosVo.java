/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intecap.miprimeraagenda.vo;

/**
 *
 * @author Capacitaciones_pc30
 */
public class ContactosVo {
    private int Contactos_id;
    private int tipo_documento_id;
    private long numero_documento;
    private String  nombres;
    private String    apellidos;
    private long     telefono;
    private long  celular;         
    private String direccion;
    private String barrio;       

    /**
     * @return the Contactos_id
     */
    public int getContactos_id() {
        return Contactos_id;
    }

    /**
     * @param Contactos_id the Contactos_id to set
     */
    public void setContactos_id(int Contactos_id) {
        this.Contactos_id = Contactos_id;
    }

    /**
     * @return the tipo_documento_id
     */
    public int getTipo_documento_id() {
        return tipo_documento_id;
    }

    /**
     * @param tipo_documento_id the tipo_documento_id to set
     */
    public void setTipo_documento_id(int tipo_documento_id) {
        this.tipo_documento_id = tipo_documento_id;
    }

    /**
     * @return the numero_documento
     */
    public long getNumero_documento() {
        return numero_documento;
    }

    /**
     * @param numero_documento the numero_documento to set
     */
    public void setNumero_documento(long numero_documento) {
        this.numero_documento = numero_documento;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the telefono
     */
    public long getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the celular
     */
    public long getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(long celular) {
        this.celular = celular;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the barrio
     */
    public String getBarrio() {
        return barrio;
    }

    /**
     * @param barrio the barrio to set
     */
    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
}
    
