package product.star.spring.rest.dao;

import product.star.spring.rest.model.Contact;

import java.util.Collection;
import java.util.Optional;

public interface ContactDao {

    Contact addContact(String firstName, String lastName, String phoneNumber, String email);
    Optional<Contact> findContact(long contactId);
    Contact getContact(long contactId);
    Collection<Contact> getAllContacts();
    boolean updateContact(long contactId, Contact contact);
}
