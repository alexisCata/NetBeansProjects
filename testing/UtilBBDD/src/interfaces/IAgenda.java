/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import datos.*;
import java.util.Collection;
/**
 *
 * @author alexis
 */
public interface IAgenda {

    public boolean insertarContacto(Contacto contacto);
    
    public boolean eliminarTelefono(String telefono);
    
    public Collection<Contacto> obtenerContactos();
    
}
