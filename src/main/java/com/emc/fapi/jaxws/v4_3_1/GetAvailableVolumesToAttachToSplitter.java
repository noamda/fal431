package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableVolumesToAttachToSplitter", propOrder = {"splitter", "filterUnseenVolumes"})
public class GetAvailableVolumesToAttachToSplitter {
    protected SplitterUID splitter;
    protected boolean filterUnseenVolumes;

    public GetAvailableVolumesToAttachToSplitter() {
    }

    public GetAvailableVolumesToAttachToSplitter(SplitterUID splitter, boolean filterUnseenVolumes) {
        this.splitter = splitter;
        this.filterUnseenVolumes = filterUnseenVolumes;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public boolean isFilterUnseenVolumes() {
        return this.filterUnseenVolumes;
    }


    public void setFilterUnseenVolumes(boolean value) {
        this.filterUnseenVolumes = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableVolumesToAttachToSplitter)) {
            return false;
        }
        GetAvailableVolumesToAttachToSplitter otherObj = (GetAvailableVolumesToAttachToSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.filterUnseenVolumes == otherObj.filterUnseenVolumes);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.filterUnseenVolumes ? 1 : 0);
    }


    public String toString() {
        return "GetAvailableVolumesToAttachToSplitter [splitter=" + this.splitter + ", " + "filterUnseenVolumes=" + this.filterUnseenVolumes + "]";
    }
}


