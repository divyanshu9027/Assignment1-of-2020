package definition;

public class Person {
    private String firstname;
    private String lastname;
    private String[] contactNo;
    private String email;
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
        sb.append("First Name: ").append(firstname).append('\n');
        sb.append("Last Name: ").append(lastname).append('\n');
        sb.append("Contact No: ");
        for (int i = 0; i < contactNo.length; i++) {
            sb.append((contactNo[0] != null && i == 0 ? contactNo[0] : "") + (contactNo[1] != null && i == 1 ? ", " + contactNo[1] : "") +
                    (contactNo[2] != null && i == 2 ? ", " + contactNo[i] : ""));
        }
        sb.append("\nEmail: ").append(email).append('\n');
        sb.append("-------- * -------- * -------- * --------\n");
        return sb.toString();
    }

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
