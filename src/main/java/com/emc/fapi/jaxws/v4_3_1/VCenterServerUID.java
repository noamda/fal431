package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerUID", propOrder = {"clusterUID", "ip"})
public class VCenterServerUID {
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(required = true)
    protected String ip;

    public VCenterServerUID() {
    }

    public VCenterServerUID(ClusterUID clusterUID, String ip) {
        this.clusterUID = clusterUID;
        this.ip = ip;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerUID)) {
            return false;
        }
        VCenterServerUID otherObj = (VCenterServerUID) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
    }


    public String toString() {
        return "VCenterServerUID [clusterUID=" + this.clusterUID + ", " + "ip=" + this.ip + "]";
    }
}


