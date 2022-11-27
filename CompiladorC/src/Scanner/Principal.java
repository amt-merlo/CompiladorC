/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Scanner;

import Controlador.Controlador;
import UI.VentanaPrincipal;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amtmerlo
 */
public class Principal {

    /*
    RUTAS Alita
        lexerPath : C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\Lexer.flex"
        lexerCupPath : "C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\LexerCup.flex"
        paths : {"-parse", "Sintax", "C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Parser\\Sintax.cup"}
        
    RUTAS Chisco
        lexerPath : "C:\\Users\\FRANJ\\Desktop\\TEC2022ll\\Compiladores\\Proyecto1\\CompiladorC\\CompiladorC\\src\\Scanner\\Lexer.flex"
        lexerCupPath : "C:\\Users\\FRANJ\\Desktop\\TEC2022ll\\Compiladores\\Proyecto1\\CompiladorC\\CompiladorC\\src\\Scanner\\LexerCup.flex";
        paths : {"-parse", "Sintax", "C:\\Users\\FRANJ\\Desktop\\TEC2022ll\\Compiladores\\Proyecto1\\CompiladorC\\CompiladorC\\src\\Parser\\Sintax.cup"}
    
    RUTAS Gaby
        lexerPath : "C:\Users\gabyg\Documents\GitHub\CompiladorC\CompiladorC\src\Scanner\Lexer.flex"
        lexerCupPath : "C:\Users\gabyg\Documents\GitHub\CompiladorC\CompiladorC\src\Scanner\LexerCup.flex"
        paths : {"-parse", "Sintax", "C:\Users\gabyg\Documents\GitHub\CompiladorC\CompiladorC\src\Parser\Sintax.cup"}
    */
    public static void main(String[] args) throws FileNotFoundException {
        
        //VentanaPrincipal vista = new VentanaPrincipal();       
        //Controlador ctrl = new Controlador( vista);
        //ctrl.iniciar();
        
        String lexerPath = "C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\Lexer.flex";
        String lexerCupPath = "C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\LexerCup.flex";
        String[] paths = {"-parser", "Sintax", "C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\Syntax.cup"};
        try {
            generarLexer(lexerPath);
            generarParser(lexerPath, lexerCupPath, paths);
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Reader reader = new FileReader("C:\\Users\\amtme\\Desktop\\CodigoC\\identificadores.c");
        Parser parser = new Parser(reader);
        //Syntax syntax = new Syntax(parser);
        /*
        try{
            syntax.parse(); 
            System.out.println("SUCCESFULL!! :)");
        }catch(Exception ex){
            System.out.println("Errores");
            System.out.println(syntax.errores);
        }
        */
    }
    //Genera el scanner para el analisis lexico
    public static void generarLexer(String path){
        File archivo = new File(path);
        JFlex.Main.generate(archivo);
    }
    
    //Genera el scanner y el parser para el analisis lexico y sintactico
    public static void generarParser(String path1, String path2, String[] paths) throws IOException, Exception{
        File archivo = new File(path1);
        JFlex.Main.generate(archivo);
        archivo = new File(path2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(paths);
        
        //Verificamos que el archivo sym no exista y si existe lo elimina
        Path rutaSym = Paths.get("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\sym.java");
        if (Files.exists(rutaSym)){
            Files.delete(rutaSym);
        }
        Files.move(
            Paths.get("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\sym.java"),
            Paths.get("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\sym.java")
        );
        
        //Verificamos que el archivo Syntax no exista y si existe lo elimina
        Path rutaSin = Paths.get("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\Syntax.java");
        if (Files.exists(rutaSin)){
            Files.delete(rutaSin);
        }
        Files.move(
            Paths.get("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\Sintax.java"),
            Paths.get("C:\\Users\\amtme\\Documents\\GitHub\\CompiladorC\\CompiladorC\\src\\Scanner\\Syntax.java")
        );
    }
    
    
    
    
}
