
package edu.intecap.miprimeraagenda.conexion;

import edu.intecap.miprimeraagenda.dao.TipoDocumentoDAO;
import edu.intecap.miprimeraagenda.vo.TipoDocumentoVO;
import java.util.ArrayList;


public class TestConexion {


    public static void main(String[] args) {
        //Conexion conectar = new Conexion();
        //conectar.conectar();
        
     ArrayList<TipoDocumentoVO> listTipoDoc = new TipoDocumentoDAO().consultar();
    
       for (TipoDocumentoVO t : listTipoDoc){
            System.out.println("tipo doc" + t.getNombre());
        }
       
    }
    
}
