/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner.Registros;

/**
 *
 * @author amtme
 */
public class RSIf extends RS{
    String else_label;
    String exit_label;

    public RSIf() {
    }

    //Sets
    public void setElse_label(String else_label) {
        this.else_label = else_label;
    }

    public void setExit_label(String exit_label) {
        this.exit_label = exit_label;
    }
    
    //Gets
    public String getElse_label() {
        return else_label;
    }

    public String getExit_label() {
        return exit_label;
    }
    
}
