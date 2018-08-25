package BaiTap;

public class Contact {
    private String firstName;
    private String lastName;
    private String middleNmae;
    private String email;
    private String locale = "English";
/** set gia tri*/
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleNmae(String middleNmae) {
        this.middleNmae = middleNmae;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /** lay gia tri*/

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleNmae() {
        return middleNmae;
    }

    public String getEmail() {
        return email;
    }

    /** constructor*/
    public Contact(String firstName, String middleNmae, String lastName, String email, String locale)
    {
        this.firstName = firstName;
        this.middleNmae = middleNmae;
        this.lastName = lastName;
        this.email = email;
        this.locale = locale;
    }
}
