package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsistencyGroupCopySnapshots", propOrder = {"actualJournalCapacity", "averageCompression", "copyUID", "earliest", "journalUsage", "latest", "protectionWindows", "snapshots"})
public class ConsistencyGroupCopySnapshots {
    protected Double actualJournalCapacity;
    protected Double averageCompression;
    protected ConsistencyGroupCopyUID copyUID;
    protected RecoverPointTimeStamp earliest;
    protected Long journalUsage;
    protected RecoverPointTimeStamp latest;
    protected ProtectionWindowsInfo protectionWindows;
    @XmlElement(nillable = true)
    protected List<Snapshot> snapshots;

    public ConsistencyGroupCopySnapshots() {
    }

    public ConsistencyGroupCopySnapshots(Double actualJournalCapacity, Double averageCompression, ConsistencyGroupCopyUID copyUID, RecoverPointTimeStamp earliest, Long journalUsage, RecoverPointTimeStamp latest, ProtectionWindowsInfo protectionWindows, List<Snapshot> snapshots) {
        this.actualJournalCapacity = actualJournalCapacity;
        this.averageCompression = averageCompression;
        this.copyUID = copyUID;
        this.earliest = earliest;
        this.journalUsage = journalUsage;
        this.latest = latest;
        this.protectionWindows = protectionWindows;
        this.snapshots = snapshots;
    }


    public Double getActualJournalCapacity() {
        return this.actualJournalCapacity;
    }


    public void setActualJournalCapacity(Double value) {
        this.actualJournalCapacity = value;
    }


    public Double getAverageCompression() {
        return this.averageCompression;
    }


    public void setAverageCompression(Double value) {
        this.averageCompression = value;
    }


    public ConsistencyGroupCopyUID getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(ConsistencyGroupCopyUID value) {
        this.copyUID = value;
    }


    public RecoverPointTimeStamp getEarliest() {
        return this.earliest;
    }


    public void setEarliest(RecoverPointTimeStamp value) {
        this.earliest = value;
    }


    public Long getJournalUsage() {
        return this.journalUsage;
    }


    public void setJournalUsage(Long value) {
        this.journalUsage = value;
    }


    public RecoverPointTimeStamp getLatest() {
        return this.latest;
    }


    public void setLatest(RecoverPointTimeStamp value) {
        this.latest = value;
    }


    public ProtectionWindowsInfo getProtectionWindows() {
        return this.protectionWindows;
    }


    public void setProtectionWindows(ProtectionWindowsInfo value) {
        this.protectionWindows = value;
    }


    public List<Snapshot> getSnapshots() {
        if (this.snapshots == null) {
            this.snapshots = new ArrayList();
        }
        return this.snapshots;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConsistencyGroupCopySnapshots)) {
            return false;
        }
        ConsistencyGroupCopySnapshots otherObj = (ConsistencyGroupCopySnapshots) obj;

        return (this.actualJournalCapacity != null ? this.actualJournalCapacity.equals(otherObj.actualJournalCapacity) : this.actualJournalCapacity == otherObj.actualJournalCapacity) && (this.averageCompression != null ? this.averageCompression.equals(otherObj.averageCompression) : this.averageCompression == otherObj.averageCompression) && (this.copyUID != null ? this.copyUID.equals(otherObj.copyUID) : this.copyUID == otherObj.copyUID) && (this.earliest != null ? this.earliest.equals(otherObj.earliest) : this.earliest == otherObj.earliest) && (this.journalUsage != null ? this.journalUsage.equals(otherObj.journalUsage) : this.journalUsage == otherObj.journalUsage) && (this.latest != null ? this.latest.equals(otherObj.latest) : this.latest == otherObj.latest) && (this.protectionWindows != null ? this.protectionWindows.equals(otherObj.protectionWindows) : this.protectionWindows == otherObj.protectionWindows) && (this.snapshots != null ? this.snapshots.equals(otherObj.snapshots) : this.snapshots == otherObj.snapshots);
    }


    public int hashCode() {
        return (this.actualJournalCapacity != null ? this.actualJournalCapacity.hashCode() : 0) ^ (this.averageCompression != null ? this.averageCompression.hashCode() : 0) ^ (this.copyUID != null ? this.copyUID.hashCode() : 0) ^ (this.earliest != null ? this.earliest.hashCode() : 0) ^ (this.journalUsage != null ? this.journalUsage.hashCode() : 0) ^ (this.latest != null ? this.latest.hashCode() : 0) ^ (this.protectionWindows != null ? this.protectionWindows.hashCode() : 0) ^ (this.snapshots != null ? this.snapshots.hashCode() : 0);
    }


    public String toString() {
        return "ConsistencyGroupCopySnapshots [actualJournalCapacity=" + this.actualJournalCapacity + ", " + "averageCompression=" + this.averageCompression + ", " + "copyUID=" + this.copyUID + ", " + "earliest=" + this.earliest + ", " + "journalUsage=" + this.journalUsage + ", " + "latest=" + this.latest + ", " + "protectionWindows=" + this.protectionWindows + ", " + "snapshots=" + this.snapshots + "]";
    }
}


