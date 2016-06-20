package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("IPv6CustomizationPolicy")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPv6CustomizationPolicy", propOrder = {"ipV6SubnetPrefixLength"})
public class IPv6CustomizationPolicy
        extends IPCustomizationPolicy {
    protected int ipV6SubnetPrefixLength;

    public IPv6CustomizationPolicy() {
    }

    public IPv6CustomizationPolicy(int ipV6SubnetPrefixLength) {
        this.ipV6SubnetPrefixLength = ipV6SubnetPrefixLength;
    }


    public int getIpV6SubnetPrefixLength() {
        return this.ipV6SubnetPrefixLength;
    }


    public void setIpV6SubnetPrefixLength(int value) {
        this.ipV6SubnetPrefixLength = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof IPv6CustomizationPolicy)) {
            return false;
        }
        IPv6CustomizationPolicy otherObj = (IPv6CustomizationPolicy) obj;

        return (super.equals(obj)) && (this.ipV6SubnetPrefixLength == otherObj.ipV6SubnetPrefixLength);
    }


    public int hashCode() {
        return super.hashCode() ^ this.ipV6SubnetPrefixLength;
    }


    public String toString() {
        return "IPv6CustomizationPolicy [super=" + super.toString() + ", " + "ipV6SubnetPrefixLength=" + this.ipV6SubnetPrefixLength + "]";
    }
}


