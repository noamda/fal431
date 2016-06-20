package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupVMHardwareReplicationParams", propOrder = {"groupUID", "virtualHardwareReplicationPolicyParams"})
public class ConsistencyGroupVMHardwareReplicationParams {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    @XmlElement(required = true)
    protected List<VirtualHardwareReplicationPolicyParam> virtualHardwareReplicationPolicyParams;

    public ConsistencyGroupVMHardwareReplicationParams() {
    }

    public ConsistencyGroupVMHardwareReplicationParams(ConsistencyGroupUID groupUID, List<VirtualHardwareReplicationPolicyParam> virtualHardwareReplicationPolicyParams) {
        this.groupUID = groupUID;
        this.virtualHardwareReplicationPolicyParams = virtualHardwareReplicationPolicyParams;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public List<VirtualHardwareReplicationPolicyParam> getVirtualHardwareReplicationPolicyParams() {
        if (this.virtualHardwareReplicationPolicyParams == null) {
            this.virtualHardwareReplicationPolicyParams = new ArrayList();
        }
        return this.virtualHardwareReplicationPolicyParams;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupVMHardwareReplicationParams)) {
            return false;
        }
        ConsistencyGroupVMHardwareReplicationParams otherObj = (ConsistencyGroupVMHardwareReplicationParams) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.virtualHardwareReplicationPolicyParams != null ? this.virtualHardwareReplicationPolicyParams.equals(otherObj.virtualHardwareReplicationPolicyParams) : this.virtualHardwareReplicationPolicyParams == otherObj.virtualHardwareReplicationPolicyParams);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.virtualHardwareReplicationPolicyParams != null ? this.virtualHardwareReplicationPolicyParams.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupVMHardwareReplicationParams [groupUID=" + this.groupUID + ", " + "virtualHardwareReplicationPolicyParams=" + this.virtualHardwareReplicationPolicyParams + "]";
    }
}


