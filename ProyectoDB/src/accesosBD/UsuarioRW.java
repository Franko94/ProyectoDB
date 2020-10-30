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
public class UsuarioRW {
    
    public static final String GET_USUARIOYCONTRASENA = "SELECT * FROM usuario where id_usuario = ? and contrasena = ?";
    
    public static final String GET_USUARIO = "SELECT * FROM usuario where id_usuario = ?";
    
    public static final String INSERTAR_USUARIO = "INSERT INTO usuario values (?,?,?,?,?,?,?)";
}
