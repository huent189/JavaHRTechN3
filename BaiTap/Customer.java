package BaiTap;
public enum CustomerType
{
    Individual, Company;
}
public class Customer {
    private String CRM_ID;
    private CustomerType type;
    private String description;
/** set gia tri*/

    public void setDescription(String description)
    {
        this.description = description;
    }


    public void setType(BaiTap.CustomerType type) {
        this.type = type;
    }
/** lay gia tri*/
    public String getDescription()
    {
        return description;
    }

    public BaiTap.CustomerType getType() {
        return type;
    }
/**constructor*/

    public Customer(String CRM_ID, String description)
    {
        this.CRM_ID = CRM_ID;
        this.description = description;
    }
}
