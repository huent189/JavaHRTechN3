package BaiTap;

import java.util.Enumeration;
public enum LockingType
{
    HL,SLAdminMode, SLUserMode, HLorSLAdminMode, HLorSLUserMode;
}
public enum Rehost
{
    Enable, Disable, Leave_as_it_is, Specify_atentilemen_time;
}
public class Product {
    private Integer id;
    private LockingType lockingType;
    private Rehost rehost;
    private String name;
    private String description;

    /** set gia tri*/
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLockingType(BaiTap.LockingType lockingType) {
        this.lockingType = lockingType;
    }

    public void setRehost(BaiTap.Rehost rehost) {
        this.rehost = rehost;
    }
    /** lay gia tri*/

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BaiTap.LockingType getLockingType() {
        return lockingType;
    }

    public BaiTap.Rehost getRehost() {
        return rehost;
    }
    /** composition*/
    private Product product1 = new Product();
    /** aggegation*/
    private Feature feature;
    public Product(Feature feature)
    {
        this.feature = feature;
    }
}
