package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVirtualEntitiesInformationFromClusters", propOrder = {"clusters"})
public class GetVirtualEntitiesInformationFromClusters {
    protected List<ClusterUID> clusters;

    public GetVirtualEntitiesInformationFromClusters() {
    }

    public GetVirtualEntitiesInformationFromClusters(List<ClusterUID> clusters) {
        this.clusters = clusters;
    }


    public List<ClusterUID> getClusters() {
        if (this.clusters == null) {
            this.clusters = new ArrayList();
        }
        return this.clusters;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVirtualEntitiesInformationFromClusters)) {
            return false;
        }
        GetVirtualEntitiesInformationFromClusters otherObj = (GetVirtualEntitiesInformationFromClusters) obj;

        return this.clusters == otherObj.clusters ? true : this.clusters != null ? this.clusters.equals(otherObj.clusters) : false;
    }


    public int hashCode() {
        return this.clusters != null ? this.clusters.hashCode() : 0;
    }


    public String toString() {
        return "GetVirtualEntitiesInformationFromClusters [clusters=" + this.clusters + "]";
    }
}


