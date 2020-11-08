/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.administracion.persona;

import pantallas.adminsitracion.usuario.SolicitudCrearUsuario;
import backend.AdministracionPersonas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pantallas.login.Login;
import java.awt.Color;

/**
 *
 * @author Usuario
 */
public class EditarPersona extends javax.swing.JFrame {

    private static String ci;
    private static String nombrePer;
    private static String apePer;
    private static String nacPer;
    private static String mailPer;
    private int xx;
    private int yy;

    /**
     * Creates new form CrearPersona
     */
    public EditarPersona(String cedula, String nom, String ape, String nac, String mail) {
        initComponents();
        this.ci = cedula;
        this.nombrePer = nom;
        this.apePer = ape;
        this.nacPer = nac;
        this.mailPer = mail;
        this.setLocationRelativeTo(null);
        ciPer.setText(ci);
        cargarInfo();

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

    private void cargarInfo() {
        jTextField_NombreNuevo.setText(nombrePer);
        jTextField_ApellidoNuevo.setText(apePer);
        jTextField_EmailNuevo.setText(mailPer);
        jTextField_FechaNuevo.setText(nacPer);

    }

    private void setInfo(String nombre, String apellido, String mail, String fecha) {
        this.nombrePer = nombre;
        this.apePer = apellido;
        this.nacPer = fecha;
        this.mailPer = mail;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_NombreNuevo = new javax.swing.JTextField();
        jTextField_ApellidoNuevo = new javax.swing.JTextField();
        jTextField_EmailNuevo = new javax.swing.JTextField();
        jTextField_FechaNuevo = new javax.swing.JTextField();
        jButton_Aceptar = new javax.swing.JButton();
        jComboBox_Sexo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ciPer = new javax.swing.JLabel();
        panTitulo5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnSalir5 = new javax.swing.JButton();
        btnMinimizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Editar Persona - Cedula:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel5.setText("Email:");

        jLabel6.setText("Fecha nacimiento:");

        jLabel7.setText("Sexo");

        jTextField_NombreNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NombreNuevoActionPerformed(evt);
            }
        });

        jButton_Aceptar.setText("Guardar");
        jButton_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AceptarActionPerformed(evt);
            }
        });

        jComboBox_Sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "F", "M" }));

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ciPer.setText("jLabel8");

        panTitulo5.setBackground(new java.awt.Color(255, 255, 255));
        panTitulo5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panTitulo5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panTitulo5MouseDragged(evt);
            }
        });
        panTitulo5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panTitulo5MousePressed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Aceptar)
                                .addGap(80, 80, 80)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ciPer))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(44, 44, 44))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_ApellidoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_NombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_EmailNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_FechaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox_Sexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panTitulo5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciPer))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_NombreNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_ApellidoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox_Sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_EmailNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_FechaNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Aceptar)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AceptarActionPerformed
        if ("".equals(jTextField_NombreNuevo.getText())
                || "".equals(jTextField_ApellidoNuevo.getText())
                || "".equals(jTextField_EmailNuevo.getText())
                || "".equals(jTextField_FechaNuevo.getText())) {

            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", 0);
            cargarInfo();
        } else {
            try {
                setInfo(jTextField_NombreNuevo.getText(), jTextField_ApellidoNuevo.getText(), jTextField_EmailNuevo.getText(), jTextField_FechaNuevo.getText());
                AdministracionPersonas.editarPersona(nombrePer, apePer, mailPer, nacPer, jComboBox_Sexo.getSelectedItem().toString(), ci);
                JOptionPane.showMessageDialog(null, "Informacion editada con exito", "Exito", 1);
                cargarInfo();

                //this.dispose();
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(EditarPersona.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton_AceptarActionPerformed

    private void jTextField_NombreNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NombreNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NombreNuevoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            AdministracionPersona admin = new AdministracionPersona();
            admin.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(EditarPersona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarPersona.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
        this.setState(EditarPersona.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(Color.gray);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseExited

    private void panTitulo5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panTitulo5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - yy);
    }//GEN-LAST:event_panTitulo5MouseDragged

    private void panTitulo5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panTitulo5MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_panTitulo5MousePressed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CrearPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CrearPersona().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir5;
    private javax.swing.JLabel ciPer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Aceptar;
    private javax.swing.JComboBox<String> jComboBox_Sexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField_ApellidoNuevo;
    private javax.swing.JTextField jTextField_EmailNuevo;
    private javax.swing.JTextField jTextField_FechaNuevo;
    private javax.swing.JTextField jTextField_NombreNuevo;
    private javax.swing.JPanel panTitulo5;
    // End of variables declaration//GEN-END:variables
}
