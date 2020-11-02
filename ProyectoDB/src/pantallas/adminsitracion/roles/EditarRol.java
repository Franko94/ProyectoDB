/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.adminsitracion.roles;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import backend.AdministracionRoles;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class EditarRol extends javax.swing.JFrame {
    
    private static int id =0;
    private static String descripcion ="";

    /**
     * Creates new form AgregarRol
     */
    public EditarRol(int idRol, String desc) {
        initComponents();
        id = idRol;
        descripcion = desc;
       lblId.setText(String.valueOf(id));
       lbldescripcion.setText(desc);
    }
    
    
    public void limpiar() {
        nuevoNombre.setText("");
   
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
        guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nuevoNombre = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lbldescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Editar Rol");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 32, 118, 49));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cambiar Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 170, 150, 34));
        getContentPane().add(nuevoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 137, -1));

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButton3.setText("Asignar Metodos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 230, 210, -1));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 120, 99, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, -1, -1));

        jLabel5.setText("Id Rol");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        lblId.setText("jLabel6");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));
        lblId.getAccessibleContext().setAccessibleName("lblId");

        lbldescripcion.setText("jLabel7");
        getContentPane().add(lbldescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));
        lbldescripcion.getAccessibleContext().setAccessibleName("lbldescripcion");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        if(!"".equals(nuevoNombre.getText())){
        
            try {
                AdministracionRoles.editarRol(Integer.parseInt(lblId.getText()), nuevoNombre.getText());

                JOptionPane.showMessageDialog(null, "Rol editado con exito", "Exito", 1);
                
                lbldescripcion.setText(nuevoNombre.getText());
                limpiar();
            } catch (SQLException ex) {
                if (ex.getMessage().contains("duplicate key value")) {
                    JOptionPane.showMessageDialog(null, "El rol ya existe", "Error", 0);
                } else {

                    Logger.getLogger(AgregarRol.class.getName()).log(Level.SEVERE, null, ex);

                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(EditarRol.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
             JOptionPane.showMessageDialog(null, "Debe escribir un nombre de rol","Error",0);
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AdminRoles admin;
        try {
            admin = new AdminRoles();
            admin.setVisible(true);
            this.setVisible(false);

        } catch (SQLException ex) {
            Logger.getLogger(EditarRol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarRol.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        RolMetodo rolmetodo;
        try {
            rolmetodo = new RolMetodo(Integer.parseInt(lblId.getText()), lbldescripcion.getText());
            rolmetodo.setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(EditarRol.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EditarRol.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarRol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarRol(id, descripcion).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JTextField nuevoNombre;
    // End of variables declaration//GEN-END:variables
}
