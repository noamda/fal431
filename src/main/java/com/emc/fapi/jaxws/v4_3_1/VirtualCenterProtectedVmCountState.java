package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualCenterProtectedVmCountState", propOrder = {"protectedVmCount", "vcUID"})
public class VirtualCenterProtectedVmCountState {
    protected long protectedVmCount;
    protected VirtualCenterUID vcUID;

    public VirtualCenterProtectedVmCountState() {
    }

    public VirtualCenterProtectedVmCountState(long protectedVmCount, VirtualCenterUID vcUID) {
        this.protectedVmCount = protectedVmCount;
        this.vcUID = vcUID;
    }


    public long getProtectedVmCount() {
        return this.protectedVmCount;
    }


    public void setProtectedVmCount(long value) {
        this.protectedVmCount = value;
    }


    public VirtualCenterUID getVcUID() {
        return this.vcUID;
    }


    public void setVcUID(VirtualCenterUID value) {
        this.vcUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualCenterProtectedVmCountState)) {
            return false;
        }
        VirtualCenterProtectedVmCountState otherObj = (VirtualCenterProtectedVmCountState) obj;

        return (this.protectedVmCount == otherObj.protectedVmCount) && (this.vcUID != null ? this.vcUID.equals(otherObj.vcUID) : this.vcUID == otherObj.vcUID);
    }


    public int hashCode() {
        return (int) this.protectedVmCount ^ (this.vcUID != null ? this.vcUID.hashCode() : 0);
    }


    public String toString() {
        return "VirtualCenterProtectedVmCountState [protectedVmCount=" + this.protectedVmCount + ", " + "vcUID=" + this.vcUID + "]";
    }
}


