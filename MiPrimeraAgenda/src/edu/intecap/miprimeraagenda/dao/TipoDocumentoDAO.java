/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.intecap.miprimeraagenda.dao;

import edu.intecap.miprimeraagenda.conexion.Conexion;
import edu.intecap.miprimeraagenda.interfaces.Iutil;
import edu.intecap.miprimeraagenda.vo.TipoDocumentoVO;
import java.util.ArrayList;

/**
 *
 * @author Capacitaciones_pc30
 */
public class TipoDocumentoDAO extends Conexion implements Iutil<TipoDocumentoVO>{

    @Override
    public boolean guardar(TipoDocumentoVO t) {
        return true;
        }
        

    public boolean eliminar(TipoDocumentoVO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(TipoDocumentoVO t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TipoDocumentoVO> consultar() {
       conectar();
       TipoDocumentoVO tipoDocumentoVO;
        ArrayList<TipoDocumentoVO> listTipoDocumentos =new ArrayList<>();
        
        sql =new StringBuilder();
        sql.append("SELECT tipo_documento_id,nombre,descripcion ");
        sql.append("from tipo_documento ");
        try{
        sentencia = conexion.prepareStatement(sql.toString());
        rs =sentencia.executeQuery();
        
        while(rs.next()){
            tipoDocumentoVO = new TipoDocumentoVO();
            tipoDocumentoVO.setTipoDocumentoID(rs.getInt("tipo_documento_id"));
            tipoDocumentoVO.setNombre(rs.getString("nombre"));
            tipoDocumentoVO.setDescripcion(rs.getString("descripcion"));
            listTipoDocumentos.add(tipoDocumentoVO);
        }
        
        }catch (Exception e){
            System.out.println("Error metodo TipoDocumentoDAO");
            e.printStackTrace();
        }finally{
            desconectar();
        }
     
        return listTipoDocumentos;
    }
    
}
