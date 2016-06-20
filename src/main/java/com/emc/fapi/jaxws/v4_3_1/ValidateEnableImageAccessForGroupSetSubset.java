package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateEnableImageAccessForGroupSetSubset", propOrder = {"groupSetSubset", "cluster", "params", "scenario"})
public class ValidateEnableImageAccessForGroupSetSubset {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID cluster;
    protected ImageAccessParameters params;
    protected ImageAccessScenario scenario;

    public ValidateEnableImageAccessForGroupSetSubset() {
    }

    public ValidateEnableImageAccessForGroupSetSubset(ConsistencyGroupSetSubset groupSetSubset, ClusterUID cluster, ImageAccessParameters params, ImageAccessScenario scenario) {
        this.groupSetSubset = groupSetSubset;
        this.cluster = cluster;
        this.params = params;
        this.scenario = scenario;
    }


    public ConsistencyGroupSetSubset getGroupSetSubset() {
        return this.groupSetSubset;
    }


    public void setGroupSetSubset(ConsistencyGroupSetSubset value) {
        this.groupSetSubset = value;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
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
        if (!(obj instanceof ValidateEnableImageAccessForGroupSetSubset)) {
            return false;
        }
        ValidateEnableImageAccessForGroupSetSubset otherObj = (ValidateEnableImageAccessForGroupSetSubset) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "ValidateEnableImageAccessForGroupSetSubset [groupSetSubset=" + this.groupSetSubset + ", " + "cluster=" + this.cluster + ", " + "params=" + this.params + ", " + "scenario=" + this.scenario + "]";
    }
}


