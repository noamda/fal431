package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecoverPointClustersInformation", propOrder = {"clustersInformation"})
public class RecoverPointClustersInformation {
    @XmlElement(nillable = true)
    protected List<ClusterInfo> clustersInformation;

    public RecoverPointClustersInformation() {
    }

    public RecoverPointClustersInformation(List<ClusterInfo> clustersInformation) {
        this.clustersInformation = clustersInformation;
    }


    public List<ClusterInfo> getClustersInformation() {
        if (this.clustersInformation == null) {
            this.clustersInformation = new ArrayList();
        }
        return this.clustersInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RecoverPointClustersInformation)) {
            return false;
        }
        RecoverPointClustersInformation otherObj = (RecoverPointClustersInformation) obj;

        return this.clustersInformation == otherObj.clustersInformation ? true : this.clustersInformation != null ? this.clustersInformation.equals(otherObj.clustersInformation) : false;
    }


    public int hashCode() {
        return this.clustersInformation != null ? this.clustersInformation.hashCode() : 0;
    }


    public String toString() {
        return "RecoverPointClustersInformation [clustersInformation=" + this.clustersInformation + "]";
    }
}


