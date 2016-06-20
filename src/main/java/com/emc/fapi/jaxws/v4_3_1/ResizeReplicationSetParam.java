package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResizeReplicationSetParam", propOrder = {"additionalSpaceClean", "newSizeInBytes"})
public class ResizeReplicationSetParam {
    protected boolean additionalSpaceClean;
    protected long newSizeInBytes;

    public ResizeReplicationSetParam() {
    }

    public ResizeReplicationSetParam(boolean additionalSpaceClean, long newSizeInBytes) {
        this.additionalSpaceClean = additionalSpaceClean;
        this.newSizeInBytes = newSizeInBytes;
    }


    public boolean isAdditionalSpaceClean() {
        return this.additionalSpaceClean;
    }


    public void setAdditionalSpaceClean(boolean value) {
        this.additionalSpaceClean = value;
    }


    public long getNewSizeInBytes() {
        return this.newSizeInBytes;
    }


    public void setNewSizeInBytes(long value) {
        this.newSizeInBytes = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ResizeReplicationSetParam)) {
            return false;
        }
        ResizeReplicationSetParam otherObj = (ResizeReplicationSetParam) obj;

        return (this.additionalSpaceClean == otherObj.additionalSpaceClean) && (this.newSizeInBytes == otherObj.newSizeInBytes);
    }


    public int hashCode() {
        return (this.additionalSpaceClean ? 1 : 0) ^ (int) this.newSizeInBytes;
    }


    public String toString() {
        return "ResizeReplicationSetParam [additionalSpaceClean=" + this.additionalSpaceClean + ", " + "newSizeInBytes=" + this.newSizeInBytes + "]";
    }
}


