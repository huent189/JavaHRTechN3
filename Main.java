package com.test2;

import java.util.Date;
import java.util.SplittableRandom;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class customer {
    private int crm_id = 17020860;
    private String description;
    batchCode ex1 = new batchCode();
    entitlement ex2 = new entitlement();
    entitlement ex3 = new entitlement();
    int type;
    // type ==  1 or type == 2;
}
class individual extends customer {
    public String firstName;
    public String lastName;
    public String middleName;
    public String email;
    public String phone;
    public String locate;
    details detailsIndividual = new details();
}
class company extends customer {
    public String name;
    public String phone;
    public String fax;
    contact contact1 = new contact();
    details details1 = new details();
}
class details {
    public String street;
    public String city;
    public String postalCode;
    public String state;
    public String country;
    public void details() {
        //Empty
    }
}
class contact {
    public String firstName;
    public String lastName;
    public String middleName;
    public String email;
    public String locate;
    public void conract() {
        //Empty
    }
}
class batchCode {
    public String id;
    product ex1 = new product();
    product ex2 = new product();
    feature ex3 = new feature();
    feature ex4 = new feature();
}
class product {
    public int street;
    public String name;
    public int lockingType; // 1 || 2 || 3 || 4 || 5
    public int rehost; // 1 || 2 || 3 || 4
    public String descrition;
    product exProduct1 = new product();
    product exProduct2 = new product();
    feature ex2 = new feature();
    feature ex3 = new feature();
    batchCode ex4 = new batchCode();
    entitlement ex5 = new entitlement();
    public product() {
        //Empty
    }
}
class feature {
    public int id;
    public String name;
    public String description;
    product ex1 = new product();
    product ex2 = new product();
    batchCode ex3 = new batchCode();
    public void feature() {
        //empty
    }
}
class entitlement {
    public String EID;
    public int type; // 1 || 2 || 3
    public Date startDate;
    public Date endDate;
    public boolean neverExpries = true;
    public String comments;
    product ex1 = new product();
    product ex2 = new product();
}