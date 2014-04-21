/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.Entreno;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class EntrenoDAO {
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
    
    public Integer guardaEntreno(Entreno entreno){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(entreno);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaEntreno(Entreno entreno) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(entreno);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaEntreno(Entreno entreno) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(entreno);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public Entreno obtenEntreno(Integer idEntreno) throws HibernateException{
        
        Entreno contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (Entreno) sesion.get(Entreno.class, idEntreno);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<Entreno> obtenListaEntrenos() throws HibernateException{
        
        List<Entreno> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from Entreno").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
