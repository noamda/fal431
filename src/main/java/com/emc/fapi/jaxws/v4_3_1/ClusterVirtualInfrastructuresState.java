package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVirtualInfrastructuresState", propOrder = {"clusterUID", "virtualInfrastructuresState"})
public class ClusterVirtualInfrastructuresState {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected VirtualInfrastructuresState virtualInfrastructuresState;

    public ClusterVirtualInfrastructuresState() {
    }

    public ClusterVirtualInfrastructuresState(ClusterUID clusterUID, VirtualInfrastructuresState virtualInfrastructuresState) {
        this.clusterUID = clusterUID;
        this.virtualInfrastructuresState = virtualInfrastructuresState;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public VirtualInfrastructuresState getVirtualInfrastructuresState() {
        return this.virtualInfrastructuresState;
    }


    public void setVirtualInfrastructuresState(VirtualInfrastructuresState value) {
        this.virtualInfrastructuresState = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterVirtualInfrastructuresState)) {
            return false;
        }
        ClusterVirtualInfrastructuresState otherObj = (ClusterVirtualInfrastructuresState) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.equals(otherObj.virtualInfrastructuresState) : this.virtualInfrastructuresState == otherObj.virtualInfrastructuresState);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.virtualInfrastructuresState != null ? this.virtualInfrastructuresState.hashCode() : 0);
    }


    public String toString() {
        return "ClusterVirtualInfrastructuresState [clusterUID=" + this.clusterUID + ", " + "virtualInfrastructuresState=" + this.virtualInfrastructuresState + "]";
    }
}


