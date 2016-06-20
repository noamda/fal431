package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotShippingPolicy", propOrder = {"intervaInMinutes", "mode"})
public class SnapshotShippingPolicy {
    protected Long intervaInMinutes;
    protected SnapshotShippingMode mode;

    public SnapshotShippingPolicy() {
    }

    public SnapshotShippingPolicy(Long intervaInMinutes, SnapshotShippingMode mode) {
        this.intervaInMinutes = intervaInMinutes;
        this.mode = mode;
    }


    public Long getIntervaInMinutes() {
        return this.intervaInMinutes;
    }


    public void setIntervaInMinutes(Long value) {
        this.intervaInMinutes = value;
    }


    public SnapshotShippingMode getMode() {
        return this.mode;
    }


    public void setMode(SnapshotShippingMode value) {
        this.mode = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SnapshotShippingPolicy)) {
            return false;
        }
        SnapshotShippingPolicy otherObj = (SnapshotShippingPolicy) obj;

        return (this.intervaInMinutes != null ? this.intervaInMinutes.equals(otherObj.intervaInMinutes) : this.intervaInMinutes == otherObj.intervaInMinutes) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode);
    }


    public int hashCode() {
        return (this.intervaInMinutes != null ? this.intervaInMinutes.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0);
    }


    public String toString() {
        return "SnapshotShippingPolicy [intervaInMinutes=" + this.intervaInMinutes + ", " + "mode=" + this.mode + "]";
    }
}


