package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetVmCandidate", propOrder = {"vmUID", "name"})
public class TargetVmCandidate {
    @XmlElement(nillable = true)
    protected VmUID vmUID;
    protected String name;

    public TargetVmCandidate() {
    }

    public TargetVmCandidate(VmUID vmUID, String name) {
        this.vmUID = vmUID;
        this.name = name;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TargetVmCandidate)) {
            return false;
        }
        TargetVmCandidate otherObj = (TargetVmCandidate) obj;

        return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name);
    }


    public int hashCode() {
        return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0);
    }


    public String toString() {
        return "TargetVmCandidate [vmUID=" + this.vmUID + ", " + "name=" + this.name + "]";
    }
}


