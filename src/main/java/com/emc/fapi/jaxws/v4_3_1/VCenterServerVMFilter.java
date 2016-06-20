package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VCenterServerVMFilter")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCenterServerVMFilter", propOrder = {"ip"})
public class VCenterServerVMFilter
        extends VCenterServerFilter {
    @XmlElement(required = true)
    protected String ip;

    public VCenterServerVMFilter() {
    }

    public VCenterServerVMFilter(String ip) {
        this.ip = ip;
    }


    public String getIp() {
        return this.ip;
    }


    public void setIp(String value) {
        this.ip = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCenterServerVMFilter)) {
            return false;
        }
        VCenterServerVMFilter otherObj = (VCenterServerVMFilter) obj;

        return (super.equals(obj)) && (this.ip != null ? this.ip.equals(otherObj.ip) : this.ip == otherObj.ip);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.ip != null ? this.ip.hashCode() : 0);
    }


    public String toString() {
        return "VCenterServerVMFilter [super=" + super.toString() + ", " + "ip=" + this.ip + "]";
    }
}


