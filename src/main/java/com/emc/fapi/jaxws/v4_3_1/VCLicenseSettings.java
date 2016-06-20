package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VCLicenseSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCLicenseSettings", propOrder = {"virtualCenterUid"})
public class VCLicenseSettings
        extends LicenseSettings {
    @XmlElement(nillable = true)
    protected VirtualCenterUID virtualCenterUid;

    public VCLicenseSettings() {
    }

    public VCLicenseSettings(VirtualCenterUID virtualCenterUid) {
        this.virtualCenterUid = virtualCenterUid;
    }


    public VirtualCenterUID getVirtualCenterUid() {
        return this.virtualCenterUid;
    }


    public void setVirtualCenterUid(VirtualCenterUID value) {
        this.virtualCenterUid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VCLicenseSettings)) {
            return false;
        }
        VCLicenseSettings otherObj = (VCLicenseSettings) obj;

        return (super.equals(obj)) && (this.virtualCenterUid != null ? this.virtualCenterUid.equals(otherObj.virtualCenterUid) : this.virtualCenterUid == otherObj.virtualCenterUid);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.virtualCenterUid != null ? this.virtualCenterUid.hashCode() : 0);
    }


    public String toString() {
        return "VCLicenseSettings [super=" + super.toString() + ", " + "virtualCenterUid=" + this.virtualCenterUid + "]";
    }
}


