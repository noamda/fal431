package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNMPTrapDestination", propOrder = {"clusterUID", "targetHostAddress"})
public class SNMPTrapDestination {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(required = true)
    protected String targetHostAddress;

    public SNMPTrapDestination() {
    }

    public SNMPTrapDestination(ClusterUID clusterUID, String targetHostAddress) {
        this.clusterUID = clusterUID;
        this.targetHostAddress = targetHostAddress;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public String getTargetHostAddress() {
        return this.targetHostAddress;
    }


    public void setTargetHostAddress(String value) {
        this.targetHostAddress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SNMPTrapDestination)) {
            return false;
        }
        SNMPTrapDestination otherObj = (SNMPTrapDestination) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.targetHostAddress != null ? this.targetHostAddress.equals(otherObj.targetHostAddress) : this.targetHostAddress == otherObj.targetHostAddress);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.targetHostAddress != null ? this.targetHostAddress.hashCode() : 0);
    }


    public String toString() {
        return "SNMPTrapDestination [clusterUID=" + this.clusterUID + ", " + "targetHostAddress=" + this.targetHostAddress + "]";
    }
}


