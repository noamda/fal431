package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateVolumeSize", propOrder = {"isDistributedCg", "calculateVolumeSizeParams"})
public class CalculateVolumeSize {
    protected boolean isDistributedCg;

    @XmlElement(namespace = "http:
            protected CalculateVolumeSizeParams calculateVolumeSizeParams;

            public CalculateVolumeSize(){}

            public CalculateVolumeSize(boolean isDistributedCg, CalculateVolumeSizeParams calculateVolumeSizeParams) {
        this.isDistributedCg = isDistributedCg;
        this.calculateVolumeSizeParams = calculateVolumeSizeParams;
    }


    public boolean isIsDistributedCg() {
        return this.isDistributedCg;
    }


    public void setIsDistributedCg(boolean value) {
        this.isDistributedCg = value;
    }


    public CalculateVolumeSizeParams getCalculateVolumeSizeParams() {
        return this.calculateVolumeSizeParams;
    }


    public void setCalculateVolumeSizeParams(CalculateVolumeSizeParams value) {
        this.calculateVolumeSizeParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CalculateVolumeSize)) {
            return false;
        }
        CalculateVolumeSize otherObj = (CalculateVolumeSize) obj;

        return (this.isDistributedCg == otherObj.isDistributedCg) && (this.calculateVolumeSizeParams != null ? this.calculateVolumeSizeParams.equals(otherObj.calculateVolumeSizeParams) : this.calculateVolumeSizeParams == otherObj.calculateVolumeSizeParams);
    }


    public int hashCode() {
        return (this.isDistributedCg ? 1 : 0) ^ (this.calculateVolumeSizeParams != null ? this.calculateVolumeSizeParams.hashCode() : 0);
    }


    public String toString() {
        return "CalculateVolumeSize [isDistributedCg=" + this.isDistributedCg + ", " + "calculateVolumeSizeParams=" + this.calculateVolumeSizeParams + "]";
    }
}


