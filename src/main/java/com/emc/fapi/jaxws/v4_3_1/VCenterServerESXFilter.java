package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VCenterServerESXFilter")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerESXFilter", propOrder = {"ip"})
public class VCenterServerESXFilter
        extends VCenterServerFilter {
    @XmlElement(required = true)
    protected String ip;

    public VCenterServerESXFilter() {
    }

    public VCenterServerESXFilter(String ip) {
        this.ip = ip;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerESXFilter)) {
            return false;
        }
        VCenterServerESXFilter otherObj = (VCenterServerESXFilter) obj;

        return (super.equals(obj)) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.ip != null ? this.ip.hashCode() : 0);
    }


    public String toString() {
        return "VCenterServerESXFilter [super=" + super.toString() + ", " + "ip=" + this.ip + "]";
    }
}


