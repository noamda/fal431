package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClariionVolumes", propOrder = {"splitterUID", "volumesInformation"})
public class ClariionVolumes {
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;
    @XmlElement(nillable = true)
    protected List<ClariionVolumeInformation> volumesInformation;

    public ClariionVolumes() {
    }

    public ClariionVolumes(SplitterUID splitterUID, List<ClariionVolumeInformation> volumesInformation) {
        this.splitterUID = splitterUID;
        this.volumesInformation = volumesInformation;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public List<ClariionVolumeInformation> getVolumesInformation() {
        if (this.volumesInformation == null) {
            this.volumesInformation = new ArrayList();
        }
        return this.volumesInformation;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClariionVolumes)) {
            return false;
        }
        ClariionVolumes otherObj = (ClariionVolumes) obj;

        return (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID) && (this.volumesInformation != null ? this.volumesInformation.equals(otherObj.volumesInformation) : this.volumesInformation == otherObj.volumesInformation);
    }


    public int hashCode() {
        return (this.splitterUID != null ? this.splitterUID.hashCode() : 0) ^ (this.volumesInformation != null ? this.volumesInformation.hashCode() : 0);
    }


    public String toString() {
        return "ClariionVolumes [splitterUID=" + this.splitterUID + ", " + "volumesInformation=" + this.volumesInformation + "]";
    }
}


