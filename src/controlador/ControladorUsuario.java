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
        this.usuarios.add(admin);
        
    }
    
    public boolean registrarse (Usuario usuario){ 
        Usuario temp = buscar(usuario.getId());
        if(temp == null){
            usuarios.add(usuario);
            return true;
        }
        return false;
    }
    
    public Usuario buscar (int id){
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getId() == id){
                return usuarios.get(i);
            }
            
        }
        return null;
    } 
    
    public ArrayList<Usuario> getLista(){
        return usuarios;
    }
    
    public boolean login(Usuario usuarioInte){
        if(usuarioInte == null){
            return false;
        }
        
        Usuario usuarioRegistrado = buscar(usuarioInte.getId());
        
        if(usuarioRegistrado == null){
            System.out.println("Usuario o contraseña incorrectos");
            return false;
        }
        
        if (usuarioRegistrado.getContraseña().equals(usuarioInte.getContraseña())){
            
            if(usuarioRegistrado instanceof ADMIN){
                System.out.println("¡Bienvenido Administrador: " + usuarioRegistrado.getNombre() + "!");
            } else if (usuarioRegistrado instanceof Cliente){
                System.out.println("¡Bienvenido");
            }
            return true;
            
        }else{
            System.out.println("Usuario o contraseña incorrectos");
            return false;
        }
        

    }
    
    //        if (usuario instanceof ADMIN admin){
//            if (admin.getId()== usuarios.get(i).ge && admin.getContraseña().equals(usuario.getContraseña())){
//                return true;
//            }else{
//                System.out.println("Usuario o contraseña incorrectos");
//            }
//        }
//        if(usuario instanceof Cliente cliente){
//            if(cliente.getId() == usuario.getId() && cliente.getContraseña().equals(usuario.getContraseña()) ){
//                return true;
//            }else{
//                System.out.println("Usuario o contraseña incorrectos");
//            }
//        }
//        return false;
    
}
