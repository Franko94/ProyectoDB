/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class PersonaRW {
    
    public static final String INSERTAR_PERSONA = "INSERT INTO persona values (?,?,?,?,?,?)";
    
    public static final String GET_PERSONA = "SELECT * FROM persona where ci = ?";
    
}
