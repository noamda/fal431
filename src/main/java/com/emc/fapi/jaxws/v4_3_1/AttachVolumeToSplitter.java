package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "attachVolumeToSplitter", propOrder = {"splitter", "volumeParam"})
public class AttachVolumeToSplitter {
    protected SplitterUID splitter;
    protected SetVolumeParam volumeParam;

    public AttachVolumeToSplitter() {
    }

    public AttachVolumeToSplitter(SplitterUID splitter, SetVolumeParam volumeParam) {
        this.splitter = splitter;
        this.volumeParam = volumeParam;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public SetVolumeParam getVolumeParam() {
        return this.volumeParam;
    }


    public void setVolumeParam(SetVolumeParam value) {
        this.volumeParam = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AttachVolumeToSplitter)) {
            return false;
        }
        AttachVolumeToSplitter otherObj = (AttachVolumeToSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumeParam != null ? this.volumeParam.equals(otherObj.volumeParam) : this.volumeParam == otherObj.volumeParam);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumeParam != null ? this.volumeParam.hashCode() : 0);
    }


    public String toString() {
        return "AttachVolumeToSplitter [splitter=" + this.splitter + ", " + "volumeParam=" + this.volumeParam + "]";
    }
}


