/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

/**
 *
 * @author Capacitaciones_pc30
 */
public class ClaseUsuarioDAO implements InterfacePrueba<ClaseUsuarioVo>{

    @Override
    public void guardar(ClaseUsuarioVo claseUsuarioVo) {
        System.out.println("Metodo guardar, clase usuario dao");
        System.out.println("Nombre: "+claseUsuarioVo.getNombre());
        System.out.println("Apellido: "+claseUsuarioVo.getApellido());
        System.out.println("No de " +claseUsuarioVo.getTipoDocumento()+": "+claseUsuarioVo.getNumeroDeCedula());
   
    }
  
}
