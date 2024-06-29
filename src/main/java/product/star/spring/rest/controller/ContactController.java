package product.star.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import product.star.spring.rest.facade.ContactFacade;
import product.star.spring.rest.dao.dto.ContactDto;
import product.star.spring.rest.model.Contact;

import java.util.Collection;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactFacade contactFacade;

    @Autowired
    public ContactController(ContactFacade contactFacade) {
        this.contactFacade = contactFacade;
    }

    @PostMapping
    public ContactDto createContact(@RequestParam String firstName,
                                    @RequestParam String lastName,
                                    @RequestParam String phoneNumber,
                                    @RequestParam String email) {
        return contactFacade.createContact(firstName, lastName, phoneNumber, email);
    }

    @GetMapping("/{contactId}")
    public ContactDto getContact(
            @PathVariable long contactId
    ) {
        return contactFacade.getContact(contactId);
    }

    @GetMapping("/")
    public Collection<ContactDto> getAllContact() {
        return contactFacade.getAllContacts();
    }

    @PutMapping("/{contactId}")
    public UpdateResponse updateContact(
            @PathVariable long contactId,
            @RequestBody Contact contact
    ) {
        contactFacade.updateContact(contactId, contact);
        return new UpdateResponse(UpdateResult.SUCCESS);
    }

}
