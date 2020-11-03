/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.MetodoRW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustin
 */
public class AdministracionMetodos {

    public static void insertarMetodo(String nombre) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.INSERTAR_METODO);
            stmt.setString(1, nombre);
            stmt.executeUpdate();
        }
    }
    public static ArrayList<String> traerMetodosNoRelacionados(int id_metodo) throws SQLException, ClassNotFoundException{
        ArrayList<String> resultado = new ArrayList<>();
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.LISTAR_METODOS_NO_RELACIONADOS);
            stmt.setInt(1, id_metodo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                String valor= rs.getString("id_metodo")+"-"+rs.getString("descripcion");
               resultado.add(valor);
            }
            return resultado;
        }


    }
     public static ArrayList<String> traerMetodosRelacionados(int id_metodo) throws SQLException, ClassNotFoundException{
        ArrayList<String> resultado = new ArrayList<>();
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.LISTAR_METODOS_RELACIONADOS);
            stmt.setInt(1, id_metodo);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                String valor= rs.getString("id_metodo")+"-"+rs.getString("descripcion");
               resultado.add(valor);
            }
            return resultado;
        }


    }

    public static void buscarMetodo(String id, String descripcion, JTable tabla) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.filtrarMetodos(id, descripcion));
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, descripcion);
            ResultSet rs = stmt.executeQuery();

            insertarDatos(tabla, rs);
        }
    }

    public static void cargarTablaMetodos(String id, String descripcion, JTable tabla) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.filtrarMetodos(id, descripcion));
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }

    public static void eliminarMetodo(String id, JTable tabla) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.ELIMINAR_METODO);
            stmt.setInt(1, Integer.parseInt(id));
            stmt.executeUpdate();
        }
    }

    public static void modificarNombreMetodo(String nombre, String id) throws SQLException, ClassNotFoundException {
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.MODIFICAR_DESCRIPCION);
            stmt.setString(1, nombre);
            stmt.setInt(2, Integer.parseInt(id));
            stmt.executeUpdate();
        }
    }

    private static void insertarDatos(JTable tabla, ResultSet rs) throws SQLException {
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);

        modelo.addColumn("id");
        modelo.addColumn("descripcion");

        while (rs.next()) {
            Object[] fila = new Object[2];
            for (int i = 0; i < 2; i++) {
                fila[i] = rs.getObject(i + 1);
            }
            modelo.addRow(fila);
        }
    }
}
