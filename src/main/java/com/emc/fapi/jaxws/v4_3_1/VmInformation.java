package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmInformation", propOrder = {"vmUID", "vmName"})
public class VmInformation {
    @XmlElement(nillable = true)
    protected VmUID vmUID;
    protected String vmName;

    public VmInformation() {
    }

    public VmInformation(VmUID vmUID, String vmName) {
        this.vmUID = vmUID;
        this.vmName = vmName;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public String getVmName() {
        return this.vmName;
    }


    public void setVmName(String value) {
        this.vmName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmInformation)) {
            return false;
        }
        VmInformation otherObj = (VmInformation) obj;

        return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.vmName != null ? this.vmName.equals(otherObj.vmName) : this.vmName == otherObj.vmName);
    }


    public int hashCode() {
        return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.vmName != null ? this.vmName.hashCode() : 0);
    }


    public String toString() {
        return "VmInformation [vmUID=" + this.vmUID + ", " + "vmName=" + this.vmName + "]";
    }
}


