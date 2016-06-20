package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPInformation", propOrder = {"ipVersion", "ip"})
public class IPInformation {
    @XmlElement(nillable = true)
    protected IpVersion ipVersion;
    @XmlElement(required = true)
    protected String ip;

    public IPInformation() {
    }

    public IPInformation(IpVersion ipVersion, String ip) {
        this.ipVersion = ipVersion;
        this.ip = ip;
    }


    public IpVersion getIpVersion() {
        return this.ipVersion;
    }


    public void setIpVersion(IpVersion value) {
        this.ipVersion = value;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof IPInformation)) {
            return false;
        }
        IPInformation otherObj = (IPInformation) obj;

        return (this.ipVersion != null ? this.ipVersion.equals(otherObj.ipVersion) : this.ipVersion == otherObj.ipVersion) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
    }


    public int hashCode() {
        return (this.ipVersion != null ? this.ipVersion.hashCode() : 0) ^ (this.ip != null ? this.ip.hashCode() : 0);
    }


    public String toString() {
        return "IPInformation [ipVersion=" + this.ipVersion + ", " + "ip=" + this.ip + "]";
    }
}


