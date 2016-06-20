package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSyslogHost", propOrder = {"clusterUID", "hostAddress"})
public class ClusterSyslogHost {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(required = true)
    protected String hostAddress;

    public ClusterSyslogHost() {
    }

    public ClusterSyslogHost(ClusterUID clusterUID, String hostAddress) {
        this.clusterUID = clusterUID;
        this.hostAddress = hostAddress;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public String getHostAddress() {
        return this.hostAddress;
    }


    public void setHostAddress(String value) {
        this.hostAddress = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSyslogHost)) {
            return false;
        }
        ClusterSyslogHost otherObj = (ClusterSyslogHost) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.hostAddress != null ? this.hostAddress.equals(otherObj.hostAddress) : this.hostAddress == otherObj.hostAddress);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.hostAddress != null ? this.hostAddress.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSyslogHost [clusterUID=" + this.clusterUID + ", " + "hostAddress=" + this.hostAddress + "]";
    }
}


