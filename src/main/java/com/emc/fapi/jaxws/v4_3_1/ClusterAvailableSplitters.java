package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterAvailableSplitters", propOrder = {"clusterUID", "availableSplitters"})
public class ClusterAvailableSplitters {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<SplitterInfo> availableSplitters;

    public ClusterAvailableSplitters() {
    }

    public ClusterAvailableSplitters(ClusterUID clusterUID, List<SplitterInfo> availableSplitters) {
        this.clusterUID = clusterUID;
        this.availableSplitters = availableSplitters;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<SplitterInfo> getAvailableSplitters() {
        if (this.availableSplitters == null) {
            this.availableSplitters = new ArrayList();
        }
        return this.availableSplitters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterAvailableSplitters)) {
            return false;
        }
        ClusterAvailableSplitters otherObj = (ClusterAvailableSplitters) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.availableSplitters != null ? this.availableSplitters.equals(otherObj.availableSplitters) : this.availableSplitters == otherObj.availableSplitters);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.availableSplitters != null ? this.availableSplitters.hashCode() : 0);
    }


    public String toString() {
        return "ClusterAvailableSplitters [clusterUID=" + this.clusterUID + ", " + "availableSplitters=" + this.availableSplitters + "]";
    }
}


