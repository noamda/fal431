package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVmReplicationCandidateClusters", propOrder = {"cluster", "existingVmsParams"})
public class GetVmReplicationCandidateClusters {
    protected ClusterUID cluster;
    protected List<ExistingVMParam> existingVmsParams;

    public GetVmReplicationCandidateClusters() {
    }

    public GetVmReplicationCandidateClusters(ClusterUID cluster, List<ExistingVMParam> existingVmsParams) {
        this.cluster = cluster;
        this.existingVmsParams = existingVmsParams;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public List<ExistingVMParam> getExistingVmsParams() {
        if (this.existingVmsParams == null) {
            this.existingVmsParams = new ArrayList();
        }
        return this.existingVmsParams;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVmReplicationCandidateClusters)) {
            return false;
        }
        GetVmReplicationCandidateClusters otherObj = (GetVmReplicationCandidateClusters) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.existingVmsParams != null ? this.existingVmsParams.equals(otherObj.existingVmsParams) : this.existingVmsParams == otherObj.existingVmsParams);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.existingVmsParams != null ? this.existingVmsParams.hashCode() : 0);
    }


    public String toString() {
        return "GetVmReplicationCandidateClusters [cluster=" + this.cluster + ", " + "existingVmsParams=" + this.existingVmsParams + "]";
    }
}


