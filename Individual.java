package com.company;

class Individual extends Customer {
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String locale = "English";
    private Detaills billing = new Detaills();
    private Detaills shipping = new Detaills();

    public String getFristNameIndidual()
    {
        return this.firstName;
    }
    public void setFirstNameIndidual(String temp)
    {
        this.firstName = temp;
    }

    public void setLastName(String temp)
    {
        this.lastName = temp;
    }
    public String getLastName()
    {
        return this.lastName;
    }

    public void setMiddleName(String temp)
    {
        this.middleName = temp;
    }
    public String getMiddleName()
    {
        return this.middleName;
    }

    public void setEmail(String temp)
    {
        this.email = temp;
    }
    public String getEmail()
    {
        return this.email;
    }
}
