package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteClusterConnectionInformation", propOrder = {"cluster", "connectionType"})
public class RemoteClusterConnectionInformation {
    protected ClusterUID cluster;
    @XmlElement(nillable = true)
    protected ConnectionType connectionType;

    public RemoteClusterConnectionInformation() {
    }

    public RemoteClusterConnectionInformation(ClusterUID cluster, ConnectionType connectionType) {
        this.cluster = cluster;
        this.connectionType = connectionType;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public ConnectionType getConnectionType() {
        return this.connectionType;
    }


    public void setConnectionType(ConnectionType value) {
        this.connectionType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RemoteClusterConnectionInformation)) {
            return false;
        }
        RemoteClusterConnectionInformation otherObj = (RemoteClusterConnectionInformation) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.connectionType != null ? this.connectionType.equals(otherObj.connectionType) : this.connectionType == otherObj.connectionType);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.connectionType != null ? this.connectionType.hashCode() : 0);
    }


    public String toString() {
        return "RemoteClusterConnectionInformation [cluster=" + this.cluster + ", " + "connectionType=" + this.connectionType + "]";
    }
}


