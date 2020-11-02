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
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.runtime.ListAdapter;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Agustin
 */
public class AdministracionMetodos {
	
	
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

//    public static void insertarMetodo(String descripcion) {
//        try (Connection con = Configuracion.getConnection()) {
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.INSERTAR_METODO);
//            stmt.setString(1, descripcion);
//            stmt.executeUpdate();
//
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(AdministracionMetodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public static void eliminarMetodo(int id) throws SQLException {
//        Connection con;
//        try {
//            con = Configuracion.getConnection();
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.ELIMINAR_METODO);
//            stmt.setInt(1, id);
//            stmt.executeUpdate();
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(AdministracionMetodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    public static void modificarDescripcionMetodo(String descripcion, int id) {
//        try (Connection con = Configuracion.getConnection()) {
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.MODIFICAR_DESCRIPCION);
//            stmt.setString(1, descripcion);
//            stmt.setInt(2, id);
//            stmt.executeUpdate();
//        } catch (SQLException | ClassNotFoundException ex) {
//            Logger.getLogger(AdministracionMetodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public static ResultSet CargarYActualizarMetodo(String descripcion) {
//        Connection con;
//        try {
//            con = Configuracion.getConnection();
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.OBTENER_METODO(descripcion));
//            ResultSet rs = null;
//            rs = stmt.executeQuery();
//            return rs;
//        } catch (SQLException ex) {
//            Logger.getLogger(AdministracionMetodos.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(AdministracionMetodos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
//    }
    
       public static void insertarMetodo(String nombre)throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.INSERTAR_METODO);
            stmt.setString(1, nombre);
            stmt.executeUpdate();
        }
    }
    
    public static void buscarMetodo(String id, String descripcion,JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.filtrarMetodos(id, descripcion));
            stmt.setInt(1, Integer.parseInt(id));
            stmt.setString(2, descripcion);
            ResultSet rs = stmt.executeQuery();
            
            insertarDatos(tabla, rs);
        }
    }
    
    public static void cargarTablaMetodos(String id, String descripcion,JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.filtrarMetodos(id, descripcion));
            ResultSet rs = stmt.executeQuery();
            insertarDatos(tabla, rs);
        }
    }
    
//    public static void cargarListaMenuAsociados(String id, JTable tabla) throws SQLException, ClassNotFoundException{
//        try (Connection con = Configuracion.getConnection()) {
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.OBTENER_MENUS_ASOCIADOS);
//            stmt.setString(1, id);
//            ResultSet rs = stmt.executeQuery();
//            insertarDatos(tabla, rs);
//        }
//    }
    
//    public static void cargarListaMenusNoAsociados(String id, JTable tabla) throws SQLException, ClassNotFoundException{
//        try (Connection con = Configuracion.getConnection()) {
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.OBTENER_MENUS_NO_ASOCIADOS);
//            stmt.setString(1, id);
//            ResultSet rs = stmt.executeQuery();
//            insertarDatos(tabla, rs);
//        }
//    }
    
    public static void eliminarMetodo(String id, JTable tabla) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.ELIMINAR_METODO);
            stmt.setInt(1, Integer.parseInt(id));
            stmt.executeUpdate();
        }
    }
    
    public static void modificarNombreMetodo(String nombre, String id) throws SQLException, ClassNotFoundException{
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.MODIFICAR_DESCRIPCION);
            stmt.setString(1, nombre);
            stmt.setInt(2, Integer.parseInt(id));
            stmt.executeUpdate();
        }
    }
    
//    public static void eliminarMenu(String idApp,String idMenu) throws SQLException, ClassNotFoundException{
//        try (Connection con = Configuracion.getConnection()) {
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.ELIMINAR_MENU_ASOCIADO);
//            stmt.setString(1, idApp);
//            stmt.setString(2, idMenu);
//            stmt.executeUpdate();
//        }
//    }
//    
//    public static void agregarMenu(String idApp,String idMenu)throws SQLException, ClassNotFoundException{
//         try (Connection con = Configuracion.getConnection()) {
//            PreparedStatement stmt = con.prepareStatement(MetodoRW.AGREGAR_MENU);
//            stmt.setString(1, idMenu);
//            stmt.setString(2, idApp);
//            stmt.executeUpdate();
//         }
//    }
//    
    private static void insertarDatos(JTable tabla,ResultSet rs) throws SQLException{
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        
        modelo.addColumn("id");
        modelo.addColumn("descripcion");
         
        while (rs.next()){
            Object [] fila = new Object[2];
            for (int i=0;i<2;i++)
                fila[i] = rs.getObject(i+1);
            modelo.addRow(fila);
        }
    }

}
