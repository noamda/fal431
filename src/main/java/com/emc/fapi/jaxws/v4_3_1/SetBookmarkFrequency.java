package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setBookmarkFrequency", propOrder = {"groupSet", "frequencyInMicroSeconds"})
public class SetBookmarkFrequency {
    protected ConsistencyGroupSetUID groupSet;
    protected long frequencyInMicroSeconds;

    public SetBookmarkFrequency() {
    }

    public SetBookmarkFrequency(ConsistencyGroupSetUID groupSet, long frequencyInMicroSeconds) {
        this.groupSet = groupSet;
        this.frequencyInMicroSeconds = frequencyInMicroSeconds;
    }


    public ConsistencyGroupSetUID getGroupSet() {
        return this.groupSet;
    }


    public void setGroupSet(ConsistencyGroupSetUID value) {
        this.groupSet = value;
    }


    public long getFrequencyInMicroSeconds() {
        return this.frequencyInMicroSeconds;
    }


    public void setFrequencyInMicroSeconds(long value) {
        this.frequencyInMicroSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetBookmarkFrequency)) {
            return false;
        }
        SetBookmarkFrequency otherObj = (SetBookmarkFrequency) obj;

        return (this.groupSet != null ? this.groupSet.equals(otherObj.groupSet) : this.groupSet == otherObj.groupSet) && (this.frequencyInMicroSeconds == otherObj.frequencyInMicroSeconds);
    }


    public int hashCode() {
        return (this.groupSet != null ? this.groupSet.hashCode() : 0) ^ (int) this.frequencyInMicroSeconds;
    }


    public String toString() {
        return "SetBookmarkFrequency [groupSet=" + this.groupSet + ", " + "frequencyInMicroSeconds=" + this.frequencyInMicroSeconds + "]";
    }
}


