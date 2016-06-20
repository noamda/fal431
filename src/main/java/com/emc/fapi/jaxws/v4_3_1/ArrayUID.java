package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayUID", propOrder = {"id", "clusterUID"})
public class ArrayUID {
    protected long id;
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;

    public ArrayUID() {
    }

    public ArrayUID(long id, ClusterUID clusterUID) {
        this.id = id;
        this.clusterUID = clusterUID;
    }


    public long getId() {
        return this.id;
    }


    public void setId(long value) {
        this.id = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayUID)) {
            return false;
        }
        ArrayUID otherObj = (ArrayUID) obj;

        return (this.id == otherObj.id) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
    }


    public int hashCode() {
        return (int) this.id ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
    }


    public String toString() {
        return "ArrayUID [id=" + this.id + ", " + "clusterUID=" + this.clusterUID + "]";
    }
}


