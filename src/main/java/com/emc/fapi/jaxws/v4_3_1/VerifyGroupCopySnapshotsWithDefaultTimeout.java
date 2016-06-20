package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyGroupCopySnapshotsWithDefaultTimeout", propOrder = {"groupCopy", "state"})
public class VerifyGroupCopySnapshotsWithDefaultTimeout {
    protected ConsistencyGroupCopyUID groupCopy;
    protected VerifyGroupCopySnapshotsParam state;

    public VerifyGroupCopySnapshotsWithDefaultTimeout() {
    }

    public VerifyGroupCopySnapshotsWithDefaultTimeout(ConsistencyGroupCopyUID groupCopy, VerifyGroupCopySnapshotsParam state) {
        this.groupCopy = groupCopy;
        this.state = state;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public VerifyGroupCopySnapshotsParam getState() {
        return this.state;
    }


    public void setState(VerifyGroupCopySnapshotsParam value) {
        this.state = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyGroupCopySnapshotsWithDefaultTimeout)) {
            return false;
        }
        VerifyGroupCopySnapshotsWithDefaultTimeout otherObj = (VerifyGroupCopySnapshotsWithDefaultTimeout) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
    }


    public String toString() {
        return "VerifyGroupCopySnapshotsWithDefaultTimeout [groupCopy=" + this.groupCopy + ", " + "state=" + this.state + "]";
    }
}


