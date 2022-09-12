/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokenType;
import java.util.HashMap;

/**
 *
 * @author amtmerlo
 */

public class Token {
    private String token;
    private int linea;
    private String tipo;
    private int apariciones;
    public HashMap<Integer,Integer> totalApariciones; //para contar las apariciones del token por cada linea

    public Token(String token, int linea) {
        this.token = token;
        this.linea = linea;
    }

    //Getters
    public String getToken() {
        return token;
    }

    public int getLinea() {
        return linea;
    }

    public String getTipo() {
        return tipo;
    }

    public int getApariciones() {
        return apariciones;
    }

    public String getTotalApariciones() {
       String resultado = "";
        
         for (int key : this.totalApariciones.keySet()) {
                int apariciones = this.totalApariciones.get(key);
                String concat = "";
                if(apariciones==1)
                {
                    concat = key+", ";
                }
                else
                {
                    concat = key+"("+apariciones+"), ";

                }
                resultado = resultado.concat(concat);   
        }
        if (resultado != null && resultado.length() > 0 ){
                    resultado = resultado.substring(0, resultado.length() - 2);
                } 
        return resultado;
    }
    
    //Setters

    public void setToken(String token) {
        this.token = token;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setApariciones(int apariciones) {
        this.apariciones = apariciones;
    }

    public void setTotalApariciones(int linea, int ocurrencias) {
        if(this.totalApariciones == null){
            this.totalApariciones = new HashMap<>(); //si aún no hay apariciones entonces inicializa el hashmap
        }
        this.totalApariciones.put(linea,ocurrencias); 
    }
    
}
