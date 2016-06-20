package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SnapshotConsolidationStatistics", propOrder = {"percentageOfSavedSpace", "savedSpace"})
public class SnapshotConsolidationStatistics {
    protected double percentageOfSavedSpace;
    protected long savedSpace;

    public SnapshotConsolidationStatistics() {
    }

    public SnapshotConsolidationStatistics(double percentageOfSavedSpace, long savedSpace) {
        this.percentageOfSavedSpace = percentageOfSavedSpace;
        this.savedSpace = savedSpace;
    }


    public double getPercentageOfSavedSpace() {
        return this.percentageOfSavedSpace;
    }


    public void setPercentageOfSavedSpace(double value) {
        this.percentageOfSavedSpace = value;
    }


    public long getSavedSpace() {
        return this.savedSpace;
    }


    public void setSavedSpace(long value) {
        this.savedSpace = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SnapshotConsolidationStatistics)) {
            return false;
        }
        SnapshotConsolidationStatistics otherObj = (SnapshotConsolidationStatistics) obj;

        return (this.percentageOfSavedSpace == otherObj.percentageOfSavedSpace) && (this.savedSpace == otherObj.savedSpace);
    }


    public int hashCode() {
        return (int) this.percentageOfSavedSpace ^ (int) this.savedSpace;
    }


    public String toString() {
        return "SnapshotConsolidationStatistics [percentageOfSavedSpace=" + this.percentageOfSavedSpace + ", " + "savedSpace=" + this.savedSpace + "]";
    }
}


