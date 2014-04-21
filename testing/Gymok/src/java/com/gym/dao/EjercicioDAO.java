/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.Ejercicio;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class EjercicioDAO {
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
    
    public Integer guardaEjercicio(Ejercicio ejercicio){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(ejercicio);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaEjercicio(Ejercicio ejercicio) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(ejercicio);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaEjercicio(Ejercicio ejercicio) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(ejercicio);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public Ejercicio obtenEjercicio(Integer idEjercicio) throws HibernateException{
        
        Ejercicio contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (Ejercicio) sesion.get(Ejercicio.class, idEjercicio);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<Ejercicio> obtenListaEjercicios() throws HibernateException{
        
        List<Ejercicio> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from Ejercicio").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
