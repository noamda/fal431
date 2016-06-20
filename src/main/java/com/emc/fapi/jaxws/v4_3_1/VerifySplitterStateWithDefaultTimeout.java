package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifySplitterStateWithDefaultTimeout", propOrder = {"splitter", "state"})
public class VerifySplitterStateWithDefaultTimeout {
    protected SplitterUID splitter;
    protected VerifySplitterStateParam state;

    public VerifySplitterStateWithDefaultTimeout() {
    }

    public VerifySplitterStateWithDefaultTimeout(SplitterUID splitter, VerifySplitterStateParam state) {
        this.splitter = splitter;
        this.state = state;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof VerifySplitterStateWithDefaultTimeout)) {
            return false;
        }
        VerifySplitterStateWithDefaultTimeout otherObj = (VerifySplitterStateWithDefaultTimeout) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.state != null ? this.state.equals(otherObj.state) : this.state == otherObj.state);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.state != null ? this.state.hashCode() : 0);
    }


    public String toString() {
        return "VerifySplitterStateWithDefaultTimeout [splitter=" + this.splitter + ", " + "state=" + this.state + "]";
    }
}


