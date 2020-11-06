/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesosBD;

import static accesosBD.PersonaRW.removeLast3Characters;

/**
 *
 * @author Agustin
 */
public class SolicitudRW {

    public static final String GET_SOLICITUD = "SELECT * FROM solicitud where id_solicitud = ?";

    public static final String INSERTAR_SOLICITUD = "INSERT INTO solicitud "
            + "(estado,fecha_sol,fecha,id_tipo_sol,id_usuario_solicitante)"
            + " values (?,?,?,?,?)";

    public static final String APROBAR_SOLICITUD = "UPDATE solicitud SET habilitado = true WHERE id_solicitud = ?";

    public static String filtrarSolicitud(String id_solicitud, String estado, String fecha_creacion, String fecha_actualizacion, String descripcion_solicitud, String usuario_solicitante, String aplicacion, String rol, String usuario_autorizante) {
        String where = "where ci_solicitante != " + Configuracion.ci;
        String filtro = "";
        //si el id tiene algo, poner where id = ese_id
        if (!id_solicitud.equalsIgnoreCase("")) {
            filtro += " id_solicitud = " + id_solicitud + " or ";
        }
        if (!estado.equalsIgnoreCase("")) {
            filtro += " estado LIKE  " + "'%" + estado + "%' or ";
        }
        if (!fecha_creacion.equalsIgnoreCase("")) {
            filtro += " fecha_sol = '" + fecha_creacion + "' or ";
        }
        if (!fecha_actualizacion.equalsIgnoreCase("")) {
            filtro += " fecha_actualizacion = '" + fecha_actualizacion + "' or ";
        }
        if (!descripcion_solicitud.equalsIgnoreCase("")) {
            filtro += " descripcion_solicitud LIKE " + "'%" + descripcion_solicitud + "%' or ";
        }
        if (!usuario_solicitante.equalsIgnoreCase("")) {
            filtro += " id_usuario_solicitante  LIKE " + "'%" + usuario_solicitante + "%' or ";
        }
        if (!aplicacion.equalsIgnoreCase("")) {
            filtro += " nombre_aplicacion LIKE " + "'%" + aplicacion + "%' or ";
        }
        if (!rol.equalsIgnoreCase("")) {
            filtro += " descripcion_rol LIKE " + "'%" + rol + "%' or ";
        }
        if (!usuario_autorizante.equalsIgnoreCase("")) {
            filtro += " id_usuario_autorizante =  LIKE " + "'%" + usuario_autorizante + "%' or ";
        }
        if (!filtro.equalsIgnoreCase("")) {
            where = where +  " and ";
            filtro = removeLast3Characters(filtro);

        }
        return "SELECT id_solicitud,estado,fecha_sol,fecha_actualizacion,descripcion_solicitud,id_usuario_solicitante,"
                + "nombre_aplicacion, descripcion_rol,"
                + "id_usuario_autorizante FROM solicitudes_tipo_solicitudes_usuarios_con_roles_y_ci " + where + filtro;
    }
}
