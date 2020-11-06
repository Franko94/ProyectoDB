/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.usuario;

import backend.AdministracionSolicitud;
import pantallas.adminsitracion.usuario.*;
import pantallas.administracion.persona.*;
import backend.AdministracionUsuarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import pantallas.login.MenuPrincipal;

/**
 *
 * @author Agustin
 */
public class SolicitudesUser extends javax.swing.JFrame {

    /**
     * Creates new form Metodoes
     */
    public SolicitudesUser() throws SQLException, ClassNotFoundException {
        initComponents();
        AdministracionSolicitud.cargarTablaSolicitud(jTextField_Id_solicitud.getText(), "esperando", jTextField_Fecha_Creacion.getText(), jTextField_Fecha_actualizacion.getText(), jTextField_Tipo_Solicitud.getText(), jTextField_Usuario.getText(), jTextField_Aplicacion.getText(),jTextField_Rol_Solicitado.getText(), jTextField_Usuario_autorizante.getText(), jTable1);
        }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Autorizar = new javax.swing.JButton();
        jButton_NO_Autorizar = new javax.swing.JButton();
        jTextField_Id_solicitud = new javax.swing.JTextField();
        jButton_Inicio = new javax.swing.JButton();
        jTextField_Estado = new javax.swing.JTextField();
        jButton_Buscar = new javax.swing.JButton();
        jTextField_Fecha_Creacion = new javax.swing.JTextField();
        jTextField_Fecha_actualizacion = new javax.swing.JTextField();
        jTextField_Tipo_Solicitud = new javax.swing.JTextField();
        jTextField_Usuario = new javax.swing.JTextField();
        jTextField_Rol_Solicitado = new javax.swing.JTextField();
        jTextField_Usuario_autorizante = new javax.swing.JTextField();
        jTextField_Aplicacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Solicitudes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Solicitud", "Estado", "Fecha Creacion", "Última actualización", "Tipo de Solicitud", "Usuario", "Aplicacion", "Rol Solicitado", "Autorizante", "Nuevo valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        }

        jButton_Autorizar.setText("Autorizar");
        jButton_Autorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AutorizarActionPerformed(evt);
            }
        });

        jButton_NO_Autorizar.setText("No Autorizar");
        jButton_NO_Autorizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NO_AutorizarActionPerformed(evt);
            }
        });

        jButton_Inicio.setText("Volver al Inicio");
        jButton_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InicioActionPerformed(evt);
            }
        });

        jTextField_Estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EstadoActionPerformed(evt);
            }
        });

        jButton_Buscar.setText("Buscar");
        jButton_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BuscarActionPerformed(evt);
            }
        });

        jTextField_Fecha_Creacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_Fecha_CreacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Autorizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton_NO_Autorizar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Inicio))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1103, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Buscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jTextField_Id_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Fecha_Creacion, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Fecha_actualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Tipo_Solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Aplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Rol_Solicitado, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Usuario_autorizante, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton_Buscar)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Id_solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Fecha_Creacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Fecha_actualizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Tipo_Solicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Rol_Solicitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Usuario_autorizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Aplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Autorizar)
                    .addComponent(jButton_NO_Autorizar)
                    .addComponent(jButton_Inicio))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_NO_AutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NO_AutorizarActionPerformed
        String id_solicitud = getSelectedRowId();
        String id_usuario = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 5);
        try {
            AdministracionSolicitud.no_autorizar(id_solicitud, id_usuario);
            AdministracionSolicitud.cargarTablaSolicitud(jTextField_Id_solicitud.getText(), "esperando", jTextField_Fecha_Creacion.getText(), jTextField_Fecha_actualizacion.getText(), jTextField_Tipo_Solicitud.getText(), jTextField_Usuario.getText(), jTextField_Aplicacion.getText(),jTextField_Rol_Solicitado.getText(), jTextField_Usuario_autorizante.getText(), jTable1);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_NO_AutorizarActionPerformed

    private void jButton_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InicioActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_InicioActionPerformed

    private void jButton_AutorizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AutorizarActionPerformed
    String id_usuario = (String)jTable1.getValueAt(jTable1.getSelectedRow(), 5);
        try {
            AdministracionSolicitud.autorizar(getSelectedRowId(), id_usuario, (String)jTable1.getValueAt(jTable1.getSelectedRow(), 5));
            AdministracionSolicitud.cargarTablaSolicitud(jTextField_Id_solicitud.getText(), "esperando", jTextField_Fecha_Creacion.getText(), jTextField_Fecha_actualizacion.getText(), jTextField_Tipo_Solicitud.getText(), jTextField_Usuario.getText(), jTextField_Aplicacion.getText(),jTextField_Rol_Solicitado.getText(), jTextField_Usuario_autorizante.getText(), jTable1);
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton_AutorizarActionPerformed

    private void jButton_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BuscarActionPerformed
        try {
            AdministracionSolicitud.cargarTablaSolicitud(jTextField_Id_solicitud.getText(), jTextField_Estado.getText(), jTextField_Fecha_Creacion.getText(), jTextField_Fecha_actualizacion.getText(), jTextField_Tipo_Solicitud.getText(), jTextField_Usuario.getText(), jTextField_Aplicacion.getText(),jTextField_Rol_Solicitado.getText(), jTextField_Usuario_autorizante.getText(), jTable1);
        } catch (SQLException ex) {
            Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton_BuscarActionPerformed

    private void jTextField_EstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EstadoActionPerformed

    private void jTextField_Fecha_CreacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_Fecha_CreacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_Fecha_CreacionActionPerformed

    private String getSelectedRowId() {
        int fila = jTable1.getSelectedRow();
        if (fila != -1) {
            return jTable1.getValueAt(fila, 0).toString();
        } else {
            return "";
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SolicitudesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitudesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitudesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitudesUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SolicitudesUser().setVisible(true);
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(SolicitudesUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Autorizar;
    private javax.swing.JButton jButton_Buscar;
    private javax.swing.JButton jButton_Inicio;
    private javax.swing.JButton jButton_NO_Autorizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_Aplicacion;
    private javax.swing.JTextField jTextField_Estado;
    private javax.swing.JTextField jTextField_Fecha_Creacion;
    private javax.swing.JTextField jTextField_Fecha_actualizacion;
    private javax.swing.JTextField jTextField_Id_solicitud;
    private javax.swing.JTextField jTextField_Rol_Solicitado;
    private javax.swing.JTextField jTextField_Tipo_Solicitud;
    private javax.swing.JTextField jTextField_Usuario;
    private javax.swing.JTextField jTextField_Usuario_autorizante;
    // End of variables declaration//GEN-END:variables
}
