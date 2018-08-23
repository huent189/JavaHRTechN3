package com.company;

public class Customer {
    private String IdCustomer;
    private CustomerType customType;
    private String descriptionCustomer;
    Entitlement entitlement = new Entitlement();
    BatchCode batchCode = new BatchCode();

    public void setId(String id)
    {
        this.IdCustomer = id;
    }

    public String getId()
    {
        return this.IdCustomer;
    }

    public void setCustomerType(CustomerType cus)
    {
        this.customType = cus;
    }
    public CustomerType getCustomerType()
    {
        return this.customType;
    }
    public void setDescriptionCustomer(String des)
    {
        this.descriptionCustomer = des;
    }
    public String getDescriptionCustomer()
    {
        return this.descriptionCustomer;
    }


    public Customer()
    {

    }
    public Customer(CustomerType cus)
    {
        setCustomerType(cus);

    }

    public Customer(String id)
    {
        setId(id);
    }
    public Customer(String id, String des)
    {
        this(id);
        setDescriptionCustomer(des);
    }
    public Customer(String id, CustomerType cus)
    {
        this(id);
        setCustomerType(cus);
    }
}
