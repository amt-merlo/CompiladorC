/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

import java.util.ArrayList;
import Scanner.Registros.*;
import java.util.HashMap;

/**
 *
 * @author amtme
 */
public class PilaSemantica {

    public int lineaGlobal = 0;
    public String declaraGlobales = "";
    public static String errores = ""; 
    public int cuentaGlobales = 0;
    public ArrayList<RS> registros;
    private static PilaSemantica instancia;
    private TablaSimbolos tablaSim = TablaSimbolos.getInstance();
    Traductor traductor = new Traductor();

    private PilaSemantica() {
        this.registros = new ArrayList<RS>();
    }

    public static PilaSemantica getInstance() {
        if (instancia == null) {
            instancia = new PilaSemantica();
        }
        return instancia;
    }

    public void Push(RS registro) {
        registros.add(registro);
    }

    public RS Pop() {
        RS pop = registros.get(registros.size() - 1);
        registros.remove(registros.size() - 1);
        return pop;
    }

    public int guardarVariable(String Ambito) {
        RSTipo tipo = null;
        int cont = 0;

        for (int i = this.registros.size() - 1; i >= 0; i--) {
            if ("RSTipo".equals(registros.get(i).nombre())) {
                tipo = (RSTipo) registros.get(i);
                cont = i;
                break;
            }
        }
        for (int i = this.registros.size() - 1; i > cont; i--) {
            if ("RSVar".equals(registros.get(i).nombre())) {
                RSVar id = (RSVar) this.registros.remove(i);
                //RSVar id = (RSVar) this.Pop();
                this.tablaSim.insertarSimbolo(id.ID, tipo.tipo, Ambito, id.linea, id.columna);
                if (Ambito.equals("Global")) {
                    cuentaGlobales += 1;
                    declaraGlobales += traductor.traduccionGlobales(id.ID);
                }
            }

        }
        traductor.GenerarCodigo(declaraGlobales);

        this.Pop();
        return 1;
    }

    public int verificarAsignacion(String ID, int linea, int columna) {
        this.tablaSim.verificarAsignacion(ID, linea, columna);
        return 1;
    }


    public boolean esOperador(RS registro) {
        try {
            RSOperador operador = (RSOperador) registro;
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean esConstante(RS registro) {
        try {
            RSDO constante = (RSDO) registro;
            if (constante.tipo.equals("Constante")) {
                return true;
            }
            return false;

        } catch (Exception ex) {
            return false;
        }
    }

    public boolean constantFolding(String numero, int linea, int columna) {
        //Primero verificamos que sea un numero
        try {
            Integer.parseInt(numero);
            if(registros.size() > 2){
                
            
            //Primero verificamos si se puede hacer constant folding
            RS registro1 = registros.get(registros.size() - 1);
            RS registro2 = registros.get(registros.size() - 2);

            //Comprobamos que el registro anterior de la pila sea un operador
            if (esOperador(registro1)) {

                RSOperador operador = (RSOperador) registro1;

                //Comprobamos que el registro anterior al anterior sea un registro 
                if (esConstante(registro2)) {

                    RSDO constante = (RSDO) registro2;
                    float valor1 = constante.valor;
                    String operacion = operador.operador;

                    System.out.println("\n\033[0;32m[Constant Folding en proceso....]\033[0;32m");
                    System.out.println("Numero: " + valor1);
                    System.out.println("Operacion: " + operacion);
                    System.out.println("Numero: " + Integer.parseInt(numero));
                    System.out.println("\033[0;32m=========================================================\033[0;32m");
                    float resultado = 0;
                    switch (operacion) {
                        case "+":
                            // ejecutamos una suma
                            resultado = valor1 + Integer.parseInt(numero);
                            if (cuentaGlobales != 0) {
                                declaraGlobales += "section .code" + "\n";
                                cuentaGlobales = 0;
                            }
                            declaraGlobales += traductor.traduccionSuma(Float.toString(valor1), numero);
                            traductor.GenerarCodigo(declaraGlobales);

                            break;
                        case "-":
                            // ejecutamos una resta
                            resultado = valor1 - Integer.parseInt(numero);
                            if (cuentaGlobales != 0) {
                                declaraGlobales += "section .code" + "\n";
                                cuentaGlobales = 0;
                            }
                            declaraGlobales += traductor.traduccionResta(Float.toString(valor1), numero);
                            traductor.GenerarCodigo(declaraGlobales);
                            break;
                        case "/":
                            // ejecutamos una division
                            if (Integer.parseInt(numero) != 0) {
                                resultado = valor1 / Integer.parseInt(numero);
                                if (cuentaGlobales != 0) {
                                    declaraGlobales += "section .code" + "\n";
                                    cuentaGlobales = 0;
                                }
                                declaraGlobales += traductor.traduccionDivision(Float.toString(valor1), numero);
                                traductor.GenerarCodigo(declaraGlobales);
                            } else {
                                errores += "\u001B[37mError semantico encontrado. Linea: " + linea + " Columna: " + columna + " Division por cero. \"\u001B[37m" + "\n";
                             

                            }
                            break;
                        case "*":
                            // ejecutamos una multiplicacion
                            resultado = valor1 * Integer.parseInt(numero);
                            if (cuentaGlobales != 0) {
                                declaraGlobales += "section .code" + "\n";
                                cuentaGlobales = 0;
                            }
                            declaraGlobales += traductor.traduccionMulti(Float.toString(valor1), numero);
                            traductor.GenerarCodigo(declaraGlobales);
                            break;
                        case "%":
                            break;
                        default:
                            System.out.println("");
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
        }else{
                float valor = Float.parseFloat(numero);
                RSDO condicion = new RSDO(valor, "Constante");
                this.Push(condicion);
                return false;
            }
        } catch (NumberFormatException nfe) {
            RSDO resLiteral = new RSDO("Literal", numero);
            this.Push(resLiteral);
            return false;
        }

    }

    public boolean startIf(int linea, int columna) {
        String lineaString = linea+"";
        lineaGlobal = linea;
        if (cuentaGlobales != 0) {
        declaraGlobales += "section .code" + "\n";
        cuentaGlobales = 0;
        }
        declaraGlobales += traductor.traduccionIfInicio(lineaString);
        traductor.GenerarCodigo(declaraGlobales);
        return true;
    }

    public boolean startWhile(int linea, int columna) {
        String lineaString = linea+"";
        lineaGlobal = linea;
        if (cuentaGlobales != 0) {
        declaraGlobales += "section .code" + "\n";
        cuentaGlobales = 0;
        }
        declaraGlobales += traductor.traduccionWhileInicio(lineaString);
        traductor.GenerarCodigo(declaraGlobales);

        return true;
    }
    
    public boolean endWhile(int linea, int columna){
        String lineaString = lineaGlobal+"";
        if (cuentaGlobales != 0) {
        declaraGlobales += "section .code" + "\n";
        cuentaGlobales = 0;
        }
        declaraGlobales += traductor.traduccionWhileFin(lineaString);
        traductor.GenerarCodigo(declaraGlobales);

        return true;
    }
    

    public boolean endIf(int linea, int columna) {
        
        String lineaString = lineaGlobal+"";
        if (cuentaGlobales != 0) {
        declaraGlobales += "section .code" + "\n";
        cuentaGlobales = 0;
        }
        declaraGlobales += traductor.traduccionElseInicio(lineaString);
        traductor.GenerarCodigo(declaraGlobales);
        
        return true;
    }

    public boolean comprobarIf() {
        //comprobar que haya una instruccion if en la pila
        for (int i = this.registros.size() - 1; i >= 0; i--) {
            if ("RSIf".equals(registros.get(i).nombre())) {
                return true;
            }
        }
        return false;
    }

    public boolean comprobarCiclo(String nombre, int linea, int columna) {
        for (int i = this.registros.size() - 1; i >= 0; i--) {
            if ("RSWhile".equals(registros.get(i).nombre()) || "RSFor".equals(registros.get(i).nombre())) {
                
                if (comprobarIf()) { //Comprobamos que haya un registro de if
                    return true;
                } else {
                    errores += "\u001B[37mError semantico encontrado. Linea: " + linea + " Columna: " + columna + " " + nombre + "fuera de contexto \"\u001B[37m" + "\n";
                    return false;
                }
            }
        }
        errores += "\u001B[37mError semantico encontrado. Linea: " + linea + " Columna: " + columna + " BREAK | CONTINUE fuera de contexto \"\u001B[37m" + "\n";
//        for (int i = this.registros.size() - 1; i >= 0; i--) {
//            System.out.println(registros.get(i).nombre());
//        }
        return false;
    }

    public void operacionIncDec(String nombre, int linea, int columna, String identificador) {
        if (nombre.equals("++")) {
            if (cuentaGlobales != 0) {
                declaraGlobales += "section .code" + "\n";
                cuentaGlobales = 0;
            }
            declaraGlobales += traductor.traduccionInc(identificador);
            traductor.GenerarCodigo(declaraGlobales);
        }
        if (nombre.equals("--")) {
            if (cuentaGlobales != 0) {
                declaraGlobales += "section .code" + "\n";
                cuentaGlobales = 0;
            }
            declaraGlobales += traductor.traduccionDec(identificador);
            traductor.GenerarCodigo(declaraGlobales);
        }
    }
    
    public void operacionRelacionales(String nombre, int linea, int columna){

        RSVar variable = null;
        RS registro1 = registros.get(registros.size() - 1);

        //RS registro2 = registros.get(registros.size() - 2);
        
        //RSDO constante = (RSDO) registro2;
        //float valor1 = constante.valor;
                    
        if("RSVar".equals(registro1.nombre())){
            variable = (RSVar)registro1;
            
        }
        

        //Hacer pop
        
    }
    
    //Cuando se hace un llamado a una funcion
    public int verificarFuncion(String ID, int linea, int columna){
        
        ArrayList<String> parametrosLlamada = new ArrayList();
        ArrayList<RegistroSemantico> parametrosFuncion = new ArrayList();
        int cont = 0;  
        //Primero verificamos que la funcion haya sido declarada anteriormente
        if(this.tablaSim.verificarFuncion(ID, linea, columna)){
            
            //Si la funcion existe, saca los parametros con los que fue llamada
            for (int i = this.registros.size()-1; i > cont; i--){
                if("RSVar".equals(registros.get(i).nombre())){
                    
                    //Verificamos que el parametro se encuentre en la misma linea que la funcion
                    RSVar variable = (RSVar) registros.get(i);
                    if(variable.linea == linea){
                        
                        //Verificamos que el parametro fue declarado con anterioridad y lo obtenemos
                        
                        RegistroSemantico actual = this.tablaSim.getVariable(variable.ID);
                        
                        if(actual==null){
                            
                            errores += "\u001B[37mError semantico encontrado. Linea: " + linea + " Columna: " + columna +  " uso de variable sin declarar: \""+ID+"\"\u001B[37m\n";
                            
                        }else{
                            parametrosLlamada.add(actual.getTipo());
                        }
                    }
                }
            }
            
            //Obtenemos los parametros originales de la tabla de simbolos
            
            parametrosFuncion = this.tablaSim.getParametros(ID);
            
            //Si la cantidad de parametros no coincide, indicamos el error
            if(parametrosLlamada.size()!= parametrosFuncion.size()){
                errores += "\u001B[37mError semantico encontrado. Linea: " + linea + " Columna: " + columna +  " cantidad de parametros no coincide en la llamada de la funcion: \""+ID+"\"\u001B[37m\n";
                return 0;
            }else{
                //Hacemos la comparacion de parametros
                for(int i = 0; i<parametrosFuncion.size(); i++){
                    String tipoLlamada = parametrosLlamada.get(i);
                    String tipoOriginal = parametrosFuncion.get(i).getTipo();
                    
                    //Comparamos
                    if(!tipoLlamada.equals(tipoOriginal)){
                        //error
                        errores += "\u001B[37mError semantico encontrado. Linea: " + linea + " Columna: " + columna + " " + "tipo de parametro incorrecto \"\u001B[37m" + "\n";
                        return 0;
                    }
                }
            }
        }
        return 1;
    }
}
