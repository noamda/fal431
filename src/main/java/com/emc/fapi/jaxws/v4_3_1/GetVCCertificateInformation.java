package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getVCCertificateInformation", propOrder = {"cluster", "ip", "port"})
public class GetVCCertificateInformation {
    protected ClusterUID cluster;
    protected String ip;
    protected int port;

    public GetVCCertificateInformation() {
    }

    public GetVCCertificateInformation(ClusterUID cluster, String ip, int port) {
        this.cluster = cluster;
        this.ip = ip;
        this.port = port;
    }


    public ClusterUID getCluster() {
        return this.cluster;
    }


    public void setCluster(ClusterUID value) {
        this.cluster = value;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetVCCertificateInformation)) {
            return false;
        }
        GetVCCertificateInformation otherObj = (GetVCCertificateInformation) obj;

        return (this.cluster != null ? this.cluster.equals(otherObj.cluster) : this.cluster == otherObj.cluster) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.port == otherObj.port);
    }


    public int hashCode() {
        return (this.cluster != null ? this.cluster.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0) ^ this.port;
    }


    public String toString() {
        return "GetVCCertificateInformation [cluster=" + this.cluster + ", " + "ip=" + this.ip + ", " + "port=" + this.port + "]";
    }
}


