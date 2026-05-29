/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.Cliente;
import modelo.Torneo;

/**
 *
 * @author LUZ ELENA
 */
public class ControladorAdmin {
    
    ArrayList<Torneo> listaTorneos;
    
    public ControladorAdmin(){
        this.listaTorneos = new ArrayList<>();
        
    }
    
    public boolean CrearTorneo(int id, String nombre, String fecha, int cupoMax, int numeroParticipantes, String premios){
        if(buscarTorneo(id)!= null){
            System.out.println("Error: Ya existe un torneo registrado con el ID " + id);
            return false;
        }
        
        Torneo nuevoTorneo = new Torneo(id, nombre, fecha, cupoMax, numeroParticipantes, premios);
        listaTorneos.add(nuevoTorneo);
        System.out.println("Torneo" + nombre + "Creado correctamente");
        return true; 
    }
    
    public boolean inscribirClienteEnTorneo(int idTorneo, Cliente cliente){
        Torneo torneoTemp = buscarTorneo(idTorneo);
        if(torneoTemp == null){
            System.out.println("Torneo no existe");
            return false;
        }
        
        boolean exitoInscripcion = torneoTemp.AgregarParticipante(cliente);
        
        if(exitoInscripcion){
            System.out.println("Inscripcion exitosa");
            return true;
        }else{
            System.out.println("No se pudo procesar la inscripcion");
            return false;
        }
    }
    
    public Torneo buscarTorneo(int id) {
        for (int i = 0; i < listaTorneos.size(); i++) {
            if (listaTorneos.get(i).getId() == id) {
                return listaTorneos.get(i);
            }
        }
        return null; 
    }
    
    public ArrayList<Torneo> getListaTorneos(){
        return listaTorneos;
    }      
}
