package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalEnableLatestImageAccessForGroupSetProblems", propOrder = {"groupSetSubset", "cluster", "mode", "scenario"})
public class GetIllegalEnableLatestImageAccessForGroupSetProblems {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID cluster;
    protected ImageAccessMode mode;
    protected ImageAccessScenario scenario;

    public GetIllegalEnableLatestImageAccessForGroupSetProblems() {
    }

    public GetIllegalEnableLatestImageAccessForGroupSetProblems(ConsistencyGroupSetSubset groupSetSubset, ClusterUID cluster, ImageAccessMode mode, ImageAccessScenario scenario) {
        this.groupSetSubset = groupSetSubset;
        this.cluster = cluster;
        this.mode = mode;
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
        if (!(obj instanceof GetIllegalEnableLatestImageAccessForGroupSetProblems)) {
            return false;
        }
        GetIllegalEnableLatestImageAccessForGroupSetProblems otherObj = (GetIllegalEnableLatestImageAccessForGroupSetProblems) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.mode != null ? this.mode.equals(otherObj.mode) : this.mode == otherObj.mode) && (this.scenario != null ? this.scenario.equals(otherObj.scenario) : this.scenario == otherObj.scenario);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.mode != null ? this.mode.hashCode() : 0) ^ (this.scenario != null ? this.scenario.hashCode() : 0);
    }


    public String toString() {
        return "GetIllegalEnableLatestImageAccessForGroupSetProblems [groupSetSubset=" + this.groupSetSubset + ", " + "cluster=" + this.cluster + ", " + "mode=" + this.mode + ", " + "scenario=" + this.scenario + "]";
    }
}


