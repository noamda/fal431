package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SNMPUser", propOrder = {"username", "password", "certificates"})
public class SNMPUser {
    @XmlElement(required = true)
    protected String username;
    protected byte[] password;
    protected String certificates;

    public SNMPUser() {
    }

    public SNMPUser(String username, byte[] password, String certificates) {
        this.username = username;
        this.password = password;
        this.certificates = certificates;
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


    public String getCertificates() {
        return this.certificates;
    }


    public void setCertificates(String value) {
        this.certificates = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SNMPUser)) {
            return false;
        }
        SNMPUser otherObj = (SNMPUser) obj;

        return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password) && (this.certificates != null ? this.certificates.equals(otherObj.certificates) : this.certificates == otherObj.certificates);
    }


    public int hashCode() {
        return (this.username != null ? this.username.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0) ^ (this.certificates != null ? this.certificates.hashCode() : 0);
    }


    public String toString() {
        return "SNMPUser [username=" + this.username + ", " + "password=" + this.password + ", " + "certificates=" + this.certificates + "]";
    }
}


