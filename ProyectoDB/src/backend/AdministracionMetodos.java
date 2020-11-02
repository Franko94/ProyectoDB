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

/**
 *
 * @author Meki
 */
public class AdministracionMetodos {
    
    
    
     public static ArrayList<String> traerMetodosNoRelacionados() throws SQLException, ClassNotFoundException{
        ArrayList<String> resultado = new ArrayList<>();
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.LISTAR_METODOS_NO_RELACIONADOS);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                String valor= rs.getString("id_metodo")+"-"+rs.getString("descripcion");
               resultado.add(valor);
            }
            return resultado;
        }
  
        
    }
     public static ArrayList<String> traerMetodosRelacionados() throws SQLException, ClassNotFoundException{
        ArrayList<String> resultado = new ArrayList<>();
        try (Connection con = Configuracion.getConnection()) {
            PreparedStatement stmt = con.prepareStatement(MetodoRW.LISTAR_METODOS_RELACIONADOS);
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()){
                String valor= rs.getString("id_metodo")+"-"+rs.getString("descripcion");
               resultado.add(valor);
            }
            return resultado;
        }
  
        
    }
    
}
