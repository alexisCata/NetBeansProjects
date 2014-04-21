/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.EjerciciosEntreno;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class EjerciciosEntrenoDAO {
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
    
    public Integer guardaEjerciciosEntreno(EjerciciosEntreno ejerentreno){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(ejerentreno);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaEjerciciosEntreno(EjerciciosEntreno ejerentreno) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(ejerentreno);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaEjerciciosEntreno(EjerciciosEntreno ejerentreno) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(ejerentreno);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public EjerciciosEntreno obtenEjerciciosEntreno(Integer idEjerciciosEntreno) throws HibernateException{
        
        EjerciciosEntreno contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (EjerciciosEntreno) sesion.get(EjerciciosEntreno.class, idEjerciciosEntreno);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<EjerciciosEntreno> obtenListaEjerciciosEntrenos() throws HibernateException{
        
        List<EjerciciosEntreno> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from EjerciciosEntreno").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}

