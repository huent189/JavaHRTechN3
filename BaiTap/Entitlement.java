package BaiTap;

import java.util.Date;

public enum EntitlementType
{
    HardwareKey,ProductKey, ProtectionKeyUpdate;
}
public class Entitlement {
    private String EID;
    private EntitlementType type;
    private Date startDate;
    private Date endDate;
    private Boolean neverExpires = true; // co can set k
    private String comments;

    /**
     * set gia tri
     */

    public void setEID(String EID) {
        this.EID = EID;
    }

    public void setType(BaiTap.EntitlementType type) {
        this.type = type;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * lay gia tri
     */
    public String getEID() {
        return EID;
    }

    public BaiTap.EntitlementType getType() {
        return type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getComments() {
        return comments;
    }
    /** constructor*/
}
