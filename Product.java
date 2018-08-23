package com.company;

public class Product {
    int idProduce;
    String name;
    LockingType lockingType;
    Rehost rehost;
    String descriptionProduce;

    public void setId(int temp)
    {
        this.idProduce = temp;
    }
    public int getId()
    {
        return this.idProduce;
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

    public void setDescription(String temp)
    {
        this.descriptionProduce = temp;
    }
    public String getDescription()
    {
        return this.descriptionProduce;
    }


}
