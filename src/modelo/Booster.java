/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUZ ELENA
 */
public class Booster extends Producto {
    
    private int cantidadCartas;

    public Booster(int cantidadCartas, String nombre, String descripcion, int id, double precioUSD, int stock) {
        super(nombre, descripcion, id, precioUSD, stock);
        this.cantidadCartas = cantidadCartas;
    }

    public int getCantidadCartas() {
        return cantidadCartas;
    }

    public void setCantidadCartas(int cantidadCartas) {
        this.cantidadCartas = cantidadCartas;
    }
    
    
    
}
