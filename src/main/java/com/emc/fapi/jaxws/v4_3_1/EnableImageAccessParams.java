package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessParams", propOrder = {"snapshot", "mode", "scenario"})
public class EnableImageAccessParams {
    @XmlElement(nillable = true)
    protected Snapshot snapshot;
    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;

    public EnableImageAccessParams() {
    }

    public EnableImageAccessParams(Snapshot snapshot, ImageAccessMode mode, ImageAccessScenario scenario) {
        this.snapshot = snapshot;
        this.mode = mode;
        this.scenario = scenario;
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
        if (!(obj instanceof EnableImageAccessParams)) {
            return false;
        }
        EnableImageAccessParams otherObj = (EnableImageAccessParams) obj;

        return (this.snapshot != null ? this.snapshot.equals(otherObj.snapshot) : this.snapshot == otherObj.snapshot) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.snapshot != null ? this.snapshot.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccessParams [snapshot=" + this.snapshot + ", " + "mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
    }
}


