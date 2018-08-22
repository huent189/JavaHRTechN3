package JavaHRTechN3;
public class Customer {
    public enum  CustomerType{
        Individual, Company;
    }
    private CustomerType type;
    private String description;
    private String CRM_ID;
    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        if(type != null){
            this.type = type;
        }
        else {
            System.out.println("Error");
        }
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer(String CRM_ID, CustomerType type) {
        this.type = type;
        this.CRM_ID = CRM_ID;
    }
}
