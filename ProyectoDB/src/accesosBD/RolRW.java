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
    
    public static String INSERTAR_ROL = "INSERT INTO rol (descripcion, id_aplicacion) values(?,?)";
    public static final String GET_ROL = "SELECT * FROM rol ";
    public static String FILTRAR_ROL_ID = "SELECT * FROM rol where id_rol = ?";
    public static String FILTRAR_ROL_DESCRIPCION = "SELECT * FROM rol where descripcion = ?";
    public static String FILTRAR_ROL = "SELECT * FROM rol where id_rol = ? or descripcion = ?";
    public static String ELIMINAR_ROL = "DELETE FROM rol where id_rol = ?";
    public static String EDITAR_ROL = "update rol set descripcion = ? where id_rol = ?";
    
    
    
    
}
