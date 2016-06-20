package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyConsistencyGroupState", propOrder = {"group", "state", "timeoutInSeconds"})
public class VerifyConsistencyGroupState {
    protected ConsistencyGroupUID group;
    protected VerifyConsistencyGroupStateParam state;
    protected long timeoutInSeconds;

    public VerifyConsistencyGroupState() {
    }

    public VerifyConsistencyGroupState(ConsistencyGroupUID group, VerifyConsistencyGroupStateParam state, long timeoutInSeconds) {
        this.group = group;
        this.state = state;
        this.timeoutInSeconds = timeoutInSeconds;
    }


    public ConsistencyGroupUID getGroup() {
        return this.group;
    }


    public void setGroup(ConsistencyGroupUID value) {
        this.group = value;
    }


    public VerifyConsistencyGroupStateParam getState() {
        return this.state;
    }


    public void setState(VerifyConsistencyGroupStateParam value) {
        this.state = value;
    }


    public long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }


    public void setTimeoutInSeconds(long value) {
        this.timeoutInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyConsistencyGroupState)) {
            return false;
        }
        VerifyConsistencyGroupState otherObj = (VerifyConsistencyGroupState) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int) this.timeoutInSeconds;
    }


    public String toString() {
        return "VerifyConsistencyGroupState [group=" + this.group + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
    }
}


