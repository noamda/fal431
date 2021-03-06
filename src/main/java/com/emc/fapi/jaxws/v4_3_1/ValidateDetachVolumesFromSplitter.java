package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validateDetachVolumesFromSplitter", propOrder = {"splitter", "volumesIDs"})
public class ValidateDetachVolumesFromSplitter {
    protected SplitterUID splitter;
    protected List<DeviceUID> volumesIDs;

    public ValidateDetachVolumesFromSplitter() {
    }

    public ValidateDetachVolumesFromSplitter(SplitterUID splitter, List<DeviceUID> volumesIDs) {
        this.splitter = splitter;
        this.volumesIDs = volumesIDs;
    }


    public SplitterUID getSplitter() {
        return this.splitter;
    }


    public void setSplitter(SplitterUID value) {
        this.splitter = value;
    }


    public List<DeviceUID> getVolumesIDs() {
        if (this.volumesIDs == null) {
            this.volumesIDs = new ArrayList();
        }
        return this.volumesIDs;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ValidateDetachVolumesFromSplitter)) {
            return false;
        }
        ValidateDetachVolumesFromSplitter otherObj = (ValidateDetachVolumesFromSplitter) obj;

        return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumesIDs != null ? this.volumesIDs.equals(otherObj.volumesIDs) : this.volumesIDs == otherObj.volumesIDs);
    }


    public int hashCode() {
        return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumesIDs != null ? this.volumesIDs.hashCode() : 0);
    }


    public String toString() {
        return "ValidateDetachVolumesFromSplitter [splitter=" + this.splitter + ", " + "volumesIDs=" + this.volumesIDs + "]";
    }
}


