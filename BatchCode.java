package com.company;

public class BatchCode {
    private String id;

    public boolean checkId(String id)
    {
        return id.length() == 5;
    }
    public void setId(String temp)
    {
        if(checkId(temp))
        {
            this.id = temp;
        }
        else
        {
            System.out.println("Input Error");
        }
    }
    public String getId()
    {
        return this.id;
    }


}
