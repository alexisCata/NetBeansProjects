/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;


import com.entities.Contacto;
import com.service.ContactoServicio;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

/**
 *
 * @author davidjgc
 */
@Controller
 //@Transactional
public class ContactoController {

    @Autowired
    private ContactoServicio contactoService;

     @RequestMapping("/index")
     public String listContacts(Map<String, Object> map) {
         
     System.out.println("Entro en /index");

     map.put("contactoForm", new Contacto());
     map.put("contactList", contactoService.listContactos());

     return "contacto";
     }
     
   /* @RequestMapping("/index")
    public ModelAndView handleRequest(
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        Map<String, Object> map = new HashMap();
        map.put("contactoForm", new Contacto());
        map.put("contactList", contactoService.listContactos());

        System.out.println("Devolviendo la vista 'contacto'");

        return new ModelAndView("contacto", map);

    }
*/
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@ModelAttribute("contacto") Contacto contacto, BindingResult result) {

        if (result.hasErrors()) {
            return "index";
        }

        contactoService.addContacto(contacto);

        return "redirect:./index";
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {

        contactoService.removeContacto(contactId);
        
        System.out.println("Antes de redireccionar en deleteCOntact");

        return "redirect:../index";
    }

}
