/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUZ ELENA
 */
public class ProductoSellado extends Producto{
    
    private boolean tipoContenido;

    public ProductoSellado(boolean tipoContenido, String nombre, String descripcion, int id, double precioUSD, int stock) {
        super(nombre, descripcion, id, precioUSD, stock);
        this.tipoContenido = tipoContenido;
    }

    public boolean isTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(boolean tipoContenido) {
        this.tipoContenido = tipoContenido;
    }
}
