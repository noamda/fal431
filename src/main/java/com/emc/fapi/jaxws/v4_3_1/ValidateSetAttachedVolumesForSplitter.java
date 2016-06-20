package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateSetAttachedVolumesForSplitter", propOrder = {"splitter", "volumes"})
public class ValidateSetAttachedVolumesForSplitter {
    protected SplitterUID splitter;
    protected List<SetVolumeParam> volumes;

    public ValidateSetAttachedVolumesForSplitter() {
    }

    public ValidateSetAttachedVolumesForSplitter(SplitterUID splitter, List<SetVolumeParam> volumes) {
        this.splitter = splitter;
        this.volumes = volumes;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public List<SetVolumeParam> getVolumes() {
        if (this.volumes == null) {
            this.volumes = new ArrayList();
        }
        return this.volumes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateSetAttachedVolumesForSplitter)) {
            return false;
        }
        ValidateSetAttachedVolumesForSplitter otherObj = (ValidateSetAttachedVolumesForSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0);
    }


    public String toString() {
        return "ValidateSetAttachedVolumesForSplitter [splitter=" + this.splitter + ", " + "volumes=" + this.volumes + "]";
    }
}


