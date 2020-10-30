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
public class AplicacionRW {
    
    public static String INSERTAR_APLICACION = "insert into aplicacion (nombre) values (?)";
    public static String OBTENER_APLICACIONES = "SELECT * from aplicacion";
    
}
