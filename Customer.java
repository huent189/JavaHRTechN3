package JavaHRTechN3;
import android.support.annotation.Nullable;

public class Customer {
    public enum  CustomerType{
        Individual, Company;
    }
    CustomerType type;
    @Nullable String description;
}
