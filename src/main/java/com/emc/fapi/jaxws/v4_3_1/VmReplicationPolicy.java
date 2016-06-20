package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationPolicy", propOrder = {"networkCustomizationPolicy"})
public class VmReplicationPolicy {
    @XmlElement(required = true)
    protected VmNetworkCustomizationPolicy networkCustomizationPolicy;

    public VmReplicationPolicy() {
    }

    public VmReplicationPolicy(VmNetworkCustomizationPolicy networkCustomizationPolicy) {
        this.networkCustomizationPolicy = networkCustomizationPolicy;
    }


    public VmNetworkCustomizationPolicy getNetworkCustomizationPolicy() {
        return this.networkCustomizationPolicy;
    }


    public void setNetworkCustomizationPolicy(VmNetworkCustomizationPolicy value) {
        this.networkCustomizationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationPolicy)) {
            return false;
        }
        VmReplicationPolicy otherObj = (VmReplicationPolicy) obj;

        return this.networkCustomizationPolicy == otherObj.networkCustomizationPolicy ? true : this.networkCustomizationPolicy != null ? this.networkCustomizationPolicy.equals(otherObj.networkCustomizationPolicy) : false;
    }


    public int hashCode() {
        return this.networkCustomizationPolicy != null ? this.networkCustomizationPolicy.hashCode() : 0;
    }


    public String toString() {
        return "VmReplicationPolicy [networkCustomizationPolicy=" + this.networkCustomizationPolicy + "]";
    }
}


