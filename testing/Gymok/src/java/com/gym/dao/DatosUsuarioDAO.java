/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.gym.dao;

import com.gym.entities.DatosUsuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class DatosUsuarioDAO {
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
    
    public Integer guardaDatosUsuario(DatosUsuario datosUsuario){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(datosUsuario);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaDatosUsuario(DatosUsuario datosUsuario) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(datosUsuario);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaDatosUsuario(DatosUsuario datosUsuario) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(datosUsuario);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public DatosUsuario obtenDatosUsuario(Integer idDatosUsuario) throws HibernateException{
        
        DatosUsuario contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (DatosUsuario) sesion.get(DatosUsuario.class, idDatosUsuario);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<DatosUsuario> obtenListaDatosUsuarios() throws HibernateException{
        
        List<DatosUsuario> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from DatosUsuario").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
