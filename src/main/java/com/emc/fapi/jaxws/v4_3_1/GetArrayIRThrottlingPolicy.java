package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayIRThrottlingPolicy", propOrder = {"array", "cluster"})
public class GetArrayIRThrottlingPolicy {
    protected String array;
    protected ClusterUID cluster;

    public GetArrayIRThrottlingPolicy() {
    }

    public GetArrayIRThrottlingPolicy(String array, ClusterUID cluster) {
        this.array = array;
        this.cluster = cluster;
    }


    public String getArray() {
        return this.array;
    }


    public void setArray(String value) {
        this.array = value;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayIRThrottlingPolicy)) {
            return false;
        }
        GetArrayIRThrottlingPolicy otherObj = (GetArrayIRThrottlingPolicy) obj;

        return (this.array != null ? this.array.equals(otherObj.array) : this.array == otherObj.array) && (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster);
    }


    public int hashCode() {
        return (this.array != null ? this.array.hashCode() : 0) ^ (this.cluster != null ? this.cluster.hashCode() : 0);
    }


    public String toString() {
        return "GetArrayIRThrottlingPolicy [array=" + this.array + ", " + "cluster=" + this.cluster + "]";
    }
}


