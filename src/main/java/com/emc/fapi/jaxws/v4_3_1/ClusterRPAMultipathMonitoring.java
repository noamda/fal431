package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterRPAMultipathMonitoring", propOrder = {"clusterUID", "monitoringStorage", "monitoringSplitters"})
public class ClusterRPAMultipathMonitoring {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    protected boolean monitoringStorage;
    protected boolean monitoringSplitters;

    public ClusterRPAMultipathMonitoring() {
    }

    public ClusterRPAMultipathMonitoring(ClusterUID clusterUID, boolean monitoringStorage, boolean monitoringSplitters) {
        this.clusterUID = clusterUID;
        this.monitoringStorage = monitoringStorage;
        this.monitoringSplitters = monitoringSplitters;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean isMonitoringStorage() {
        return this.monitoringStorage;
    }


    public void setMonitoringStorage(boolean value) {
        this.monitoringStorage = value;
    }


    public boolean isMonitoringSplitters() {
        return this.monitoringSplitters;
    }


    public void setMonitoringSplitters(boolean value) {
        this.monitoringSplitters = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterRPAMultipathMonitoring)) {
            return false;
        }
        ClusterRPAMultipathMonitoring otherObj = (ClusterRPAMultipathMonitoring) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.monitoringStorage == otherObj.monitoringStorage) && (this.monitoringSplitters == otherObj.monitoringSplitters);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.monitoringStorage ? 1 : 0) ^ (this.monitoringSplitters ? 1 : 0);
    }


    public String toString() {
        return "ClusterRPAMultipathMonitoring [clusterUID=" + this.clusterUID + ", " + "monitoringStorage=" + this.monitoringStorage + ", " + "monitoringSplitters=" + this.monitoringSplitters + "]";
    }
}


