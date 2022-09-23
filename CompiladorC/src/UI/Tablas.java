/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Toolkit;

/**
 *
 * @author Feterro
 */
public class Tablas extends javax.swing.JFrame {

    /**
     * Creates new form tablaTokens
     */
    
    
    public Tablas() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Tokens = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_Errores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(811, 554));

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("OCR A Extended", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(1, 0, 19));
        jPanel1.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        jPanel1.setLayout(null);

        tabla_Tokens.setBackground(new java.awt.Color(51, 51, 51));
        tabla_Tokens.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
        jScrollPane1.setBounds(76, 85, 669, 390);

        jPanel1.add(jLabel6);
        jLabel6.setBounds(220, 10, 80, 90);

        jLabel2.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tokens");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 811, 77);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo2.jpg"))); // NOI18N
        jLabel4.setText("Scanner Para");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 530);

        jTabbedPane1.addTab("Tokens", jPanel1);

        jPanel2.setBackground(new java.awt.Color(1, 0, 19));
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

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Errores");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 811, 77);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo2.jpg"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 0, 810, 530);

        jTabbedPane1.addTab("Errores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable tabla_Errores;
    public javax.swing.JTable tabla_Tokens;
    // End of variables declaration//GEN-END:variables
}
