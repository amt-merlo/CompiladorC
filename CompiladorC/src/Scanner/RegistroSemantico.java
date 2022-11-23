/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner;

/**
 *
 * @author amtme
 */
public class RegistroSemantico {
    private String ID;
    private String tipo;
    private String ambito;

    public RegistroSemantico(String ID, String tipo, String ambito) {
        this.ID = ID;
        this.tipo = tipo;
        this.ambito = ambito;
    }
    

    public String getID() {
        return ID;
    }

    public void setIdentificador(String ID) {
        this.ID = ID;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String Ambito) {
        this.ambito = Ambito;
    }
}
