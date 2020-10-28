/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.RolRW;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class AdministracionRoles {
    
    public static void insertarRol(int idRol, String descripcion,int idAplicacion)throws SQLException{
        Connection con = DriverManager.getConnection(Configuracion.getURL(), Configuracion.getUsuario(), Configuracion.getPassword());     
        String sql = RolRW.INSERTAR_ROL;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, idRol);
        stmt.setString(2, descripcion);
        stmt.setInt(3, idAplicacion);

        stmt.executeUpdate();
    }
    
}
