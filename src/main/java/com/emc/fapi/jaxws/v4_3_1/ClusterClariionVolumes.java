package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterClariionVolumes", propOrder = {"clusterUID", "clariionsView"})
public class ClusterClariionVolumes {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<ClariionVolumes> clariionsView;

    public ClusterClariionVolumes() {
    }

    public ClusterClariionVolumes(ClusterUID clusterUID, List<ClariionVolumes> clariionsView) {
        this.clusterUID = clusterUID;
        this.clariionsView = clariionsView;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<ClariionVolumes> getClariionsView() {
        if (this.clariionsView == null) {
            this.clariionsView = new ArrayList();
        }
        return this.clariionsView;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterClariionVolumes)) {
            return false;
        }
        ClusterClariionVolumes otherObj = (ClusterClariionVolumes) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.clariionsView != null ? this.clariionsView.equals(otherObj.clariionsView) : this.clariionsView == otherObj.clariionsView);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.clariionsView != null ? this.clariionsView.hashCode() : 0);
    }


    public String toString() {
        return "ClusterClariionVolumes [clusterUID=" + this.clusterUID + ", " + "clariionsView=" + this.clariionsView + "]";
    }
}


