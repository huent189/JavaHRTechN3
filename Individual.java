package com.company;

public class Individual {
    String firstName;
    String lastName;
    String middleName;
    String email;
    String locale = "English";

    public String getFristName()
    {
        return this.firstName;
    }
    public void setFirstName(String temp)
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
