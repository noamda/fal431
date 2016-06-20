package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClariionSplitterCredentials.class, name = "ClariionSplitterCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VplexSplitterCredentials.class, name = "VplexSplitterCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VnxSplitterCredentials.class, name = "VnxSplitterCredentials")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseSplitterCredentials", propOrder = {"username", "passwordConfigured", "ip"})
@XmlSeeAlso({ClariionSplitterCredentials.class, VnxSplitterCredentials.class, VplexSplitterCredentials.class})
public abstract class BaseSplitterCredentials {
    @XmlElement(required = true)
    protected String username;
    protected boolean passwordConfigured;
    @XmlElement(required = true)
    protected String ip;

    public BaseSplitterCredentials() {
    }

    public BaseSplitterCredentials(String username, boolean passwordConfigured, String ip) {
        this.username = username;
        this.passwordConfigured = passwordConfigured;
        this.ip = ip;
    }


    public String getUsername() {
        return this.username;
    }


    public void setUsername(String value) {
        this.username = value;
    }


    public boolean isPasswordConfigured() {
        return this.passwordConfigured;
    }


    public void setPasswordConfigured(boolean value) {
        this.passwordConfigured = value;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof BaseSplitterCredentials)) {
            return false;
        }
        BaseSplitterCredentials otherObj = (BaseSplitterCredentials) obj;

        return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.passwordConfigured == otherObj.passwordConfigured) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
    }


    public int hashCode() {
        return (this.username != null ? this.username.hashCode() : 0) ^ (this.passwordConfigured ? 1 : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
    }


    public String toString() {
        return "BaseSplitterCredentials [username=" + this.username + ", " + "passwordConfigured=" + this.passwordConfigured + ", " + "ip=" + this.ip + "]";
    }
}


