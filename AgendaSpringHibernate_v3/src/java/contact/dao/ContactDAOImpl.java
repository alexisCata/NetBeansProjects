/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact.dao;

import java.util.List;
import contact.form.Contact;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addContact(Contact contact) {
        Session session = sessionFactory.openSession();
        session.save(contact);
        session.close();
    }

    @Override
    public List<Contact> listContact() {
        Session session = sessionFactory.openSession();
        List contactList = session.createQuery("from Contact").list();
        session.close();
        return contactList;
    }
    
    @Override
    public Contact getContact(Integer id) {
        Session session = sessionFactory.openSession();
        Contact contact = (Contact) session.get(Contact.class, id);
        session.close();
        return contact;
    }

    @Override
    public void removeContact(Integer id) {
        Session session = sessionFactory.openSession();
        Contact contact = (Contact) session.get(Contact.class, id);
        if (null != contact) {
            session.delete(contact);
            session.flush();
        }
        session.close();
    }

    @Override
    public void modifyContact(Contact contact) {
        Session session = sessionFactory.openSession();
        session.update(contact);
        session.flush();
        session.close();
    }
}
