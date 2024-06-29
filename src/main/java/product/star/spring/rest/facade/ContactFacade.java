package product.star.spring.rest.facade;

import org.springframework.stereotype.Service;
import product.star.spring.rest.dao.ContactDao;
import product.star.spring.rest.dao.dto.ContactDto;
import product.star.spring.rest.model.Contact;

import java.util.Collection;

@Service
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

        return contactDao.getAllContacts().stream()
                .map(ContactDto::new)
                .toList();
    }

    public boolean updateContact(long contactId, Contact contact) {

        return contactDao.updateContact(contactId, contact);
    }
}
