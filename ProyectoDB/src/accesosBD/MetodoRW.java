/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

/**
 *
 * @author Meki
 */
public class MetodoRW {
    
   public static String LISTAR_METODOS_NO_RELACIONADOS = "SELECT * FROM metodo WHERE id_metodo NOT IN (SELECT id_metodo FROM rol_metodo WHERE id_rol = ?)";
   public static String LISTAR_METODOS_RELACIONADOS = "SELECT * FROM metodo WHERE id_metodo IN (SELECT id_metodo FROM rol_metodo WHERE id_rol = ?)";
    
    
    
    
}
