/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokenType;

/**
 *
 * @author amtmerlo
 */
public class ErrorLexico extends Token{

    public ErrorLexico(String token, int linea) {
        super(token, linea);
        this.setTipo("ErrorLexico");
    }
    
}
