package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LDAPServer", propOrder = {"address", "port"})
public class LDAPServer {
    protected String address;
    protected int port;

    public LDAPServer() {
    }

    public LDAPServer(String address, int port) {
        this.address = address;
        this.port = port;
    }


    public String getAddress() {
        return this.address;
    }


    public void setAddress(String value) {
        this.address = value;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LDAPServer)) {
            return false;
        }
        LDAPServer otherObj = (LDAPServer) obj;

        return (this.address != null ? this.address.equals(otherObj.address) : this.address == otherObj.address) && (this.port == otherObj.port);
    }


    public int hashCode() {
        return (this.address != null ? this.address.hashCode() : 0) ^ this.port;
    }


    public String toString() {
        return "LDAPServer [address=" + this.address + ", " + "port=" + this.port + "]";
    }
}


