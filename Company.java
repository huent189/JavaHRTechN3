package com.company;

public class Company extends Customer {
    private String name;
    private String phone;
    private String fax;
    private Detaills billing = new Detaills();
    private Detaills shipping = new Detaills();
    private Contact contact = new Contact();


    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    public void setPhone(String temp)
    {
        this.phone = temp;
    }
    public String getPhone()
    {
        return this.phone;
    }

    public void setFax(String temp)
    {
        this.fax = temp;
    }
    public String getFax()
    {
        return this.fax;
    }
}
