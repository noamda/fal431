package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableLatestImageAccessForGroupSetSubsetParams", propOrder = {"groupSetSubset", "mode", "scenario"})
public class EnableLatestImageAccessForGroupSetSubsetParams {
    protected ConsistencyGroupSetSubset groupSetSubset;
    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;

    public EnableLatestImageAccessForGroupSetSubsetParams() {
    }

    public EnableLatestImageAccessForGroupSetSubsetParams(ConsistencyGroupSetSubset groupSetSubset, ImageAccessMode mode, ImageAccessScenario scenario) {
        this.groupSetSubset = groupSetSubset;
        this.mode = mode;
        this.scenario = scenario;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
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
        if (!(obj instanceof EnableLatestImageAccessForGroupSetSubsetParams)) {
            return false;
        }
        EnableLatestImageAccessForGroupSetSubsetParams otherObj = (EnableLatestImageAccessForGroupSetSubsetParams) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableLatestImageAccessForGroupSetSubsetParams [groupSetSubset=" + this.groupSetSubset + ", " + "mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
    }
}


