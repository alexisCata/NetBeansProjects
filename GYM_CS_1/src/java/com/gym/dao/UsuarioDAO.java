/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.Usuario;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alexis
 */
@Repository
public class UsuarioDAO {
    
    @Autowired
    private SessionFactory sessionFactory;
    
    public void addUsuario(Usuario usuario) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.save(usuario);
        session.close();
    }

    public List<Usuario> listUsuario() {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        List usuarioList = session.createQuery("from Usuario").list();
        session.close();
        return usuarioList;
    }
    
    public Usuario getUsuario(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        Usuario usuario = (Usuario) session.get(Usuario.class, id);
        session.close();
        return usuario;
    }

    public void removeUsuario(Integer id) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        Usuario usuario = (Usuario) session.get(Usuario.class, id);
        if (null != usuario) {
            session.delete(usuario);
            session.flush();
        }
        session.close();
    }

    public void modifyUsuario(Usuario usuario) {
        org.hibernate.classic.Session session = sessionFactory.openSession();
        session.update(usuario);
        session.flush();
        session.close();
    }
    
}
