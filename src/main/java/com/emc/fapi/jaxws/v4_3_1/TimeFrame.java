package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeFrame", propOrder = {"endTime", "startTime"})
public class TimeFrame {
    protected RecoverPointTimeStamp endTime;
    protected RecoverPointTimeStamp startTime;

    public TimeFrame() {
    }

    public TimeFrame(RecoverPointTimeStamp endTime, RecoverPointTimeStamp startTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }


    public RecoverPointTimeStamp getEndTime() {
        return this.endTime;
    }


    public void setEndTime(RecoverPointTimeStamp value) {
        this.endTime = value;
    }


    public RecoverPointTimeStamp getStartTime() {
        return this.startTime;
    }


    public void setStartTime(RecoverPointTimeStamp value) {
        this.startTime = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof TimeFrame)) {
            return false;
        }
        TimeFrame otherObj = (TimeFrame) obj;

        return (this.endTime != null ? this.endTime.equals(otherObj.endTime) : this.endTime == otherObj.endTime) && (this.startTime != null ? this.startTime.equals(otherObj.startTime) : this.startTime == otherObj.startTime);
    }


    public int hashCode() {
        return (this.endTime != null ? this.endTime.hashCode() : 0) ^ (this.startTime != null ? this.startTime.hashCode() : 0);
    }


    public String toString() {
        return "TimeFrame [endTime=" + this.endTime + ", " + "startTime=" + this.startTime + "]";
    }
}


