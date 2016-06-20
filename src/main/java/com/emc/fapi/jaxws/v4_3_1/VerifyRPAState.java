package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyRPAState", propOrder = {"rpa", "state", "timeoutInSeconds"})
public class VerifyRPAState {
    protected RpaUID rpa;
    protected VerifyRPAStateParam state;
    protected long timeoutInSeconds;

    public VerifyRPAState() {
    }

    public VerifyRPAState(RpaUID rpa, VerifyRPAStateParam state, long timeoutInSeconds) {
        this.rpa = rpa;
        this.state = state;
        this.timeoutInSeconds = timeoutInSeconds;
    }


    public RpaUID getRpa() {
        return this.rpa;
    }


    public void setRpa(RpaUID value) {
        this.rpa = value;
    }


    public VerifyRPAStateParam getState() {
        return this.state;
    }


    public void setState(VerifyRPAStateParam value) {
        this.state = value;
    }


    public long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }


    public void setTimeoutInSeconds(long value) {
        this.timeoutInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyRPAState)) {
            return false;
        }
        VerifyRPAState otherObj = (VerifyRPAState) obj;

        return (this.rpa != null ? this.rpa.equals(otherObj.rpa) : this.rpa == otherObj.rpa) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
    }


    public int hashCode() {
        return (this.rpa != null ? this.rpa.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int) this.timeoutInSeconds;
    }


    public String toString() {
        return "VerifyRPAState [rpa=" + this.rpa + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
    }
}


