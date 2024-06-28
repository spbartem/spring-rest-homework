package product.star.spring.rest.model;

public class Contact {
    private final long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    public Contact(long id, String firstName, String lastName, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
