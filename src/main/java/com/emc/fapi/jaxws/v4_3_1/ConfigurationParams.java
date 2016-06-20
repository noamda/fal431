package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationParams", propOrder = {"connectionParams", "credentials"})
public class ConfigurationParams {
    @XmlElement(required = true)
    protected BaseConnectionParams connectionParams;
    @XmlElement(required = true)
    protected BaseCredentials credentials;

    public ConfigurationParams() {
    }

    public ConfigurationParams(BaseConnectionParams connectionParams, BaseCredentials credentials) {
        this.connectionParams = connectionParams;
        this.credentials = credentials;
    }


    public BaseConnectionParams getConnectionParams() {
        return this.connectionParams;
    }


    public void setConnectionParams(BaseConnectionParams value) {
        this.connectionParams = value;
    }


    public BaseCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(BaseCredentials value) {
        this.credentials = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ConfigurationParams)) {
            return false;
        }
        ConfigurationParams otherObj = (ConfigurationParams) obj;

        return (this.connectionParams != null ? this.connectionParams.equals(otherObj.connectionParams) : this.connectionParams == otherObj.connectionParams) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials);
    }


    public int hashCode() {
        return (this.connectionParams != null ? this.connectionParams.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0);
    }


    public String toString() {
        return "ConfigurationParams [connectionParams=" + this.connectionParams + ", " + "credentials=" + this.credentials + "]";
    }
}


