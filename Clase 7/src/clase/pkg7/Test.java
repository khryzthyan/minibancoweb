/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg7;

import java.util.Scanner;

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
            MVC -MODELO
                -VISTA
                -CONTROLADOR
            DAO-Data access Object
            VO-Value object, Representacion de las entidades(Tablas)
         */
        Scanner entrada=new Scanner(System.in);
        ClaseUsuarioVo claseUsuarioVo2 = new ClaseUsuarioVo();
        ClaseUsuarioDAO dao = new ClaseUsuarioDAO();
        ClasePersonasVo clasePersonasVo2 = new ClasePersonasVo();
        ClasePersonasDAO daoPersonas = new ClasePersonasDAO();
        
        dao.guardar(claseUsuarioVo2);
        System.out.println("******************");
        
        claseUsuarioVo2.setNombre("Diego");
        claseUsuarioVo2.setApellido("Pardo");
        claseUsuarioVo2.setTipoDocumento("CC");
        claseUsuarioVo2.setNumeroDeCedula(1018496233);
        dao.guardar(claseUsuarioVo2);
        System.out.println("******************");
        
        claseUsuarioVo2.setNombre("Alejandro");
        claseUsuarioVo2.setApellido("Suarez");
        claseUsuarioVo2.setTipoDocumento("CC");
        claseUsuarioVo2.setNumeroDeCedula(1018496235);
        dao.guardar(claseUsuarioVo2);
        System.out.println("******************");
        
        clasePersonasVo2.setNombre("Wilson");
        clasePersonasVo2.setApellido("Garces");
        clasePersonasVo2.setTipoDocumento("CC");
        clasePersonasVo2.setNumeroDeCedula(1018789255);
        daoPersonas.guardar(clasePersonasVo2);
        System.out.println("******************");
        
        clasePersonasVo2.setNombre("Alejandro");
        clasePersonasVo2.setApellido("Sanchez");
        clasePersonasVo2.setTipoDocumento("TI");
        clasePersonasVo2.setNumeroDeCedula(990512457);
        daoPersonas.guardar(clasePersonasVo2);
        System.out.println("******************");
        
        /*
            Para el interface por orden se van a llamar las cosas de la siguiente manera:
        FrmNombre-Formulario-Jframe
        LblNombre-Jlabel
        btnNombre-JButtons -boton
        txtNombre-JTextField -Cuadro de Texto
        cbNombre-JComboBox - La barra desplegable
        rdbNombre-JRadioButton-Botonsito con relleno
        txtpNombre-JTextFieldPaswword
        chkNombre-JChecklist-Cuadrito con chulito
        
        */

    }

}
