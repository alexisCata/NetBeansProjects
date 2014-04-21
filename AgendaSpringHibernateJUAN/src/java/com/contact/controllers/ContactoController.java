/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contact.controllers;

import com.contact.entities.Contacto;
import com.contact.service.ContactoServicio;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author davidjgc
 */
@Controller
 //@Transactional
public class ContactoController {

     @Autowired
     private ContactoServicio contactoService;

// -------------------------------------- INDEX -----------------------------------------------
     @RequestMapping("/index")
     public String Index() {
        // Cargamos la vista del index
        return "index";
     }
//---------------------------------------------------------------------------------------------


// --------------------------------- MOSTRAR_CONTACTOS ------------------------------------------
     @RequestMapping("/showContactos")
     public String showContactos(Map<String, Object> map) {
         
        map.put("contactList", this.contactoService.listContactos());
        
        // Cargamos la vista de mostrar_contactos
        return "mostrar_contactos";
     }
//---------------------------------------------------------------------------------------------

     
// ---------------------------------AÑADIR_CONTACTO----------------------------------------------
     @RequestMapping("/addContacto")
     public String formContacto(Map<String, Object> map) {
         
        // Cargamos en un Map el contacto y la lista de contactos del DAO
        map.put("contactoForm", new Contacto());

        // Redireccionamos al index
        return "aniadir_contacto";
     }
    
    // Buscamos la direccion "/add" y ejecutamos el metodo
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contacto") Contacto contacto, BindingResult result) {

        // Si hay errores, volvemos al index.jsp
        if (result.hasErrors()) {
            return "aniadir_contacto";
        }

        // Añadimos el contacto
        this.contactoService.addContacto(contacto);

        // Redireccionamos al index.jsp
        return "redirect:./showContactos";
    }

    // Buscamos la direccion "/delete/", le pasamos el "contactId" y ejecutamos el metodo
    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {

        // Borramos el contacto
        this.contactoService.removeContacto(contactId);

        // Redireccionamos al index.jsp
        return "redirect:../showContactos";
    }
//---------------------------------------------------------------------------------------------

// ---------------------------------BUSCAR_CONTACTO----------------------------------------------
    @RequestMapping(value = "/buscarContactos", method = RequestMethod.GET)
    public String buscarContacto(Map<String, Object> map) {
        
        map.put("contactList", this.contactoService.listContactos());
        
        // Redireccionamos al buscar_contacto.jsp
        return "buscar_contacto";
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateContacto(String telefono, Map<String, Object> map) {
        
        List<Contacto> contactList = new ArrayList();
        Contacto contacto;
        
        // Enviamos al "mostrar_contactos.jsp" una lista con el contacto que se ha
        // encontrado al filtrar por telefono.
        
        contacto = this.contactoService.getContacto(telefono);
        
        contactList.add(contacto);
        
        map.put("contactList", contactList);
        
        // Redireccionamos al buscar_contacto.jsp
        return "mostrar_contactos";
    }
//---------------------------------------------------------------------------------------------
}
