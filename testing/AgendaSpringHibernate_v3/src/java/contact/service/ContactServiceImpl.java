/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import contact.dao.ContactDAO;
import contact.form.Contact;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {
        return contactDAO.listContact();
    }
    
    @Transactional
    public Contact getContact(Integer id) {
        return contactDAO.getContact(id);
    }

    @Transactional
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }

    @Override
    public void modifyContact(Contact contact) {
        contactDAO.modifyContact(contact);
    }
}
