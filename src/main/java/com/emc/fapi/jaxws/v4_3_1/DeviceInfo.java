package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInfo", propOrder = {"oldVolumeName", "volumeUID"})
public class DeviceInfo {
    protected String oldVolumeName;
    protected DeviceUID volumeUID;

    public DeviceInfo() {
    }

    public DeviceInfo(String oldVolumeName, DeviceUID volumeUID) {
        this.oldVolumeName = oldVolumeName;
        this.volumeUID = volumeUID;
    }


    public String getOldVolumeName() {
        return this.oldVolumeName;
    }


    public void setOldVolumeName(String value) {
        this.oldVolumeName = value;
    }


    public DeviceUID getVolumeUID() {
        return this.volumeUID;
    }


    public void setVolumeUID(DeviceUID value) {
        this.volumeUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DeviceInfo)) {
            return false;
        }
        DeviceInfo otherObj = (DeviceInfo) obj;

        return (this.oldVolumeName != null ? this.oldVolumeName.equals(otherObj.oldVolumeName) : this.oldVolumeName == otherObj.oldVolumeName) && (this.volumeUID != null ? this.volumeUID.equals(otherObj.volumeUID) : this.volumeUID == otherObj.volumeUID);
    }


    public int hashCode() {
        return (this.oldVolumeName != null ? this.oldVolumeName.hashCode() : 0) ^ (this.volumeUID != null ? this.volumeUID.hashCode() : 0);
    }


    public String toString() {
        return "DeviceInfo [oldVolumeName=" + this.oldVolumeName + ", " + "volumeUID=" + this.volumeUID + "]";
    }
}


