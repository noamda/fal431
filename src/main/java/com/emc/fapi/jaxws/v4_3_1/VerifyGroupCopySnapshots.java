package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyGroupCopySnapshots", propOrder = {"groupCopy", "state", "timeoutInSeconds"})
public class VerifyGroupCopySnapshots {
    protected ConsistencyGroupCopyUID groupCopy;
    protected VerifyGroupCopySnapshotsParam state;
    protected long timeoutInSeconds;

    public VerifyGroupCopySnapshots() {
    }

    public VerifyGroupCopySnapshots(ConsistencyGroupCopyUID groupCopy, VerifyGroupCopySnapshotsParam state, long timeoutInSeconds) {
        this.groupCopy = groupCopy;
        this.state = state;
        this.timeoutInSeconds = timeoutInSeconds;
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


    public long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }


    public void setTimeoutInSeconds(long value) {
        this.timeoutInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyGroupCopySnapshots)) {
            return false;
        }
        VerifyGroupCopySnapshots otherObj = (VerifyGroupCopySnapshots) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int) this.timeoutInSeconds;
    }


    public String toString() {
        return "VerifyGroupCopySnapshots [groupCopy=" + this.groupCopy + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
    }
}


