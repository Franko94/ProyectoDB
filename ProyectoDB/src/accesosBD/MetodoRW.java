/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

/**
 *
 * @author Agustin
 */
public class MetodoRW {
    public static String INSERTAR_METODO = "INSERT into metodo (descripcion) values (?)";
    public static String OBTENER_METODOS = "SELECT * FROM metodo";
    public static String FILTRAR_METODOS = "SELECT * FROM metodo where id_metodo = ? or descripcion = ?";
    public static String ELIMINAR_METODO = "DELETE FROM metodo where id_metodo = ?";
    public static String MODIFICAR_DESCRIPCION = "update metodo set descripcion = ? where id_metodo = ?";

    public static String filtrarMetodos(String id, String descripcion) {
        String where = "";
        //si el id tiene algo, poner where id = ese_id
        if (!id.equalsIgnoreCase("")) {
            where = "where id_metodo = " + id;
            if (!descripcion.equalsIgnoreCase("")) {
                where = where + " or descripcion LIKE " + "'%"+descripcion+"%'";
            }
        } else {
             if (!descripcion.equalsIgnoreCase("")){
                 where = "where descripcion LIKE "+"'%"+descripcion+"%'";
             }
        }
        return "SELECT * FROM metodo " + where;
    }
    
//    public static String OBTENER_MENUS_ASOCIADOS = "SELECT * FROM proyectoFinal.menus_en_aplicacion WHERE id_aplicacion = ?";
//    public static String ELIMINAR_MENU_ASOCIADO = "DELETE FROM   proyectoFinal.menu_aplicacion  where id_aplicacion = ? and id_menu = ?";
//    public static String OBTENER_MENUS_NO_ASOCIADOS = " select * FROM   menu m where id_menu not in (select id_menu from proyectoFinal.menu_aplicacion where id_aplicacion = ?)";
//    public static String AGREGAR_MENU = "INSERT into menu_aplicacion values (?,?)";
}
