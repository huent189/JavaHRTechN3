package BaiTap;

import java.util.Date;

enum EntitlementType
{
    // tạo như này dược nhỉ
    HardwareKey = 1;
    ProductKey = 2;
    ProtectionKeyUpdate = 3;
}
public class Entitlement {
    private String EID;
    private EntitlementType type;
    private Date startDate; // cái date này là ntn
    private Date endDate;
    private Boolean neverExpires = true;
    private String comments;
}
