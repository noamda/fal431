package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyStatistics", propOrder = {"averageIncomingThroughput", "averageIncomingWrites", "copyUID", "incomingThroughput", "incomingWrites", "journalStatistics"})
public class ConsistencyGroupCopyStatistics {
    protected long averageIncomingThroughput;
    protected long averageIncomingWrites;
    protected ConsistencyGroupCopyUID copyUID;
    protected long incomingThroughput;
    protected long incomingWrites;
    protected ConsistencyGroupCopyJournalStatistics journalStatistics;

    public ConsistencyGroupCopyStatistics() {
    }

    public ConsistencyGroupCopyStatistics(long averageIncomingThroughput, long averageIncomingWrites, ConsistencyGroupCopyUID copyUID, long incomingThroughput, long incomingWrites, ConsistencyGroupCopyJournalStatistics journalStatistics) {
        this.averageIncomingThroughput = averageIncomingThroughput;
        this.averageIncomingWrites = averageIncomingWrites;
        this.copyUID = copyUID;
        this.incomingThroughput = incomingThroughput;
        this.incomingWrites = incomingWrites;
        this.journalStatistics = journalStatistics;
    }


    public long getAverageIncomingThroughput() {
        return this.averageIncomingThroughput;
    }


    public void setAverageIncomingThroughput(long value) {
        this.averageIncomingThroughput = value;
    }


    public long getAverageIncomingWrites() {
        return this.averageIncomingWrites;
    }


    public void setAverageIncomingWrites(long value) {
        this.averageIncomingWrites = value;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public long getIncomingThroughput() {
        return this.incomingThroughput;
    }


    public void setIncomingThroughput(long value) {
        this.incomingThroughput = value;
    }


    public long getIncomingWrites() {
        return this.incomingWrites;
    }


    public void setIncomingWrites(long value) {
        this.incomingWrites = value;
    }


    public ConsistencyGroupCopyJournalStatistics getJournalStatistics() {
        return this.journalStatistics;
    }


    public void setJournalStatistics(ConsistencyGroupCopyJournalStatistics value) {
        this.journalStatistics = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyStatistics)) {
            return false;
        }
        ConsistencyGroupCopyStatistics otherObj = (ConsistencyGroupCopyStatistics) obj;

        return (this.averageIncomingThroughput == otherObj.averageIncomingThroughput) && (this.averageIncomingWrites == otherObj.averageIncomingWrites) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.incomingThroughput == otherObj.incomingThroughput) && (this.incomingWrites == otherObj.incomingWrites) && (this.journalStatistics != null ? this.journalStatistics.equals(otherObj.journalStatistics) : this.journalStatistics == otherObj.journalStatistics);
    }


    public int hashCode() {
        return (int) this.averageIncomingThroughput ^ (int) this.averageIncomingWrites ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (int) this.incomingThroughput ^ (int) this.incomingWrites ^ (this.journalStatistics != null ? this.journalStatistics.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopyStatistics [averageIncomingThroughput=" + this.averageIncomingThroughput + ", " + "averageIncomingWrites=" + this.averageIncomingWrites + ", " + "copyUID=" + this.copyUID + ", " + "incomingThroughput=" + this.incomingThroughput + ", " + "incomingWrites=" + this.incomingWrites + ", " + "journalStatistics=" + this.journalStatistics + "]";
    }
}


