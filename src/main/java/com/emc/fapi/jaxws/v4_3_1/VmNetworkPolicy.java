package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmNetworkPolicy", propOrder = {"group", "vmUID", "vmNetworkCustomizationPolicy"})
public class VmNetworkPolicy {
    @XmlElement(required = true)
    protected ConsistencyGroupUID group;
    @XmlElement(required = true, nillable = true)
    protected VmUID vmUID;
    @XmlElement(required = true, nillable = true)
    protected VmNetworkCustomizationPolicy vmNetworkCustomizationPolicy;

    public VmNetworkPolicy() {
    }

    public VmNetworkPolicy(ConsistencyGroupUID group, VmUID vmUID, VmNetworkCustomizationPolicy vmNetworkCustomizationPolicy) {
        this.group = group;
        this.vmUID = vmUID;
        this.vmNetworkCustomizationPolicy = vmNetworkCustomizationPolicy;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public VmNetworkCustomizationPolicy getVmNetworkCustomizationPolicy() {
        return this.vmNetworkCustomizationPolicy;
    }


    public void setVmNetworkCustomizationPolicy(VmNetworkCustomizationPolicy value) {
        this.vmNetworkCustomizationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmNetworkPolicy)) {
            return false;
        }
        VmNetworkPolicy otherObj = (VmNetworkPolicy) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.vmNetworkCustomizationPolicy != null ? this.vmNetworkCustomizationPolicy.equals(otherObj.vmNetworkCustomizationPolicy) : this.vmNetworkCustomizationPolicy == otherObj.vmNetworkCustomizationPolicy);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.vmNetworkCustomizationPolicy != null ? this.vmNetworkCustomizationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VmNetworkPolicy [group=" + this.group + ", " + "vmUID=" + this.vmUID + ", " + "vmNetworkCustomizationPolicy=" + this.vmNetworkCustomizationPolicy + "]";
    }
}


