package product.star.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import product.star.spring.rest.facade.ContactFacade;
import product.star.spring.rest.dao.dto.ContactDto;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    private final ContactFacade contactFacade;

    @Autowired
    public ContactController(ContactFacade contactFacade) {
        this.contactFacade = contactFacade;
    }

    @PostMapping
    public ContactDto createContact(
        @RequestParam String firstname,
        @RequestParam String lastname,
        @RequestParam String phonenumber,
        @RequestParam String email
    ) {
        return contactFacade.createContact(firstname, lastname, phonenumber, email);
    }

}
