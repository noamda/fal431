package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatisticsCounters", propOrder = {"dataCounter", "timeCounter", "transactionCounter"})
public class StatisticsCounters {
    protected long dataCounter;
    protected long timeCounter;
    protected long transactionCounter;

    public StatisticsCounters() {
    }

    public StatisticsCounters(long dataCounter, long timeCounter, long transactionCounter) {
        this.dataCounter = dataCounter;
        this.timeCounter = timeCounter;
        this.transactionCounter = transactionCounter;
    }


    public long getDataCounter() {
        return this.dataCounter;
    }


    public void setDataCounter(long value) {
        this.dataCounter = value;
    }


    public long getTimeCounter() {
        return this.timeCounter;
    }


    public void setTimeCounter(long value) {
        this.timeCounter = value;
    }


    public long getTransactionCounter() {
        return this.transactionCounter;
    }


    public void setTransactionCounter(long value) {
        this.transactionCounter = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof StatisticsCounters)) {
            return false;
        }
        StatisticsCounters otherObj = (StatisticsCounters) obj;

        return (this.dataCounter == otherObj.dataCounter) && (this.timeCounter == otherObj.timeCounter) && (this.transactionCounter == otherObj.transactionCounter);
    }


    public int hashCode() {
        return (int) this.dataCounter ^ (int) this.timeCounter ^ (int) this.transactionCounter;
    }


    public String toString() {
        return "StatisticsCounters [dataCounter=" + this.dataCounter + ", " + "timeCounter=" + this.timeCounter + ", " + "transactionCounter=" + this.transactionCounter + "]";
    }
}


