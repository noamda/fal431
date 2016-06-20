package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSpecificVMsState", propOrder = {"clusterUID", "vmUIDs"})
public class GetClusterSpecificVMsState {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected List<VmUID> vmUIDs;

    public GetClusterSpecificVMsState() {
    }

    public GetClusterSpecificVMsState(ClusterUID clusterUID, List<VmUID> vmUIDs) {
        this.clusterUID = clusterUID;
        this.vmUIDs = vmUIDs;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<VmUID> getVmUIDs() {
        if (this.vmUIDs == null) {
            this.vmUIDs = new ArrayList();
        }
        return this.vmUIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClusterSpecificVMsState)) {
            return false;
        }
        GetClusterSpecificVMsState otherObj = (GetClusterSpecificVMsState) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.vmUIDs != null ? this.vmUIDs.equals(otherObj.vmUIDs) : this.vmUIDs == otherObj.vmUIDs);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.vmUIDs != null ? this.vmUIDs.hashCode() : 0);
    }


    public String toString() {
        return "GetClusterSpecificVMsState [clusterUID=" + this.clusterUID + ", " + "vmUIDs=" + this.vmUIDs + "]";
    }
}


