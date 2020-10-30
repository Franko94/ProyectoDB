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
    
    public static String INSERTAR_APLICACION = "INSERT into aplicacion (nombre) values (?)";
    public static String OBTENER_APLICACIONES = "SELECT * FROM aplicacion";
    public static String FILTRAR_APLICACIONES = "SELECT * FROM proyectofinal.aplicacion where id_aplicacion = ? or nombre = ?";
    public static String ELIMINAR_APLICACION = "DELETE FROM aplicacion where id_aplicacion = ?";
}
