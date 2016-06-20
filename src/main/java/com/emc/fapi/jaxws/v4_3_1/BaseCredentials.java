package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VcCredentials.class, name = "VcCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClariionCredentials.class, name = "ClariionCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = XioCredentials.class, name = "XioCredentials"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VplexCredentials.class, name = "VplexCredentials")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseCredentials", propOrder = {"username", "password"})
@XmlSeeAlso({VplexCredentials.class, ClariionCredentials.class, VcCredentials.class, XioCredentials.class})
public class BaseCredentials {
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected byte[] password;

    public BaseCredentials() {
    }

    public BaseCredentials(String username, byte[] password) {
        this.username = username;
        this.password = password;
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


    public boolean equals(Object obj) {
        if (!(obj instanceof BaseCredentials)) {
            return false;
        }
        BaseCredentials otherObj = (BaseCredentials) obj;

        return (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username) && (this.password != null ? this.password.equals(otherObj.password) : this.password == otherObj.password);
    }


    public int hashCode() {
        return (this.username != null ? this.username.hashCode() : 0) ^ (this.password != null ? this.password.hashCode() : 0);
    }


    public String toString() {
        return "BaseCredentials [username=" + this.username + ", " + "password=" + this.password + "]";
    }
}


