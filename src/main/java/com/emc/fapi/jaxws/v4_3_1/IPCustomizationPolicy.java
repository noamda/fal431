package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = IPv4CustomizationPolicy.class, name = "IPv4CustomizationPolicy"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = IPv6CustomizationPolicy.class, name = "IPv6CustomizationPolicy")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPCustomizationPolicy", propOrder = {"ip", "gateways"})
@XmlSeeAlso({IPv4CustomizationPolicy.class, IPv6CustomizationPolicy.class})
public abstract class IPCustomizationPolicy {
    @XmlElement(required = true)
    protected String ip;
    @XmlElement(required = true)
    protected List<String> gateways;

    public IPCustomizationPolicy() {
    }

    public IPCustomizationPolicy(String ip, List<String> gateways) {
        this.ip = ip;
        this.gateways = gateways;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public List<String> getGateways() {
        if (this.gateways == null) {
            this.gateways = new ArrayList();
        }
        return this.gateways;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof IPCustomizationPolicy)) {
            return false;
        }
        IPCustomizationPolicy otherObj = (IPCustomizationPolicy) obj;

        return (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip) && (this.gateways != null ? this.gateways.equals(otherObj.gateways) : this.gateways == otherObj.gateways);
    }


    public int hashCode() {
        return (this.ip != null ? this.ip.hashCode() : 0) ^ (this.gateways != null ? this.gateways.hashCode() : 0);
    }


    public String toString() {
        return "IPCustomizationPolicy [ip=" + this.ip + ", " + "gateways=" + this.gateways + "]";
    }
}


