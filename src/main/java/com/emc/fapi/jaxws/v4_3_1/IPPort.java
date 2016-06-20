package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPPort", propOrder = {"ip", "port"})
public class IPPort {
    protected String ip;
    protected int port;

    public IPPort() {
    }

    public IPPort(String ip, int port) {
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
        if (!(obj instanceof IPPort)) {
            return false;
        }
        IPPort otherObj = (IPPort) obj;

        return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.port == otherObj.port);
    }


    public int hashCode() {
        return (this.ip != null ? this.ip.hashCode() : 0) ^ this.port;
    }


    public String toString() {
        return "IPPort [ip=" + this.ip + ", " + "port=" + this.port + "]";
    }
}


