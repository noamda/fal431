package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDefaultArrayResourcePool", propOrder = {"clusterUID", "params"})
public class GetDefaultArrayResourcePool {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected DefaultArrayResourcePoolParams params;

    public GetDefaultArrayResourcePool() {
    }

    public GetDefaultArrayResourcePool(ClusterUID clusterUID, DefaultArrayResourcePoolParams params) {
        this.clusterUID = clusterUID;
        this.params = params;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public DefaultArrayResourcePoolParams getParams() {
        return this.params;
    }


    public void setParams(DefaultArrayResourcePoolParams value) {
        this.params = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetDefaultArrayResourcePool)) {
            return false;
        }
        GetDefaultArrayResourcePool otherObj = (GetDefaultArrayResourcePool) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.params != null ? this.params.equals(otherObj.params) : this.params == otherObj.params);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.params != null ? this.params.hashCode() : 0);
    }


    public String toString() {
        return "GetDefaultArrayResourcePool [clusterUID=" + this.clusterUID + ", " + "params=" + this.params + "]";
    }
}


