package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotsPolicy", propOrder = {"numOfDesiredSnapshots", "snapshotTimeLimitInSeconds"})
public class SnapshotsPolicy {
    protected Integer numOfDesiredSnapshots;
    protected Long snapshotTimeLimitInSeconds;

    public SnapshotsPolicy() {
    }

    public SnapshotsPolicy(Integer numOfDesiredSnapshots, Long snapshotTimeLimitInSeconds) {
        this.numOfDesiredSnapshots = numOfDesiredSnapshots;
        this.snapshotTimeLimitInSeconds = snapshotTimeLimitInSeconds;
    }


    public Integer getNumOfDesiredSnapshots() {
        return this.numOfDesiredSnapshots;
    }


    public void setNumOfDesiredSnapshots(Integer value) {
        this.numOfDesiredSnapshots = value;
    }


    public Long getSnapshotTimeLimitInSeconds() {
        return this.snapshotTimeLimitInSeconds;
    }


    public void setSnapshotTimeLimitInSeconds(Long value) {
        this.snapshotTimeLimitInSeconds = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SnapshotsPolicy)) {
            return false;
        }
        SnapshotsPolicy otherObj = (SnapshotsPolicy) obj;

        return (this.numOfDesiredSnapshots != null ? this.numOfDesiredSnapshots.equals(otherObj.numOfDesiredSnapshots) : this.numOfDesiredSnapshots == otherObj.numOfDesiredSnapshots) && (this.snapshotTimeLimitInSeconds != null ? this.snapshotTimeLimitInSeconds.equals(otherObj.snapshotTimeLimitInSeconds) : this.snapshotTimeLimitInSeconds == otherObj.snapshotTimeLimitInSeconds);
    }


    public int hashCode() {
        return (this.numOfDesiredSnapshots != null ? this.numOfDesiredSnapshots.hashCode() : 0) ^ (this.snapshotTimeLimitInSeconds != null ? this.snapshotTimeLimitInSeconds.hashCode() : 0);
    }


    public String toString() {
        return "SnapshotsPolicy [numOfDesiredSnapshots=" + this.numOfDesiredSnapshots + ", " + "snapshotTimeLimitInSeconds=" + this.snapshotTimeLimitInSeconds + "]";
    }
}


