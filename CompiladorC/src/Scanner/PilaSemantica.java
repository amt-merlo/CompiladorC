/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

import java.util.ArrayList;
import Scanner.Registros.*;

/**
 *
 * @author amtme
 */
public class PilaSemantica {
    public ArrayList<RS> registros;
    private static PilaSemantica instancia; 
    private TablaSimbolos tablaSim = TablaSimbolos.getInstance();
    private PilaSemantica() {
        this.registros = new ArrayList<RS>();
    }
    
    public static PilaSemantica getInstance() {
        if (instancia == null) {
            instancia = new PilaSemantica();
        }
        return instancia;
    }

    public void Push(RS registro){
        registros.add(registro);
    }
    
    public RS Pop(){
        RS pop = registros.get(registros.size()-1);
        registros.remove(registros.size()-1);
        return pop;
    }
    
    public int guardarVariable(String Ambito){
        RSTipo tipo = null;
        int cont = 0;
        for (int i = this.registros.size()-1; i >= 0; i--) {
            if("RSTipo".equals(registros.get(i).nombre())){
                tipo = (RSTipo) registros.get(i);
                cont = i;
                break;
            }
        }
        for (int i = this.registros.size()-1; i > cont; i--) {
            RSVar id = (RSVar) this.Pop();
            this.tablaSim.insertarSimbolo(id.ID,tipo.tipo, Ambito,id.linea,id.columna);
        }

        this.Pop();
        
        return 1;
    }
    
    public int verificarAsignacion(String ID, int linea, int columna){
        this.tablaSim.verificarAsignacion(ID, linea, columna);
        return 1;
    }
    
    public int verificarFuncion(String ID, int linea, int columna){
        this.tablaSim.verificarFuncion(ID, linea, columna);
        return 1;
    }
    
    public boolean esOperador(RS registro){
        try{
            RSOperador operador = (RSOperador)registro;
            return true;
        }catch(Exception ex){
            return false;
        }
    }
    
    public boolean esConstante(RS registro){
        try{
            RSDO constante = (RSDO) registro;
            if(constante.tipo.equals("Constante")){
                return true;
            }
            return false;
            
        }catch(Exception ex){
            return false;
        }
    }
    public boolean constantFolding(String numero, int linea, int columna){
        //Primero verificamos que sea un numero
        try {
            Integer.parseInt(numero);
            //Primero verificamos si se puede hacer constant folding
            RS registro1 = registros.get(registros.size()-1);
            RS registro2 = registros.get(registros.size()-2);
            
            //Comprobamos que el registro anterior de la pila sea un operador
            if(esOperador(registro1)){
                
                RSOperador operador = (RSOperador) registro1;
                
                //Comprobamos que el registro anterior al anterior sea un registro 
                if(esConstante(registro2)){
                    
                    RSDO constante = (RSDO) registro2;
                    float valor1 = constante.valor;
                    String operacion = operador.operador;
                    
                    System.out.println("\n\033[0;32m[Constant Folding en proceso....]\033[0;32m");
                    System.out.println("Numero: "+valor1);
                    System.out.println("Operacion: "+operacion);
                    System.out.println("Numero: "+Integer.parseInt(numero));
                    System.out.println("\033[0;32m=========================================================\033[0;32m");
                    float resultado = 0;
                    switch (operacion) {
                        case "+":
                            // ejecutamos una suma
                           
                            resultado = valor1 + Integer.parseInt(numero);
                            break;
                        case "-":
                            // ejecutamos una resta
                            resultado = valor1 - Integer.parseInt(numero);
                            break;
                        case "/":
                            // ejecutamos una division
                            if (Integer.parseInt(numero) != 0) {
                                resultado = valor1 / Integer.parseInt(numero);
                            } else {
                                System.out.println("\u001B[31mError semantico encontrado. Linea: " + linea + " Columna: " + columna + " Division por cero. \"\u001B[31m");
                                
                            }
                            break;
                        case "*":
                            // ejecutamos una multiplicacion
                            resultado = valor1 * Integer.parseInt(numero);
                            break;
                        case "%":
                            break;
                        default:
                            System.out.println("Sin constant folding");
                    }

                    //Hacemos pop a la pila para eliminar el operador y la constante anterior
                    this.Pop();
                    this.Pop();
                    //Hacemos push a la pila con el resultado del constant folding
                    RSDO resDO = new RSDO(resultado, "Constante");
                    this.Push(resDO);
                    System.out.println("Resultado: " + resultado);
                    return true;
                }
                
            }
            //En caso de no cumplirse las condiciones, hacemos push a la pila con la constante sin aplicar Constant Folding
            RSDO resConstante = new RSDO(Float.parseFloat(numero), "Constante");
            this.Push(resConstante);
            System.out.println("No se hizo constant folding pero se inserto la constante en la pila");
            return true;
	} 
        catch (NumberFormatException nfe){
            RSDO resLiteral = new RSDO("Literal", numero);
            this.Push(resLiteral);
            System.out.println("no es numero");
            return false;
	}
            
    }
    
    public boolean startIf(int linea, int columna){
        RSIf rsIF = new RSIf();
        this.Push(rsIF);
        return true;
    }
    
    public boolean endIf(){
        //Generamos el exit label
        
        //Pop al RSIf y la pila queda igual que antes del if
        RSTipo tipo = null;
        int cont = 0;
        for (int i = this.registros.size()-1; i >= 0; i--) {
            if("RSIf".equals(registros.get(i).nombre())){
                cont = i;
                break;
            }
        }
        registros.remove(cont);
        return true;
    }
        
    public boolean comprobarCiclo(int linea, int columna){
        RSTipo tipo = null;
        int cont = 0;
        for (int i = this.registros.size()-1; i >= 0; i--) {
            if("RSIf".equals(registros.get(i).nombre()) || "RSWhile".equals(registros.get(i).nombre()) || "RSFor".equals(registros.get(i).nombre())){
                cont = i;
                return true;
            }
        }
        System.out.println("\u001B[31mError semantico encontrado. Linea: " + linea + " Columna: " + columna + " BREAK | CONTINUE fuera de contexto \"\u001B[31m");
        return false;
    }
}
    
    
    
    
    

