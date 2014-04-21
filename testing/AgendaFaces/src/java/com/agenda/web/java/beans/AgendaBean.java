/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.web.java.beans;

import com.agenda.web.java.entidades.Contacto;
import com.agenda.web.java.persistencia.AgendaDao;
import com.agenda.web.java.persistencia.HibernateUtil;
import java.io.Serializable;
import java.util.*;
import javax.faces.bean.*;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author davidjgc
 */
@ManagedBean
@SessionScoped
public class AgendaBean implements Serializable {

    List<Contacto> contactos;

    public AgendaBean() {
        contactos = new ArrayList();
    }

   
    
    public List<Contacto> getContactos() {

        contactos = AgendaDao.obtenerContactos();

        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }
}
