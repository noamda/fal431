package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmStartUpActionUID", propOrder = {"id", "vmUID"})
public class VmStartUpActionUID {
    protected long id;
    @XmlElement(required = true, nillable = true)
    protected VmUID vmUID;

    public VmStartUpActionUID() {
    }

    public VmStartUpActionUID(long id, VmUID vmUID) {
        this.id = id;
        this.vmUID = vmUID;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmStartUpActionUID)) {
            return false;
        }
        VmStartUpActionUID otherObj = (VmStartUpActionUID) obj;

        return (this.id == otherObj.id) && (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID);
    }


    public int hashCode() {
        return (int) this.id ^ (this.vmUID != null ? this.vmUID.hashCode() : 0);
    }


    public String toString() {
        return "VmStartUpActionUID [id=" + this.id + ", " + "vmUID=" + this.vmUID + "]";
    }
}


