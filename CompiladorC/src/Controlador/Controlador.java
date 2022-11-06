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
import java.util.ArrayList;
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
                //tabla.setVisible(true);
                
                //this.tabla.btnVolver.addActionListener(this);
                //this.tabla.btnVolver1.addActionListener(this);
                
                //ERRORES de Sintaxis
                
                
                if(!errores.isEmpty()){ //Si encuentra errores
                    
                    errores.forEach((n) -> texto = texto +"\n"+ n.toString());
                    
                    resultados.txtAreaErroresSintax.setText(texto);
                    resultados.txtAreaSintax.setText("Sintaxis Incorrecta :(");
                    resultados.txtAreaErroresSintax.setForeground(Color.red);
                }
                else{
                   
                    resultados.txtAreaSintax.setText("Sintaxis Correcta :)");
                    resultados.txtAreaSintax.setForeground(Color.green);
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
        JTable table = this.resultados.tabla_Tokens;
        //JTable table = this.tabla.tabla_Tokens;
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (Map.Entry<String,Token> entry : Modelo.losTokens.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(),entry.getValue().getTipo(),a});
        }
        
        table = this.resultados.tabla_Errores;
        //table = this.tabla.tabla_Errores;
        model = (DefaultTableModel) table.getModel();
        System.out.println("Errores");
        for (Map.Entry<String,Token> entry : Modelo.losErrores.entrySet()) {
            String a = entry.getValue().getTotalApariciones();
            model.addRow(new Object[]{entry.getKey(), a});
        }
    }
    
}
