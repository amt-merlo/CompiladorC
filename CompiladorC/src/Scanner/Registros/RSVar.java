/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner.Registros;

/**
 *
 * @author amtme
 */
public class RSVar extends RS{
    public String ID;
    public int columna;
    public int linea;

    public RSVar(String ID, int columna, int linea) {
        this.ID = ID;
        this.columna = columna;
        this.linea = linea;
    }
}
