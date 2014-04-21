/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.service;

import com.contact.dao.ContactoDAO;
import com.contact.entities.Contacto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author davidjgc
 */
@Service
public class ContactoServicioImpl implements ContactoServicio {

    @Autowired
    private ContactoDAO contactDAO;

    @Transactional
    @Override
    public void addContacto(Contacto contact) {
        contactDAO.addContacto(contact);
    }

    @Transactional
    @Override
    public List<Contacto> listContactos() {
        return contactDAO.listContactos();
    }

    @Transactional
    @Override
    public void removeContacto(long id) {
        contactDAO.removeContacto(id);
    }

    @Override
    public void removeContactoByTelefono(String telefono) {
        contactDAO.removeContactoByTelefono(telefono);
    }

    @Override
    public void updateContactoByTelefono(String telefono){
        contactDAO.updateContactoByTelefono(telefono);
    }

    @Override
    public Contacto getContacto(String telefono) {
        Contacto contacto = contactDAO.getContacto(telefono);
        return contacto;
    }
    
}
