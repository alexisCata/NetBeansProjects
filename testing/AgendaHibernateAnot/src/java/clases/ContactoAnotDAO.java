/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import entidades.ContactoAnot;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author alexis
 */
public class ContactoAnotDAO {
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
    
    public Integer guardaContacto(ContactoAnot contacto){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(contacto);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            //throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaContacto(ContactoAnot contacto) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.update(contacto);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public void eliminaContacto(ContactoAnot contacto) throws HibernateException{
        
        try{
            iniciaOperacion();
           sesion.delete(contacto);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
    }
    
    public ContactoAnot obtenContacto(Integer idContacto) throws HibernateException{
        
        ContactoAnot contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (ContactoAnot) sesion.get(ContactoAnot.class, idContacto);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<ContactoAnot> obtenListaContactos() throws HibernateException{
        
        List<ContactoAnot> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from ContactoAnot").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
