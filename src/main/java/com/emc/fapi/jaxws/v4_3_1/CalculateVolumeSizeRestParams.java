package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculateVolumeSizeRestParams", propOrder = {"distributedConsistencyGroup", "volumeSizeParams"})
public class CalculateVolumeSizeRestParams {
    protected boolean distributedConsistencyGroup;
    protected CalculateVolumeSizeParams volumeSizeParams;

    public CalculateVolumeSizeRestParams() {
    }

    public CalculateVolumeSizeRestParams(boolean distributedConsistencyGroup, CalculateVolumeSizeParams volumeSizeParams) {
        this.distributedConsistencyGroup = distributedConsistencyGroup;
        this.volumeSizeParams = volumeSizeParams;
    }


    public boolean isDistributedConsistencyGroup() {
        return this.distributedConsistencyGroup;
    }


    public void setDistributedConsistencyGroup(boolean value) {
        this.distributedConsistencyGroup = value;
    }


    public CalculateVolumeSizeParams getVolumeSizeParams() {
        return this.volumeSizeParams;
    }


    public void setVolumeSizeParams(CalculateVolumeSizeParams value) {
        this.volumeSizeParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CalculateVolumeSizeRestParams)) {
            return false;
        }
        CalculateVolumeSizeRestParams otherObj = (CalculateVolumeSizeRestParams) obj;

        return (this.distributedConsistencyGroup == otherObj.distributedConsistencyGroup) && (this.volumeSizeParams != null ? this.volumeSizeParams.equals(otherObj.volumeSizeParams) : this.volumeSizeParams == otherObj.volumeSizeParams);
    }


    public int hashCode() {
        return (this.distributedConsistencyGroup ? 1 : 0) ^ (this.volumeSizeParams != null ? this.volumeSizeParams.hashCode() : 0);
    }


    public String toString() {
        return "CalculateVolumeSizeRestParams [distributedConsistencyGroup=" + this.distributedConsistencyGroup + ", " + "volumeSizeParams=" + this.volumeSizeParams + "]";
    }
}


