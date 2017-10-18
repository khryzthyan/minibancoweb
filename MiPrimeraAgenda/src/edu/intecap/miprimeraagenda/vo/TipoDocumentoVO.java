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
public class TipoDocumentoVO {

    private int tipoDocumentoID;
    private String nombre;
    private String descripcion;

    public TipoDocumentoVO() {
    }

    public TipoDocumentoVO(int tipoDocumentoID, String nombre, String descripcion) {
        this.tipoDocumentoID = tipoDocumentoID;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    

    /**
     * @return the tipoDocumentoID
     */
    public int getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    /**
     * @param tipoDocumentoID the tipoDocumentoID to set
     */
    public void setTipoDocumentoID(int tipoDocumentoID) {
        this.tipoDocumentoID = tipoDocumentoID;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
