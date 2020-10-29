/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.AdministracionAplicacionesRW;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class AdministracionAplicacion {
    
    public static void insertarAplicacion(int idApp, String nombre)throws SQLException{
        Connection con = DriverManager.getConnection(Configuracion.getURL(), Configuracion.getUsuario(), Configuracion.getPassword());     
        String sql = AdministracionAplicacionesRW.INSERTAR_APLICACION;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, idApp);
        stmt.setString(2, nombre);

        stmt.executeUpdate();
    }
    
}
