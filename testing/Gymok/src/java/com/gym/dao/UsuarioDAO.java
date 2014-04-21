/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class UsuarioDAO {
    private Session sesion;
    private Transaction tx;
    
    private void iniciaOperacion() throws HibernateException{
        
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
        
    }
    
    private void manejaExcepcion (HibernateException he) throws HibernateException{
        tx.rollback();
        throw new HibernateException("Ocurrió un error en la capa de acceso a datos",he);
    }
    
    public Integer guardaUsuario(Usuario usuario){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(usuario);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaUsuario(Usuario usuario) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(usuario);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaUsuario(Usuario usuario) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(usuario);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public Usuario obtenUsuario(Integer idUsuario) throws HibernateException{
        
        Usuario contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (Usuario) sesion.get(Usuario.class, idUsuario);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<Usuario> obtenListaUsuarios() throws HibernateException{
        
        List<Usuario> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from Usuario").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
