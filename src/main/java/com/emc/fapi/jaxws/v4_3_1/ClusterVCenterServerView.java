package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVCenterServerView", propOrder = {"clusterUID", "vcentersView"})
public class ClusterVCenterServerView {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<VCenterServerView> vcentersView;

    public ClusterVCenterServerView() {
    }

    public ClusterVCenterServerView(ClusterUID clusterUID, List<VCenterServerView> vcentersView) {
        this.clusterUID = clusterUID;
        this.vcentersView = vcentersView;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<VCenterServerView> getVcentersView() {
        if (this.vcentersView == null) {
            this.vcentersView = new ArrayList();
        }
        return this.vcentersView;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterVCenterServerView)) {
            return false;
        }
        ClusterVCenterServerView otherObj = (ClusterVCenterServerView) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.vcentersView != null ? this.vcentersView.equals(otherObj.vcentersView) : this.vcentersView == otherObj.vcentersView);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.vcentersView != null ? this.vcentersView.hashCode() : 0);
    }


    public String toString() {
        return "ClusterVCenterServerView [clusterUID=" + this.clusterUID + ", " + "vcentersView=" + this.vcentersView + "]";
    }
}


