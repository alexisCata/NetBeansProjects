/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;


import com.gym.entities.GrupoMuscular;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexis
 */
@Repository
public class GrupoMuscularDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void addGrupoMuscular(GrupoMuscular grupo) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.save(grupo);
        session.close();
    }

    public List<GrupoMuscular> listGrupoMuscular() {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        List grupoList = session.createQuery("from GrupoMuscular").list();
        session.close();
        return grupoList;
    }
    
    public GrupoMuscular getGrupoMuscular(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        GrupoMuscular grupo = (GrupoMuscular) session.get(GrupoMuscular.class, id);
        session.close();
        return grupo;
    }

    public void removeGrupoMuscular(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        GrupoMuscular grupo = (GrupoMuscular) session.get(GrupoMuscular.class, id);
        if (null != grupo) {
            session.delete(grupo);
            session.flush();
        }
        session.close();
    }

    public void modifyGrupoMuscular(GrupoMuscular grupo) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.update(grupo);
        session.flush();
        session.close();
    }
    
}


