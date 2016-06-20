package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "startClusterMaintenance", propOrder = {"cluster", "maintenanceMode"})
public class StartClusterMaintenance {
    protected ClusterUID cluster;
    protected ClusterMaintenanceMode maintenanceMode;

    public StartClusterMaintenance() {
    }

    public StartClusterMaintenance(ClusterUID cluster, ClusterMaintenanceMode maintenanceMode) {
        this.cluster = cluster;
        this.maintenanceMode = maintenanceMode;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public ClusterMaintenanceMode getMaintenanceMode() {
        return this.maintenanceMode;
    }


    public void setMaintenanceMode(ClusterMaintenanceMode value) {
        this.maintenanceMode = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof StartClusterMaintenance)) {
            return false;
        }
        StartClusterMaintenance otherObj = (StartClusterMaintenance) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.maintenanceMode != null ? this.maintenanceMode.equals(otherObj.maintenanceMode) : this.maintenanceMode == otherObj.maintenanceMode);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.maintenanceMode != null ? this.maintenanceMode.hashCode() : 0);
    }


    public String toString() {
        return "StartClusterMaintenance [cluster=" + this.cluster + ", " + "maintenanceMode=" + this.maintenanceMode + "]";
    }
}


