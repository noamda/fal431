package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suppressCallHomeEvents", propOrder = {"suppressUntilInGmt"})
public class SuppressCallHomeEvents {
    protected long suppressUntilInGmt;

    public SuppressCallHomeEvents() {
    }

    public SuppressCallHomeEvents(long suppressUntilInGmt) {
        this.suppressUntilInGmt = suppressUntilInGmt;
    }


    public long getSuppressUntilInGmt() {
        return this.suppressUntilInGmt;
    }


    public void setSuppressUntilInGmt(long value) {
        this.suppressUntilInGmt = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SuppressCallHomeEvents)) {
            return false;
        }
        SuppressCallHomeEvents otherObj = (SuppressCallHomeEvents) obj;

        return this.suppressUntilInGmt == otherObj.suppressUntilInGmt;
    }


    public int hashCode() {
        return (int) this.suppressUntilInGmt;
    }


    public String toString() {
        return "SuppressCallHomeEvents [suppressUntilInGmt=" + this.suppressUntilInGmt + "]";
    }
}


