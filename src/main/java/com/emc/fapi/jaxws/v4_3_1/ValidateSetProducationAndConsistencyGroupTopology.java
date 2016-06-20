package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetProducationAndConsistencyGroupTopology", propOrder = {"groupCopy", "params", "startTransfer"})
public class ValidateSetProducationAndConsistencyGroupTopology {
    protected ConsistencyGroupCopyUID groupCopy;
    protected ConsistencyGroupTopologyParams params;
    protected boolean startTransfer;

    public ValidateSetProducationAndConsistencyGroupTopology() {
    }

    public ValidateSetProducationAndConsistencyGroupTopology(ConsistencyGroupCopyUID groupCopy, ConsistencyGroupTopologyParams params, boolean startTransfer) {
        this.groupCopy = groupCopy;
        this.params = params;
        this.startTransfer = startTransfer;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public ConsistencyGroupTopologyParams getParams() {
        return this.params;
    }


    public void setParams(ConsistencyGroupTopologyParams value) {
        this.params = value;
    }


    public boolean isStartTransfer() {
        return this.startTransfer;
    }


    public void setStartTransfer(boolean value) {
        this.startTransfer = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetProducationAndConsistencyGroupTopology)) {
            return false;
        }
        ValidateSetProducationAndConsistencyGroupTopology otherObj = (ValidateSetProducationAndConsistencyGroupTopology) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.startTransfer == otherObj.startTransfer);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.startTransfer ? 1 : 0);
    }


    public String toString() {
        return "ValidateSetProducationAndConsistencyGroupTopology [groupCopy=" + this.groupCopy + ", " + "params=" + this.params + ", " + "startTransfer=" + this.startTransfer + "]";
    }
}


