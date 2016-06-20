package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidationProgress", propOrder = {"consolidationType", "firstSnapshotTime", "lastSnapshotTime", "pending", "progress"})
public class ConsolidationProgress {
    protected SnapshotConsolidationType consolidationType;
    protected RecoverPointTimeStamp firstSnapshotTime;
    protected RecoverPointTimeStamp lastSnapshotTime;
    protected boolean pending;
    protected double progress;

    public ConsolidationProgress() {
    }

    public ConsolidationProgress(SnapshotConsolidationType consolidationType, RecoverPointTimeStamp firstSnapshotTime, RecoverPointTimeStamp lastSnapshotTime, boolean pending, double progress) {
        this.consolidationType = consolidationType;
        this.firstSnapshotTime = firstSnapshotTime;
        this.lastSnapshotTime = lastSnapshotTime;
        this.pending = pending;
        this.progress = progress;
    }


    public SnapshotConsolidationType getConsolidationType() {
        return this.consolidationType;
    }


    public void setConsolidationType(SnapshotConsolidationType value) {
        this.consolidationType = value;
    }


    public RecoverPointTimeStamp getFirstSnapshotTime() {
        return this.firstSnapshotTime;
    }


    public void setFirstSnapshotTime(RecoverPointTimeStamp value) {
        this.firstSnapshotTime = value;
    }


    public RecoverPointTimeStamp getLastSnapshotTime() {
        return this.lastSnapshotTime;
    }


    public void setLastSnapshotTime(RecoverPointTimeStamp value) {
        this.lastSnapshotTime = value;
    }


    public boolean isPending() {
        return this.pending;
    }


    public void setPending(boolean value) {
        this.pending = value;
    }


    public double getProgress() {
        return this.progress;
    }


    public void setProgress(double value) {
        this.progress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsolidationProgress)) {
            return false;
        }
        ConsolidationProgress otherObj = (ConsolidationProgress) obj;

        return (this.consolidationType != null ? this.consolidationType.equals(otherObj.consolidationType) : this.consolidationType == otherObj.consolidationType) && (this.firstSnapshotTime != null ? this.firstSnapshotTime.equals(otherObj.firstSnapshotTime) : this.firstSnapshotTime == otherObj.firstSnapshotTime) && (this.lastSnapshotTime != null ? this.lastSnapshotTime.equals(otherObj.lastSnapshotTime) : this.lastSnapshotTime == otherObj.lastSnapshotTime) && (this.pending == otherObj.pending) && (this.progress == otherObj.progress);
    }


    public int hashCode() {
        return (this.consolidationType != null ? this.consolidationType.hashCode() : 0) ^ (this.firstSnapshotTime != null ? this.firstSnapshotTime.hashCode() : 0) ^ (this.lastSnapshotTime != null ? this.lastSnapshotTime.hashCode() : 0) ^ (this.pending ? 1 : 0) ^ (int) this.progress;
    }


    public String toString() {
        return "ConsolidationProgress [consolidationType=" + this.consolidationType + ", " + "firstSnapshotTime=" + this.firstSnapshotTime + ", " + "lastSnapshotTime=" + this.lastSnapshotTime + ", " + "pending=" + this.pending + ", " + "progress=" + this.progress + "]";
    }
}


