package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeRPAAccessStatus", propOrder = {"rpaUID", "accessStatus"})
public class VolumeRPAAccessStatus {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected VolumeStatus accessStatus;

    public VolumeRPAAccessStatus() {
    }

    public VolumeRPAAccessStatus(RpaUID rpaUID, VolumeStatus accessStatus) {
        this.rpaUID = rpaUID;
        this.accessStatus = accessStatus;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public VolumeStatus getAccessStatus() {
        return this.accessStatus;
    }


    public void setAccessStatus(VolumeStatus value) {
        this.accessStatus = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeRPAAccessStatus)) {
            return false;
        }
        VolumeRPAAccessStatus otherObj = (VolumeRPAAccessStatus) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.accessStatus != null ? this.accessStatus.equals(otherObj.accessStatus) : this.accessStatus == otherObj.accessStatus);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.accessStatus != null ? this.accessStatus.hashCode() : 0);
    }


    public String toString() {
        return "VolumeRPAAccessStatus [rpaUID=" + this.rpaUID + ", " + "accessStatus=" + this.accessStatus + "]";
    }
}


