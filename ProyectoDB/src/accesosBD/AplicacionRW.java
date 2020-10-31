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
    public static String MODIFICAR_NOMBRE = "update aplicacion set nombre = ? where id_aplicacion = ?";
    public static String OBTENER_MENUS_ASOCIADOS = "SELECT * FROM proyectofinal.menus_en_aplicacion WHERE id_aplicacion = ?";
    public static String ELIMINAR_MENU_ASOCIADO = "DELETE FROM   proyectofinal.menu_aplicacion  where id_aplicacion = ? and id_menu = ?";
    public static String OBTENER_MENUS_NO_ASOCIADOS = " select * FROM   menu m where id_menu not in (select id_menu from proyectofinal.menu_aplicacion where id_aplicacion = ?)";
    public static String AGREGAR_MENU = "INSERT into menu_aplicacion values (?,?)";
}
