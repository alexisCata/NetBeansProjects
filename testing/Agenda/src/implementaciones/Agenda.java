/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package implementaciones;

import datos.Contacto;
import interfaces.IAgenda;
import java.util.Collection;

/**
 *
 * @author alexis
 */

public class Agenda implements IAgenda{

    private Contacto contactos[];
    
    public Agenda(){
        this.contactos = new Contacto[5];
    }
    
    
    public boolean insertarContacto(Contacto unContacto) {
        
        Integer indice;
        
        //Lo correcto es hacerlo con un WHILE
        for (indice = 0; indice < this.contactos.length; indice++){
            if (this.contactos[indice] == null){
                this.contactos[indice] = unContacto;
                //indice = this.contactos.length+10;
                break;

            }
        }

        return true;
        
    }

    @Override
    public boolean eliminarTelefono(String telefono) {
        
        Integer indice;
        String telf;
        
        for (indice = 0; indice < this.contactos.length; indice++){
            
            if (this.contactos[indice] != null){
                
                telf = this.contactos[indice].getTelefono();

                if (telf.equals(telefono)){
                    this.contactos[indice] = null;
                }
            }
        }
        
        return false;
        
    }

    public String MostrarTodo() {
        
        Integer indice;
        String mostrarContactos = "";
        
        
        for (indice = 0; indice < this.contactos.length; indice++){
            
            if (this.contactos[indice] != null){
                mostrarContactos += this.contactos[indice].toString() + "\n";
            }
        }

        return mostrarContactos;
    }    
    
    @Override
    public Collection<Contacto> obtenerContactos() {
        return null;
        
    }
    
}
