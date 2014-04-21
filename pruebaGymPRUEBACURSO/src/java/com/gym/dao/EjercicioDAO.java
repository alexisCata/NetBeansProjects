/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.Ejercicio;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexis
 */
@Repository
public class EjercicioDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void addEjercicio(Ejercicio ejercicio) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.save(ejercicio);
        session.close();
    }

    public List<Ejercicio> listEjercicio() {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        List ejercicioList = session.createQuery("from Ejercicio").list();
        session.close();
        return ejercicioList;
    }
    
    public Ejercicio getEjercicio(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        Ejercicio ejercicio = (Ejercicio) session.get(Ejercicio.class, id);
        session.close();
        return ejercicio;
    }

    public void removeEjercicio(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        Ejercicio ejercicio = (Ejercicio) session.get(Ejercicio.class, id);
        if (null != ejercicio) {
            session.delete(ejercicio);
            session.flush();
        }
        session.close();
    }

    public void modifyEjercicio(Ejercicio ejercicio) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.update(ejercicio);
        session.flush();
        session.close();
    }
    
}


