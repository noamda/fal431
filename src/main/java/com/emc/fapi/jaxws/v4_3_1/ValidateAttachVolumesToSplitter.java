package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateAttachVolumesToSplitter", propOrder = {"splitter", "volumesParams"})
public class ValidateAttachVolumesToSplitter {
    protected SplitterUID splitter;
    protected List<SetVolumeParam> volumesParams;

    public ValidateAttachVolumesToSplitter() {
    }

    public ValidateAttachVolumesToSplitter(SplitterUID splitter, List<SetVolumeParam> volumesParams) {
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
        if (!(obj instanceof ValidateAttachVolumesToSplitter)) {
            return false;
        }
        ValidateAttachVolumesToSplitter otherObj = (ValidateAttachVolumesToSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumesParams != null ? this.volumesParams.equals(otherObj.volumesParams) : this.volumesParams == otherObj.volumesParams);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumesParams != null ? this.volumesParams.hashCode() : 0);
    }


    public String toString() {
        return "ValidateAttachVolumesToSplitter [splitter=" + this.splitter + ", " + "volumesParams=" + this.volumesParams + "]";
    }
}


