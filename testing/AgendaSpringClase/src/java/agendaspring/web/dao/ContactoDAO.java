/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agendaspring.web.dao;

import agendaspring.web.entidades.Contacto;
import java.util.List;

/**
 *
 * @author davidjgc
 */
public interface ContactoDAO {
     
    public void addContacto(Contacto contact);
    public List<Contacto> listContactos();
    public void removeContacto(Integer id);
        public void removeContactoByTelefono(String telefono);

}
