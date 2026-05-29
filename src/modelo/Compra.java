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
public class Compra {
    private int idCompra;
    private Cliente cliente;
    private ArrayList<DetalleCompra> listaDetalles;
    private double totalFinal;
    private String fecha; 

    public Compra(int idCompra, Cliente cliente, ArrayList<DetalleCompra> listaDetalles, String fecha) {
        this.idCompra = idCompra;
        this.cliente = cliente;
        this.listaDetalles = listaDetalles;
        this.totalFinal = CalcularTotal();
        this.fecha = fecha;
    }

    private double CalcularTotal(){
        double total = 0;
        
        for (int i = 0; i < listaDetalles.size(); i++) {
            total += listaDetalles.get(i).calcularSubtotal();
        }
        return total;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<DetalleCompra> getListaDetalles() {
        return listaDetalles;
    }

    public void setListaDetalles(ArrayList<DetalleCompra> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    public double getTotalFinal() {
        return totalFinal;
    }

    public void setTotalFinal(double totalFinal) {
        this.totalFinal = totalFinal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
