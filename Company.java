package huent189.bthrtech;

import android.support.annotation.Nullable;

public class Company extends Customer {
    String name;
    @Nullable String phone;
    @Nullable String fax;
    Contact mContact = new Contact();
    Details billing = new Details();
    Details shipping = new Details();
}
