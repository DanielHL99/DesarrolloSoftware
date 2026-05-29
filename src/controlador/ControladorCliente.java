/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Compra;
import modelo.DetalleCompra;
import modelo.Producto;

/**
 *
 * @author LUZ ELENA
 */
public class ControladorCliente {
    
    private ArrayList<Producto> catalogoProductos;
    private ArrayList<Compra> histotialGlobalCompras;
    
    private int contadorCompras = 0;
    
    public ControladorCliente(){
        this.catalogoProductos = new ArrayList<>();
        this.histotialGlobalCompras = new ArrayList<>();
        
    }
    
    public void verCatalogo() {
        System.out.println("=== CATÁLOGO DE PRODUCTOS ===");
        
        for (int i = 0; i < catalogoProductos.size(); i++) {
            Producto p = catalogoProductos.get(i);
            System.out.println("ID: " + p.getId() + " | " + p.getNombre() + " | Precio: $" + p.getPrecioUSD()+ " | Stock: " + p.getStock());
        }
        
        System.out.println("=============================");
    }
    
    public boolean realizarCompra(Cliente cliente, ArrayList<DetalleCompra> carrito, String fecha){
        if(carrito == null || carrito.isEmpty()){
            System.out.println("El carrito está vacío.");
            return false;
        }
        
        for (int i = 0; i < carrito.size(); i++) {
            if(carrito.get(i).getProducto().getStock() < carrito.get(i).getCantidad()){
                System.out.println("No hay stock suficiente del producto: " + carrito.get(i).getProducto().getNombre());
                return false;
            }
        }
        
        for (int i = 0; i < carrito.size(); i++) {
            Producto productoSelec = carrito.get(i).getProducto();
            productoSelec.setStock(productoSelec.getStock() - carrito.get(i).getCantidad());            
        }
        
        Compra compraNueva = new Compra(contadorCompras, cliente, carrito, fecha);
        
        histotialGlobalCompras.add(compraNueva);
        contadorCompras++;
        
        cliente.AgregarRecibo(compraNueva);
        
        int comprasActuales = cliente.getHistorialCompras();
        cliente.setHistorialCompras(comprasActuales + 1);
        
        System.out.println("¡Compra realizada con éxito el " + fecha + "! Total pagado: $" + compraNueva.getTotalFinal());
        return true;
    }      
    
    public void verHistorialCliente(Cliente cliente){
        System.out.println("=== HISTORIAL DE COMPRAS DE: " + cliente.getNombre() + " ===");
        System.out.println("Cantidad total de transacciones: " + cliente.getHistorialCompras());
        System.out.println("--------------------------------------------------");
        
        ArrayList<Compra> facturasCliente = cliente.getMisFacturas();
        
        if (facturasCliente.isEmpty()) {
            System.out.println("Este cliente aún no ha realizado ninguna compra.");
            System.out.println("==========================================");
            return;
        }
        
        for (int i = 0; i < facturasCliente.size(); i++) {
            Compra compra = facturasCliente.get(i);
            
            System.out.println("Recibo #" + compra.getIdCompra() + " | Fecha: " + 
                    compra.getFecha() + " | Total Pagado: $" + compra.getTotalFinal());
            
            ArrayList<DetalleCompra> detalles = compra.getListaDetalles();
            
            for (int j = 0; j < detalles.size(); j++) {
                DetalleCompra detalle = detalles.get(j);
                System.out.println("   - " + detalle.getCantidad() + "x " + 
                        detalle.getProducto().getNombre() + " (Subtotal: $" + detalle.calcularSubtotal() + ")");
            }
            System.out.println("   -------------------------");
        }
        System.out.println("==========================================");
    }
    
}
