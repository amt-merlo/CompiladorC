/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import TokenType.Token;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Laptop
 */
public class Modelo {
    //Este es el hashmap de hasmap, esto para guardar por linea las apariciones
    public static HashMap<Integer,HashMap<String,Token>> codeLines = new HashMap<Integer,HashMap<String,Token>>();
    //Este es el hashmap de los tokens que se encuentran
    public static HashMap<String,Token> losTokens = new HashMap<String,Token>();
    //Este es el hashmap de los errores que se encuentran
    public static HashMap<String,Token> losErrores = new HashMap<String,Token>();  

    public Modelo() {
    }
    
    //Esta funcion se encarga de leer el archivo .c
    public static void iniciar(String ruta) {
    try { 
        Reader lector = new BufferedReader(new FileReader(ruta)); //creamos el reader con el documento que contiene el codigo a analizar
        LexerViejo lexer = new LexerViejo(lector); //creamos el lexer con el reader que contiene el codigo
        HashMap<String,Token> lineaHash = new HashMap<>(); 
        Integer currentLine = 0;
        while(true){

            Token token = lexer.yylex(); //iteramos sobre cada token que hizo match en el lexer
            if(token == null)
            {
                codeLines.put(currentLine, lineaHash);
                break;
            }
            //Aqui va en caso de cambir de linea, se agrega una nueva
            if(token.getLinea() != currentLine)
            {
                codeLines.put(currentLine, lineaHash);
                lineaHash =  new HashMap<>();
            }        

            String currentKey = token.getToken();

            //En caso de existir la llave, se le suma 1 a las apariciones
            if(lineaHash.containsKey(currentKey))
            {
                Token tokenFound = lineaHash.get(token.getToken());
                Integer repeticiones = tokenFound.getApariciones()+1  ;
                tokenFound.setApariciones(repeticiones);
                lineaHash.put(currentKey, tokenFound);

            }
            else
            {
                lineaHash.put(token.getToken(), token);
            }
            currentLine = token.getLinea();
        }

        revisarTipos();

       losTokens.forEach((k,v)->{
           String a = v.getTotalApariciones();

       });

       losErrores.forEach((k,v)->{
           String a = v.getTotalApariciones();

       });

    } catch (FileNotFoundException ex) {
        System.out.println("a");
    } catch (IOException ex) {
        System.out.println("a");
    }
}
    //Aqui se separa entre Errores y Tokens
    public static void revisarTipos(){
        
         codeLines.forEach((t,v)->{
                v.forEach((t2,v2)->{
                Token tokenFound = v2;
                if(!tokenFound.getTipo().equals("ErrorLexico"))
                {
                    if(losTokens.containsKey(t2))
                    {
                        losTokens.get(t2).setTotalApariciones(tokenFound.getLinea(),tokenFound.getApariciones()); 
                    }
                
                    else
                    {
                        tokenFound.setTotalApariciones(tokenFound.getLinea(), tokenFound.getApariciones());
                        losTokens.put(tokenFound.getToken(),tokenFound);
                    }
                }
                else
                {
                    
                    if(losErrores.containsKey(t2))
                    {
                        losErrores.get(t2).setTotalApariciones(tokenFound.getLinea(),tokenFound.getApariciones()); 
                    }
                
                    else
                    {
                        tokenFound.setTotalApariciones(tokenFound.getLinea(), tokenFound.getApariciones());
                        losErrores.put(tokenFound.getToken(),tokenFound);
                    }
                }
                
                
                });
            });
    }
    
    public static ArrayList parsear(String ruta){
        ArrayList errores = new ArrayList();
        try{
            Reader lector = new BufferedReader(new FileReader(ruta));
            Parser parser = new Parser(lector);
            Syntax syntax = new Syntax(parser);
            
            
            try{
                syntax.parse();
                System.out.println("SUCCESFULL!! :)");
                
            }catch(Exception ex){
                System.out.println("\n\nErrores");
                System.out.println(syntax.errores);
               
            }
            errores = syntax.errores;
            TablaSimbolos.getInstance().imprimir();
            System.out.println(""+PilaSemantica.getInstance().registros.size());
           
        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado");
        }
        
        return errores;
    }
}
