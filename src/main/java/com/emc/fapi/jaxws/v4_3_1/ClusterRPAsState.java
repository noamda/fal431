package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterRPAsState", propOrder = {"clusterUID", "rpasState"})
public class ClusterRPAsState {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<RPAState> rpasState;

    public ClusterRPAsState() {
    }

    public ClusterRPAsState(ClusterUID clusterUID, List<RPAState> rpasState) {
        this.clusterUID = clusterUID;
        this.rpasState = rpasState;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<RPAState> getRpasState() {
        if (this.rpasState == null) {
            this.rpasState = new ArrayList();
        }
        return this.rpasState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterRPAsState)) {
            return false;
        }
        ClusterRPAsState otherObj = (ClusterRPAsState) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.rpasState != null ? this.rpasState.equals(otherObj.rpasState) : this.rpasState == otherObj.rpasState);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.rpasState != null ? this.rpasState.hashCode() : 0);
    }


    public String toString() {
        return "ClusterRPAsState [clusterUID=" + this.clusterUID + ", " + "rpasState=" + this.rpasState + "]";
    }
}


