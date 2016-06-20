package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enableImageAccessForGroupSetSubsetWithGeneralParameters", propOrder = {"groupSetSubset", "clusterUID", "params"})
public class EnableImageAccessForGroupSetSubsetWithGeneralParameters {
    protected ConsistencyGroupSetSubset groupSetSubset;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected ImageAccessGeneralParameters params;

    public EnableImageAccessForGroupSetSubsetWithGeneralParameters() {
    }

    public EnableImageAccessForGroupSetSubsetWithGeneralParameters(ConsistencyGroupSetSubset groupSetSubset, ClusterUID clusterUID, ImageAccessGeneralParameters params) {
        this.groupSetSubset = groupSetSubset;
        this.clusterUID = clusterUID;
        this.params = params;
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


    public ImageAccessGeneralParameters getParams() {
        return this.params;
    }


    public void setParams(ImageAccessGeneralParameters value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof EnableImageAccessForGroupSetSubsetWithGeneralParameters)) {
            return false;
        }
        EnableImageAccessForGroupSetSubsetWithGeneralParameters otherObj = (EnableImageAccessForGroupSetSubsetWithGeneralParameters) obj;

        return (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
    }


    public int hashCode() {
        return (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0);
    }


    public String toString() {
        return "EnableImageAccessForGroupSetSubsetWithGeneralParameters [groupSetSubset=" + this.groupSetSubset + ", " + "clusterUID=" + this.clusterUID + ", " + "params=" + this.params + "]";
    }
}


