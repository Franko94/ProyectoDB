/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.adminsitracion.usuario;

import accesosBD.Configuracion;
import backend.AdministracionAuditoria;
import backend.AdministracionUsuarios;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pantallas.login.Login;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EditarUsuario extends javax.swing.JFrame {

    String id_usuario;

    /**
     * Creates new form AgregarRol
     */
    public EditarUsuario(String id) {
        initComponents();
        this.id_usuario = id;
        this.setLocationRelativeTo(null);
    }
    
    

    private void desvanecer() {
        for (double i = 1.0; i >= 0.0; i -= 0.1) {
            float f = (float) i;
            this.setOpacity(f);
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        jButtonAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Contrasena = new javax.swing.JTextField();
        jButtonAtras = new javax.swing.JButton();
        panTitulo5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir5 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Nombre = new javax.swing.JTextField();
        jButton_Asignar_Roles = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Editar Usuario");

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña");

        jButtonAtras.setText("Atras");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        panTitulo5.setBackground(new java.awt.Color(255, 255, 255));
        panTitulo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSalir5.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSalir5.setText("X");
        btnSalir5.setAlignmentY(0.0F);
        btnSalir5.setBorder(null);
        btnSalir5.setBorderPainted(false);
        btnSalir5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir5.setFocusPainted(false);
        btnSalir5.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnSalir5.setIconTextGap(0);
        btnSalir5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalir5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalir5MouseExited(evt);
            }
        });
        btnSalir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir5ActionPerformed(evt);
            }
        });

        btnMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        btnMinimizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnMinimizar.setText("-");
        btnMinimizar.setAlignmentY(0.0F);
        btnMinimizar.setBorder(null);
        btnMinimizar.setBorderPainted(false);
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.setFocusPainted(false);
        btnMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMinimizar.setIconTextGap(0);
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panTitulo5Layout = new javax.swing.GroupLayout(panTitulo5);
        panTitulo5.setLayout(panTitulo5Layout);
        panTitulo5Layout.setHorizontalGroup(
            panTitulo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTitulo5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panTitulo5Layout.setVerticalGroup(
            panTitulo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
            .addComponent(btnSalir5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setText("Nombre");

        jButton_Asignar_Roles.setText("Rol");
        jButton_Asignar_Roles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Asignar_RolesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(206, 206, 206))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAtras)
                        .addGap(89, 89, 89))))
            .addComponent(panTitulo5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabel2)
                        .addGap(115, 115, 115)
                        .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAceptar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton_Asignar_Roles)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(175, 175, 175)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(71, 71, 71)
                    .addComponent(jTextField_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(175, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton_Asignar_Roles)
                .addGap(42, 42, 42)
                .addComponent(jButtonAceptar)
                .addGap(23, 23, 23)
                .addComponent(jButtonAtras)
                .addGap(48, 48, 48))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField_Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(219, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    String porDefecto = "Seleccione";


    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed

    try {    // TODO add your handling code here:
        AdministracionUsuarios.editarNombreUsuario(id_usuario, jTextField_Nombre.getText());
        AdministracionUsuarios.editarContrasenaUsuario(id_usuario, jTextField_Contrasena.getText());
        AdministracionAuditoria.agregarAuditoria(Configuracion.usuario, "3", id_usuario, null);
        AdministracionUsuario admin;
        admin = new AdministracionUsuario();
    admin.setVisible(true);
        
    } catch (SQLException ex) {
        Logger.getLogger(EditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(EditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        try {
            AdministracionUsuario admin = new AdministracionUsuario();
            admin.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(EditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i += 0.1) {
            float f = (float) i;
            this.setOpacity(f);
            try {
                Thread.sleep(25);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSalir5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir5MouseClicked
        int confirmacion = JOptionPane.showConfirmDialog(null, "Seguro que desea salir??", "Salir del Sistema", JOptionPane.YES_NO_OPTION);
        if (confirmacion == 0) {
            desvanecer();
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir5MouseClicked

    private void btnSalir5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir5MouseEntered
        btnSalir5.setBackground(Color.red);
        btnSalir5.setForeground(Color.white);
    }//GEN-LAST:event_btnSalir5MouseEntered

    private void btnSalir5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir5MouseExited
        btnSalir5.setBackground(Color.white);
        btnSalir5.setForeground(Color.black);
    }//GEN-LAST:event_btnSalir5MouseExited

    private void btnSalir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir5ActionPerformed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
         this.setState(EditarUsuario.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(Color.gray);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void jButton_Asignar_RolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Asignar_RolesActionPerformed
        // TODO add your handling code here:
        UsuarioRol edit;
        try {
            edit = new UsuarioRol(id_usuario);edit.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(EditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton_Asignar_RolesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir5;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButton_Asignar_Roles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField_Contrasena;
    private javax.swing.JTextField jTextField_Nombre;
    private javax.swing.JPanel panTitulo5;
    // End of variables declaration//GEN-END:variables
}
