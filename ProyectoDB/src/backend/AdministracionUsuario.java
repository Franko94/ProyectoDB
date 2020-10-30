/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.UsuarioRW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;    


/**
 *
 * @author Usuario
 */
public class AdministracionUsuario {
    
    public static boolean usuarioYContraseñaExisten(String usuario, String password) throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        String sql = UsuarioRW.GET_USUARIOYCONTRASENA;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
    
    public static boolean usuarioExiste(String usuario) throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        String sql = UsuarioRW.GET_USUARIO;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, usuario);
        ResultSet rs = stmt.executeQuery();
        return rs.next();
    }
    
    public static void insertarUsuario(String idUsuario, String contrasena, String ci) throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        String fechaCreacion = java.time.LocalDate.now().toString();
        String idRol = "null";
               
        String sql = UsuarioRW.INSERTAR_USUARIO;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Integer.valueOf(idUsuario));
        stmt.setString(2, contrasena);
        stmt.setString(3, fechaCreacion);
        stmt.setString(4, idRol);
        stmt.setString(5, ci);
        stmt.setString(6, intentosFallidos);
        stmt.setString(6, habilitado);
        stmt.executeUpdate();
    }
}
