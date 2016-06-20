package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VirtualVolumeInformation")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualVolumeInformation", propOrder = {"fileName", "volumeType"})
public class VirtualVolumeInformation
        extends VolumeInformation {
    protected String fileName;
    protected VirtualVolumeType volumeType;

    public VirtualVolumeInformation() {
    }

    public VirtualVolumeInformation(String fileName, VirtualVolumeType volumeType) {
        this.fileName = fileName;
        this.volumeType = volumeType;
    }


    public String getFileName() {
        return this.fileName;
    }


    public void setFileName(String value) {
        this.fileName = value;
    }


    public VirtualVolumeType getVolumeType() {
        return this.volumeType;
    }


    public void setVolumeType(VirtualVolumeType value) {
        this.volumeType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualVolumeInformation)) {
            return false;
        }
        VirtualVolumeInformation otherObj = (VirtualVolumeInformation) obj;

        return (super.equals(obj)) && (this.fileName != null ? this.fileName.equals(otherObj.fileName) : this.fileName == otherObj.fileName) && (this.volumeType != null ? this.volumeType.equals(otherObj.volumeType) : this.volumeType == otherObj.volumeType);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.fileName != null ? this.fileName.hashCode() : 0) ^ (this.volumeType != null ? this.volumeType.hashCode() : 0);
    }


    public String toString() {
        return "VirtualVolumeInformation [super=" + super.toString() + ", " + "fileName=" + this.fileName + ", " + "volumeType=" + this.volumeType + "]";
    }
}


