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
import javax.swing.DefaultListModel;
import javax.swing.JList;
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
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.filtrarAplicaciones(id, nombre));
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, nombre);
            ResultSet rs = stmt.executeQuery();
            
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarTablaAplicaciones(String id, String nombre,JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.filtrarAplicaciones(id, nombre));
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarListaMenuAsociados(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.OBTENER_MENUS_ASOCIADOS);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarListaRolesAsociados(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.ROLES_EN_APLICACION);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarListaRolesNoAsociados(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.ROLES_SIN_APLICACION);
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarListaMenusNoAsociados(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.OBTENER_MENUS_NO_ASOCIADOS);
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }
    
    public static void eliminarAplicacion(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.ELIMINAR_APLICACION);
            stmt.setInt(1, Integer.parseInt(id));
            stmt.executeUpdate();
        }
    }
    
    public static void modificarNombreAplicacion(String nombre, String id) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.MODIFICAR_NOMBRE);
            stmt.setString(1, nombre);
            stmt.setInt(2, Integer.parseInt(id));
            stmt.executeUpdate();
        }
    }
    
    public static void eliminarMenu(String idApp,String idMenu) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.ELIMINAR_MENU_ASOCIADO);
            stmt.setString(1, idApp);
            stmt.setString(2, idMenu);
            stmt.executeUpdate();
        }
    }
    
     public static void eliminarRol(String idRol) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.QUITAR_ROL);
            stmt.setString(1, idRol);
            stmt.executeUpdate();
        }
    }
     public static void agregarRol(String idApp, String idRol) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.AGREGAR_ROL);
            stmt.setString(1, idApp);
            stmt.setString(2, idRol);
            stmt.executeUpdate();
        }
    }
    
    public static void agregarMenu(String idApp,String idMenu)throws SQLException, ClassNotFoundException{
         try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(AplicacionRW.AGREGAR_MENU);
            stmt.setString(1, idMenu);
            stmt.setString(2, idApp);
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