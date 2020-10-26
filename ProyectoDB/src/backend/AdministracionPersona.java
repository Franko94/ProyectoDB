/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.PersonaRW;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class AdministracionPersona {
    
    public void insertarPersona(String nombre, String apellido,String documento,
                            String email,String fechaNacimiento, String sexo) throws SQLException{
        Connection con = DriverManager.getConnection(Configuracion.getURL(), Configuracion.getUsuario(), Configuracion.getPassword());     
        String sql = PersonaRW.INSERTAR_PERSONA;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, "a1");
        stmt.setString(2, "a2");
        stmt.executeUpdate();
    }
    
}
