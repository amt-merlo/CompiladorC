/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

import java.util.ArrayList;

/**
 *
 * @author amtme
 */
public class TablaSimbolos {
    private int ultimaFuncion;
    private ArrayList<RegistroSemantico> simbolos;
    private static TablaSimbolos intancia;
    private boolean errorF;
    

    private TablaSimbolos() {
        this.ultimaFuncion = 0;
        this.simbolos = new ArrayList<RegistroSemantico>();
        
    }
    
    public static TablaSimbolos getInstance() {
        if (intancia == null) { //Si no existe, la creamos
            intancia = new TablaSimbolos();
        }
        return intancia;
    }
    
    public void insertarSimbolo(String ID, String tipo, String ambito, int linea, int columna){
        if(buscarSimbolo(ID,ambito) != null){
            System.out.println("\u001B[31mError semantico encontrado. Linea: " + linea + " Columna: " + columna +  " el identificador fue declarado con anterioridad: \""+ID+"\"\u001B[31m");
            if("Funcion".equals(ambito)){
                this.EliminarFuncion();
                this.errorF = false;
            }
            if("Parametro".equals(ambito)){
                this.errorF = true;
            }
        }
        else{
            RegistroSemantico registro = new RegistroSemantico(ID, tipo, ambito);
            if("Funcion".equals(ambito) && this.errorF){
                this.EliminarFuncion();
                this.errorF = false;
            }
            else {
                if("Funcion".equals(ambito)){
                    this.ultimaFuncion=simbolos.size();
                }
                simbolos.add(registro);
            }
        }
        
    }

    private RegistroSemantico buscarSimbolo(String ID, String ambito) {
        String currentAmbito;
        RegistroSemantico current;
        int cont = 0; 
        if("Parametro".equals(ambito)){
            cont = this.ultimaFuncion;
        }
        for (int i = cont; i < simbolos.size(); i++) {
            current  = simbolos.get(i);
            if(current.getID().compareTo(ID) == 0){
                currentAmbito = current.getAmbito();
                if(currentAmbito.equals(ambito)){
                    return current;
                }
            }
        }
        return null;
    }
    
    private boolean buscarVariable(String ID){
        String currentAmbito;
        RegistroSemantico current;
        int cont = 0; 
        for (int i = cont; i < simbolos.size(); i++) {
            current  = simbolos.get(i);
            if(current.getID().compareTo(ID) == 0){
                currentAmbito = current.getAmbito();
                if(!currentAmbito.equals("Funcion")){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean buscarFuncion(String ID){
           String currentAmbito;
        RegistroSemantico current;
        int cont = 0; 
        for (int i = cont; i < simbolos.size(); i++) {
            current  = simbolos.get(i);
            if(current.getID().compareTo(ID) == 0){
                currentAmbito = current.getAmbito();
                if(currentAmbito.equals("Funcion")){
                    return true;
                }
            }
        }
        return false;
    }

    private void EliminarFuncion() {
        RegistroSemantico current;
        int cont = 0;
        cont = this.ultimaFuncion+1;
        for (int i = cont; i < simbolos.size(); i++) {
            current = simbolos.get(i);
            if(current.getAmbito().compareTo("Global") != 0){
                simbolos.remove(i);
                --i;
            }
        }
    }
    
    public void verificarAsignacion(String ID, int linea, int columna){
       if(!buscarVariable(ID)){
           System.out.println("\u001B[31mError semantico encontrado. Linea: " + linea + " Columna: " + columna +  " uso de variable sin declarar: \""+ID+"\"\u001B[31m");
       }
    }
    
    public void verificarFuncion(String ID, int linea, int columna){
        if(!buscarFuncion(ID)){
           System.out.println("\u001B[31mError semantico encontrado. Linea: " + linea + " Columna: " + columna +  " llamada a función que no ha sido declarada : \""+ID+"\"\u001B[31m");
        }
    }
   
  
    public void imprimir(){
        System.out.println("\nID  |   TIPO    |   AMBITO");
        for (int i = 0; i < simbolos.size(); i++) {
            RegistroSemantico current = simbolos.get(i);
            System.out.println("\n"+current.getID()+"  | "+current.getTipo()+" | "+current.getAmbito());
        }
    }
}
