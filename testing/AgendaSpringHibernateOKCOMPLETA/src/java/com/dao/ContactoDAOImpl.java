/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;


import com.entities.Contacto;
import java.util.List;
import javax.annotation.Resource;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author davidjgc
 */
@Repository
@Transactional
public class ContactoDAOImpl implements ContactoDAO {

    //@Resource(name="sessionFactory")
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addContacto(Contacto contact) {
        Session sesion = sessionFactory.openSession();

        sesion.save(contact);
        
        sesion.close();

    }

    @Override
    public List<Contacto> listContactos() {
        Session sesion = sessionFactory.openSession();
        List listaContactos = sesion.createQuery("from Contacto")
                .list();

        sesion.close();
        return listaContactos;
        // return sessionFactory.getCurrentSession().createQuery("from Contacto")
        //       .list();
    }

    @Override
    public void removeContacto(Integer id) {
        System.out.println("removeContacto en DAOImpl");
        Session sesion = sessionFactory.openSession();
        Contacto contacto = (Contacto) sesion.get(Contacto.class, id);
        if (null != contacto) {
            
            sesion.delete(contacto);
            sesion.flush();
            System.out.println("Elimina  en DAOImpl2");
        }
           System.out.println("removeContacto en DAOImpl2");
        sesion.close();

    }

    @Override
    public void removeContactoByTelefono(String telefono) {
        
        Session sesion = sessionFactory.openSession();
        
        Query query = sesion.createQuery("delete Contacto where telefono = :telefono");
        query.setParameter("telefono", telefono);
        int result = query.executeUpdate();
        
        sesion.close();
        
        
        
    }

}
