/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUZ ELENA
 */
public class Carta extends Producto{
    
    private String rareza;

    public Carta(String rareza, String nombre, String descripcion, int id, double precioUSD, int stock) {
        super(nombre, descripcion, id, precioUSD, stock);
        this.rareza = rareza;
    }

    public String getRareza() {
        return rareza;
    }

    public void setRareza(String rareza) {
        this.rareza = rareza;
    }
    
    
    
}
