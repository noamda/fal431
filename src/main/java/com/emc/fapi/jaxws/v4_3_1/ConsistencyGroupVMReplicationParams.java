package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupVMReplicationParams", propOrder = {"groupUID", "virtualDisksReplicationPolicyParams"})
public class ConsistencyGroupVMReplicationParams {
    @XmlElement(required = true)
    protected ConsistencyGroupUID groupUID;
    @XmlElement(required = true)
    protected List<VirtualDisksReplicationPolicyParam> virtualDisksReplicationPolicyParams;

    public ConsistencyGroupVMReplicationParams() {
    }

    public ConsistencyGroupVMReplicationParams(ConsistencyGroupUID groupUID, List<VirtualDisksReplicationPolicyParam> virtualDisksReplicationPolicyParams) {
        this.groupUID = groupUID;
        this.virtualDisksReplicationPolicyParams = virtualDisksReplicationPolicyParams;
    }


    public ConsistencyGroupUID getGroupUID() {
        return this.groupUID;
    }


    public void setGroupUID(ConsistencyGroupUID value) {
        this.groupUID = value;
    }


    public List<VirtualDisksReplicationPolicyParam> getVirtualDisksReplicationPolicyParams() {
        if (this.virtualDisksReplicationPolicyParams == null) {
            this.virtualDisksReplicationPolicyParams = new ArrayList();
        }
        return this.virtualDisksReplicationPolicyParams;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupVMReplicationParams)) {
            return false;
        }
        ConsistencyGroupVMReplicationParams otherObj = (ConsistencyGroupVMReplicationParams) obj;

        return (this.groupUID != null ? this.groupUID.equals(otherObj.groupUID) : this.groupUID == otherObj.groupUID) && (this.virtualDisksReplicationPolicyParams != null ? this.virtualDisksReplicationPolicyParams.equals(otherObj.virtualDisksReplicationPolicyParams) : this.virtualDisksReplicationPolicyParams == otherObj.virtualDisksReplicationPolicyParams);
    }


    public int hashCode() {
        return (this.groupUID != null ? this.groupUID.hashCode() : 0) ^ (this.virtualDisksReplicationPolicyParams != null ? this.virtualDisksReplicationPolicyParams.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupVMReplicationParams [groupUID=" + this.groupUID + ", " + "virtualDisksReplicationPolicyParams=" + this.virtualDisksReplicationPolicyParams + "]";
    }
}


