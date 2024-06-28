package product.star.spring.rest.dao.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import product.star.spring.rest.model.Contact;

public class ContactDto {
    @JsonProperty("contactId")
    private final long contactId;
    @JsonProperty("firstName")
    private final String firstName;
    @JsonProperty("lastName")
    private final String lastName;
    @JsonProperty("phoneNumber")
    private final String phoneNumber;
    @JsonProperty("email")
    private final String email;

    public ContactDto(Contact contact) {
        this.contactId = contact.getId();
        this.firstName = contact.getFirstName();
        this.lastName = contact.getLastName();
        this.phoneNumber = contact.getPhoneNumber();
        this.email = contact.getEmail();
    }

    public long getContactId() {
        return contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
