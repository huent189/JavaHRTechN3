package BaiTap;

class Company extends Customer{
    private String name;
    private String phone;
    private String fax;
/** set gia tri*/
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public void setFax(String fax)
    {
        this.fax = fax;
    }

    /** lay gia tri*/
    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }
    /** compositon*/
    private Detail detail2 = new Detail();
    private Contact contac1 = new Contact();
}
