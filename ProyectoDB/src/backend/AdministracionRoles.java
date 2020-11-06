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
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class AdministracionRoles {
    
    public static void insertarRol(String descripcion, int idAplicacion) throws SQLException {
        Connection con = DriverManager.getConnection(Configuracion.getURL(), Configuracion.getUsuario(), Configuracion.getPassword());     
        String sql = RolRW.INSERTAR_ROL;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, descripcion);
        stmt.setInt(2, idAplicacion);

        stmt.executeUpdate();
    }
    
    public static Integer getIdRol(String descripcion) throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        String sql = RolRW.GET_ID_ROL;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, descripcion);
        ResultSet rs = stmt.executeQuery();
        Integer res = -1;
        if (rs.next()) {
            res = Integer.valueOf(rs.getString("id_rol"));
        }
        return res;
    }
    public static void insertarRolMetodo(int idRol, int idMetodo) throws SQLException {
        Connection con = DriverManager.getConnection(Configuracion.getURL(), Configuracion.getUsuario(), Configuracion.getPassword());
        String sql = RolRW.INSERTAR_ROL_METODO;
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, idRol);
        stmt.setInt(2, idMetodo);
         stmt.executeUpdate();
    }
    
    public static void buscarRol(int id, String descripcion, JTable tabla) throws SQLException, ClassNotFoundException {


        try (Connection con = Configuracion.getConnection()) {
            if (descripcion == null) {
                PreparedStatement stmt = con.prepareStatement(RolRW.FILTRAR_ROL_ID);
                stmt.setInt(1, id);
                ResultSet rs = stmt.executeQuery();
                insertarDatos(tabla, rs);
            } else if (id == -1) {

                PreparedStatement stmt = con.prepareStatement(RolRW.FILTRAR_ROL_DESCRIPCION);
                stmt.setString(1, '%' + descripcion + '%');
                ResultSet rs = stmt.executeQuery();
                insertarDatos(tabla, rs);

            } else {
                PreparedStatement stmt = con.prepareStatement(RolRW.FILTRAR_ROL);
                stmt.setInt(1, id);
                stmt.setString(2, descripcion);
                ResultSet rs = stmt.executeQuery();
                insertarDatos(tabla, rs);
            }
        }
    }

    public static void cargarRoles(JTable tabla) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(RolRW.GET_ROL);
            ResultSet rs = stmt.executeQuery();

            insertarDatos(tabla, rs);
        }
    }

    public static void eliminarRol(int id, JTable tabla) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(RolRW.ELIMINAR_ROL);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public static void eliminarRolMetodo(int idRol, int idMetodo) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(RolRW.ELIMINAR_ROL_METODO);
            stmt.setInt(1, idRol);
            stmt.setInt(2, idMetodo);
            stmt.executeUpdate();
        }
    }

    public static void editarRol(int id, String desc) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(RolRW.EDITAR_ROL);
            stmt.setString(1, desc);
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    private static void insertarDatos(JTable tabla, ResultSet rs) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCION");

        while (rs.next()) {
            Object[] fila = new Object[2];
            for (int i = 0; i < 2; i++) {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }
    }
    
}
