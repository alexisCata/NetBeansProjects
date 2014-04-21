/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.GrupoMuscular;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class GrupoMuscularDAO {
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
    
    public Integer guardaGrupoMuscular(GrupoMuscular grupom){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(grupom);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaGrupoMuscular(GrupoMuscular grupom) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(grupom);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaGrupoMuscular(GrupoMuscular grupom) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(grupom);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public GrupoMuscular obtenGrupoMuscular(Integer idGrupoMuscular) throws HibernateException{
        
        GrupoMuscular contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (GrupoMuscular) sesion.get(GrupoMuscular.class, idGrupoMuscular);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<GrupoMuscular> obtenListaGrupoMusculars() throws HibernateException{
        
        List<GrupoMuscular> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from GrupoMuscular").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
