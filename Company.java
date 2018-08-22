package JavaHRTechN3;
import android.support.annotation.Nullable;

public class Company extends Customer {
    private String name;
    @Nullable
    private String phone;
    @Nullable String fax;
    private Contact mContact = new Contact();
    private Details billing = new Details();
    private Details shipping = new Details();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Nullable
    public String getPhone() {
        return phone;
    }

    public void setPhone(@Nullable String phone) {
        this.phone = phone;
    }

    @Nullable
    public String getFax() {
        return fax;
    }

    public void setFax(@Nullable String fax) {
        this.fax = fax;
    }
}
