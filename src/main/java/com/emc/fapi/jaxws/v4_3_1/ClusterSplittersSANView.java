package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSplittersSANView", propOrder = {"clusterUID", "splittersSANView"})
public class ClusterSplittersSANView {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<SplitterSANView> splittersSANView;

    public ClusterSplittersSANView() {
    }

    public ClusterSplittersSANView(ClusterUID clusterUID, List<SplitterSANView> splittersSANView) {
        this.clusterUID = clusterUID;
        this.splittersSANView = splittersSANView;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<SplitterSANView> getSplittersSANView() {
        if (this.splittersSANView == null) {
            this.splittersSANView = new ArrayList();
        }
        return this.splittersSANView;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSplittersSANView)) {
            return false;
        }
        ClusterSplittersSANView otherObj = (ClusterSplittersSANView) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.splittersSANView != null ? this.splittersSANView.equals(otherObj.splittersSANView) : this.splittersSANView == otherObj.splittersSANView);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.splittersSANView != null ? this.splittersSANView.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSplittersSANView [clusterUID=" + this.clusterUID + ", " + "splittersSANView=" + this.splittersSANView + "]";
    }
}


