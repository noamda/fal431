package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutgoingThroughputStatistics", propOrder = {"rpaUID", "numberOfGrids", "outgoingThroughput"})
public class OutgoingThroughputStatistics {
    @XmlElement(nillable = true)
    protected RpaUID rpaUID;
    protected int numberOfGrids;
    protected long outgoingThroughput;

    public OutgoingThroughputStatistics() {
    }

    public OutgoingThroughputStatistics(RpaUID rpaUID, int numberOfGrids, long outgoingThroughput) {
        this.rpaUID = rpaUID;
        this.numberOfGrids = numberOfGrids;
        this.outgoingThroughput = outgoingThroughput;
    }


    public RpaUID getRpaUID() {
        return this.rpaUID;
    }


    public void setRpaUID(RpaUID value) {
        this.rpaUID = value;
    }


    public int getNumberOfGrids() {
        return this.numberOfGrids;
    }


    public void setNumberOfGrids(int value) {
        this.numberOfGrids = value;
    }


    public long getOutgoingThroughput() {
        return this.outgoingThroughput;
    }


    public void setOutgoingThroughput(long value) {
        this.outgoingThroughput = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof OutgoingThroughputStatistics)) {
            return false;
        }
        OutgoingThroughputStatistics otherObj = (OutgoingThroughputStatistics) obj;

        return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.numberOfGrids == otherObj.numberOfGrids) && (this.outgoingThroughput == otherObj.outgoingThroughput);
    }


    public int hashCode() {
        return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ this.numberOfGrids ^ (int) this.outgoingThroughput;
    }


    public String toString() {
        return "OutgoingThroughputStatistics [rpaUID=" + this.rpaUID + ", " + "numberOfGrids=" + this.numberOfGrids + ", " + "outgoingThroughput=" + this.outgoingThroughput + "]";
    }
}


