package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VplexSplitter", propOrder = {"splitter", "creds", "password"})
public class VplexSplitter {
    @XmlElement(required = true)
    protected SplitterUID splitter;
    protected VplexSplitterCredentials creds;
    protected byte[] password;

    public VplexSplitter() {
    }

    public VplexSplitter(SplitterUID splitter, VplexSplitterCredentials creds, byte[] password) {
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


    public VplexSplitterCredentials getCreds() {
        return this.creds;
    }


    public void setCreds(VplexSplitterCredentials value) {
        this.creds = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VplexSplitter)) {
            return false;
        }
        VplexSplitter otherObj = (VplexSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.creds != null ? this.creds.equals(otherObj.creds) : this.creds == otherObj.creds) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.creds != null ? this.creds.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
    }


    public String toString() {
        return "VplexSplitter [splitter=" + this.splitter + ", " + "creds=" + this.creds + ", " + "password=" + this.password + "]";
    }
}


