package product.star.spring.rest.dao.impl;

import product.star.spring.rest.dao.ContactDao;
import product.star.spring.rest.model.Contact;

import java.util.Optional;

public class InMemoryContactDao implements ContactDao {

    private long contactId = 1L;


    @Override
    public Contact addContact(String firstName, String lastName, String phoneNumber, String email) {
        return null;
    }

    @Override
    public Optional<Contact> findContact(long contactId) {
        return Optional.empty();
    }

    @Override
    public Contact getContact(long contactId) {
        return null;
    }
}
