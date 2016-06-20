package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setArrayIRThrottlingPolicy", propOrder = {"cluster", "policy"})
public class SetArrayIRThrottlingPolicy {
    protected ClusterUID cluster;
    protected ArrayIRThrottlingPolicyParams policy;

    public SetArrayIRThrottlingPolicy() {
    }

    public SetArrayIRThrottlingPolicy(ClusterUID cluster, ArrayIRThrottlingPolicyParams policy) {
        this.cluster = cluster;
        this.policy = policy;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public ArrayIRThrottlingPolicyParams getPolicy() {
        return this.policy;
    }


    public void setPolicy(ArrayIRThrottlingPolicyParams value) {
        this.policy = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetArrayIRThrottlingPolicy)) {
            return false;
        }
        SetArrayIRThrottlingPolicy otherObj = (SetArrayIRThrottlingPolicy) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0);
    }


    public String toString() {
        return "SetArrayIRThrottlingPolicy [cluster=" + this.cluster + ", " + "policy=" + this.policy + "]";
    }
}


