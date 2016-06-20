package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSplittersState", propOrder = {"clusterUID", "splittersState"})
public class ClusterSplittersState {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<SplitterState> splittersState;

    public ClusterSplittersState() {
    }

    public ClusterSplittersState(ClusterUID clusterUID, List<SplitterState> splittersState) {
        this.clusterUID = clusterUID;
        this.splittersState = splittersState;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<SplitterState> getSplittersState() {
        if (this.splittersState == null) {
            this.splittersState = new ArrayList();
        }
        return this.splittersState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSplittersState)) {
            return false;
        }
        ClusterSplittersState otherObj = (ClusterSplittersState) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.splittersState != null ? this.splittersState.equals(otherObj.splittersState) : this.splittersState == otherObj.splittersState);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.splittersState != null ? this.splittersState.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSplittersState [clusterUID=" + this.clusterUID + ", " + "splittersState=" + this.splittersState + "]";
    }
}


