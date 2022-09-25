/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author amtmerlo
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Compiler
     */
    public VentanaPrincipal() {
        initComponents();
        scaleAppIcon();
        //scaleAppWallpaper();
    }
    //C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Images\\dino.png
    public void scaleAppIcon(){
        ImageIcon icon = new ImageIcon("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Images\\dinoVerde.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblIcon.getWidth(), lblIcon.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled = new ImageIcon(imgScale);
        lblIcon.setIcon(scaled);
    }
    
     public void scaleAppWallpaper(){
        ImageIcon icon = new ImageIcon("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Images\\fondoPrincipalVerde.png");
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaled = new ImageIcon(imgScale);
        lblFondo.setIcon(scaled);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblIcon = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCargar.setBackground(new java.awt.Color(51, 153, 0));
        btnCargar.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        btnCargar.setForeground(new java.awt.Color(255, 255, 255));
        btnCargar.setText("Analizar");
        btnCargar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnCargarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnCargarMouseMoved(evt);
            }
        });
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 270, 60));

        lblTitulo.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitulo.setText("Compilador para C");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 410, 50));

        lblSubtitulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Proyecto Semestral ITCR | Compiladores e Intérpretes ");
        getContentPane().add(lblSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dinoVerde.png"))); // NOI18N
        lblIcon.setText("iconoDino");
        getContentPane().add(lblIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 290, 330));

        btnInfo.setBackground(new java.awt.Color(51, 153, 0));
        btnInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnInfo.setForeground(new java.awt.Color(255, 255, 255));
        btnInfo.setText("?");
        btnInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInfo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnInfoMouseMoved(evt);
            }
        });
        btnInfo.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                btnInfoMouseWheelMoved(evt);
            }
        });
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 40, 40));

        lblFondo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblFondo.setForeground(new java.awt.Color(0, 102, 102));
        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoPrincipalVerde.png"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnCargarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseMoved
        // TODO add your handling code here:
        btnCargar.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnCargarMouseMoved

    private void btnCargarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseDragged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnCargarMouseDragged

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(rootPane, "*********Autores\nAllison Montero Merlo\nFrancisco Chavarro Conde\n Gabriela Gutiérrez",  JOptionPane.ERROR_MESSAGE);
        JLabel label = new JLabel("<html><center>Allison Montero Merlo<br>Francisco Chavarro Conde <br> Gabriela Gutérrez Valverde");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        JOptionPane.showMessageDialog(null, label, "Autores", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnInfoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseMoved
        // TODO add your handling code here:
        btnInfo.setBackground(Color.green);
    }//GEN-LAST:event_btnInfoMouseMoved

    private void btnInfoMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_btnInfoMouseWheelMoved
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnInfoMouseWheelMoved

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCargar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblIcon;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
