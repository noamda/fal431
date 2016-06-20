package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVPLEXCertificateInformation", propOrder = {"ip", "clusterUID"})
public class GetVPLEXCertificateInformation {
    protected String ip;
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;

    public GetVPLEXCertificateInformation() {
    }

    public GetVPLEXCertificateInformation(String ip, ClusterUID clusterUID) {
        this.ip = ip;
        this.clusterUID = clusterUID;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVPLEXCertificateInformation)) {
            return false;
        }
        GetVPLEXCertificateInformation otherObj = (GetVPLEXCertificateInformation) obj;

        return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID);
    }


    public int hashCode() {
        return (this.ip != null ? this.ip.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0);
    }


    public String toString() {
        return "GetVPLEXCertificateInformation [ip=" + this.ip + ", " + "clusterUID=" + this.clusterUID + "]";
    }
}


