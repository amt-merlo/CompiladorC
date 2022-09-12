/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TokenType;

/**
 *
 * @author amtme
 */
public class PalabraReservada extends Token{

    public PalabraReservada(String token, int linea) {
        super(token, linea);
        this.setTipo("PalabraReservada");
    }
    
}
