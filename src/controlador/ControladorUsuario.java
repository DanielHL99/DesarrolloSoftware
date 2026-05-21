/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import modelo.ADMIN;
import modelo.Cliente;
import modelo.Usuario;

/**
 *
 * @author LUZ ELENA
 */
public class ControladorUsuario {
    ArrayList<Usuario> usuarios;

    public ControladorUsuario() {
        this.usuarios = new ArrayList<>();
        ADMIN admin = new ADMIN(123, "Mario", "123");
        
    }
    
    public boolean registrarse (Usuario usuario){ 
        Usuario temp = buscar(usuario.getId());
        if(temp == null){
            usuarios.add(usuario);        
        }
        return true;
    }
    
    public Usuario buscar (int id){
        for (int i = 0; i < usuarios.size(); i++) {
            return usuarios.get(i);
        }
        return null;
    } 
    
    public ArrayList<Usuario> getLista(){
        return usuarios;
    }
    
    public boolean login(Usuario usuario){
        if (usuario instanceof ADMIN admin){
            if (admin.getId()== usuario.getId() && admin.getContraseña().equals(usuario.getContraseña())){
                return true;
            }
        }
        if(usuario instanceof Cliente cliente){
            if(cliente.getId() == usuario.getId() && cliente.getContraseña().equals(usuario.getContraseña()) ){
                return true;
            }
        }
        return false;
    }
}
