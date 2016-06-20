package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("ArrayLicenseSettings")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayLicenseSettings", propOrder = {"arraySerial", "arrayType"})
public class ArrayLicenseSettings
        extends LicenseSettings {
    protected String arraySerial;
    @XmlElement(nillable = true)
    protected ArrayType arrayType;

    public ArrayLicenseSettings() {
    }

    public ArrayLicenseSettings(String arraySerial, ArrayType arrayType) {
        this.arraySerial = arraySerial;
        this.arrayType = arrayType;
    }


    public String getArraySerial() {
        return this.arraySerial;
    }


    public void setArraySerial(String value) {
        this.arraySerial = value;
    }


    public ArrayType getArrayType() {
        return this.arrayType;
    }


    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayLicenseSettings)) {
            return false;
        }
        ArrayLicenseSettings otherObj = (ArrayLicenseSettings) obj;

        return (super.equals(obj)) && (this.arraySerial != null ? this.arraySerial.equals(otherObj.arraySerial) : this.arraySerial == otherObj.arraySerial) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.arraySerial != null ? this.arraySerial.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0);
    }


    public String toString() {
        return "ArrayLicenseSettings [super=" + super.toString() + ", " + "arraySerial=" + this.arraySerial + ", " + "arrayType=" + this.arrayType + "]";
    }
}


