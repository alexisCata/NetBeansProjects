/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.service;

import java.util.List;
import contact.form.Contact;

public interface ContactService {

    public void addContact(Contact contact);

    public List<Contact> listContact();
    
    public Contact getContact(Integer id);

    public void removeContact(Integer id);
    
    public void modifyContact(Contact contact);
}
