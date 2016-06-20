package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnxUID", propOrder = {"clusterUID", "id"})
public class VnxUID {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(required = true)
    protected String id;

    public VnxUID() {
    }

    public VnxUID(ClusterUID clusterUID, String id) {
        this.clusterUID = clusterUID;
        this.id = id;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public String getId() {
        return this.id;
    }


    public void setId(String value) {
        this.id = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VnxUID)) {
            return false;
        }
        VnxUID otherObj = (VnxUID) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.id != null ? this.id.equals(otherObj.id) : this.id == otherObj.id);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.id != null ? this.id.hashCode() : 0);
    }


    public String toString() {
        return "VnxUID [clusterUID=" + this.clusterUID + ", " + "id=" + this.id + "]";
    }
}


