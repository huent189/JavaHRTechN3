package BaiTap;

class Individual extends Customer{
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
    private String locale = "English";
    /**khoi tao gia tri ban dau*/
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName)
    {
        this.middleName = middleName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
/** lay gia tri*/
    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLocale() {
        return locale;
    }
    /**constructor*/
    public Individual(String firstName, String middleName, String lastName, String email, String phone, String locale)
    {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.phone;
        this.locale = locale;
    }
    /** composition*/
    private Detail detail1 = new Detail();
}
