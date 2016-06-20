package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClustersVirtualInfraConfiguration", propOrder = {"clustersConfigurationSet"})
public class ClustersVirtualInfraConfiguration {
    @XmlElement(nillable = true)
    protected List<ClusterVirtualInfraConfiguration> clustersConfigurationSet;

    public ClustersVirtualInfraConfiguration() {
    }

    public ClustersVirtualInfraConfiguration(List<ClusterVirtualInfraConfiguration> clustersConfigurationSet) {
        this.clustersConfigurationSet = clustersConfigurationSet;
    }


    public List<ClusterVirtualInfraConfiguration> getClustersConfigurationSet() {
        if (this.clustersConfigurationSet == null) {
            this.clustersConfigurationSet = new ArrayList();
        }
        return this.clustersConfigurationSet;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClustersVirtualInfraConfiguration)) {
            return false;
        }
        ClustersVirtualInfraConfiguration otherObj = (ClustersVirtualInfraConfiguration) obj;

        return this.clustersConfigurationSet == otherObj.clustersConfigurationSet ? true : this.clustersConfigurationSet != null ? this.clustersConfigurationSet.equals(otherObj.clustersConfigurationSet) : false;
    }


    public int hashCode() {
        return this.clustersConfigurationSet != null ? this.clustersConfigurationSet.hashCode() : 0;
    }


    public String toString() {
        return "ClustersVirtualInfraConfiguration [clustersConfigurationSet=" + this.clustersConfigurationSet + "]";
    }
}


