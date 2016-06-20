package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detachVolumeFromSplitter", propOrder = {"splitter", "volumeID"})
public class DetachVolumeFromSplitter {
    protected SplitterUID splitter;
    protected DeviceUID volumeID;

    public DetachVolumeFromSplitter() {
    }

    public DetachVolumeFromSplitter(SplitterUID splitter, DeviceUID volumeID) {
        this.splitter = splitter;
        this.volumeID = volumeID;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DetachVolumeFromSplitter)) {
            return false;
        }
        DetachVolumeFromSplitter otherObj = (DetachVolumeFromSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0);
    }


    public String toString() {
        return "DetachVolumeFromSplitter [splitter=" + this.splitter + ", " + "volumeID=" + this.volumeID + "]";
    }
}


