/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intecap.miprimeraagenda.dao;

import edu.intecap.miprimeraagenda.conexion.Conexion;
import edu.intecap.miprimeraagenda.interfaces.Iutil;
import edu.intecap.miprimeraagenda.vo.ContactosVo;
import java.util.ArrayList;

/**
 *
 * @author Capacitaciones_pc30
 */
public class ContactosDAO extends Conexion implements Iutil<ContactosVo> {

    @Override
    public boolean guardar(ContactosVo t) {
        conectar();
        sql = new StringBuilder();
        sql.append("INSERT INTO contactos (contactos_id, tipo_documento, numero_documento, telefono, celular, direccion, barrio)");
        sql.append("VALUES (? ,?, ?, ?,? ,?, ?, ?)");
        try {
            sentencia = conexion.prepareStatement(sql.toString());
            sentencia.setInt(1, t.getTipo_documento_id());
            sentencia.setLong(2, t.getNumero_documento());
            sentencia.setString(3, t.getNombres());
            sentencia.setString(4, t.getApellidos());
            sentencia.setLong(5, t.getTelefono());
            sentencia.setLong(6, t.getCelular());
            sentencia.setString(7, t.getDireccion());
            sentencia.setString(8, t.getBarrio());
            
            if (sentencia.executeUpdate()>0){
                return true;
            }return false;
            
        } catch (Exception e) {

        }finally{
            desconectar();
        }

        return true;
    }

    @Override
    public boolean eliminar(ContactosVo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(ContactosVo t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ContactosVo> consultar() {
        conectar();
        ContactosVo contactosVo;
        ArrayList<ContactosVo> ListContactos = new ArrayList<>();
        sql = new StringBuilder();
        sql.append("SELECT tipo_documento_id, numero_documento, nombres, apellidos, telefono, celular, direccion, barrio ");
        sql.append("FROM contactos");

        try {
            sentencia = conexion.prepareStatement(sql.toString());
            rs = sentencia.executeQuery();
            while (rs.next()) {
                contactosVo = new ContactosVo();
                contactosVo.setTipo_documento_id(rs.getInt("tipo_documento_id"));
                contactosVo.setNumero_documento(rs.getLong("numero_documento"));
                contactosVo.setNombres(rs.getString("nombres"));
                contactosVo.setApellidos(rs.getString("apellidos"));
                contactosVo.setTelefono(rs.getLong("telefono"));
                contactosVo.setCelular(rs.getLong("celular"));
                contactosVo.setDireccion(rs.getString("direccion"));
                contactosVo.setBarrio(rs.getString("barrio"));
                ListContactos.add(contactosVo);
            }
        } catch (Exception e) {
            System.err.println("Error método consultarDAO");
            e.printStackTrace();
        }

        return ListContactos;
    }
}
