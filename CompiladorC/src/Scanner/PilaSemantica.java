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
    
    
}
