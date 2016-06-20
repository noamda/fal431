package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessForGroupSetsSubsetParams", propOrder = {"groupSetSubset", "params", "scenario"})
public class EnableImageAccessForGroupSetsSubsetParams {
    protected ConsistencyGroupSetSubset groupSetSubset;
    protected ImageAccessParameters params;
    protected ImageAccessScenario scenario;

    public EnableImageAccessForGroupSetsSubsetParams() {
    }

    public EnableImageAccessForGroupSetsSubsetParams(ConsistencyGroupSetSubset groupSetSubset, ImageAccessParameters params, ImageAccessScenario scenario) {
        this.groupSetSubset = groupSetSubset;
        this.params = params;
        this.scenario = scenario;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public ImageAccessParameters getParams() {
        return this.params;
    }


    public void setParams(ImageAccessParameters value) {
        this.params = value;
    }


    public ImageAccessScenario getScenario() {
        return this.scenario;
    }


    public void setScenario(ImageAccessScenario value) {
        this.scenario = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EnableImageAccessForGroupSetsSubsetParams)) {
            return false;
        }
        EnableImageAccessForGroupSetsSubsetParams otherObj = (EnableImageAccessForGroupSetsSubsetParams) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccessForGroupSetsSubsetParams [groupSetSubset=" + this.groupSetSubset + ", " + "params=" + this.params + ", " + "scenario=" + this.scenario + "]";
    }
}


