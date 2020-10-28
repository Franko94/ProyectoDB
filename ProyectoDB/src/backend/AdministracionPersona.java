/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.PersonaRW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class AdministracionPersona {
    
    public static void insertarPersona(String nombre, String apellido,String documento,
                            String email,String fechaNacimiento, String sexo) throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        String sql = PersonaRW.INSERTAR_PERSONA;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, Integer.valueOf(documento));
        stmt.setString(2, nombre);
        stmt.setString(3, apellido);
        stmt.setString(4, fechaNacimiento);
        stmt.setString(5, email);
        stmt.setString(6, sexo);
        stmt.executeUpdate();
    }
    
}
