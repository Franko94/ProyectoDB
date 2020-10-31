/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.UsuarioRW;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    //no funciona
    public static void insertarUsuario(String idUsuario, String contrasena, String ci) 
            throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        String fechaCreacion = java.time.LocalDate.now().toString();
           
        String sql = UsuarioRW.INSERTAR_USUARIO;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, idUsuario);
        stmt.setString(2, contrasena);
        stmt.setDate(3,java.sql.Date.valueOf(java.time.LocalDate.now()) );
        stmt.setNull(4, 0);
        stmt.setInt(5, Integer.parseInt(ci));
        stmt.setInt(6, 0);
        stmt.setBoolean(7, false);
        stmt.executeUpdate();
    }
}
