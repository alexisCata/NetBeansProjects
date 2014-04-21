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
 * @author davidjgc
 */
public class AgendaArrays implements IAgenda{
    
    public static final int MAXCONTACTOS=10;
    private Contacto agenda[];
            

    @Override
    public boolean insertarContacto(Contacto contacto) {
        return false;
        
    }

    @Override
    public boolean eliminarContacto(String telefono) {
        return false;

    }

    @Override
    public Collection<Contacto> obtenerContactos() {
        return null;

    }
    
    
    
}
