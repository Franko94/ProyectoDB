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
}
