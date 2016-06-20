package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVirtualEntitiesInformation", propOrder = {"clusterUID", "virtualCentersEntitiesInformation"})
public class ClusterVirtualEntitiesInformation {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<VirtualCenterEntitiesInformation> virtualCentersEntitiesInformation;

    public ClusterVirtualEntitiesInformation() {
    }

    public ClusterVirtualEntitiesInformation(ClusterUID clusterUID, List<VirtualCenterEntitiesInformation> virtualCentersEntitiesInformation) {
        this.clusterUID = clusterUID;
        this.virtualCentersEntitiesInformation = virtualCentersEntitiesInformation;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<VirtualCenterEntitiesInformation> getVirtualCentersEntitiesInformation() {
        if (this.virtualCentersEntitiesInformation == null) {
            this.virtualCentersEntitiesInformation = new ArrayList();
        }
        return this.virtualCentersEntitiesInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterVirtualEntitiesInformation)) {
            return false;
        }
        ClusterVirtualEntitiesInformation otherObj = (ClusterVirtualEntitiesInformation) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.virtualCentersEntitiesInformation != null ? this.virtualCentersEntitiesInformation.equals(otherObj.virtualCentersEntitiesInformation) : this.virtualCentersEntitiesInformation == otherObj.virtualCentersEntitiesInformation);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.virtualCentersEntitiesInformation != null ? this.virtualCentersEntitiesInformation.hashCode() : 0);
    }


    public String toString() {
        return "ClusterVirtualEntitiesInformation [clusterUID=" + this.clusterUID + ", " + "virtualCentersEntitiesInformation=" + this.virtualCentersEntitiesInformation + "]";
    }
}


