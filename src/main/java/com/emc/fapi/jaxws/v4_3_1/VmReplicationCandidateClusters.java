package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationCandidateClusters", propOrder = {"nonCandidateClustersReasons", "replicationCandidateClusters"})
public class VmReplicationCandidateClusters {
    @XmlElement(nillable = true)
    protected List<VmReplicationNonCandidateClusterReasons> nonCandidateClustersReasons;
    @XmlElement(nillable = true)
    protected List<VmReplicationCandidateCluster> replicationCandidateClusters;

    public VmReplicationCandidateClusters() {
    }

    public VmReplicationCandidateClusters(List<VmReplicationNonCandidateClusterReasons> nonCandidateClustersReasons, List<VmReplicationCandidateCluster> replicationCandidateClusters) {
        this.nonCandidateClustersReasons = nonCandidateClustersReasons;
        this.replicationCandidateClusters = replicationCandidateClusters;
    }


    public List<VmReplicationNonCandidateClusterReasons> getNonCandidateClustersReasons() {
        if (this.nonCandidateClustersReasons == null) {
            this.nonCandidateClustersReasons = new ArrayList();
        }
        return this.nonCandidateClustersReasons;
    }


    public List<VmReplicationCandidateCluster> getReplicationCandidateClusters() {
        if (this.replicationCandidateClusters == null) {
            this.replicationCandidateClusters = new ArrayList();
        }
        return this.replicationCandidateClusters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationCandidateClusters)) {
            return false;
        }
        VmReplicationCandidateClusters otherObj = (VmReplicationCandidateClusters) obj;

        return (this.nonCandidateClustersReasons != null ? this.nonCandidateClustersReasons.equals(otherObj.nonCandidateClustersReasons) : this.nonCandidateClustersReasons == otherObj.nonCandidateClustersReasons) && (this.replicationCandidateClusters != null ? this.replicationCandidateClusters.equals(otherObj.replicationCandidateClusters) : this.replicationCandidateClusters == otherObj.replicationCandidateClusters);
    }


    public int hashCode() {
        return (this.nonCandidateClustersReasons != null ? this.nonCandidateClustersReasons.hashCode() : 0) ^ (this.replicationCandidateClusters != null ? this.replicationCandidateClusters.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationCandidateClusters [nonCandidateClustersReasons=" + this.nonCandidateClustersReasons + ", " + "replicationCandidateClusters=" + this.replicationCandidateClusters + "]";
    }
}


