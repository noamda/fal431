package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemStatistics", propOrder = {"clusterStatistics", "consistencyGroupStatistics", "currentRPATime", "rpaStatistics"})
public class SystemStatistics {
    @XmlElement(nillable = true)
    protected List<ClusterStatistics> clusterStatistics;
    @XmlElement(nillable = true)
    protected List<ConsistencyGroupStatistics> consistencyGroupStatistics;
    protected RecoverPointTimeStamp currentRPATime;
    @XmlElement(nillable = true)
    protected List<RPAStatistics> rpaStatistics;

    public SystemStatistics() {
    }

    public SystemStatistics(List<ClusterStatistics> clusterStatistics, List<ConsistencyGroupStatistics> consistencyGroupStatistics, RecoverPointTimeStamp currentRPATime, List<RPAStatistics> rpaStatistics) {
        this.clusterStatistics = clusterStatistics;
        this.consistencyGroupStatistics = consistencyGroupStatistics;
        this.currentRPATime = currentRPATime;
        this.rpaStatistics = rpaStatistics;
    }


    public List<ClusterStatistics> getClusterStatistics() {
        if (this.clusterStatistics == null) {
            this.clusterStatistics = new ArrayList();
        }
        return this.clusterStatistics;
    }


    public List<ConsistencyGroupStatistics> getConsistencyGroupStatistics() {
        if (this.consistencyGroupStatistics == null) {
            this.consistencyGroupStatistics = new ArrayList();
        }
        return this.consistencyGroupStatistics;
    }


    public RecoverPointTimeStamp getCurrentRPATime() {
        return this.currentRPATime;
    }


    public void setCurrentRPATime(RecoverPointTimeStamp value) {
        this.currentRPATime = value;
    }


    public List<RPAStatistics> getRpaStatistics() {
        if (this.rpaStatistics == null) {
            this.rpaStatistics = new ArrayList();
        }
        return this.rpaStatistics;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SystemStatistics)) {
            return false;
        }
        SystemStatistics otherObj = (SystemStatistics) obj;

        return (this.clusterStatistics != null ? this.clusterStatistics.equals(otherObj.clusterStatistics) : this.clusterStatistics == otherObj.clusterStatistics) && (this.consistencyGroupStatistics != null ? this.consistencyGroupStatistics.equals(otherObj.consistencyGroupStatistics) : this.consistencyGroupStatistics == otherObj.consistencyGroupStatistics) && (this.currentRPATime != null ? this.currentRPATime.equals(otherObj.currentRPATime) : this.currentRPATime == otherObj.currentRPATime) && (this.rpaStatistics != null ? this.rpaStatistics.equals(otherObj.rpaStatistics) : this.rpaStatistics == otherObj.rpaStatistics);
    }


    public int hashCode() {
        return (this.clusterStatistics != null ? this.clusterStatistics.hashCode() : 0) ^ (this.consistencyGroupStatistics != null ? this.consistencyGroupStatistics.hashCode() : 0) ^ (this.currentRPATime != null ? this.currentRPATime.hashCode() : 0) ^ (this.rpaStatistics != null ? this.rpaStatistics.hashCode() : 0);
    }


    public String toString() {
        return "SystemStatistics [clusterStatistics=" + this.clusterStatistics + ", " + "consistencyGroupStatistics=" + this.consistencyGroupStatistics + ", " + "currentRPATime=" + this.currentRPATime + ", " + "rpaStatistics=" + this.rpaStatistics + "]";
    }
}


