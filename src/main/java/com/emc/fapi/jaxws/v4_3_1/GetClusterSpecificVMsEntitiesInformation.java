package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClusterSpecificVMsEntitiesInformation", propOrder = {"clusterUID", "vmUIDs"})
public class GetClusterSpecificVMsEntitiesInformation {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected List<VmUID> vmUIDs;

    public GetClusterSpecificVMsEntitiesInformation() {
    }

    public GetClusterSpecificVMsEntitiesInformation(ClusterUID clusterUID, List<VmUID> vmUIDs) {
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
        if (!(obj instanceof GetClusterSpecificVMsEntitiesInformation)) {
            return false;
        }
        GetClusterSpecificVMsEntitiesInformation otherObj = (GetClusterSpecificVMsEntitiesInformation) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.vmUIDs != null ? this.vmUIDs.equals(otherObj.vmUIDs) : this.vmUIDs == otherObj.vmUIDs);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.vmUIDs != null ? this.vmUIDs.hashCode() : 0);
    }


    public String toString() {
        return "GetClusterSpecificVMsEntitiesInformation [clusterUID=" + this.clusterUID + ", " + "vmUIDs=" + this.vmUIDs + "]";
    }
}


