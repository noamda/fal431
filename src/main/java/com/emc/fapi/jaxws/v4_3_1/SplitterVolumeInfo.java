package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitterVolumeInfo", propOrder = {"splitterVolume", "splitterName", "volumeName"})
public class SplitterVolumeInfo {
    @XmlElement(nillable = true)
    protected SplitterVolume splitterVolume;
    protected String splitterName;
    protected String volumeName;

    public SplitterVolumeInfo() {
    }

    public SplitterVolumeInfo(SplitterVolume splitterVolume, String splitterName, String volumeName) {
        this.splitterVolume = splitterVolume;
        this.splitterName = splitterName;
        this.volumeName = volumeName;
    }


    public SplitterVolume getSplitterVolume() {
        return this.splitterVolume;
    }


    public void setSplitterVolume(SplitterVolume value) {
        this.splitterVolume = value;
    }


    public String getSplitterName() {
        return this.splitterName;
    }


    public void setSplitterName(String value) {
        this.splitterName = value;
    }


    public String getVolumeName() {
        return this.volumeName;
    }


    public void setVolumeName(String value) {
        this.volumeName = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof SplitterVolumeInfo)) {
            return false;
        }
        SplitterVolumeInfo otherObj = (SplitterVolumeInfo) obj;

        return (this.splitterVolume != null ? this.splitterVolume.equals(otherObj.splitterVolume) : this.splitterVolume == otherObj.splitterVolume) && (this.splitterName != null ? this.splitterName.equals(otherObj.splitterName) : this.splitterName == otherObj.splitterName) && (this.volumeName != null ? this.volumeName.equals(otherObj.volumeName) : this.volumeName == otherObj.volumeName);
    }


    public int hashCode() {
        return (this.splitterVolume != null ? this.splitterVolume.hashCode() : 0) ^ (this.splitterName != null ? this.splitterName.hashCode() : 0) ^ (this.volumeName != null ? this.volumeName.hashCode() : 0);
    }


    public String toString() {
        return "SplitterVolumeInfo [splitterVolume=" + this.splitterVolume + ", " + "splitterName=" + this.splitterName + ", " + "volumeName=" + this.volumeName + "]";
    }
}


