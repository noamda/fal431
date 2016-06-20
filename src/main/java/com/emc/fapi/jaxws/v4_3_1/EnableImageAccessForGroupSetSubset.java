package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessForGroupSetSubset", propOrder = {"groupSetSubset", "clusterUID", "params", "scenario"})
public class EnableImageAccessForGroupSetSubset {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected ImageAccessParameters params;
    protected ImageAccessScenario scenario;

    public EnableImageAccessForGroupSetSubset() {
    }

    public EnableImageAccessForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, ClusterUID clusterUID, ImageAccessParameters params, ImageAccessScenario scenario) {
        this.groupSetSubset = groupSetSubset;
        this.clusterUID = clusterUID;
        this.params = params;
        this.scenario = scenario;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
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
        if (!(obj instanceof EnableImageAccessForGroupSetSubset)) {
            return false;
        }
        EnableImageAccessForGroupSetSubset otherObj = (EnableImageAccessForGroupSetSubset) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccessForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "clusterUID=" + this.clusterUID + ", " + "params=" + this.params + ", " + "scenario=" + this.scenario + "]";
    }
}


