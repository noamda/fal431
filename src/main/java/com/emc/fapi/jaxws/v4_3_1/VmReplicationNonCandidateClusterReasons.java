package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmReplicationNonCandidateClusterReasons", propOrder = {"clusterUID", "reasons"})
public class VmReplicationNonCandidateClusterReasons {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<String> reasons;

    public VmReplicationNonCandidateClusterReasons() {
    }

    public VmReplicationNonCandidateClusterReasons(ClusterUID clusterUID, List<String> reasons) {
        this.clusterUID = clusterUID;
        this.reasons = reasons;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<String> getReasons() {
        if (this.reasons == null) {
            this.reasons = new ArrayList();
        }
        return this.reasons;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VmReplicationNonCandidateClusterReasons)) {
            return false;
        }
        VmReplicationNonCandidateClusterReasons otherObj = (VmReplicationNonCandidateClusterReasons) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.reasons != null ? this.reasons.equals(otherObj.reasons) : this.reasons == otherObj.reasons);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.reasons != null ? this.reasons.hashCode() : 0);
    }


    public String toString() {
        return "VmReplicationNonCandidateClusterReasons [clusterUID=" + this.clusterUID + ", " + "reasons=" + this.reasons + "]";
    }
}


