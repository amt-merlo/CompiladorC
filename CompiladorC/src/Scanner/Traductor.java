/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author FRANJ
 */
public class Traductor {

    public Traductor() {
    }
    
    
    public void GenerarCodigo(String Traducido){
            FileWriter fichero = null;
            PrintWriter pw = null;
                try {
            fichero = new FileWriter("C:\\Users\\FRANJ\\Documents\\GitHub\\CompiladorC\\prueba.asm");
            pw = new PrintWriter(fichero);
            pw.println("section .stack" + "\n");
            pw.println("section .data");
            pw.println(Traducido);
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != fichero) {
                    fichero.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
    
    public String traduccionGlobales( String ID){
        String TraducidoTemp = "";
        TraducidoTemp += "       "  + "db" + "     " + ID + "     " + "0" + " " + ";" + "\n";
        return TraducidoTemp;
    }
    
    
    
    public String traduccionSuma(String valor1, String valor2){
        String TraducidoTemp = "";
        TraducidoTemp += "       " + "mov eax, " + valor1 + ";         Aqui empieza la suma" + "\n"
                + "       " + "sub eax, 0 ;" + "\n" 
                + "       " + "mov ebx, " + valor2 + "\n"
                + "       " + "sub eax, 0 ;" + "\n" 
                + "       " + "add eax, ebx ;" + "\n" 
                + "       " + "add eax, 0 ;" + "\n"
                + "       " + "mov [res], eax ;" + "          Aqui termina la suma" + "\n";
        return TraducidoTemp;

    }
    
    public String traduccionResta(String valor1, String valor2){
    String TraducidoTemp = "";
    TraducidoTemp += "       " + "mov eax, " + valor1 + ";         Aqui empieza la resta" + "\n"
            + "       " + "sub eax, 0 ;" + "\n" 
            + "       " + "mov ebx, " + valor2 + "\n"
            + "       " + "sub eax, 0 ;" + "\n" 
            + "       " + "sub eax, ebx ;" + "\n" 
            + "       " + "add eax, 0 ;" + "\n"
            + "       " + "mov [res], eax ;" + ";         Aqui termina la resta" + "\n";
    return TraducidoTemp;

}
    public String traduccionMulti(String valor1, String valor2){
    String TraducidoTemp = "";
    TraducidoTemp += "       " + "mov al, " + valor1 + ";         Aqui empieza la multiplicacion" + "\n"
            + "       " + "sub al, 0 ;" + "\n" 
            + "       " + "mov bl, " + valor2 + "\n"
            + "       " + "sub bl, 0 ;" + "\n" 
            + "       " + "mul bl ;" + "\n" 
            + "       " + "add al, 0 ;" + "\n"
            + "       " + "mov [res], al ;" + "          Aqui termina la multiplicacion" + "\n";
    return TraducidoTemp;
    }
    
    public String traduccionDivision(String valor1, String valor2){
    String TraducidoTemp = "";
    TraducidoTemp += "       " + "mov ax, " + valor1 + ";         Aqui empieza la division" + "\n"
            + "       " + "sub ax, 0 ;" + "\n" 
            + "       " + "mov bl, " + valor2 + "\n"
            + "       " + "sub bl, 0 ;" + "\n" 
            + "       " + "div bl ;" + "\n" 
            + "       " + "add ax, 0 ;" + "\n"
            + "       " + "mov [res], ax ;" + "          Aqui termina la division" + "\n";
    return TraducidoTemp;
    }
    
    public String traduccionInc(String valor1){
    String TraducidoTemp = "";
    TraducidoTemp += "       " + "mov ax, " + valor1 + ";         Aqui empieza el inc" + "\n"
            + "       " + "sub ax, 0 ;" + "\n" 
            + "       " + "inc ax ;" + "\n" 
            + "       " + "add ax, 0 ;" + "          Aqui termina el inc" + "\n";
    return TraducidoTemp;            
    }
    
    public String traduccionDec(String valor1){
    String TraducidoTemp = "";
    TraducidoTemp += "       " + "mov ax, " + valor1 + "          Aqui empieza el dec" + "\n"
            + "       " + "sub ax, 0 ;" + "\n" 
            + "       " + "dec ax ;" + "\n" 
            + "       " + "add ax, 0 ;" + "          Aqui termina el dec" + "\n";
    return TraducidoTemp;            
    }
    
    public String traduccionWhileInicio(String linea){
        String TraducidoTemp = "";
        TraducidoTemp += "while_label_" + linea + ":  ;         Aqui empieza el while\n"
        + "       " + "evaluamos el while ; \n"
        + "       " + "jmp exit_label_" + linea + " ; \n"
        + "       " + "codigo del while ; \n";
        
        return TraducidoTemp;
    }
    
    public String traduccionWhileFin(String linea){
        String TraducidoTemp = "";
        TraducidoTemp += "       " + "jmp while_label_" + linea + " \n"
        + "exit_label_" + linea + ":  " + "   ;         Aqui etermina el while \n" ;


        
        return TraducidoTemp;
    }
    
    public String traduccionIfInicio(String linea){
        String TraducidoTemp = "";
        TraducidoTemp += "       " + "evaluamos el if ; \n" 
        + "       " + "jmp else_label_" + linea + " ; \n"
        + "       " + "codigo del if ; \n";
        
        return TraducidoTemp;
    }
    
    public String traduccionElseInicio(String linea){
        String TraducidoTemp = "";
        TraducidoTemp += "       " + "jmp exit_label_" + linea + " ; \n"
        + "else_label_" + linea + " : " + " ; \n"
        + "       " + "codigo del else ; \n"
        + "exit_label_" + linea + " : " + " ; \n";
        
        return TraducidoTemp;
    }
    
}
