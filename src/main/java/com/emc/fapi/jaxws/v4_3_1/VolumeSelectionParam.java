package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VolumeSelectionParam")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeSelectionParam", propOrder = {"deviceUID"})
public class VolumeSelectionParam
        extends BaseVolumeParams {
    @XmlElement(required = true, nillable = true)
    protected DeviceUID deviceUID;

    public VolumeSelectionParam() {
    }

    public VolumeSelectionParam(DeviceUID deviceUID) {
        this.deviceUID = deviceUID;
    }


    public DeviceUID getDeviceUID() {
        return this.deviceUID;
    }


    public void setDeviceUID(DeviceUID value) {
        this.deviceUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeSelectionParam)) {
            return false;
        }
        VolumeSelectionParam otherObj = (VolumeSelectionParam) obj;

        return (super.equals(obj)) && (this.deviceUID != null ? this.deviceUID.equals(otherObj.deviceUID) : this.deviceUID == otherObj.deviceUID);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.deviceUID != null ? this.deviceUID.hashCode() : 0);
    }


    public String toString() {
        return "VolumeSelectionParam [super=" + super.toString() + ", " + "deviceUID=" + this.deviceUID + "]";
    }
}


