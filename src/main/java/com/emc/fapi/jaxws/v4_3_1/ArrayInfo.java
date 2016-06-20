package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayInfo", propOrder = {"serialNumber", "arrayUID", "ampUID", "arrayType", "splitterUID"})
public class ArrayInfo {
    protected String serialNumber;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected ArrayManagementProviderUID ampUID;
    @XmlElement(nillable = true)
    protected ArrayType arrayType;
    @XmlElement(nillable = true)
    protected SplitterUID splitterUID;

    public ArrayInfo() {
    }

    public ArrayInfo(String serialNumber, ArrayUID arrayUID, ArrayManagementProviderUID ampUID, ArrayType arrayType, SplitterUID splitterUID) {
        this.serialNumber = serialNumber;
        this.arrayUID = arrayUID;
        this.ampUID = ampUID;
        this.arrayType = arrayType;
        this.splitterUID = splitterUID;
    }


    public String getSerialNumber() {
        return this.serialNumber;
    }


    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public ArrayManagementProviderUID getAmpUID() {
        return this.ampUID;
    }


    public void setAmpUID(ArrayManagementProviderUID value) {
        this.ampUID = value;
    }


    public ArrayType getArrayType() {
        return this.arrayType;
    }


    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }


    public SplitterUID getSplitterUID() {
        return this.splitterUID;
    }


    public void setSplitterUID(SplitterUID value) {
        this.splitterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayInfo)) {
            return false;
        }
        ArrayInfo otherObj = (ArrayInfo) obj;

        return (this.serialNumber != null ? this.serialNumber.equals(otherObj.serialNumber) : this.serialNumber == otherObj.serialNumber) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.splitterUID != null ? this.splitterUID.equals(otherObj.splitterUID) : this.splitterUID == otherObj.splitterUID);
    }


    public int hashCode() {
        return (this.serialNumber != null ? this.serialNumber.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.splitterUID != null ? this.splitterUID.hashCode() : 0);
    }


    public String toString() {
        return "ArrayInfo [serialNumber=" + this.serialNumber + ", " + "arrayUID=" + this.arrayUID + ", " + "ampUID=" + this.ampUID + ", " + "arrayType=" + this.arrayType + ", " + "splitterUID=" + this.splitterUID + "]";
    }
}


