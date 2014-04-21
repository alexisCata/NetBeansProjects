/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.controller;

import contact.form.Address;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import contact.form.Contact;
import contact.form.ContactValidator;
import contact.service.ContactService;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;
    
    @RequestMapping("/index")
    public String showIndex() {
        return "index";
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addContact(Map<String, Object> map) {
        map.put("contact", new Contact());
        return "addcontact"; 
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addContact(@Valid Contact contact, BindingResult result) {
        if (result.hasErrors()) {
            return "addcontact";
        }
        contactService.addContact(contact);
        return "redirect:./show";
    }
    
    @RequestMapping(value = "/show")
    public String showContact(Map<String, Object> map) {
        map.put("contactList", contactService.listContact());
        return "showcontact";
    }

    @RequestMapping("/delete/{contactId}")
    public String deleteContact(@PathVariable("contactId") Integer contactId) {
        contactService.removeContact(contactId);
        return "redirect:../show";
    }
    
    @RequestMapping(value = "/modify/{contact.id}", method = RequestMethod.GET)
    public String modifyContact(@PathVariable("contact.id") Integer contactId, Map<String, Object> map) {
        map.put("contact", contactService.getContact(contactId));
        return "modifycontact";
    }

    
    @RequestMapping(value = "/modify/{contact.id}", method = RequestMethod.POST)
    public String modifyContact(@Valid Contact contact, BindingResult result, @PathVariable("contact.id") Integer contactId) {
        contact.setId(contactId);
        if (result.hasErrors()) {
            return "modifycontact";
        }
        contactService.modifyContact(contact);
        return "redirect:../show";
    }
    
        
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new ContactValidator()); // registramos el validador
    }
}

/**
 * Separar controladores
 * Modificar contacto en lugar de crear nuevo contacto y copiar atributos
 * Validaciones no funcionan correctamente
*/