package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeInformationAndPaths", propOrder = {"volumeInformation", "volumePaths"})
public class VolumeInformationAndPaths {
    @XmlElement(nillable = true)
    protected VolumeInformation volumeInformation;
    @XmlElement(nillable = true)
    protected List<VolumePath> volumePaths;

    public VolumeInformationAndPaths() {
    }

    public VolumeInformationAndPaths(VolumeInformation volumeInformation, List<VolumePath> volumePaths) {
        this.volumeInformation = volumeInformation;
        this.volumePaths = volumePaths;
    }


    public VolumeInformation getVolumeInformation() {
        return this.volumeInformation;
    }


    public void setVolumeInformation(VolumeInformation value) {
        this.volumeInformation = value;
    }


    public List<VolumePath> getVolumePaths() {
        if (this.volumePaths == null) {
            this.volumePaths = new ArrayList();
        }
        return this.volumePaths;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeInformationAndPaths)) {
            return false;
        }
        VolumeInformationAndPaths otherObj = (VolumeInformationAndPaths) obj;

        return (this.volumeInformation != null ? this.volumeInformation.equals(otherObj.volumeInformation) : this.volumeInformation == otherObj.volumeInformation) && (this.volumePaths != null ? this.volumePaths.equals(otherObj.volumePaths) : this.volumePaths == otherObj.volumePaths);
    }


    public int hashCode() {
        return (this.volumeInformation != null ? this.volumeInformation.hashCode() : 0) ^ (this.volumePaths != null ? this.volumePaths.hashCode() : 0);
    }


    public String toString() {
        return "VolumeInformationAndPaths [volumeInformation=" + this.volumeInformation + ", " + "volumePaths=" + this.volumePaths + "]";
    }
}


