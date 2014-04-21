/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.contact.dao;

import com.contact.entities.Contacto;
import java.util.List;

/**
 *
 * @author davidjgc
 */
public interface ContactoDAO {
     
    public void addContacto(Contacto contact);
    public List<Contacto> listContactos();
    public Contacto getContacto(String telefono);
    public void removeContacto(long id);
    public void removeContactoByTelefono(String telefono);
    public void updateContactoByTelefono(String telefono);

}
