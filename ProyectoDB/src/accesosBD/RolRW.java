/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

/**
 *
 * @author Meki
 */
public class RolRW {
    
    public static String INSERTAR_ROL = "INSERT INTO rol values (descripcion, id_aplicacion) values (?,?)";
    public static final String GET_ROL = "SELECT * FROM rol ";
    public static String FILTRAR_ROL = "SELECT * FROM rol where id_rol = ? or id_aplicacion = ? or descripcion = ?";
    public static String ELIMINAR_ROL = "DELETE FROM rol where id_rol = ?";
    
    
}
