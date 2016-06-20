package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmUID", propOrder = {"uuid", "virtualCenterUID"})
public class VmUID {
    @XmlElement(required = true)
    protected String uuid;
    @XmlElement(required = true, nillable = true)
    protected VirtualCenterUID virtualCenterUID;

    public VmUID() {
    }

    public VmUID(String uuid, VirtualCenterUID virtualCenterUID) {
        this.uuid = uuid;
        this.virtualCenterUID = virtualCenterUID;
    }


    public String getUuid() {
        return this.uuid;
    }


    public void setUuid(String value) {
        this.uuid = value;
    }


    public VirtualCenterUID getVirtualCenterUID() {
        return this.virtualCenterUID;
    }


    public void setVirtualCenterUID(VirtualCenterUID value) {
        this.virtualCenterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmUID)) {
            return false;
        }
        VmUID otherObj = (VmUID) obj;

        return (this.uuid != null ? this.uuid.equals(otherObj.uuid) : this.uuid == otherObj.uuid) && (this.virtualCenterUID != null ? this.virtualCenterUID.equals(otherObj.virtualCenterUID) : this.virtualCenterUID == otherObj.virtualCenterUID);
    }


    public int hashCode() {
        return (this.uuid != null ? this.uuid.hashCode() : 0) ^ (this.virtualCenterUID != null ? this.virtualCenterUID.hashCode() : 0);
    }


    public String toString() {
        return "VmUID [uuid=" + this.uuid + ", " + "virtualCenterUID=" + this.virtualCenterUID + "]";
    }
}


