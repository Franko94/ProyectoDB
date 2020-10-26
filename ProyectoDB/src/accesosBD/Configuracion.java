/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

/**
 *
 * @author Usuario
 */
public class Configuracion {
    
    private static final String USUARIO_DB  = "USUARIO-PC\\Usuario";
    private static final String PASSWORD_DB  = "120894";
    private static final String URL_DB  = "jdbc:sqlserver://localhost:1433;DatabaseName=proyectoFinal";
    
    public static String getUsuario(){
        return USUARIO_DB;
    }
    
    public static String getPassword(){
        return PASSWORD_DB;
    }
    
    public static String getURL(){
        return URL_DB;
    }
    
}
