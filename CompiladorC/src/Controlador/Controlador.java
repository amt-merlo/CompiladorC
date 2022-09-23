/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Scanner.Modelo;
import TokenType.Token;
import UI.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laptop
 */
public class Controlador implements ActionListener{
    
    private Tablas tabla;
    private VentanaPrincipal ventana;
    
    public Controlador(){
    }

   
    public Controlador(VentanaPrincipal vista) {
        this.ventana = vista;
    }
    
    public void iniciar(){
        this.ventana.setVisible(true);
        this.ventana.btnCargar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this.ventana.btnCargar){
            JFileChooser buscador= new JFileChooser();
            buscador.showOpenDialog(null);
            File archivo =buscador.getSelectedFile();
            if (archivo != null){
                String path=archivo.getAbsolutePath();
                Modelo.iniciar(path);  
                this.tabla = new Tablas();
                llenarLista();
                this.ventana.setVisible(false);
                tabla.setVisible(true);
                
            }
        }
        
        
    }
    
    public void llenarLista(){
        
        JTable table = this.tabla.tabla_Tokens;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (Map.Entry<String,Token> entry : Modelo.losTokens.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(),entry.getValue().getTipo(),a});
        }
        
        table = this.tabla.tabla_Errores;
        model = (DefaultTableModel) table.getModel();
        System.out.println("Errores");
        for (Map.Entry<String,Token> entry : Modelo.losErrores.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(), a});
        }
    }
    
}
