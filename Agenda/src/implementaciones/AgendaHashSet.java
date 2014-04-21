/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementaciones;

import datos.Contacto;
import interfaces.IAgenda;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author alexis
 */
public class AgendaHashSet implements IAgenda{

    private Collection<Contacto> contactos;
    
     public AgendaHashSet(){
        this.contactos = new HashSet();
    }
    
    @Override
    public boolean insertarContacto(Contacto unContacto) {
        
        contactos.add(unContacto);
        
        return true;
        
    }

    @Override
    public boolean eliminarTelefono(String telefono) {
        
        Iterator<Contacto> it = contactos.iterator();
        
        while (it.hasNext()){
            
            if (it.next().getTelefono().equals(telefono)){
                
                it.remove();
                
            }
        }
       
        return true;
        
    }
    
    public String MostrarTodo() {
        
        String mostrarContactos = null;
        
        Iterator<Contacto> it = contactos.iterator();
        
        mostrarContactos = "\n";
        
        while (it.hasNext()){
            
            mostrarContactos = mostrarContactos + it.next().toString() + "\n";
                
            }
        
        return mostrarContactos;
    }      

    @Override
    public  Collection<Contacto> obtenerContactos() {
        return contactos;
    }
    
}
