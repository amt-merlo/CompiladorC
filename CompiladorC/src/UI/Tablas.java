/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Laptop
 */
public class Tablas extends javax.swing.JFrame {

    /**
     * Creates new form tablaTokens
     */
    
    
    public Tablas() {
        initComponents();
        setAppIcon(); //Icono de la aplicacion
    }

    public void setAppIcon(){
        setIconImage(new ImageIcon(getClass().getResource("../Images/triceratops.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Tokens = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Errores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btnVolver1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(811, 554));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 102));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setToolTipText("");
        jTabbedPane1.setAutoscrolls(true);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(87, 65));
        jTabbedPane1.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jPanel1.setLayout(null);

        btnVolver.setBackground(new java.awt.Color(12, 124, 221));
        btnVolver.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("← Regresar");
        btnVolver.setToolTipText("");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolverMouseMoved(evt);
            }
        });
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);
        btnVolver.setBounds(20, 20, 110, 30);

        tabla_Tokens.setBackground(new java.awt.Color(51, 51, 51));
        tabla_Tokens.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabla_Tokens.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabla_Tokens.setForeground(new java.awt.Color(255, 255, 255));
        tabla_Tokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Token", "Tipo", "Lineas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Tokens.setGridColor(new java.awt.Color(51, 51, 51));
        tabla_Tokens.setRowHeight(25);
        tabla_Tokens.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_Tokens);
        if (tabla_Tokens.getColumnModel().getColumnCount() > 0) {
            tabla_Tokens.getColumnModel().getColumn(0).setResizable(false);
            tabla_Tokens.getColumnModel().getColumn(1).setResizable(false);
            tabla_Tokens.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 100, 980, 390);

        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 10, 80, 90);

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tokens");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 811, 77);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo5.png"))); // NOI18N
        jLabel4.setText("Scanner Para");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 1130, 810);

        jTabbedPane1.addTab("Tokens", jPanel1);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        tabla_Errores.setBackground(new java.awt.Color(51, 51, 51));
        tabla_Errores.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tabla_Errores.setForeground(new java.awt.Color(255, 255, 255));
        tabla_Errores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Error", "Linea"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_Errores.setGridColor(new java.awt.Color(51, 51, 51));
        tabla_Errores.setRowHeight(24);
        tabla_Errores.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tabla_Errores);
        if (tabla_Errores.getColumnModel().getColumnCount() > 0) {
            tabla_Errores.getColumnModel().getColumn(0).setResizable(false);
            tabla_Errores.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(110, 83, 599, 390);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(220, 10, 80, 90);

        btnVolver1.setBackground(new java.awt.Color(153, 0, 0));
        btnVolver1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnVolver1.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver1.setText("← Regresar");
        btnVolver1.setToolTipText("");
        btnVolver1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVolver1MouseMoved(evt);
            }
        });
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver1);
        btnVolver1.setBounds(20, 20, 110, 30);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Errores");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 811, 77);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoerrores.png"))); // NOI18N
        jPanel2.add(lblFondo);
        lblFondo.setBounds(0, 0, 840, 530);

        jTabbedPane1.addTab("Errores", jPanel2);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 811, 554));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolver1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolver1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolver1MouseMoved

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
        // TODO add your handling code here:
        btnVolver1.setBackground(Color.red);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVolverMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolverMouseMoved
        // TODO add your handling code here:
        btnVolver.setBackground(Color.blue);
    }//GEN-LAST:event_btnVolverMouseMoved

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
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnVolver;
    public javax.swing.JButton btnVolver1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFondo;
    public javax.swing.JTable tabla_Errores;
    public javax.swing.JTable tabla_Tokens;
    // End of variables declaration//GEN-END:variables
}
