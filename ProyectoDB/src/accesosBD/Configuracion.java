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
    
    public static final String USUARIO_DB  = "postgres";
    public static final String PASSWORD_DB  = "120894";
    public static final String URL_DB  = "jdbc:postgresql://192.168.56.102:5432/test";
    
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
