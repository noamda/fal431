package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationSettings", propOrder = {"vmUID", "groupCopyUID", "replicationPolicy"})
public class VmReplicationSettings {
    @XmlElement(nillable = true)
    protected VmUID vmUID;
    protected ConsistencyGroupCopyUID groupCopyUID;
    protected VmReplicationPolicy replicationPolicy;

    public VmReplicationSettings() {
    }

    public VmReplicationSettings(VmUID vmUID, ConsistencyGroupCopyUID groupCopyUID, VmReplicationPolicy replicationPolicy) {
        this.vmUID = vmUID;
        this.groupCopyUID = groupCopyUID;
        this.replicationPolicy = replicationPolicy;
    }


    public VmUID getVmUID() {
        return this.vmUID;
    }


    public void setVmUID(VmUID value) {
        this.vmUID = value;
    }


    public ConsistencyGroupCopyUID getGroupCopyUID() {
        return this.groupCopyUID;
    }


    public void setGroupCopyUID(ConsistencyGroupCopyUID value) {
        this.groupCopyUID = value;
    }


    public VmReplicationPolicy getReplicationPolicy() {
        return this.replicationPolicy;
    }


    public void setReplicationPolicy(VmReplicationPolicy value) {
        this.replicationPolicy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationSettings)) {
            return false;
        }
        VmReplicationSettings otherObj = (VmReplicationSettings) obj;

        return (this.vmUID != null ? this.vmUID.equals(otherObj.vmUID) : this.vmUID == otherObj.vmUID) && (this.groupCopyUID != null ? this.groupCopyUID.equals(otherObj.groupCopyUID) : this.groupCopyUID == otherObj.groupCopyUID) && (this.replicationPolicy != null ? this.replicationPolicy.equals(otherObj.replicationPolicy) : this.replicationPolicy == otherObj.replicationPolicy);
    }


    public int hashCode() {
        return (this.vmUID != null ? this.vmUID.hashCode() : 0) ^ (this.groupCopyUID != null ? this.groupCopyUID.hashCode() : 0) ^ (this.replicationPolicy != null ? this.replicationPolicy.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationSettings [vmUID=" + this.vmUID + ", " + "groupCopyUID=" + this.groupCopyUID + ", " + "replicationPolicy=" + this.replicationPolicy + "]";
    }
}


