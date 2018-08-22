package huent189.bthrtech;

import android.support.annotation.Nullable;

public class Individual extends Customer {
    String firstName;
    String lastName;
    @Nullable String middleName;
    String email;
    @Nullable String phone;
    @Nullable String locale = "English";
    Details billing = new Details();
    Details shipping = new Details();
}
