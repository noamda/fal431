package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncReplicationThreshold", propOrder = {"thresholdEnabled", "startAsyncReplicationAbove", "resumeSyncReplicationBelow"})
public class SyncReplicationThreshold {
    protected boolean thresholdEnabled;
    @XmlElement(required = true)
    protected Quantity startAsyncReplicationAbove;
    @XmlElement(required = true)
    protected Quantity resumeSyncReplicationBelow;

    public SyncReplicationThreshold() {
    }

    public SyncReplicationThreshold(boolean thresholdEnabled, Quantity startAsyncReplicationAbove, Quantity resumeSyncReplicationBelow) {
        this.thresholdEnabled = thresholdEnabled;
        this.startAsyncReplicationAbove = startAsyncReplicationAbove;
        this.resumeSyncReplicationBelow = resumeSyncReplicationBelow;
    }


    public boolean isThresholdEnabled() {
        return this.thresholdEnabled;
    }


    public void setThresholdEnabled(boolean value) {
        this.thresholdEnabled = value;
    }


    public Quantity getStartAsyncReplicationAbove() {
        return this.startAsyncReplicationAbove;
    }


    public void setStartAsyncReplicationAbove(Quantity value) {
        this.startAsyncReplicationAbove = value;
    }


    public Quantity getResumeSyncReplicationBelow() {
        return this.resumeSyncReplicationBelow;
    }


    public void setResumeSyncReplicationBelow(Quantity value) {
        this.resumeSyncReplicationBelow = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SyncReplicationThreshold)) {
            return false;
        }
        SyncReplicationThreshold otherObj = (SyncReplicationThreshold) obj;

        return (this.thresholdEnabled == otherObj.thresholdEnabled) && (this.startAsyncReplicationAbove != null ? this.startAsyncReplicationAbove.equals(otherObj.startAsyncReplicationAbove) : this.startAsyncReplicationAbove == otherObj.startAsyncReplicationAbove) && (this.resumeSyncReplicationBelow != null ? this.resumeSyncReplicationBelow.equals(otherObj.resumeSyncReplicationBelow) : this.resumeSyncReplicationBelow == otherObj.resumeSyncReplicationBelow);
    }


    public int hashCode() {
        return (this.thresholdEnabled ? 1 : 0) ^ (this.startAsyncReplicationAbove != null ? this.startAsyncReplicationAbove.hashCode() : 0) ^ (this.resumeSyncReplicationBelow != null ? this.resumeSyncReplicationBelow.hashCode() : 0);
    }


    public String toString() {
        return "SyncReplicationThreshold [thresholdEnabled=" + this.thresholdEnabled + ", " + "startAsyncReplicationAbove=" + this.startAsyncReplicationAbove + ", " + "resumeSyncReplicationBelow=" + this.resumeSyncReplicationBelow + "]";
    }
}


