package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetVolumeParam", propOrder = {"volumeID", "shouldAttachAsClean"})
public class SetVolumeParam {
    @XmlElement(required = true)
    protected DeviceUID volumeID;
    protected boolean shouldAttachAsClean;

    public SetVolumeParam() {
    }

    public SetVolumeParam(DeviceUID volumeID, boolean shouldAttachAsClean) {
        this.volumeID = volumeID;
        this.shouldAttachAsClean = shouldAttachAsClean;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public boolean isShouldAttachAsClean() {
        return this.shouldAttachAsClean;
    }


    public void setShouldAttachAsClean(boolean value) {
        this.shouldAttachAsClean = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SetVolumeParam)) {
            return false;
        }
        SetVolumeParam otherObj = (SetVolumeParam) obj;

        return (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.shouldAttachAsClean == otherObj.shouldAttachAsClean);
    }


    public int hashCode() {
        return (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.shouldAttachAsClean ? 1 : 0);
    }


    public String toString() {
        return "SetVolumeParam [volumeID=" + this.volumeID + ", " + "shouldAttachAsClean=" + this.shouldAttachAsClean + "]";
    }
}


