package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopyJournalStatistics", propOrder = {"actualJournalSizeInBytes", "actualJournalUsageInBytes", "consolidationStatistics", "distributionFinished", "fastForward", "imageAccessSizeLeftInBytes", "imageAccessTimeLeftInSeconds", "imageAccessTotalSizeInBytes", "journalLagInBytes", "movingFrom", "movingTo", "tspUsageInBytes", "tspUsagePercentage", "usagePercentFromDistributionCapacity"})
public class ConsistencyGroupCopyJournalStatistics {
    protected long actualJournalSizeInBytes;
    protected long actualJournalUsageInBytes;
    protected SnapshotConsolidationStatistics consolidationStatistics;
    protected Boolean distributionFinished;
    protected boolean fastForward;
    protected Long imageAccessSizeLeftInBytes;
    protected Long imageAccessTimeLeftInSeconds;
    protected Long imageAccessTotalSizeInBytes;
    protected Long journalLagInBytes;
    protected RecoverPointTimeStamp movingFrom;
    protected RecoverPointTimeStamp movingTo;
    protected Long tspUsageInBytes;
    protected Double tspUsagePercentage;
    protected double usagePercentFromDistributionCapacity;

    public ConsistencyGroupCopyJournalStatistics() {
    }

    public ConsistencyGroupCopyJournalStatistics(long actualJournalSizeInBytes, long actualJournalUsageInBytes, SnapshotConsolidationStatistics consolidationStatistics, Boolean distributionFinished, boolean fastForward, Long imageAccessSizeLeftInBytes, Long imageAccessTimeLeftInSeconds, Long imageAccessTotalSizeInBytes, Long journalLagInBytes, RecoverPointTimeStamp movingFrom, RecoverPointTimeStamp movingTo, Long tspUsageInBytes, Double tspUsagePercentage, double usagePercentFromDistributionCapacity) {
        this.actualJournalSizeInBytes = actualJournalSizeInBytes;
        this.actualJournalUsageInBytes = actualJournalUsageInBytes;
        this.consolidationStatistics = consolidationStatistics;
        this.distributionFinished = distributionFinished;
        this.fastForward = fastForward;
        this.imageAccessSizeLeftInBytes = imageAccessSizeLeftInBytes;
        this.imageAccessTimeLeftInSeconds = imageAccessTimeLeftInSeconds;
        this.imageAccessTotalSizeInBytes = imageAccessTotalSizeInBytes;
        this.journalLagInBytes = journalLagInBytes;
        this.movingFrom = movingFrom;
        this.movingTo = movingTo;
        this.tspUsageInBytes = tspUsageInBytes;
        this.tspUsagePercentage = tspUsagePercentage;
        this.usagePercentFromDistributionCapacity = usagePercentFromDistributionCapacity;
    }


    public long getActualJournalSizeInBytes() {
        return this.actualJournalSizeInBytes;
    }


    public void setActualJournalSizeInBytes(long value) {
        this.actualJournalSizeInBytes = value;
    }


    public long getActualJournalUsageInBytes() {
        return this.actualJournalUsageInBytes;
    }


    public void setActualJournalUsageInBytes(long value) {
        this.actualJournalUsageInBytes = value;
    }


    public SnapshotConsolidationStatistics getConsolidationStatistics() {
        return this.consolidationStatistics;
    }


    public void setConsolidationStatistics(SnapshotConsolidationStatistics value) {
        this.consolidationStatistics = value;
    }


    public Boolean isDistributionFinished() {
        return this.distributionFinished;
    }


    public void setDistributionFinished(Boolean value) {
        this.distributionFinished = value;
    }


    public boolean isFastForward() {
        return this.fastForward;
    }


    public void setFastForward(boolean value) {
        this.fastForward = value;
    }


    public Long getImageAccessSizeLeftInBytes() {
        return this.imageAccessSizeLeftInBytes;
    }


    public void setImageAccessSizeLeftInBytes(Long value) {
        this.imageAccessSizeLeftInBytes = value;
    }


    public Long getImageAccessTimeLeftInSeconds() {
        return this.imageAccessTimeLeftInSeconds;
    }


    public void setImageAccessTimeLeftInSeconds(Long value) {
        this.imageAccessTimeLeftInSeconds = value;
    }


    public Long getImageAccessTotalSizeInBytes() {
        return this.imageAccessTotalSizeInBytes;
    }


    public void setImageAccessTotalSizeInBytes(Long value) {
        this.imageAccessTotalSizeInBytes = value;
    }


    public Long getJournalLagInBytes() {
        return this.journalLagInBytes;
    }


    public void setJournalLagInBytes(Long value) {
        this.journalLagInBytes = value;
    }


    public RecoverPointTimeStamp getMovingFrom() {
        return this.movingFrom;
    }


    public void setMovingFrom(RecoverPointTimeStamp value) {
        this.movingFrom = value;
    }


    public RecoverPointTimeStamp getMovingTo() {
        return this.movingTo;
    }


    public void setMovingTo(RecoverPointTimeStamp value) {
        this.movingTo = value;
    }


    public Long getTspUsageInBytes() {
        return this.tspUsageInBytes;
    }


    public void setTspUsageInBytes(Long value) {
        this.tspUsageInBytes = value;
    }


    public Double getTspUsagePercentage() {
        return this.tspUsagePercentage;
    }


    public void setTspUsagePercentage(Double value) {
        this.tspUsagePercentage = value;
    }


    public double getUsagePercentFromDistributionCapacity() {
        return this.usagePercentFromDistributionCapacity;
    }


    public void setUsagePercentFromDistributionCapacity(double value) {
        this.usagePercentFromDistributionCapacity = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopyJournalStatistics)) {
            return false;
        }
        ConsistencyGroupCopyJournalStatistics otherObj = (ConsistencyGroupCopyJournalStatistics) obj;

        return (this.actualJournalSizeInBytes == otherObj.actualJournalSizeInBytes) && (this.actualJournalUsageInBytes == otherObj.actualJournalUsageInBytes) && (this.consolidationStatistics != null ? this.consolidationStatistics.equals(otherObj.consolidationStatistics) : this.consolidationStatistics == otherObj.consolidationStatistics) && (this.distributionFinished != null ? this.distributionFinished.equals(otherObj.distributionFinished) : this.distributionFinished == otherObj.distributionFinished) && (this.fastForward == otherObj.fastForward) && (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.equals(otherObj.imageAccessSizeLeftInBytes) : this.imageAccessSizeLeftInBytes == otherObj.imageAccessSizeLeftInBytes) && (this.imageAccessTimeLeftInSeconds != null ? this.imageAccessTimeLeftInSeconds.equals(otherObj.imageAccessTimeLeftInSeconds) : this.imageAccessTimeLeftInSeconds == otherObj.imageAccessTimeLeftInSeconds) && (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.equals(otherObj.imageAccessTotalSizeInBytes) : this.imageAccessTotalSizeInBytes == otherObj.imageAccessTotalSizeInBytes) && (this.journalLagInBytes != null ? this.journalLagInBytes.equals(otherObj.journalLagInBytes) : this.journalLagInBytes == otherObj.journalLagInBytes) && (this.movingFrom != null ? this.movingFrom.equals(otherObj.movingFrom) : this.movingFrom == otherObj.movingFrom) && (this.movingTo != null ? this.movingTo.equals(otherObj.movingTo) : this.movingTo == otherObj.movingTo) && (this.tspUsageInBytes != null ? this.tspUsageInBytes.equals(otherObj.tspUsageInBytes) : this.tspUsageInBytes == otherObj.tspUsageInBytes) && (this.tspUsagePercentage != null ? this.tspUsagePercentage.equals(otherObj.tspUsagePercentage) : this.tspUsagePercentage == otherObj.tspUsagePercentage) && (this.usagePercentFromDistributionCapacity == otherObj.usagePercentFromDistributionCapacity);
    }


    public int hashCode() {
        return (int) this.actualJournalSizeInBytes ^ (int) this.actualJournalUsageInBytes ^ (this.consolidationStatistics != null ? this.consolidationStatistics.hashCode() : 0) ^ (this.distributionFinished != null ? this.distributionFinished.hashCode() : 0) ^ (this.fastForward ? 1 : 0) ^ (this.imageAccessSizeLeftInBytes != null ? this.imageAccessSizeLeftInBytes.hashCode() : 0) ^ (this.imageAccessTimeLeftInSeconds != null ? this.imageAccessTimeLeftInSeconds.hashCode() : 0) ^ (this.imageAccessTotalSizeInBytes != null ? this.imageAccessTotalSizeInBytes.hashCode() : 0) ^ (this.journalLagInBytes != null ? this.journalLagInBytes.hashCode() : 0) ^ (this.movingFrom != null ? this.movingFrom.hashCode() : 0) ^ (this.movingTo != null ? this.movingTo.hashCode() : 0) ^ (this.tspUsageInBytes != null ? this.tspUsageInBytes.hashCode() : 0) ^ (this.tspUsagePercentage != null ? this.tspUsagePercentage.hashCode() : 0) ^ (int) this.usagePercentFromDistributionCapacity;
    }


    public String toString() {
        return "ConsistencyGroupCopyJournalStatistics [actualJournalSizeInBytes=" + this.actualJournalSizeInBytes + ", " + "actualJournalUsageInBytes=" + this.actualJournalUsageInBytes + ", " + "consolidationStatistics=" + this.consolidationStatistics + ", " + "distributionFinished=" + this.distributionFinished + ", " + "fastForward=" + this.fastForward + ", " + "imageAccessSizeLeftInBytes=" + this.imageAccessSizeLeftInBytes + ", " + "imageAccessTimeLeftInSeconds=" + this.imageAccessTimeLeftInSeconds + ", " + "imageAccessTotalSizeInBytes=" + this.imageAccessTotalSizeInBytes + ", " + "journalLagInBytes=" + this.journalLagInBytes + ", " + "movingFrom=" + this.movingFrom + ", " + "movingTo=" + this.movingTo + ", " + "tspUsageInBytes=" + this.tspUsageInBytes + ", " + "tspUsagePercentage=" + this.tspUsagePercentage + ", " + "usagePercentFromDistributionCapacity=" + this.usagePercentFromDistributionCapacity + "]";
    }
}


