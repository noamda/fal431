package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupLinkPipeStatistics", propOrder = {"averageJournalCompressionRatio", "compressionRatio", "detachData", "detachDataRate", "lag", "numberOfGrids", "outgoingThroughput", "outgoingThroughputPerRPA", "replicationMode", "syncRemoteLink", "deduplicationRatio", "averageDeduplicationRatio"})
public class ConsistencyGroupLinkPipeStatistics {
    protected double averageJournalCompressionRatio;
    protected double compressionRatio;
    protected Long detachData;
    protected Long detachDataRate;
    protected StatisticsCounters lag;
    protected int numberOfGrids;
    protected long outgoingThroughput;
    @XmlElement(nillable = true)
    protected List<OutgoingThroughputStatistics> outgoingThroughputPerRPA;
    @XmlElement(nillable = true)
    protected ReplicationMode replicationMode;
    protected boolean syncRemoteLink;
    protected double deduplicationRatio;
    protected double averageDeduplicationRatio;

    public ConsistencyGroupLinkPipeStatistics() {
    }

    public ConsistencyGroupLinkPipeStatistics(double averageJournalCompressionRatio, double compressionRatio, Long detachData, Long detachDataRate, StatisticsCounters lag, int numberOfGrids, long outgoingThroughput, List<OutgoingThroughputStatistics> outgoingThroughputPerRPA, ReplicationMode replicationMode, boolean syncRemoteLink, double deduplicationRatio, double averageDeduplicationRatio) {
        this.averageJournalCompressionRatio = averageJournalCompressionRatio;
        this.compressionRatio = compressionRatio;
        this.detachData = detachData;
        this.detachDataRate = detachDataRate;
        this.lag = lag;
        this.numberOfGrids = numberOfGrids;
        this.outgoingThroughput = outgoingThroughput;
        this.outgoingThroughputPerRPA = outgoingThroughputPerRPA;
        this.replicationMode = replicationMode;
        this.syncRemoteLink = syncRemoteLink;
        this.deduplicationRatio = deduplicationRatio;
        this.averageDeduplicationRatio = averageDeduplicationRatio;
    }


    public double getAverageJournalCompressionRatio() {
        return this.averageJournalCompressionRatio;
    }


    public void setAverageJournalCompressionRatio(double value) {
        this.averageJournalCompressionRatio = value;
    }


    public double getCompressionRatio() {
        return this.compressionRatio;
    }


    public void setCompressionRatio(double value) {
        this.compressionRatio = value;
    }


    public Long getDetachData() {
        return this.detachData;
    }


    public void setDetachData(Long value) {
        this.detachData = value;
    }


    public Long getDetachDataRate() {
        return this.detachDataRate;
    }


    public void setDetachDataRate(Long value) {
        this.detachDataRate = value;
    }


    public StatisticsCounters getLag() {
        return this.lag;
    }


    public void setLag(StatisticsCounters value) {
        this.lag = value;
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


    public List<OutgoingThroughputStatistics> getOutgoingThroughputPerRPA() {
        if (this.outgoingThroughputPerRPA == null) {
            this.outgoingThroughputPerRPA = new ArrayList();
        }
        return this.outgoingThroughputPerRPA;
    }


    public ReplicationMode getReplicationMode() {
        return this.replicationMode;
    }


    public void setReplicationMode(ReplicationMode value) {
        this.replicationMode = value;
    }


    public boolean isSyncRemoteLink() {
        return this.syncRemoteLink;
    }


    public void setSyncRemoteLink(boolean value) {
        this.syncRemoteLink = value;
    }


    public double getDeduplicationRatio() {
        return this.deduplicationRatio;
    }


    public void setDeduplicationRatio(double value) {
        this.deduplicationRatio = value;
    }


    public double getAverageDeduplicationRatio() {
        return this.averageDeduplicationRatio;
    }


    public void setAverageDeduplicationRatio(double value) {
        this.averageDeduplicationRatio = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupLinkPipeStatistics)) {
            return false;
        }
        ConsistencyGroupLinkPipeStatistics otherObj = (ConsistencyGroupLinkPipeStatistics) obj;

        return (this.averageJournalCompressionRatio == otherObj.averageJournalCompressionRatio) && (this.compressionRatio == otherObj.compressionRatio) && (this.detachData != null ? this.detachData.equals(otherObj.detachData) : this.detachData == otherObj.detachData) && (this.detachDataRate != null ? this.detachDataRate.equals(otherObj.detachDataRate) : this.detachDataRate == otherObj.detachDataRate) && (this.lag != null ? this.lag.equals(otherObj.lag) : this.lag == otherObj.lag) && (this.numberOfGrids == otherObj.numberOfGrids) && (this.outgoingThroughput == otherObj.outgoingThroughput) && (this.outgoingThroughputPerRPA != null ? this.outgoingThroughputPerRPA.equals(otherObj.outgoingThroughputPerRPA) : this.outgoingThroughputPerRPA == otherObj.outgoingThroughputPerRPA) && (this.replicationMode != null ? this.replicationMode.equals(otherObj.replicationMode) : this.replicationMode == otherObj.replicationMode) && (this.syncRemoteLink == otherObj.syncRemoteLink) && (this.deduplicationRatio == otherObj.deduplicationRatio) && (this.averageDeduplicationRatio == otherObj.averageDeduplicationRatio);
    }


    public int hashCode() {
        return (int) this.averageJournalCompressionRatio ^ (int) this.compressionRatio ^ (this.detachData != null ? this.detachData.hashCode() : 0) ^ (this.detachDataRate != null ? this.detachDataRate.hashCode() : 0) ^ (this.lag != null ? this.lag.hashCode() : 0) ^ this.numberOfGrids ^ (int) this.outgoingThroughput ^ (this.outgoingThroughputPerRPA != null ? this.outgoingThroughputPerRPA.hashCode() : 0) ^ (this.replicationMode != null ? this.replicationMode.hashCode() : 0) ^ (this.syncRemoteLink ? 1 : 0) ^ (int) this.deduplicationRatio ^ (int) this.averageDeduplicationRatio;
    }


    public String toString() {
        return "ConsistencyGroupLinkPipeStatistics [averageJournalCompressionRatio=" + this.averageJournalCompressionRatio + ", " + "compressionRatio=" + this.compressionRatio + ", " + "detachData=" + this.detachData + ", " + "detachDataRate=" + this.detachDataRate + ", " + "lag=" + this.lag + ", " + "numberOfGrids=" + this.numberOfGrids + ", " + "outgoingThroughput=" + this.outgoingThroughput + ", " + "outgoingThroughputPerRPA=" + this.outgoingThroughputPerRPA + ", " + "replicationMode=" + this.replicationMode + ", " + "syncRemoteLink=" + this.syncRemoteLink + ", " + "deduplicationRatio=" + this.deduplicationRatio + ", " + "averageDeduplicationRatio=" + this.averageDeduplicationRatio + "]";
    }
}


