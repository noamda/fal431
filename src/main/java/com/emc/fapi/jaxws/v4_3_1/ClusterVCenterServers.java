package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVCenterServers", propOrder = {"clusterUID", "vcenterServers"})
public class ClusterVCenterServers {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<VCenterServer> vcenterServers;

    public ClusterVCenterServers() {
    }

    public ClusterVCenterServers(ClusterUID clusterUID, List<VCenterServer> vcenterServers) {
        this.clusterUID = clusterUID;
        this.vcenterServers = vcenterServers;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<VCenterServer> getVcenterServers() {
        if (this.vcenterServers == null) {
            this.vcenterServers = new ArrayList();
        }
        return this.vcenterServers;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterVCenterServers)) {
            return false;
        }
        ClusterVCenterServers otherObj = (ClusterVCenterServers) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.vcenterServers != null ? this.vcenterServers.equals(otherObj.vcenterServers) : this.vcenterServers == otherObj.vcenterServers);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.vcenterServers != null ? this.vcenterServers.hashCode() : 0);
    }


    public String toString() {
        return "ClusterVCenterServers [clusterUID=" + this.clusterUID + ", " + "vcenterServers=" + this.vcenterServers + "]";
    }
}


