package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccess", propOrder = {"groupCopy", "snapshot", "mode", "scenario"})
public class EnableImageAccess {
    protected ConsistencyGroupCopyUID groupCopy;
    @XmlElement(nillable = true)
    protected Snapshot snapshot;
    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;

    public EnableImageAccess() {
    }

    public EnableImageAccess(ConsistencyGroupCopyUID groupCopy, Snapshot snapshot, ImageAccessMode mode, ImageAccessScenario scenario) {
        this.groupCopy = groupCopy;
        this.snapshot = snapshot;
        this.mode = mode;
        this.scenario = scenario;
    }


    public ConsistencyGroupCopyUID getGroupCopy() {
        return this.groupCopy;
    }


    public void setGroupCopy(ConsistencyGroupCopyUID value) {
        this.groupCopy = value;
    }


    public Snapshot getSnapshot() {
        return this.snapshot;
    }


    public void setSnapshot(Snapshot value) {
        this.snapshot = value;
    }


    public ImageAccessMode getMode() {
        return this.mode;
    }


    public void setMode(ImageAccessMode value) {
        this.mode = value;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EnableImageAccess)) {
            return false;
        }
        EnableImageAccess otherObj = (EnableImageAccess) obj;

        return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccess [groupCopy=" + this.groupCopy + ", " + "snapshot=" + this.snapshot + ", " + "mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
    }
}


