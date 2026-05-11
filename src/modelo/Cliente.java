/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author LUZ ELENA
 */
public class Cliente extends Usuario{
    private int historialCompras;
    private int torneosInscritos;

    public Cliente(int historialCompras, int torneosInscritos, int id, String nombre, String contraseña, boolean rol) {
        super(id, nombre, contraseña, rol);
        this.historialCompras = historialCompras;
        this.torneosInscritos = torneosInscritos;
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
