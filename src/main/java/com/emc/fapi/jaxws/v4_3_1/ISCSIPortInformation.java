package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = LocalISCSIPortInformation.class, name = "LocalISCSIPortInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = RemoteISCSIPortInformation.class, name = "RemoteISCSIPortInformation")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ISCSIPortInformation", propOrder = {"port", "chap"})
@XmlSeeAlso({RemoteISCSIPortInformation.class, LocalISCSIPortInformation.class})
public abstract class ISCSIPortInformation {
    protected int port;
    @XmlElement(nillable = true)
    protected Chap chap;

    public ISCSIPortInformation() {
    }

    public ISCSIPortInformation(int port, Chap chap) {
        this.port = port;
        this.chap = chap;
    }


    public int getPort() {
        return this.port;
    }


    public void setPort(int value) {
        this.port = value;
    }


    public Chap getChap() {
        return this.chap;
    }


    public void setChap(Chap value) {
        this.chap = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ISCSIPortInformation)) {
            return false;
        }
        ISCSIPortInformation otherObj = (ISCSIPortInformation) obj;

        return (this.port == otherObj.port) && (this.chap != null ? this.chap.equals(otherObj.chap) : this.chap == otherObj.chap);
    }


    public int hashCode() {
        return this.port ^ (this.chap != null ? this.chap.hashCode() : 0);
    }


    public String toString() {
        return "ISCSIPortInformation [port=" + this.port + ", " + "chap=" + this.chap + "]";
    }
}


