package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rescanSANVolumesInCluster", propOrder = {"cluster", "checkExistingVolumesAsWell"})
public class RescanSANVolumesInCluster {
    protected ClusterUID cluster;
    protected boolean checkExistingVolumesAsWell;

    public RescanSANVolumesInCluster() {
    }

    public RescanSANVolumesInCluster(ClusterUID cluster, boolean checkExistingVolumesAsWell) {
        this.cluster = cluster;
        this.checkExistingVolumesAsWell = checkExistingVolumesAsWell;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public boolean isCheckExistingVolumesAsWell() {
        return this.checkExistingVolumesAsWell;
    }


    public void setCheckExistingVolumesAsWell(boolean value) {
        this.checkExistingVolumesAsWell = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RescanSANVolumesInCluster)) {
            return false;
        }
        RescanSANVolumesInCluster otherObj = (RescanSANVolumesInCluster) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.checkExistingVolumesAsWell == otherObj.checkExistingVolumesAsWell);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.checkExistingVolumesAsWell ? 1 : 0);
    }


    public String toString() {
        return "RescanSANVolumesInCluster [cluster=" + this.cluster + ", " + "checkExistingVolumesAsWell=" + this.checkExistingVolumesAsWell + "]";
    }
}


