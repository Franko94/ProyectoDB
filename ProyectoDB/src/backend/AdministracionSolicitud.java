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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustin
 */
public class AdministracionSolicitud {

    public static void insertarSolicitudHabilitarUsuario(String usuario, Date fecha) {

        try {
            Connection con = Configuracion.getConnection();

            Date date = java.sql.Date.valueOf(java.time.LocalDate.now());
            String sql = SolicitudRW.INSERTAR_SOLICITUD;
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "esperando");
            stmt.setDate(2, fecha);
            stmt.setDate(3, date);

            stmt.setInt(4, 1);
            stmt.setString(5, usuario);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdministracionSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministracionSolicitud.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void cargarTablaSolicitud(String id_solicitud, String estado, String fecha_creacion, String fecha_actualizacion, String tipo_solicitud, String usuario_solicitante,String aplicacion, String rol, String usuario_autorizante, JTable tabla) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(SolicitudRW.filtrarSolicitud(id_solicitud,  estado,  fecha_creacion,  fecha_actualizacion,  tipo_solicitud,  usuario_solicitante, aplicacion, rol,  usuario_autorizante));
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }

     private static void insertarDatos(JTable tabla, ResultSet rs) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        modelo.addColumn("Id Solicitud");
        modelo.addColumn("Estado");
        modelo.addColumn("Fecha Creacion");
        modelo.addColumn("Ultima Actualizacion");
        modelo.addColumn("Tipo de Solicitud");
        modelo.addColumn("Usuario");
        modelo.addColumn("Aplicacion");
        modelo.addColumn("Rol Solicitado");
        modelo.addColumn("Autorizante");

        while (rs.next()) {
            
            Object[] fila = new Object[9];
            for (int i = 0; i < 9; i++) {
                fila[i] = rs.getObject(i + 1);
                System.out.println(String.valueOf(fila[i]));
            }
            modelo.addRow(fila);
        }
    }
}
