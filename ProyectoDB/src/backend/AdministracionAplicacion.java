/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import accesosBD.Configuracion;
import accesosBD.AplicacionRW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.ListAdapter;

/**
 *
 * @author Usuario
 */
public class AdministracionAplicacion {
    
    public static void insertarAplicacion(String nombre)throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.INSERTAR_APLICACION);
            stmt.setString(1, nombre);
            stmt.executeUpdate();
        }
    }
    
    public static void buscarAplicacion(String id, String nombre,JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.FILTRAR_APLICACIONES);
            stmt.setString(1, id);
            stmt.setString(2, nombre);
            ResultSet rs = stmt.executeQuery();
            
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarTablaAplicaciones(JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.OBTENER_APLICACIONES);
            ResultSet rs = stmt.executeQuery();
            
            insertarDatos(tabla, rs);
        }
    }
    
    public static void eliminarAplicacion(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.ELIMINAR_APLICACION);
            stmt.setString(1, id);
            stmt.executeUpdate();
        }
    }
    
    private static void insertarDatos(JTable tabla,ResultSet rs) throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
         
        while (rs.next()){
            Object [] fila = new Object[2];
            for (int i=0;i<2;i++)
                fila[i] = rs.getObject(i+1);
            modelo.addRow(fila);
        }
    }
    
    public static ArrayList<String> llenar_combo() throws SQLException, ClassNotFoundException{
        ArrayList<String> resultado = new ArrayList<>();
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.NOMBRE_APLICACIONES);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
               resultado.add(rs.getString("nombre"));
            }
            return resultado;
        }
  
        
    }
    
    public static int getIdAplicacion(String nombre) throws SQLException, ClassNotFoundException{
        int idApp = 0;
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.ID_APLICACIONES);
            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
               idApp = rs.getInt("id_aplicacion");
            }
            return idApp;
        }
        
    }

}
