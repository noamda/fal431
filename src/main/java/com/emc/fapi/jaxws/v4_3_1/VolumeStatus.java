package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeStatus", propOrder = {"accessStatus", "multipathingProblems"})
public class VolumeStatus {
    @XmlElement(required = true)
    protected VolumeAccessStatus accessStatus;
    protected boolean multipathingProblems;

    public VolumeStatus() {
    }

    public VolumeStatus(VolumeAccessStatus accessStatus, boolean multipathingProblems) {
        this.accessStatus = accessStatus;
        this.multipathingProblems = multipathingProblems;
    }


    public VolumeAccessStatus getAccessStatus() {
        return this.accessStatus;
    }


    public void setAccessStatus(VolumeAccessStatus value) {
        this.accessStatus = value;
    }


    public boolean isMultipathingProblems() {
        return this.multipathingProblems;
    }


    public void setMultipathingProblems(boolean value) {
        this.multipathingProblems = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeStatus)) {
            return false;
        }
        VolumeStatus otherObj = (VolumeStatus) obj;

        return (this.accessStatus != null ? this.accessStatus.equals(otherObj.accessStatus) : this.accessStatus == otherObj.accessStatus) && (this.multipathingProblems == otherObj.multipathingProblems);
    }


    public int hashCode() {
        return (this.accessStatus != null ? this.accessStatus.hashCode() : 0) ^ (this.multipathingProblems ? 1 : 0);
    }


    public String toString() {
        return "VolumeStatus [accessStatus=" + this.accessStatus + ", " + "multipathingProblems=" + this.multipathingProblems + "]";
    }
}


