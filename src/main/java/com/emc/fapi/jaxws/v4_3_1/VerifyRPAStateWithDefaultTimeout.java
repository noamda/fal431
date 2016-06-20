package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyRPAStateWithDefaultTimeout", propOrder = {"rpa", "state"})
public class VerifyRPAStateWithDefaultTimeout {
    protected RpaUID rpa;
    protected VerifyRPAStateParam state;

    public VerifyRPAStateWithDefaultTimeout() {
    }

    public VerifyRPAStateWithDefaultTimeout(RpaUID rpa, VerifyRPAStateParam state) {
        this.rpa = rpa;
        this.state = state;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifyRPAStateWithDefaultTimeout)) {
            return false;
        }
        VerifyRPAStateWithDefaultTimeout otherObj = (VerifyRPAStateWithDefaultTimeout) obj;

        return (this.rpa != null ? this.rpa.equals(otherObj.rpa) : this.rpa == otherObj.rpa) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
    }


    public int hashCode() {
        return (this.rpa != null ? this.rpa.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
    }


    public String toString() {
        return "VerifyRPAStateWithDefaultTimeout [rpa=" + this.rpa + ", " + "state=" + this.state + "]";
    }
}


