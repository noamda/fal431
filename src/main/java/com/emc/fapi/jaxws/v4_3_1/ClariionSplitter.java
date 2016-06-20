package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionSplitter", propOrder = {"splitter", "creds", "password"})
public class ClariionSplitter {
    @XmlElement(required = true)
    protected SplitterUID splitter;
    protected ClariionSplitterCredentials creds;
    @XmlElement(required = true)
    protected byte[] password;

    public ClariionSplitter() {
    }

    public ClariionSplitter(SplitterUID splitter, ClariionSplitterCredentials creds, byte[] password) {
        this.splitter = splitter;
        this.creds = creds;
        this.password = password;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public ClariionSplitterCredentials getCreds() {
        return this.creds;
    }


    public void setCreds(ClariionSplitterCredentials value) {
        this.creds = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionSplitter)) {
            return false;
        }
        ClariionSplitter otherObj = (ClariionSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.creds != null ? this.creds.equals(otherObj.creds) : this.creds == otherObj.creds) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.creds != null ? this.creds.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
    }


    public String toString() {
        return "ClariionSplitter [splitter=" + this.splitter + ", " + "creds=" + this.creds + ", " + "password=" + this.password + "]";
    }
}


