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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class AdministracionAplicacion {
    
    public static void insertarAplicacion(String nombre)throws SQLException, ClassNotFoundException{
        Connection con = Configuracion.getConnection();
        PreparedStatement stmt = con.prepareStatement(AplicacionRW.INSERTAR_APLICACION);
        stmt.setString(1, nombre);
        stmt.executeUpdate();
    }
    
    public static void cargarTablaAplicaciones(JTable tabla) throws SQLException, ClassNotFoundException{
        
        DefaultTableModel modelo = new DefaultTableModel();
        tabla.setModel(modelo);
        
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        
        Connection con = Configuracion.getConnection();
        PreparedStatement stmt = con.prepareStatement(AplicacionRW.OBTENER_APLICACIONES);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            Object [] fila = new Object[2];
            for (int i=0;i<2;i++)
                fila[i] = rs.getObject(i+1);
            modelo.addRow(fila);
        }
    }

}
