package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VnxCredentials", propOrder = {"username", "password", "certificate", "authenticationType"})
public class VnxCredentials {
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected byte[] password;
    @XmlElement(required = true)
    protected String certificate;
    @XmlElement(required = true, nillable = true)
    protected AuthenticationType authenticationType;

    public VnxCredentials() {
    }

    public VnxCredentials(String username, byte[] password, String certificate, AuthenticationType authenticationType) {
        this.username = username;
        this.password = password;
        this.certificate = certificate;
        this.authenticationType = authenticationType;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public String getCertificate() {
        return this.certificate;
    }


    public void setCertificate(String value) {
        this.certificate = value;
    }


    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }


    public void setAuthenticationType(AuthenticationType value) {
        this.authenticationType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VnxCredentials)) {
            return false;
        }
        VnxCredentials otherObj = (VnxCredentials) obj;

        return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.certificate != null ? this.certificate.equals(otherObj.certificate) : this.certificate == otherObj.certificate) && (this.authenticationType != null ? this.authenticationType.equals(otherObj.authenticationType) : this.authenticationType == otherObj.authenticationType);
    }


    public int hashCode() {
        return (this.username != null ? this.username.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.certificate != null ? this.certificate.hashCode() : 0) ^ (this.authenticationType != null ? this.authenticationType.hashCode() : 0);
    }


    public String toString() {
        return "VnxCredentials [username=" + this.username + ", " + "password=" + this.password + ", " + "certificate=" + this.certificate + ", " + "authenticationType=" + this.authenticationType + "]";
    }
}


