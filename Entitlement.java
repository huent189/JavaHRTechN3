package JavaHRTechN3;
import android.support.annotation.Nullable;

import java.util.Date;

public class Entitlement {
    public enum  EntitlementType{
        HardwareKey, ProductKey, ProtectionKeyUpdate
    }
    String EID;
    Date startDate;
    Date endDate;
    Boolean neverExpires = true;
    @Nullable String comment;

}
