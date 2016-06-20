package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeSize", propOrder = {"sizeInBytes"})
public class VolumeSize {
    protected long sizeInBytes;

    public VolumeSize() {
    }

    public VolumeSize(long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }


    public long getSizeInBytes() {
        return this.sizeInBytes;
    }


    public void setSizeInBytes(long value) {
        this.sizeInBytes = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeSize)) {
            return false;
        }
        VolumeSize otherObj = (VolumeSize) obj;

        return this.sizeInBytes == otherObj.sizeInBytes;
    }


    public int hashCode() {
        return (int) this.sizeInBytes;
    }


    public String toString() {
        return "VolumeSize [sizeInBytes=" + this.sizeInBytes + "]";
    }
}


