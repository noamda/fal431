package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServer", propOrder = {"vcenterServerUID", "userName", "port", "certificateConfigured"})
public class VCenterServer {
    @XmlElement(nillable = true)
    protected VCenterServerUID vcenterServerUID;
    protected String userName;
    protected int port;
    protected boolean certificateConfigured;

    public VCenterServer() {
    }

    public VCenterServer(VCenterServerUID vcenterServerUID, String userName, int port, boolean certificateConfigured) {
        this.vcenterServerUID = vcenterServerUID;
        this.userName = userName;
        this.port = port;
        this.certificateConfigured = certificateConfigured;
    }


    public VCenterServerUID getVcenterServerUID() {
        return this.vcenterServerUID;
    }


    public void setVcenterServerUID(VCenterServerUID value) {
        this.vcenterServerUID = value;
    }


    public String getUserName() {
        return this.userName;
    }


    public void setUserName(String value) {
        this.userName = value;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public boolean isCertificateConfigured() {
        return this.certificateConfigured;
    }


    public void setCertificateConfigured(boolean value) {
        this.certificateConfigured = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServer)) {
            return false;
        }
        VCenterServer otherObj = (VCenterServer) obj;

        return (this.vcenterServerUID != null ? this.vcenterServerUID.equals(otherObj.vcenterServerUID) : this.vcenterServerUID == otherObj.vcenterServerUID) && (this.userName != null ? this.userName.equals(otherObj.userName) : this.userName == otherObj.userName) && (this.port == otherObj.port) && (this.certificateConfigured == otherObj.certificateConfigured);
    }


    public int hashCode() {
        return (this.vcenterServerUID != null ? this.vcenterServerUID.hashCode() : 0) ^ (this.userName != null ? this.userName.hashCode() : 0) ^ this.port ^ (this.certificateConfigured ? 1 : 0);
    }


    public String toString() {
        return "VCenterServer [vcenterServerUID=" + this.vcenterServerUID + ", " + "userName=" + this.userName + ", " + "port=" + this.port + ", " + "certificateConfigured=" + this.certificateConfigured + "]";
    }
}


