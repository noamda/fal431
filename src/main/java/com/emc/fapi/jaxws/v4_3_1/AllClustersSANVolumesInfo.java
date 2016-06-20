package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllClustersSANVolumesInfo", propOrder = {"clustersSanVols"})
public class AllClustersSANVolumesInfo {
    @XmlElement(nillable = true)
    protected List<ClusterSANVolumes> clustersSanVols;

    public AllClustersSANVolumesInfo() {
    }

    public AllClustersSANVolumesInfo(List<ClusterSANVolumes> clustersSanVols) {
        this.clustersSanVols = clustersSanVols;
    }


    public List<ClusterSANVolumes> getClustersSanVols() {
        if (this.clustersSanVols == null) {
            this.clustersSanVols = new ArrayList();
        }
        return this.clustersSanVols;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AllClustersSANVolumesInfo)) {
            return false;
        }
        AllClustersSANVolumesInfo otherObj = (AllClustersSANVolumesInfo) obj;

        return this.clustersSanVols == otherObj.clustersSanVols ? true : this.clustersSanVols != null ? this.clustersSanVols.equals(otherObj.clustersSanVols) : false;
    }


    public int hashCode() {
        return this.clustersSanVols != null ? this.clustersSanVols.hashCode() : 0;
    }


    public String toString() {
        return "AllClustersSANVolumesInfo [clustersSanVols=" + this.clustersSanVols + "]";
    }
}


