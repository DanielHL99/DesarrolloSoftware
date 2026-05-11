/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUZ ELENA
 */
public class Accesorio extends Producto{
    
    private String categoria;

    public Accesorio(String categoria, String nombre, String descripcion, int id, double precioUSD, int stock) {
        super(nombre, descripcion, id, precioUSD, stock);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
