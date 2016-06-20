package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterStatistics", propOrder = {"clusterUID", "traffic"})
public class ClusterStatistics {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected TrafficStatistics traffic;

    public ClusterStatistics() {
    }

    public ClusterStatistics(ClusterUID clusterUID, TrafficStatistics traffic) {
        this.clusterUID = clusterUID;
        this.traffic = traffic;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public TrafficStatistics getTraffic() {
        return this.traffic;
    }


    public void setTraffic(TrafficStatistics value) {
        this.traffic = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterStatistics)) {
            return false;
        }
        ClusterStatistics otherObj = (ClusterStatistics) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.traffic != null ? this.traffic.equals(otherObj.traffic) : this.traffic == otherObj.traffic);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.traffic != null ? this.traffic.hashCode() : 0);
    }


    public String toString() {
        return "ClusterStatistics [clusterUID=" + this.clusterUID + ", " + "traffic=" + this.traffic + "]";
    }
}


