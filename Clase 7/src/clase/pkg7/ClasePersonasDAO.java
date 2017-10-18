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
public class ClasePersonasDAO implements InterfacePrueba<ClasePersonasVo>{

    @Override
    public void guardar(ClasePersonasVo clasePersonasVo) {
        System.out.println("Estoy en el metodo guardar de la clase ClasePersonasDAO");
        System.out.println("Nombre: "+clasePersonasVo.getNombre());
        System.out.println("Apellido: "+clasePersonasVo.getApellido());
        System.out.println("Numero de "+clasePersonasVo.getTipoDocumento()+": "+clasePersonasVo.getNumeroDeCedula());

    }
    
    
}
