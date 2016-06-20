package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterArrayManagementProvidersState", propOrder = {"clusterUID", "ampsState"})
public class ClusterArrayManagementProvidersState {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<ArrayManagementProviderState> ampsState;

    public ClusterArrayManagementProvidersState() {
    }

    public ClusterArrayManagementProvidersState(ClusterUID clusterUID, List<ArrayManagementProviderState> ampsState) {
        this.clusterUID = clusterUID;
        this.ampsState = ampsState;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<ArrayManagementProviderState> getAmpsState() {
        if (this.ampsState == null) {
            this.ampsState = new ArrayList();
        }
        return this.ampsState;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterArrayManagementProvidersState)) {
            return false;
        }
        ClusterArrayManagementProvidersState otherObj = (ClusterArrayManagementProvidersState) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.ampsState != null ? this.ampsState.equals(otherObj.ampsState) : this.ampsState == otherObj.ampsState);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.ampsState != null ? this.ampsState.hashCode() : 0);
    }


    public String toString() {
        return "ClusterArrayManagementProvidersState [clusterUID=" + this.clusterUID + ", " + "ampsState=" + this.ampsState + "]";
    }
}


