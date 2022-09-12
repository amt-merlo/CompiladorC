/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Scanner;

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
        // TODO code application logic here
        String lexerPath = "C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\lexer.flex";
        //generarLexer(lexerPath);
        
    }
    public static void generarLexer(String path){
        File archivo = new File(path);
        JFlex.Main.generate(archivo);
    }
}
