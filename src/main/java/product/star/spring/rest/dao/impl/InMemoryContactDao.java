package product.star.spring.rest.dao.impl;

import product.star.spring.rest.dao.ContactDao;
import product.star.spring.rest.model.Contact;

import java.util.*;

public class InMemoryContactDao implements ContactDao {

    private long contactId = 1L;
    private final Map<Long, Contact> contactMap;

    public InMemoryContactDao() {
        this.contactMap = new HashMap<>();
    }

    @Override
    public Contact addContact(String firstName, String lastName, String phoneNumber, String email) {
        var contact = new Contact(contactId, firstName, lastName, phoneNumber, email);
        contactMap.put(contactId++, contact);
        return contact;
    }

    @Override
    public Optional<Contact> findContact(long contactId) {
        return Optional.ofNullable(contactMap.get(contactId));
    }

    @Override
    public Contact getContact(long contactId) {
        return findContact(contactId)
                .orElseThrow(() -> new IllegalArgumentException("Contact not found: " + contactId));
    }

    @Override
    public Collection<Contact> getAllContacts() {
        return new ArrayList<>(contactMap.values());
    }

    @Override
    public boolean updateContact(long contactId, Contact contact) {
        if (!contactMap.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found: " + contactId);
        }
        contactMap.put(contactId, contact);
        return true;
    }
}
