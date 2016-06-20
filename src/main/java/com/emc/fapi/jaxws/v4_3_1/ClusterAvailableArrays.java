package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterAvailableArrays", propOrder = {"clusterUID", "availableArrays"})
public class ClusterAvailableArrays {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<ArrayInfo> availableArrays;

    public ClusterAvailableArrays() {
    }

    public ClusterAvailableArrays(ClusterUID clusterUID, List<ArrayInfo> availableArrays) {
        this.clusterUID = clusterUID;
        this.availableArrays = availableArrays;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<ArrayInfo> getAvailableArrays() {
        if (this.availableArrays == null) {
            this.availableArrays = new ArrayList();
        }
        return this.availableArrays;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterAvailableArrays)) {
            return false;
        }
        ClusterAvailableArrays otherObj = (ClusterAvailableArrays) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.availableArrays != null ? this.availableArrays.equals(otherObj.availableArrays) : this.availableArrays == otherObj.availableArrays);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.availableArrays != null ? this.availableArrays.hashCode() : 0);
    }


    public String toString() {
        return "ClusterAvailableArrays [clusterUID=" + this.clusterUID + ", " + "availableArrays=" + this.availableArrays + "]";
    }
}


