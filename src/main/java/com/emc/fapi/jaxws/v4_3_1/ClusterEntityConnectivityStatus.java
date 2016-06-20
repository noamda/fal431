package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = RPAConnectivityStatus.class, name = "RPAConnectivityStatus"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VolumeConnectivityStatus.class, name = "VolumeConnectivityStatus"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SplitterConnectivityStatus.class, name = "SplitterConnectivityStatus")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterEntityConnectivityStatus", propOrder = {"clusterUID", "entityType", "connectivityStatus"})
@XmlSeeAlso({RPAConnectivityStatus.class, VolumeConnectivityStatus.class, SplitterConnectivityStatus.class})
public abstract class ClusterEntityConnectivityStatus {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected ClusterEntityType entityType;
    protected GeneralStatus connectivityStatus;

    public ClusterEntityConnectivityStatus() {
    }

    public ClusterEntityConnectivityStatus(ClusterUID clusterUID, ClusterEntityType entityType, GeneralStatus connectivityStatus) {
        this.clusterUID = clusterUID;
        this.entityType = entityType;
        this.connectivityStatus = connectivityStatus;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public ClusterEntityType getEntityType() {
        return this.entityType;
    }


    public void setEntityType(ClusterEntityType value) {
        this.entityType = value;
    }


    public GeneralStatus getConnectivityStatus() {
        return this.connectivityStatus;
    }


    public void setConnectivityStatus(GeneralStatus value) {
        this.connectivityStatus = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterEntityConnectivityStatus)) {
            return false;
        }
        ClusterEntityConnectivityStatus otherObj = (ClusterEntityConnectivityStatus) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.entityType != null ? this.entityType.equals(otherObj.entityType) : this.entityType == otherObj.entityType) && (this.connectivityStatus != null ? this.connectivityStatus.equals(otherObj.connectivityStatus) : this.connectivityStatus == otherObj.connectivityStatus);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.entityType != null ? this.entityType.hashCode() : 0) ^ (this.connectivityStatus != null ? this.connectivityStatus.hashCode() : 0);
    }


    public String toString() {
        return "ClusterEntityConnectivityStatus [clusterUID=" + this.clusterUID + ", " + "entityType=" + this.entityType + ", " + "connectivityStatus=" + this.connectivityStatus + "]";
    }
}


