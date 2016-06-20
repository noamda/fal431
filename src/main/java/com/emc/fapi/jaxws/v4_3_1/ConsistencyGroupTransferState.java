package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupTransferState", propOrder = {"consistencyGroupUID", "transferState", "groupName", "sourceClusterName"})
public class ConsistencyGroupTransferState {
    @XmlElement(nillable = true)
    protected ConsistencyGroupUID consistencyGroupUID;
    @XmlElement(nillable = true)
    protected TransferState transferState;
    protected String groupName;
    protected String sourceClusterName;

    public ConsistencyGroupTransferState() {
    }

    public ConsistencyGroupTransferState(ConsistencyGroupUID consistencyGroupUID, TransferState transferState, String groupName, String sourceClusterName) {
        this.consistencyGroupUID = consistencyGroupUID;
        this.transferState = transferState;
        this.groupName = groupName;
        this.sourceClusterName = sourceClusterName;
    }


    public ConsistencyGroupUID getConsistencyGroupUID() {
        return this.consistencyGroupUID;
    }


    public void setConsistencyGroupUID(ConsistencyGroupUID value) {
        this.consistencyGroupUID = value;
    }


    public TransferState getTransferState() {
        return this.transferState;
    }


    public void setTransferState(TransferState value) {
        this.transferState = value;
    }


    public String getGroupName() {
        return this.groupName;
    }


    public void setGroupName(String value) {
        this.groupName = value;
    }


    public String getSourceClusterName() {
        return this.sourceClusterName;
    }


    public void setSourceClusterName(String value) {
        this.sourceClusterName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupTransferState)) {
            return false;
        }
        ConsistencyGroupTransferState otherObj = (ConsistencyGroupTransferState) obj;

        return (this.consistencyGroupUID != null ? this.consistencyGroupUID.equals(otherObj.consistencyGroupUID) : this.consistencyGroupUID == otherObj.consistencyGroupUID) && (this.transferState != null ? this.transferState.equals(otherObj.transferState) : this.transferState == otherObj.transferState) && (this.groupName != null ? this.groupName.equals(otherObj.groupName) : this.groupName == otherObj.groupName) && (this.sourceClusterName != null ? this.sourceClusterName.equals(otherObj.sourceClusterName) : this.sourceClusterName == otherObj.sourceClusterName);
    }


    public int hashCode() {
        return (this.consistencyGroupUID != null ? this.consistencyGroupUID.hashCode() : 0) ^ (this.transferState != null ? this.transferState.hashCode() : 0) ^ (this.groupName != null ? this.groupName.hashCode() : 0) ^ (this.sourceClusterName != null ? this.sourceClusterName.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupTransferState [consistencyGroupUID=" + this.consistencyGroupUID + ", " + "transferState=" + this.transferState + ", " + "groupName=" + this.groupName + ", " + "sourceClusterName=" + this.sourceClusterName + "]";
    }
}


