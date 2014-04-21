/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import entidades.ContactoH;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author alexis
 */
public class ContactoDAO {
    
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
    
    public Integer guardaContacto(ContactoH contacto){
        Integer id = 0;
        
        try{
            iniciaOperacion();
            id = (Integer)sesion.save(contacto);
            tx.commit();
        }catch(HibernateException he){
            manejaExcepcion(he);
            throw he;
        }finally{
            sesion.close();
        }
        return id;
    }
    
    public void actualizaContacto(ContactoH contacto) throws HibernateException{
        
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
    
    public void eliminaContacto(ContactoH contacto) throws HibernateException{
        
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
    
    public ContactoH obtenContacto(Integer idContacto) throws HibernateException{
        
        ContactoH contacto = null;
        
        try{
            iniciaOperacion();
            contacto = (ContactoH) sesion.get(ContactoH.class, idContacto);
        }finally{
            sesion.close();
        }
        return contacto;
    }
    
    public List<ContactoH> obtenListaContactos() throws HibernateException{
        
        List<ContactoH> listaContactos = null;
        
        try{
            iniciaOperacion();
            listaContactos = sesion.createQuery("from ContactoH").list();
            
        }finally{
            sesion.close();
        }
        return listaContactos;
    }
    
}
