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
public class Torneo {
    
    private int id;
    private String nombre;
    private String fecha;
    private int cupoMax;
    private int numeroParticipantes;
    private String premios;

    private ArrayList<Cliente> participantesInscritos;

    public Torneo(int id, String nombre, String fecha, int cupoMax, int numeroParticipantes, String premios) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cupoMax = cupoMax;
        this.numeroParticipantes = numeroParticipantes;
        this.premios = premios;
        this.participantesInscritos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public int getCupoMax() {
        return cupoMax;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public String getPremios() {
        return premios;
    }

    public ArrayList<Cliente> getParticipantesInscritos() {
        return participantesInscritos;
    }
    
    
    
    public boolean AgregarParticipante(Cliente nuevoParticipante){
        if(participantesInscritos.size() <= cupoMax){
            System.out.println("Error: El torneo ya alcanzó el número máximo de participantes.");
        return false;
        }
        
        for (int i = 0; i < participantesInscritos.size(); i++) {
            if(participantesInscritos.get(i).getId()== nuevoParticipante.getId()){
                System.out.println("ID"+ nuevoParticipante.getId() +"ya inscrito" );
            return false;
            }
        }
        participantesInscritos.add(nuevoParticipante);
        return true;
    }
     
}
