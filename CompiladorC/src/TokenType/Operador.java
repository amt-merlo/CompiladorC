/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokenType;

/**
 *
 * @author amtmerlo
 */
public class Operador extends Token{

    public Operador(int linea, String token) {
        super(token, linea);
        this.setTipo("Operador");
    }
    
}
