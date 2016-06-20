package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifySplitterState", propOrder = {"splitter", "state", "timeoutInSeconds"})
public class VerifySplitterState {
    protected SplitterUID splitter;
    protected VerifySplitterStateParam state;
    protected long timeoutInSeconds;

    public VerifySplitterState() {
    }

    public VerifySplitterState(SplitterUID splitter, VerifySplitterStateParam state, long timeoutInSeconds) {
        this.splitter = splitter;
        this.state = state;
        this.timeoutInSeconds = timeoutInSeconds;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public VerifySplitterStateParam getState() {
        return this.state;
    }


    public void setState(VerifySplitterStateParam value) {
        this.state = value;
    }


    public long getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }


    public void setTimeoutInSeconds(long value) {
        this.timeoutInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifySplitterState)) {
            return false;
        }
        VerifySplitterState otherObj = (VerifySplitterState) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state) && (this.timeoutInSeconds == otherObj.timeoutInSeconds);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0) ^ (int) this.timeoutInSeconds;
    }


    public String toString() {
        return "VerifySplitterState [splitter=" + this.splitter + ", " + "state=" + this.state + ", " + "timeoutInSeconds=" + this.timeoutInSeconds + "]";
    }
}


