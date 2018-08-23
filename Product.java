package com.company;

public class Product {
    private int idProduce;
    private String name;
    private LockingType lockingType;
    private Rehost rehost;
    private String descriptionProduce;

    BatchCode batchCode = new BatchCode();
    Entitlement entitlement = new Entitlement();

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
