package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterVirtualInfraConfiguration", propOrder = {"clusterUID", "virtualCentersConfiguration"})
public class ClusterVirtualInfraConfiguration {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected List<VirtualCenterConfiguration> virtualCentersConfiguration;

    public ClusterVirtualInfraConfiguration() {
    }

    public ClusterVirtualInfraConfiguration(ClusterUID clusterUID, List<VirtualCenterConfiguration> virtualCentersConfiguration) {
        this.clusterUID = clusterUID;
        this.virtualCentersConfiguration = virtualCentersConfiguration;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public List<VirtualCenterConfiguration> getVirtualCentersConfiguration() {
        if (this.virtualCentersConfiguration == null) {
            this.virtualCentersConfiguration = new ArrayList();
        }
        return this.virtualCentersConfiguration;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterVirtualInfraConfiguration)) {
            return false;
        }
        ClusterVirtualInfraConfiguration otherObj = (ClusterVirtualInfraConfiguration) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.virtualCentersConfiguration != null ? this.virtualCentersConfiguration.equals(otherObj.virtualCentersConfiguration) : this.virtualCentersConfiguration == otherObj.virtualCentersConfiguration);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.virtualCentersConfiguration != null ? this.virtualCentersConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "ClusterVirtualInfraConfiguration [clusterUID=" + this.clusterUID + ", " + "virtualCentersConfiguration=" + this.virtualCentersConfiguration + "]";
    }
}


