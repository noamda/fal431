package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyConsistencyGroupStateWithDefaultTimeout", propOrder = {"group", "state"})
public class VerifyConsistencyGroupStateWithDefaultTimeout {
    protected ConsistencyGroupUID group;
    protected VerifyConsistencyGroupStateParam state;

    public VerifyConsistencyGroupStateWithDefaultTimeout() {
    }

    public VerifyConsistencyGroupStateWithDefaultTimeout(ConsistencyGroupUID group, VerifyConsistencyGroupStateParam state) {
        this.group = group;
        this.state = state;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyConsistencyGroupStateWithDefaultTimeout)) {
            return false;
        }
        VerifyConsistencyGroupStateWithDefaultTimeout otherObj = (VerifyConsistencyGroupStateWithDefaultTimeout) obj;

        return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
    }


    public int hashCode() {
        return (this.group != null ? this.group.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
    }


    public String toString() {
        return "VerifyConsistencyGroupStateWithDefaultTimeout [group=" + this.group + ", " + "state=" + this.state + "]";
    }
}


