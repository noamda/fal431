package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoverPointTimeStamp", propOrder = {"timeInMicroSeconds"})
public class RecoverPointTimeStamp {
    protected long timeInMicroSeconds;

    public RecoverPointTimeStamp() {
    }

    public RecoverPointTimeStamp(long timeInMicroSeconds) {
        this.timeInMicroSeconds = timeInMicroSeconds;
    }


    public long getTimeInMicroSeconds() {
        return this.timeInMicroSeconds;
    }


    public void setTimeInMicroSeconds(long value) {
        this.timeInMicroSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RecoverPointTimeStamp)) {
            return false;
        }
        RecoverPointTimeStamp otherObj = (RecoverPointTimeStamp) obj;

        return this.timeInMicroSeconds == otherObj.timeInMicroSeconds;
    }


    public int hashCode() {
        return (int) this.timeInMicroSeconds;
    }


    public String toString() {
        return "RecoverPointTimeStamp [timeInMicroSeconds=" + this.timeInMicroSeconds + "]";
    }
}


