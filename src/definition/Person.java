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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String[] getContactNo() {
        return contactNo;
    }

    public void setContactNo(String[] contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
