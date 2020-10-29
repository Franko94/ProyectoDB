/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author Usuario
 */
public class Configuracion {
    
    private static final String USUARIO_DB  = "root";
    private static final String PASSWORD_DB  = "120894";
    private static final String URL_DB  = "jdbc:mysql://localhost:3306/proyectofinal?characterEncoding=latin1&useConfigs=maxPerformance";

    public static String getUsuario(){
        return USUARIO_DB;
    }
    
    public static String getPassword(){
        return PASSWORD_DB;
    }
    
    public static String getURL(){
        return URL_DB;
    }
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException{
       //Class.forName("com.mysql.jdbc.Driver"); //esto solo para franco quitar el resto
       Connection con = DriverManager.getConnection(Configuracion.getURL(), Configuracion.getUsuario(), Configuracion.getPassword());  
       return con;
    }
}
