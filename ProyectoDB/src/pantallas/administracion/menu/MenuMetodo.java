/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantallas.administracion.menu;

import backend.AdministracionMenu;
import backend.AdministracionMetodos;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pantallas.adminsitracion.roles.*;
import pantallas.login.Login;
import java.awt.Color;

/**
 *
 * @author Agustin
 */
public class MenuMetodo extends javax.swing.JFrame {

    private static int id = 0;
    private static String descripcion = "";

    /**
     * Creates new form RolMetodo
     */
    public MenuMetodo(int idMenu, String desc) throws SQLException, ClassNotFoundException {
        initComponents();
        id = idMenu;
        descripcion = desc;
        menuname.setText(desc);
        recargaMetodosAgregar();
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

    private void recargaMetodosAgregar() throws SQLException, ClassNotFoundException {

        ArrayList<String> listaNoRelacionados = new ArrayList<>();
        listaNoRelacionados = AdministracionMetodos.traerMetodosNoRelacionadosMenu(id);
        listaNoRelacion.setListData(convertir(listaNoRelacionados));
        ArrayList<String> listaRelacionados = new ArrayList<>();
        listaRelacionados = AdministracionMetodos.traerMetodosRelacionadosMenu(id);
        listaRelacion.setListData(convertir(listaRelacionados));

    }

    private String[] convertir(ArrayList<String> t) {
        int cantTemas = t.size();
        String[] retorno = new String[cantTemas];

        for (int i = 0; i < cantTemas; i++) {
            retorno[i] = t.get(i);
        }
        return retorno;
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
        listaRelacion = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaNoRelacion = new javax.swing.JList<>();
        agregar = new javax.swing.JButton();
        quitar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Atras = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        menuname = new javax.swing.JLabel();
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

        jLabel1.setText("Menu - Metodos");

        listaRelacion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaRelacion);

        listaNoRelacion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listaNoRelacion);

        agregar.setText("<-- Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        quitar.setText("Quitar -->");
        quitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarActionPerformed(evt);
            }
        });

        jLabel2.setText("Metodos en uso");

        jLabel3.setText("Metodos disponibles");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });

        jLabel4.setText("Menu");

        menuname.setText("jLabel5");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, Short.MAX_VALUE)
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
                .addComponent(panTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(124, 124, 124)
                                .addComponent(menuname))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(quitar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(34, 34, 34))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(Atras))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panTitulo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(menuname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(agregar)
                                .addGap(45, 45, 45)
                                .addComponent(quitar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(Atras)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
        EditarMenu menu;

        menu = new EditarMenu(id, descripcion);
        menu.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_AtrasActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        int row = listaNoRelacion.getSelectedIndex();

        if (row != -1) {

            String met = (String) listaNoRelacion.getSelectedValue();
            int metodoId = Integer.parseInt(met.split("-")[0]);
            try {
                AdministracionMenu.insertarMenuMetodo(metodoId, id);
                recargaMetodosAgregar();
            } catch (SQLException ex) {
                Logger.getLogger(RolMetodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RolMetodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un metodo para Agregar", "Error", 0);
        }
    }//GEN-LAST:event_agregarActionPerformed

    private void quitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarActionPerformed

        int row = listaRelacion.getSelectedIndex();

        if (row != -1) {

            String met = (String) listaRelacion.getSelectedValue();
            int metodoId = Integer.parseInt(met.split("-")[0]);
            try {
                AdministracionMenu.eliminarMenuMetodo(metodoId, id);
                recargaMetodosAgregar();
            } catch (SQLException ex) {
                Logger.getLogger(RolMetodo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(RolMetodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un metodo a quitar", "Error", 0);
        }
    }//GEN-LAST:event_quitarActionPerformed

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
        this.setState(MenuMetodo.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseEntered
        btnMinimizar.setBackground(Color.gray);
    }//GEN-LAST:event_btnMinimizarMouseEntered

    private void btnMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseExited
        btnMinimizar.setBackground(Color.white);
    }//GEN-LAST:event_btnMinimizarMouseExited

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
            java.util.logging.Logger.getLogger(MenuMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMetodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuMetodo(id, descripcion).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MenuMetodo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MenuMetodo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton agregar;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnSalir5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaNoRelacion;
    private javax.swing.JList<String> listaRelacion;
    private javax.swing.JLabel menuname;
    private javax.swing.JPanel panTitulo5;
    private javax.swing.JButton quitar;
    // End of variables declaration//GEN-END:variables
}
