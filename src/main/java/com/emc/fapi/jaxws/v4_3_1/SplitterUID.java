package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterUID", propOrder = {"clusterUID", "id", "splitterType"})
public class SplitterUID {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    protected long id;
    @XmlElement(required = true, nillable = true)
    protected SplitterType splitterType;

    public SplitterUID() {
    }

    public SplitterUID(ClusterUID clusterUID, long id, SplitterType splitterType) {
        this.clusterUID = clusterUID;
        this.id = id;
        this.splitterType = splitterType;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public SplitterType getSplitterType() {
        return this.splitterType;
    }


    public void setSplitterType(SplitterType value) {
        this.splitterType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterUID)) {
            return false;
        }
        SplitterUID otherObj = (SplitterUID) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.id == otherObj.id) && (this.splitterType != null ? this.splitterType.equals(otherObj.splitterType) : this.splitterType == otherObj.splitterType);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (int) this.id ^ (this.splitterType != null ? this.splitterType.hashCode() : 0);
    }


    public String toString() {
        return "SplitterUID [clusterUID=" + this.clusterUID + ", " + "id=" + this.id + ", " + "splitterType=" + this.splitterType + "]";
    }
}


