package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSANVolumes", propOrder = {"clusterUID", "volumesInformation"})
public class ClusterSANVolumes {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<VolumeInformation> volumesInformation;

    public ClusterSANVolumes() {
    }

    public ClusterSANVolumes(ClusterUID clusterUID, List<VolumeInformation> volumesInformation) {
        this.clusterUID = clusterUID;
        this.volumesInformation = volumesInformation;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<VolumeInformation> getVolumesInformation() {
        if (this.volumesInformation == null) {
            this.volumesInformation = new ArrayList();
        }
        return this.volumesInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSANVolumes)) {
            return false;
        }
        ClusterSANVolumes otherObj = (ClusterSANVolumes) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.volumesInformation != null ? this.volumesInformation.equals(otherObj.volumesInformation) : this.volumesInformation == otherObj.volumesInformation);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.volumesInformation != null ? this.volumesInformation.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSANVolumes [clusterUID=" + this.clusterUID + ", " + "volumesInformation=" + this.volumesInformation + "]";
    }
}


