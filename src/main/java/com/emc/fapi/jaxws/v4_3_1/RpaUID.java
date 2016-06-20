package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RpaUID", propOrder = {"clusterUID", "rpaNumber"})
public class RpaUID {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    protected int rpaNumber;

    public RpaUID() {
    }

    public RpaUID(ClusterUID clusterUID, int rpaNumber) {
        this.clusterUID = clusterUID;
        this.rpaNumber = rpaNumber;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public int getRpaNumber() {
        return this.rpaNumber;
    }


    public void setRpaNumber(int value) {
        this.rpaNumber = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RpaUID)) {
            return false;
        }
        RpaUID otherObj = (RpaUID) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.rpaNumber == otherObj.rpaNumber);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ this.rpaNumber;
    }


    public String toString() {
        return "RpaUID [clusterUID=" + this.clusterUID + ", " + "rpaNumber=" + this.rpaNumber + "]";
    }
}


