package com.company;

import java.lang.String;

public class Feature
{
    int idFeature;
    String name; // size name <= 50
    String description;

    public void setId(int temp)
    {
        this.idFeature = temp;
    }
    public int getId()
    {
        return this.idFeature;
    }

    public void setDescription(String temp)
    {
        this.description = temp;
    }
    public String getDescription()
    {
        return this.description;
    }

    public boolean checkNameSize(String name)
    {
        return name.length() <= 50;
    }

    public void setName(String temp)
    {
        if(checkNameSize(temp))
        {
            this.name = temp;
        }
        else
        {
            System.out.println("Input Error");
        }
    }
    public String getName()
    {
        return this.name;
    }
}
