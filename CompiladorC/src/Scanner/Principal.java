/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Scanner;

import Controlador.Controlador;
import UI.VentanaPrincipal;
import java.io.File;

/**
 *
 * @author amtmerlo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VentanaPrincipal vista = new VentanaPrincipal();       
        Controlador ctrl = new Controlador( vista);
        ctrl.iniciar();
        
        String lexerPath = "C:\\Users\\FRANJ\\Desktop\\TEC2022ll\\Compiladores\\Proyecto1"
                + "\\CompiladorC\\CompiladorC\\src\\Scanner\\Lexer.flex";
        //generarLexer(lexerPath);
        
    }
    public static void generarLexer(String path){
        File archivo = new File(path);
        JFlex.Main.generate(archivo);
    }
}
