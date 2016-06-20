package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters", propOrder = {"groupSetSubset", "cluster", "params"})
public class GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID cluster;
    protected ImageAccessGeneralParameters params;

    public GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters() {
    }

    public GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters(ConsistencyGroupSetSubset groupSetSubset, ClusterUID cluster, ImageAccessGeneralParameters params) {
        this.groupSetSubset = groupSetSubset;
        this.cluster = cluster;
        this.params = params;
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


    public ImageAccessGeneralParameters getParams() {
        return this.params;
    }


    public void setParams(ImageAccessGeneralParameters value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters)) {
            return false;
        }
        GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters otherObj = (GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0);
    }


    public String toString() {
        return "GetIllegalEnableImageAccessGroupSetProblemsWithGeneralParameters [groupSetSubset=" + this.groupSetSubset + ", " + "cluster=" + this.cluster + ", " + "params=" + this.params + "]";
    }
}


