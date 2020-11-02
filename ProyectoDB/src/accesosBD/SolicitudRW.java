/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

/**
 *
 * @author Agustin
 */
public class SolicitudRW {

    public static final String GET_SOLICITUD = "SELECT * FROM solicitud where id_solicitud = ?";

    public static final String INSERTAR_SOLICITUD = "INSERT INTO solicitud "
            + "(estado,fecha_sol,fecha,descripcion,id_tipo_sol,ci_solicitante,id_usuario_autorizante)"
            + " values (?,?,?,?,?,?,?)";

    public static final String APROBAR_SOLICITUD = "UPDATE solicitud SET habilitado = true WHERE id_solicitud = ?";
}
