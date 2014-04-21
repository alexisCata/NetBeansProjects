/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.AccesoUsuario;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexis
 */
@Repository
public class AccesoUsuarioDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void addAccesoUsuario(AccesoUsuario accesoUsuario) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.save(accesoUsuario);
        session.close();
    }

    //public List<AccesoUsuario> listAccesoUsuario() {
    //    org.hibernate.classic.Session session = sessionFactory.openSession();
    //    List accesoUsuarioList = session.createQuery("from AccesoUsuario").list();
    //    session.close();
    //    return accesoUsuarioList;
    //}
    
//    public AccesoUsuario getAccesoUsuario(Integer id) {
//        org.hibernate.classic.Session session = sessionFactory.openSession();
//        AccesoUsuario accesoUsuario = (AccesoUsuario) session.get(AccesoUsuario.class, id);
//        session.close();
//        return accesoUsuario;
//    }
    
    public AccesoUsuario getAccesoUsuario(String login, String password) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        
        Collection<String> param = new ArrayList<String>();
        param.add(login);
        param.add(password);
        
        AccesoUsuario accesoUsuario = (AccesoUsuario) session.createQuery("from AccesoUsuario "
                + "where login = :login and password = :password")
                .setParameter("login", login)
                .setParameter("password", password).uniqueResult();
                
        
        session.close();
        return accesoUsuario;
    }

    public void removeAccesoUsuario(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        AccesoUsuario accesoUsuario = (AccesoUsuario) session.get(AccesoUsuario.class, id);
        if (null != accesoUsuario) {
            session.delete(accesoUsuario);
            session.flush();
        }
        session.close();
    }

    //public void modifyAccesoUsuario(AccesoUsuario accesoUsuario) {
    //    org.hibernate.classic.Session session = sessionFactory.openSession();
    //    session.update(accesoUsuario);
    //    session.flush();
    //    session.close();
    //}
    
}
