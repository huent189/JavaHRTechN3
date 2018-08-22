package BaiTap;
enum CustomerType
{
    Individual, Company;
}
public class Customer {
    // id CRM_ID;
    private CustomerType type;
    private String description;
    void getCustomerType(CustomerType type)
    {
        this->type = type;
    }
}
