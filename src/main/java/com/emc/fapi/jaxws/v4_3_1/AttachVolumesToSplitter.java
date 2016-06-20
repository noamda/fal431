package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachVolumesToSplitter", propOrder = {"splitter", "volumesParams"})
public class AttachVolumesToSplitter {
    protected SplitterUID splitter;
    protected List<SetVolumeParam> volumesParams;

    public AttachVolumesToSplitter() {
    }

    public AttachVolumesToSplitter(SplitterUID splitter, List<SetVolumeParam> volumesParams) {
        this.splitter = splitter;
        this.volumesParams = volumesParams;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public List<SetVolumeParam> getVolumesParams() {
        if (this.volumesParams == null) {
            this.volumesParams = new ArrayList();
        }
        return this.volumesParams;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AttachVolumesToSplitter)) {
            return false;
        }
        AttachVolumesToSplitter otherObj = (AttachVolumesToSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumesParams != null ? this.volumesParams.equals(otherObj.volumesParams) : this.volumesParams == otherObj.volumesParams);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumesParams != null ? this.volumesParams.hashCode() : 0);
    }


    public String toString() {
        return "AttachVolumesToSplitter [splitter=" + this.splitter + ", " + "volumesParams=" + this.volumesParams + "]";
    }
}


