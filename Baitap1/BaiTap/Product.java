package BaiTap;

import java.util.Enumeration;
enum LockingType
{
    HL,SLAdminMode, SLUserMode, HLorSLAdminMode, HLorSLUserMode;
}
enum Rehost
{
    Enable, Disable, Leave_as_it_is, Specify_atentilemen_time;
}
public class Product {
    Integer id;
    LockingType lockingType;
    Rehost rehost;
    String name;
    String description;
}
