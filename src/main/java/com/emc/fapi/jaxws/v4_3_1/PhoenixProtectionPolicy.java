package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoenixProtectionPolicy", propOrder = {"phoenixClusterProtectionPolicy", "phoenixProctectedCopyUID"})
public class PhoenixProtectionPolicy {
    @XmlElement(required = true, nillable = true)
    protected PhoenixClusterProtectionPolicy phoenixClusterProtectionPolicy;
    @XmlElement(required = true)
    protected ConsistencyGroupCopyUID phoenixProctectedCopyUID;

    public PhoenixProtectionPolicy() {
    }

    public PhoenixProtectionPolicy(PhoenixClusterProtectionPolicy phoenixClusterProtectionPolicy, ConsistencyGroupCopyUID phoenixProctectedCopyUID) {
        this.phoenixClusterProtectionPolicy = phoenixClusterProtectionPolicy;
        this.phoenixProctectedCopyUID = phoenixProctectedCopyUID;
    }


    public PhoenixClusterProtectionPolicy getPhoenixClusterProtectionPolicy() {
        return this.phoenixClusterProtectionPolicy;
    }


    public void setPhoenixClusterProtectionPolicy(PhoenixClusterProtectionPolicy value) {
        this.phoenixClusterProtectionPolicy = value;
    }


    public ConsistencyGroupCopyUID getPhoenixProctectedCopyUID() {
        return this.phoenixProctectedCopyUID;
    }


    public void setPhoenixProctectedCopyUID(ConsistencyGroupCopyUID value) {
        this.phoenixProctectedCopyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof PhoenixProtectionPolicy)) {
            return false;
        }
        PhoenixProtectionPolicy otherObj = (PhoenixProtectionPolicy) obj;

        return (this.phoenixClusterProtectionPolicy != null ? this.phoenixClusterProtectionPolicy.equals(otherObj.phoenixClusterProtectionPolicy) : this.phoenixClusterProtectionPolicy == otherObj.phoenixClusterProtectionPolicy) && (this.phoenixProctectedCopyUID != null ? this.phoenixProctectedCopyUID.equals(otherObj.phoenixProctectedCopyUID) : this.phoenixProctectedCopyUID == otherObj.phoenixProctectedCopyUID);
    }


    public int hashCode() {
        return (this.phoenixClusterProtectionPolicy != null ? this.phoenixClusterProtectionPolicy.hashCode() : 0) ^ (this.phoenixProctectedCopyUID != null ? this.phoenixProctectedCopyUID.hashCode() : 0);
    }


    public String toString() {
        return "PhoenixProtectionPolicy [phoenixClusterProtectionPolicy=" + this.phoenixClusterProtectionPolicy + ", " + "phoenixProctectedCopyUID=" + this.phoenixProctectedCopyUID + "]";
    }
}


