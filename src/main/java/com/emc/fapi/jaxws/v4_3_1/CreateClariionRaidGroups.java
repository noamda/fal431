package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createClariionRaidGroups", propOrder = {"cluster", "numberOfGroups"})
public class CreateClariionRaidGroups {
    protected ClusterUID cluster;
    protected int numberOfGroups;

    public CreateClariionRaidGroups() {
    }

    public CreateClariionRaidGroups(ClusterUID cluster, int numberOfGroups) {
        this.cluster = cluster;
        this.numberOfGroups = numberOfGroups;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public int getNumberOfGroups() {
        return this.numberOfGroups;
    }


    public void setNumberOfGroups(int value) {
        this.numberOfGroups = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CreateClariionRaidGroups)) {
            return false;
        }
        CreateClariionRaidGroups otherObj = (CreateClariionRaidGroups) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.numberOfGroups == otherObj.numberOfGroups);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ this.numberOfGroups;
    }


    public String toString() {
        return "CreateClariionRaidGroups [cluster=" + this.cluster + ", " + "numberOfGroups=" + this.numberOfGroups + "]";
    }
}


