package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayManagementProviderUID", propOrder = {"id", "clusterUID"})
public class ArrayManagementProviderUID {
    protected long id;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;

    public ArrayManagementProviderUID() {
    }

    public ArrayManagementProviderUID(long id, ClusterUID clusterUID) {
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
        if (!(obj instanceof ArrayManagementProviderUID)) {
            return false;
        }
        ArrayManagementProviderUID otherObj = (ArrayManagementProviderUID) obj;

        return (this.id == otherObj.id) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
    }


    public int hashCode() {
        return (int) this.id ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
    }


    public String toString() {
        return "ArrayManagementProviderUID [id=" + this.id + ", " + "clusterUID=" + this.clusterUID + "]";
    }
}


