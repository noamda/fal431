package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkInitStatistics", propOrder = {"initCompletionPortion", "initIncomingThroughput", "initOutgoingThroughput", "numberOfGrids"})
public class ConsistencyGroupLinkInitStatistics {
    protected double initCompletionPortion;
    protected long initIncomingThroughput;
    protected long initOutgoingThroughput;
    protected int numberOfGrids;

    public ConsistencyGroupLinkInitStatistics() {
    }

    public ConsistencyGroupLinkInitStatistics(double initCompletionPortion, long initIncomingThroughput, long initOutgoingThroughput, int numberOfGrids) {
        this.initCompletionPortion = initCompletionPortion;
        this.initIncomingThroughput = initIncomingThroughput;
        this.initOutgoingThroughput = initOutgoingThroughput;
        this.numberOfGrids = numberOfGrids;
    }


    public double getInitCompletionPortion() {
        return this.initCompletionPortion;
    }


    public void setInitCompletionPortion(double value) {
        this.initCompletionPortion = value;
    }


    public long getInitIncomingThroughput() {
        return this.initIncomingThroughput;
    }


    public void setInitIncomingThroughput(long value) {
        this.initIncomingThroughput = value;
    }


    public long getInitOutgoingThroughput() {
        return this.initOutgoingThroughput;
    }


    public void setInitOutgoingThroughput(long value) {
        this.initOutgoingThroughput = value;
    }


    public int getNumberOfGrids() {
        return this.numberOfGrids;
    }


    public void setNumberOfGrids(int value) {
        this.numberOfGrids = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkInitStatistics)) {
            return false;
        }
        ConsistencyGroupLinkInitStatistics otherObj = (ConsistencyGroupLinkInitStatistics) obj;

        return (this.initCompletionPortion == otherObj.initCompletionPortion) && (this.initIncomingThroughput == otherObj.initIncomingThroughput) && (this.initOutgoingThroughput == otherObj.initOutgoingThroughput) && (this.numberOfGrids == otherObj.numberOfGrids);
    }


    public int hashCode() {
        return (int) this.initCompletionPortion ^ (int) this.initIncomingThroughput ^ (int) this.initOutgoingThroughput ^ this.numberOfGrids;
    }


    public String toString() {
        return "ConsistencyGroupLinkInitStatistics [initCompletionPortion=" + this.initCompletionPortion + ", " + "initIncomingThroughput=" + this.initIncomingThroughput + ", " + "initOutgoingThroughput=" + this.initOutgoingThroughput + ", " + "numberOfGrids=" + this.numberOfGrids + "]";
    }
}


