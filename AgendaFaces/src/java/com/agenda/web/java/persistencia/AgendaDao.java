/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.web.java.persistencia;

import com.agenda.web.java.entidades.Contacto;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author davidjgc
 */
public class AgendaDao {

    public static List<Contacto> obtenerContactos() {


        Session sesion = HibernateUtil.getSessionFactory().openSession();

        Query query = sesion.createQuery("from Contacto");
        List<Contacto> contactos = (List<Contacto>) query.list();
        sesion.close();
        return contactos;

    }
}
