package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VMEntitiesInformation", propOrder = {"vmUID", "name", "disksSet"})
public class VMEntitiesInformation {
    @XmlElement(nillable = true)
    protected VmUID vmUID;
    protected String name;
    @XmlElement(nillable = true)
    protected List<VirtualDiskInformation> disksSet;

    public VMEntitiesInformation() {
    }

    public VMEntitiesInformation(VmUID vmUID, String name, List<VirtualDiskInformation> disksSet) {
        this.vmUID = vmUID;
        this.name = name;
        this.disksSet = disksSet;
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


    public List<VirtualDiskInformation> getDisksSet() {
        if (this.disksSet == null) {
            this.disksSet = new ArrayList();
        }
        return this.disksSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VMEntitiesInformation)) {
            return false;
        }
        VMEntitiesInformation otherObj = (VMEntitiesInformation) obj;

        return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.disksSet != null ? this.disksSet.equals(otherObj.disksSet) : this.disksSet == otherObj.disksSet);
    }


    public int hashCode() {
        return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.disksSet != null ? this.disksSet.hashCode() : 0);
    }


    public String toString() {
        return "VMEntitiesInformation [vmUID=" + this.vmUID + ", " + "name=" + this.name + ", " + "disksSet=" + this.disksSet + "]";
    }
}


