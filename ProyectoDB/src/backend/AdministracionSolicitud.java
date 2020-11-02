/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.PersonaRW;
import accesosBD.SolicitudRW;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Agustin
 */
public class AdministracionSolicitud {

    public static void insertarSolicitudHabilitarUsuario(String ci, Date fecha) {

        try {
            Connection con = Configuracion.getConnection();

            Date date = java.sql.Date.valueOf(java.time.LocalDate.now());
            String sql = SolicitudRW.INSERTAR_SOLICITUD;
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "esperando");
            stmt.setDate(2, fecha);
            stmt.setDate(3, date);
            stmt.setString(4, "");
            stmt.setInt(5, 1);
            stmt.setInt(6, Integer.parseInt(ci));
            stmt.setNull(7, 0);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdministracionSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministracionSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
