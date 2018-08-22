package com.company;

import java.util.Date;

class Customer
{
    String id;
    CustomerType type;
    String descripion;


}
class Individual extends Customer
{
    String firstName;
    String lastName;
    String minddleName;
    String email;
    String phone;
    String locale = "Enlish";
}
class Company extends Customer
{
    String name;
    String phone;
    String fax;

    
}


enum CustomerType
{
    Individual, Company

}
class Entitlement
{
    Customer cus;
    String id;
    Entitlement type;
    Date startDate;
    Date endDate;
    boolean neverExpires = true;
    String comment;
}

enum EntitlementType
{
    HradWareKey, ProduceKey,ProtectionKeyUpdate
}

class Produce
{
    BatchCode batch;
    Entitlement entile;
    String name;// name.size <= 50
    LookingType lookingtype;
    Rehost rehost;
    String desicipion;

}
enum Rehost
{
        Enable,Disable, Leave_as_it_is, Specify_at_entitlement_time

}
enum LookingType
{
    HL, SL_AdimMode, SL_UserMode, HL_or_SL_AdimMode, HL_or_SL_UserModle
}

class Feature
{
    BatchCode bath;
    int id;
    String name;// name.size <= 50
    String description;
}

class BatchCode
{
    Customer cus;
    String id; // id.size <= 5

}

class Deatail
{
    String street;
    String city;
    String postalCode;
    String state;
    String country;

}
class Contact
{
    String firstName;
    String lastName;
    String middleName;
    String email;
    String locale;

}
public class Main {

    public static void main(String[] args) {
	// write your code here

    }
}
