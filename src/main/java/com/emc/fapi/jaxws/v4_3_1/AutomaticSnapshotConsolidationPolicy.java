package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomaticSnapshotConsolidationPolicy", propOrder = {"dailyConsolidations", "enabled", "unconsolidatedDurationInSeconds", "weeklyConsolidations"})
public class AutomaticSnapshotConsolidationPolicy {
    protected long dailyConsolidations;
    protected boolean enabled;
    protected long unconsolidatedDurationInSeconds;
    protected long weeklyConsolidations;

    public AutomaticSnapshotConsolidationPolicy() {
    }

    public AutomaticSnapshotConsolidationPolicy(long dailyConsolidations, boolean enabled, long unconsolidatedDurationInSeconds, long weeklyConsolidations) {
        this.dailyConsolidations = dailyConsolidations;
        this.enabled = enabled;
        this.unconsolidatedDurationInSeconds = unconsolidatedDurationInSeconds;
        this.weeklyConsolidations = weeklyConsolidations;
    }


    public long getDailyConsolidations() {
        return this.dailyConsolidations;
    }


    public void setDailyConsolidations(long value) {
        this.dailyConsolidations = value;
    }


    public boolean isEnabled() {
        return this.enabled;
    }


    public void setEnabled(boolean value) {
        this.enabled = value;
    }


    public long getUnconsolidatedDurationInSeconds() {
        return this.unconsolidatedDurationInSeconds;
    }


    public void setUnconsolidatedDurationInSeconds(long value) {
        this.unconsolidatedDurationInSeconds = value;
    }


    public long getWeeklyConsolidations() {
        return this.weeklyConsolidations;
    }


    public void setWeeklyConsolidations(long value) {
        this.weeklyConsolidations = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AutomaticSnapshotConsolidationPolicy)) {
            return false;
        }
        AutomaticSnapshotConsolidationPolicy otherObj = (AutomaticSnapshotConsolidationPolicy) obj;

        return (this.dailyConsolidations == otherObj.dailyConsolidations) && (this.enabled == otherObj.enabled) && (this.unconsolidatedDurationInSeconds == otherObj.unconsolidatedDurationInSeconds) && (this.weeklyConsolidations == otherObj.weeklyConsolidations);
    }


    public int hashCode() {
        return (int) this.dailyConsolidations ^ (this.enabled ? 1 : 0) ^ (int) this.unconsolidatedDurationInSeconds ^ (int) this.weeklyConsolidations;
    }


    public String toString() {
        return "AutomaticSnapshotConsolidationPolicy [dailyConsolidations=" + this.dailyConsolidations + ", " + "enabled=" + this.enabled + ", " + "unconsolidatedDurationInSeconds=" + this.unconsolidatedDurationInSeconds + ", " + "weeklyConsolidations=" + this.weeklyConsolidations + "]";
    }
}


