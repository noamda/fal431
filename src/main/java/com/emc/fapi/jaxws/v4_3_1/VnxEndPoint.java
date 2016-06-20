package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnxEndPoint", propOrder = {"ip", "port"})
public class VnxEndPoint {
    @XmlElement(required = true)
    protected String ip;
    protected int port;

    public VnxEndPoint() {
    }

    public VnxEndPoint(String ip, int port) {
        this.ip = ip;
        this.port = port;
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
        if (!(obj instanceof VnxEndPoint)) {
            return false;
        }
        VnxEndPoint otherObj = (VnxEndPoint) obj;

        return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.port == otherObj.port);
    }


    public int hashCode() {
        return (this.ip != null ? this.ip.hashCode() : 0) ^ this.port;
    }


    public String toString() {
        return "VnxEndPoint [ip=" + this.ip + ", " + "port=" + this.port + "]";
    }
}


