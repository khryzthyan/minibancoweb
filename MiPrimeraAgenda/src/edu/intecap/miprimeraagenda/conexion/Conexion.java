
package edu.intecap.miprimeraagenda.conexion;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Conexion {
    
    private static final String URL ="jdbc:mysql://localhost:3306/INTECAP";
    private static final String USUARIO ="root";
    private static final String PASSWORD ="";
    
    protected Connection conexion;
    protected PreparedStatement sentencia;
    protected ResultSet rs;
    protected StringBuilder sql;
    
    
    
    public void conectar(){
        try{
          Class.forName("com.mysql.jdbc.Driver");  
            System.out.println("Cargo");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);        
                    
                    }catch (Exception e){
                        e.printStackTrace();
        }
    } 
    
    public void desconectar(){
        try {
            if (conexion!=null){
                conexion.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
            
            
}
