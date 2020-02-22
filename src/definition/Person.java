package definition;

public class Person {
    private String firstname;
    private String lastname;
    private String[] contactNo;
    private String email;

    public Person(String firstname, String lastname, String[] contactNo, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.contactNo = contactNo;
        this.email = email;
    }
}
