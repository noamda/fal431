package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getClustersVirtualInfraConfiguration", propOrder = {"clusterUIDs"})
public class GetClustersVirtualInfraConfiguration {
    protected List<ClusterUID> clusterUIDs;

    public GetClustersVirtualInfraConfiguration() {
    }

    public GetClustersVirtualInfraConfiguration(List<ClusterUID> clusterUIDs) {
        this.clusterUIDs = clusterUIDs;
    }


    public List<ClusterUID> getClusterUIDs() {
        if (this.clusterUIDs == null) {
            this.clusterUIDs = new ArrayList();
        }
        return this.clusterUIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetClustersVirtualInfraConfiguration)) {
            return false;
        }
        GetClustersVirtualInfraConfiguration otherObj = (GetClustersVirtualInfraConfiguration) obj;

        return this.clusterUIDs == otherObj.clusterUIDs ? true : this.clusterUIDs != null ? this.clusterUIDs.equals(otherObj.clusterUIDs) : false;
    }


    public int hashCode() {
        return this.clusterUIDs != null ? this.clusterUIDs.hashCode() : 0;
    }


    public String toString() {
        return "GetClustersVirtualInfraConfiguration [clusterUIDs=" + this.clusterUIDs + "]";
    }
}


