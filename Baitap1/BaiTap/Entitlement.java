package BaiTap;

import java.util.Date;

enum EntitlementType
{
    HardwareKey,ProductKey, ProtectionKeyUpdate;
}
public class Entitlement {
    String EID;
    EntitlementType type;
    Date startDate;
    Date endDate;
    Boolean neverExpires = true;
    String comments;
}
