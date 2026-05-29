/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author LUZ ELENA
 */
public class Cliente extends Usuario{
    private int historialCompras;
    private int torneosInscritos;
    private ArrayList<Compra> MisFacturas;

    public Cliente(int historialCompras, int torneosInscritos, int id, String nombre, String contraseña) {
        super(id, nombre, contraseña);
        this.historialCompras = historialCompras;
        this.torneosInscritos = torneosInscritos;
        this.MisFacturas = new ArrayList<>();
    }
    
    public void AgregarRecibo (Compra nuevaCompra){
        this.MisFacturas.add(nuevaCompra);
    }
    
    public ArrayList<Compra> getMisFacturas(){
        return MisFacturas;
    }

    public int getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(int historialCompras) {
        this.historialCompras = historialCompras;
    }

    public int getTorneosInscritos() {
        return torneosInscritos;
    }

    public void setTorneosInscritos(int torneosInscritos) {
        this.torneosInscritos = torneosInscritos;
    }
    
}
