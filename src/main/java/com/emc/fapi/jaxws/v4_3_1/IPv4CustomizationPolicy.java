package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("IPv4CustomizationPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv4CustomizationPolicy", propOrder = {"subnetMask"})
public class IPv4CustomizationPolicy
        extends IPCustomizationPolicy {
    @XmlElement(required = true)
    protected String subnetMask;

    public IPv4CustomizationPolicy() {
    }

    public IPv4CustomizationPolicy(String subnetMask) {
        this.subnetMask = subnetMask;
    }


    public String getSubnetMask() {
        return this.subnetMask;
    }


    public void setSubnetMask(String value) {
        this.subnetMask = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof IPv4CustomizationPolicy)) {
            return false;
        }
        IPv4CustomizationPolicy otherObj = (IPv4CustomizationPolicy) obj;

        return (super.equals(obj)) && (this.subnetMask != null ? this.subnetMask.equals(otherObj.subnetMask) : this.subnetMask == otherObj.subnetMask);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.subnetMask != null ? this.subnetMask.hashCode() : 0);
    }


    public String toString() {
        return "IPv4CustomizationPolicy [super=" + super.toString() + ", " + "subnetMask=" + this.subnetMask + "]";
    }
}


