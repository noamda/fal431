package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GlobalCopyUID", propOrder = {"clusterUID", "copyUID"})
public class GlobalCopyUID {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    protected int copyUID;

    public GlobalCopyUID() {
    }

    public GlobalCopyUID(ClusterUID clusterUID, int copyUID) {
        this.clusterUID = clusterUID;
        this.copyUID = copyUID;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public int getCopyUID() {
        return this.copyUID;
    }


    public void setCopyUID(int value) {
        this.copyUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GlobalCopyUID)) {
            return false;
        }
        GlobalCopyUID otherObj = (GlobalCopyUID) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.copyUID == otherObj.copyUID);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ this.copyUID;
    }


    public String toString() {
        return "GlobalCopyUID [clusterUID=" + this.clusterUID + ", " + "copyUID=" + this.copyUID + "]";
    }
}


