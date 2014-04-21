/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementaciones;
import datos.Contacto;
import interfaces.IAgenda;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author alexis
 */
public class AgendaTreeMap implements IAgenda{
    
    private TreeMap<String,Contacto> contactos;
    
    public AgendaTreeMap (){
        this.contactos = new TreeMap<String,Contacto>();
    }

    @Override
    public boolean insertarContacto(Contacto contacto) {
        
        contactos.put(contacto.getNombre(), contacto);
        
        return true;
        
    }

    @Override
    public boolean eliminarTelefono(String telefono) {
        
        Collection<Contacto> colContactos = contactos.values();
        
        Iterator<Contacto> it = colContactos.iterator();
        
        while (it.hasNext()){
            
            if (it.next().getTelefono().equals(telefono)){
                
                it.remove();
                
            }
        }
       
        return true;
    }

    public String MostrarTodo() {
       
        String mostrarContactos = null;
        
        Collection<Contacto> colContactos = contactos.values();
        
        Iterator<Contacto> it = colContactos.iterator();
        
        mostrarContactos = "\n";
        
        while (it.hasNext()){
            
            mostrarContactos = mostrarContactos + it.next().toString() + "\n";
                
            }
        
        return mostrarContactos;
    } 
    @Override
    public Collection<Contacto> obtenerContactos() {
        return this.contactos.values();
    }
    
}
