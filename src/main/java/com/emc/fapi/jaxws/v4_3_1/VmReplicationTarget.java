package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationTarget", propOrder = {"targetClusterUID", "targetVirtualCenterUID", "targetDatacenterUID", "targetEsxClusterUID"})
public class VmReplicationTarget {
    @XmlElement(required = true)
    protected ClusterUID targetClusterUID;
    @XmlElement(required = true)
    protected VirtualCenterUID targetVirtualCenterUID;
    @XmlElement(required = true)
    protected DatacenterUID targetDatacenterUID;
    @XmlElement(required = true)
    protected EsxClusterUID targetEsxClusterUID;

    public VmReplicationTarget() {
    }

    public VmReplicationTarget(ClusterUID targetClusterUID, VirtualCenterUID targetVirtualCenterUID, DatacenterUID targetDatacenterUID, EsxClusterUID targetEsxClusterUID) {
        this.targetClusterUID = targetClusterUID;
        this.targetVirtualCenterUID = targetVirtualCenterUID;
        this.targetDatacenterUID = targetDatacenterUID;
        this.targetEsxClusterUID = targetEsxClusterUID;
    }


    public ClusterUID getTargetClusterUID() {
        return this.targetClusterUID;
    }


    public void setTargetClusterUID(ClusterUID value) {
        this.targetClusterUID = value;
    }


    public VirtualCenterUID getTargetVirtualCenterUID() {
        return this.targetVirtualCenterUID;
    }


    public void setTargetVirtualCenterUID(VirtualCenterUID value) {
        this.targetVirtualCenterUID = value;
    }


    public DatacenterUID getTargetDatacenterUID() {
        return this.targetDatacenterUID;
    }


    public void setTargetDatacenterUID(DatacenterUID value) {
        this.targetDatacenterUID = value;
    }


    public EsxClusterUID getTargetEsxClusterUID() {
        return this.targetEsxClusterUID;
    }


    public void setTargetEsxClusterUID(EsxClusterUID value) {
        this.targetEsxClusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationTarget)) {
            return false;
        }
        VmReplicationTarget otherObj = (VmReplicationTarget) obj;

        return (this.targetClusterUID != null ? this.targetClusterUID.equals(otherObj.targetClusterUID) : this.targetClusterUID == otherObj.targetClusterUID) && (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.equals(otherObj.targetVirtualCenterUID) : this.targetVirtualCenterUID == otherObj.targetVirtualCenterUID) && (this.targetDatacenterUID != null ? this.targetDatacenterUID.equals(otherObj.targetDatacenterUID) : this.targetDatacenterUID == otherObj.targetDatacenterUID) && (this.targetEsxClusterUID != null ? this.targetEsxClusterUID.equals(otherObj.targetEsxClusterUID) : this.targetEsxClusterUID == otherObj.targetEsxClusterUID);
    }


    public int hashCode() {
        return (this.targetClusterUID != null ? this.targetClusterUID.hashCode() : 0) ^ (this.targetVirtualCenterUID != null ? this.targetVirtualCenterUID.hashCode() : 0) ^ (this.targetDatacenterUID != null ? this.targetDatacenterUID.hashCode() : 0) ^ (this.targetEsxClusterUID != null ? this.targetEsxClusterUID.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationTarget [targetClusterUID=" + this.targetClusterUID + ", " + "targetVirtualCenterUID=" + this.targetVirtualCenterUID + ", " + "targetDatacenterUID=" + this.targetDatacenterUID + ", " + "targetEsxClusterUID=" + this.targetEsxClusterUID + "]";
    }
}


