/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agenda.web.java.beans;

import com.agenda.web.java.entidades.Contacto;
import com.agenda.web.java.persistencia.ContactoDao;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class ContactoBean extends Contacto {

    private String outcome = "menu";

    public ContactoBean() {
        //  nombre = "Nombre del contacto";
    }

    public String outcome() {
        return outcome;
    }

    public void printIt(ActionEvent event) {

        //Get submit button id
        String buttonId = event.getComponent().getClientId();
        System.out.println("buttonId " + buttonId);
    }

    public void guardarContacto(ActionEvent event) {
  //       public void guardarContacto() {


       //en este caso no seria necesario
     //   ContactoBean contactoBean = (ContactoBean) FacesContext.getCurrentInstance().
      //                getExternalContext().getRequestMap().get("contactoBean");


           Contacto contacto = new Contacto();
          contacto.setNombre(getNombre());
          contacto.setApellido(getApellido());
          contacto.setTelefono(getTelefono());

         //     System.out.println("llego aqui?" );
          
        boolean guardado = ContactoDao.guardar(contacto);

        if (!guardado) {
            outcome = "error";
        }
    }


    public void eliminarContacto(ActionEvent event) {

         ContactoBean contactoBean = (ContactoBean) FacesContext.getCurrentInstance().
                getExternalContext().getSessionMap().get("contactoBean");

        Contacto contacto = new Contacto();
        
             contacto.setNombre(getNombre());
          contacto.setApellido(getApellido());
          contacto.setTelefono(getTelefono());
        
    
        
        //contacto.setNombre(contactoBean.getNombre());
       // contacto.setApellido(contactoBean.getApellido());
        //contacto.setTelefono(contactoBean.getTelefono());

         /*   if (contactoBean.getNombre()!=null){
         contacto.setNombre(contactoBean.getNombre());
        }
        */
        
        
  
        Boolean eliminado = ContactoDao.eliminar(contacto);

        if (!eliminado) {
            outcome = "error";
        }
    }
}
