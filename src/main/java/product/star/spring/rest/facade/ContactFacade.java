package product.star.spring.rest.facade;

import product.star.spring.rest.dao.ContactDao;
import product.star.spring.rest.dao.dto.ContactDto;
import product.star.spring.rest.model.Contact;

import java.util.ArrayList;
import java.util.Collection;

public class ContactFacade {

    private final ContactDao contactDao;

    public ContactFacade(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public ContactDto createContact(String firstName, String lastName, String phoneNumber, String email) {
        var contact = contactDao.addContact(firstName, lastName, phoneNumber, email);
        return new ContactDto(contact);
    }

    public ContactDto getContact(long contactId) {
        var contact = contactDao.getContact(contactId);
        return new ContactDto(contact);
    }

    public Collection<ContactDto> getAllContacts() {
        //TODO update to stream api

        ArrayList<ContactDto> listOfContactDto = new ArrayList<>();
        var listOfContacts = contactDao.getAllContacts();
        for (Contact contact : listOfContacts) {
            listOfContactDto.add(new ContactDto(contact));
        }
        return listOfContactDto;
    }
}
