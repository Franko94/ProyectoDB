/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

import static accesosBD.PersonaRW.removeLast3Characters;

/**
 *
 * @author Usuario
 */
public class UsuarioRW {
    
    public static final String GET_USUARIOYCONTRASENA = "SELECT * FROM usuario where id_usuario = ? and contrasena = ?";
    
    public static final String GET_USUARIO = "SELECT * FROM usuario where id_usuario = ?";
    
    public static final String INSERTAR_USUARIO = "INSERT INTO usuario values (?,?,?,?,?,?,?)";
    
    public static String ELIMINAR_USUARIO = "DELETE FROM usuario where id_usuario = ?";
    
    public static String EDITAR_USUARIO = "update usuario set contrasena = ? , where id_usuario = ?";
    
    public static String USUARIO_IS_ADMIN = "SELECT descripcion_rol FROM ususarios_con_roles_y_ci where id_usuario = ? and descripcion_rol = 'admin'";
    
    public static String filtrarUsuarios(String id_usuario, String ci, String fecha, String descripcion_rol, String nombre_aplicacion, String habilitado) {
        String where = "";
        String filtro = "";
        //si el id tiene algo, poner where id = ese_id
        if (!id_usuario.equalsIgnoreCase("")) {
            filtro += " id_usuario LIKE " + "'%" + id_usuario + "%' or ";
        }
        if (!ci.equalsIgnoreCase("")) {
            filtro += " ci = " + ci + " or ";
        }
        if (!fecha.equalsIgnoreCase("")) {
            filtro += " fecha LIKE " + "'%" + fecha + "%' or ";
        }
        if (!descripcion_rol.equalsIgnoreCase("")) {
            filtro += " descripcion_rol LIKE " + "'%" + descripcion_rol + "%' or ";
        }
        if (!nombre_aplicacion.equalsIgnoreCase("")) {
            filtro += " nombre_aplicacion LIKE " + "'%" + nombre_aplicacion + "%' or ";
        }
        if (!habilitado.equalsIgnoreCase("")) {
            filtro += " habilitado = " +  habilitado + " or ";
        }
        if (!filtro.equalsIgnoreCase("")) {
            where = "where";
            filtro = removeLast3Characters(filtro);

        }
        return "SELECT * FROM ususarios_con_roles_y_ci " + where + filtro;

    }
}
