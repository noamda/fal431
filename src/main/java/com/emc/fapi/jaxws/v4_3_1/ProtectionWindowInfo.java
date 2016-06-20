package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectionWindowInfo", propOrder = {"protectionWindowInMicroSeconds", "status"})
public class ProtectionWindowInfo {
    protected long protectionWindowInMicroSeconds;
    protected ProtectionWindowStatus status;

    public ProtectionWindowInfo() {
    }

    public ProtectionWindowInfo(long protectionWindowInMicroSeconds, ProtectionWindowStatus status) {
        this.protectionWindowInMicroSeconds = protectionWindowInMicroSeconds;
        this.status = status;
    }


    public long getProtectionWindowInMicroSeconds() {
        return this.protectionWindowInMicroSeconds;
    }


    public void setProtectionWindowInMicroSeconds(long value) {
        this.protectionWindowInMicroSeconds = value;
    }


    public ProtectionWindowStatus getStatus() {
        return this.status;
    }


    public void setStatus(ProtectionWindowStatus value) {
        this.status = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ProtectionWindowInfo)) {
            return false;
        }
        ProtectionWindowInfo otherObj = (ProtectionWindowInfo) obj;

        return (this.protectionWindowInMicroSeconds == otherObj.protectionWindowInMicroSeconds) && (this.status != null ? this.status.equals(otherObj.status) : this.status == otherObj.status);
    }


    public int hashCode() {
        return (int) this.protectionWindowInMicroSeconds ^ (this.status != null ? this.status.hashCode() : 0);
    }


    public String toString() {
        return "ProtectionWindowInfo [protectionWindowInMicroSeconds=" + this.protectionWindowInMicroSeconds + ", " + "status=" + this.status + "]";
    }
}


