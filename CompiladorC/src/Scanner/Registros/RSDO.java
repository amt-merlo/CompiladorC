/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scanner.Registros;

/**
 *
 * @author amtme
 */
public class RSDO extends RS{
    public float valor;
    public String tipo, nombre;
    
    public RSDO(float valor, String tipo){
        this.valor = valor;
        this.tipo = tipo;
    }
    
    public RSDO(String tipo, String nombre){
        this.tipo = tipo;
        this.nombre = nombre;
    }
}
