package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setClusterIRThrottlingPolicy", propOrder = {"cluster", "policy"})
public class SetClusterIRThrottlingPolicy {
    protected ClusterUID cluster;
    protected ArrayIRThrottlingPolicy policy;

    public SetClusterIRThrottlingPolicy() {
    }

    public SetClusterIRThrottlingPolicy(ClusterUID cluster, ArrayIRThrottlingPolicy policy) {
        this.cluster = cluster;
        this.policy = policy;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public ArrayIRThrottlingPolicy getPolicy() {
        return this.policy;
    }


    public void setPolicy(ArrayIRThrottlingPolicy value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetClusterIRThrottlingPolicy)) {
            return false;
        }
        SetClusterIRThrottlingPolicy otherObj = (SetClusterIRThrottlingPolicy) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0);
    }


    public String toString() {
        return "SetClusterIRThrottlingPolicy [cluster=" + this.cluster + ", " + "policy=" + this.policy + "]";
    }
}


