package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("CollectLogsSplitterParamWithCredentials")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectLogsSplitterParamWithCredentials", propOrder = {"credentials", "password"})
public class CollectLogsSplitterParamWithCredentials
        extends CollectLogsSplitterParam {
    @XmlElement(required = true)
    protected BaseSplitterCredentials credentials;
    protected byte[] password;

    public CollectLogsSplitterParamWithCredentials() {
    }

    public CollectLogsSplitterParamWithCredentials(BaseSplitterCredentials credentials, byte[] password) {
        this.credentials = credentials;
        this.password = password;
    }


    public BaseSplitterCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(BaseSplitterCredentials value) {
        this.credentials = value;
    }


    public byte[] getPassword() {
        return this.password;
    }


    public void setPassword(byte[] value) {
        this.password = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CollectLogsSplitterParamWithCredentials)) {
            return false;
        }
        CollectLogsSplitterParamWithCredentials otherObj = (CollectLogsSplitterParamWithCredentials) obj;

        return (super.equals(obj)) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
    }


    public String toString() {
        return "CollectLogsSplitterParamWithCredentials [super=" + super.toString() + ", " + "credentials=" + this.credentials + ", " + "password=" + this.password + "]";
    }
}


