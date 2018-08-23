package com.company;

import java.util.Date;

public class Entitlement extends Customer {
    Customer cus;
    String idEntitlement;
    EntetilementType entetilementType;
    Date startDate;
    Date endDate;
    Boolean neverExpries = true;
    String commentEntitlement;

    public void setId(String id)
    {
        this.idEntitlement = id;

    }
    public String getId()
    {
        return this.idEntitlement;
    }
    public void setEntetilementType(EntetilementType ent)
    {
        this.entetilementType = ent;
    }
    public EntetilementType getEntetilementType()
    {
        return this.entetilementType;
    }
    public void setDate(Date startDay)
    {
        this.startDate = startDay;
    }
    public Date getDate()
    {
        return this.startDate;
    }
    public void setDate(Date startDate, Date endDate)
    {
        setDate(startDate);
        this.endDate = endDate;
    }
    public void setNeverExpries(boolean temp)
    {
        this.neverExpries = temp;
    }
    public boolean getNeverExpries()
    {
        return this.neverExpries;
    }

}
