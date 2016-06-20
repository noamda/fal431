package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSplittersSettingsFromCluster", propOrder = {"cluster"})
public class GetSplittersSettingsFromCluster {
    protected ClusterUID cluster;

    public GetSplittersSettingsFromCluster() {
    }

    public GetSplittersSettingsFromCluster(ClusterUID cluster) {
        this.cluster = cluster;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSplittersSettingsFromCluster)) {
            return false;
        }
        GetSplittersSettingsFromCluster otherObj = (GetSplittersSettingsFromCluster) obj;

        return this.cluster == otherObj.cluster ? true : this.cluster != null ? this.cluster.equals(otherObj.cluster) : false;
    }


    public int hashCode() {
        return this.cluster != null ? this.cluster.hashCode() : 0;
    }


    public String toString() {
        return "GetSplittersSettingsFromCluster [cluster=" + this.cluster + "]";
    }
}


