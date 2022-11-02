/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author amtme
 */
public class Analisis extends javax.swing.JFrame {

    /**
     * Creates new form Analisis
     */
    public Analisis() {
        initComponents();
        scaleAppWallpaper();
    }
    
    public void scaleAppWallpaper(){
        ImageIcon icon = new ImageIcon("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Images\\fondo5.png");
        ImageIcon iconErrores = new ImageIcon("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Images\\fondoerrores.png");
        Image img = icon.getImage();
        Image imgErrores = iconErrores.getImage();
        //Analisis
        Image imgScale = img.getScaledInstance(lblFondoAnalisis.getWidth(), lblFondoAnalisis.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled = new ImageIcon(imgScale);
        lblFondoAnalisis.setIcon(scaled);
        //Errores
        Image imgScaleErrores = imgErrores.getScaledInstance(lblFondoErrores.getWidth(), lblFondoErrores.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledErrores = new ImageIcon(imgScaleErrores);
        lblFondoErrores.setIcon(scaledErrores);
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
        lblTituloAnalisis = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_Tokens = new javax.swing.JTable();
        lblTituloAnalisis2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaSintax = new javax.swing.JTextArea();
        lblFondoAnalisis = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTituloErrores = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_Errores = new javax.swing.JTable();
        lblTituloErrores2 = new javax.swing.JLabel();
        txtFieldSintax = new javax.swing.JTextField();
        lblFondoErrores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloAnalisis.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblTituloAnalisis.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAnalisis.setText("Análisis Léxico");
        jPanel1.add(lblTituloAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 259, 62));

        tabla_Tokens.setBackground(new java.awt.Color(102, 102, 102));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1030, -1));

        lblTituloAnalisis2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblTituloAnalisis2.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloAnalisis2.setText("Análisis Sintáctico");
        jPanel1.add(lblTituloAnalisis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 350, 50));

        txtAreaSintax.setColumns(20);
        txtAreaSintax.setRows(5);
        txtAreaSintax.setEnabled(false);
        jScrollPane2.setViewportView(txtAreaSintax);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 1020, 160));

        lblFondoAnalisis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo5.png"))); // NOI18N
        jPanel1.add(lblFondoAnalisis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1080, 800));

        jTabbedPane1.addTab("Análisis", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloErrores.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblTituloErrores.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloErrores.setText("Errores Léxicos");
        jPanel2.add(lblTituloErrores, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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
        jScrollPane3.setViewportView(tabla_Errores);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 1030, -1));

        lblTituloErrores2.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        lblTituloErrores2.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloErrores2.setText("Errores de Sintaxis");
        jPanel2.add(lblTituloErrores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, -1, -1));

        txtFieldSintax.setText("jTextField1");
        txtFieldSintax.setEnabled(false);
        jPanel2.add(txtFieldSintax, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 1030, 190));

        lblFondoErrores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoerrores.png"))); // NOI18N
        jPanel2.add(lblFondoErrores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 820));

        jTabbedPane1.addTab("Errores", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Analisis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Analisis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblFondoAnalisis;
    private javax.swing.JLabel lblFondoErrores;
    private javax.swing.JLabel lblTituloAnalisis;
    private javax.swing.JLabel lblTituloAnalisis2;
    private javax.swing.JLabel lblTituloErrores;
    private javax.swing.JLabel lblTituloErrores2;
    public javax.swing.JTable tabla_Errores;
    public javax.swing.JTable tabla_Tokens;
    private javax.swing.JTextArea txtAreaSintax;
    private javax.swing.JTextField txtFieldSintax;
    // End of variables declaration//GEN-END:variables
}