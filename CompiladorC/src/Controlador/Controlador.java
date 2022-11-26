/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Scanner.Modelo;
import TokenType.Token;
import UI.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    private Analisis resultados;
    private String texto;
    
    
    public Controlador(){
    }

   
    public Controlador(VentanaPrincipal vista) {
        this.ventana = vista;
    }
    
    public void iniciar(){
        this.ventana.setVisible(true);
        this.ventana.btnCargar.addActionListener(this);
        this.texto="";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource()==this.ventana.btnCargar){
            JFileChooser buscador= new JFileChooser();
            buscador.showOpenDialog(null);
            File archivo =buscador.getSelectedFile();
            if (archivo != null){
                String path=archivo.getAbsolutePath();
                Modelo.iniciar(path);  //Iniciamos el analisis con el path del documento seleccionado por el usuario
                ArrayList errores = Modelo.parsear(path);
                this.resultados = new Analisis();
                //this.tabla = new Tablas();
                llenarLista(); 
                this.ventana.setVisible(false);
                resultados.setVisible(true);
                
                //Mostrar Codigo Analizado
                String ST;
                try {
                    ST = new String(Files.readAllBytes(archivo.toPath()));
                    resultados.txtAreaCodigo.setText(ST);
                    resultados.txtAreaCodigo2.setText(ST);
                } catch (IOException ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                //tabla.setVisible(true);
                
                //this.tabla.btnVolver.addActionListener(this);
                //this.tabla.btnVolver1.addActionListener(this);
                
                //ERRORES de Sintaxis
                if(!errores.isEmpty()){ //Si encuentra errores
                    
                    errores.forEach((n) -> texto = texto +"\n"+ n.toString());
                    
                    resultados.txtAreaErroresSin.setText(texto);
                    resultados.txtAreaErroresSin1.setText(texto);
                    resultados.txtFieldResultado.setText("Sintaxis Incorrecta :(");
                    resultados.txtAreaErroresSin.setForeground(Color.red);
                }
                else{ //Si no hay errores de sintaxis
                   
                    resultados.txtFieldResultado.setText("Sintaxis Correcta :)");
                    resultados.txtFieldResultado.setForeground(Color.green);
                }
                
            }
        }
        else if(e.getSource()==this.tabla.btnVolver1 || e.getSource()==this.tabla.btnVolver){ //Arreglar
            System.out.println("Funciona");
            this.tabla.setVisible(false);
            this.ventana.setVisible(true);
        }
        
        
    }
    
    public void llenarLista(){
        //Normal
        JTable table = this.resultados.tabla_Tokens;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (Map.Entry<String,Token> entry : Modelo.losTokens.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(),entry.getValue().getTipo(),a});
        }
        
        //Informe
        table = this.resultados.tabla_Tokens1;
        DefaultTableModel model2 = (DefaultTableModel) table.getModel();
        for (Map.Entry<String,Token> entry : Modelo.losTokens.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model2.addRow(new Object[]{entry.getKey(),entry.getValue().getTipo(),a});
        }
        
        //Normal Errores
        table = this.resultados.tabla_Errores;
        model = (DefaultTableModel) table.getModel();
        
        for (Map.Entry<String,Token> entry : Modelo.losErrores.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(), a});
        }
        
        //Informe Errores
        table = this.resultados.tabla_Errores1;
        model = (DefaultTableModel) table.getModel();
       
        for (Map.Entry<String,Token> entry : Modelo.losErrores.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(), a});
        }
    }
    
}
