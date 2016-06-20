package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDiskSettings", propOrder = {"diskId", "included"})
public class VirtualDiskSettings {
    @XmlElement(required = true)
    protected VirtualDiskId diskId;
    protected boolean included;

    public VirtualDiskSettings() {
    }

    public VirtualDiskSettings(VirtualDiskId diskId, boolean included) {
        this.diskId = diskId;
        this.included = included;
    }


    public VirtualDiskId getDiskId() {
        return this.diskId;
    }


    public void setDiskId(VirtualDiskId value) {
        this.diskId = value;
    }


    public boolean isIncluded() {
        return this.included;
    }


    public void setIncluded(boolean value) {
        this.included = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualDiskSettings)) {
            return false;
        }
        VirtualDiskSettings otherObj = (VirtualDiskSettings) obj;

        return (this.diskId != null ? this.diskId.equals(otherObj.diskId) : this.diskId == otherObj.diskId) && (this.included == otherObj.included);
    }


    public int hashCode() {
        return (this.diskId != null ? this.diskId.hashCode() : 0) ^ (this.included ? 1 : 0);
    }


    public String toString() {
        return "VirtualDiskSettings [diskId=" + this.diskId + ", " + "included=" + this.included + "]";
    }
}


