package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkArrayConnectivityParams", propOrder = {"arrayType", "arrayConfiguration"})
public class CheckArrayConnectivityParams {
    @XmlElement(nillable = true)
    protected ArrayType arrayType;
    protected ConfigurationParams arrayConfiguration;

    public CheckArrayConnectivityParams() {
    }

    public CheckArrayConnectivityParams(ArrayType arrayType, ConfigurationParams arrayConfiguration) {
        this.arrayType = arrayType;
        this.arrayConfiguration = arrayConfiguration;
    }


    public ArrayType getArrayType() {
        return this.arrayType;
    }


    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }


    public ConfigurationParams getArrayConfiguration() {
        return this.arrayConfiguration;
    }


    public void setArrayConfiguration(ConfigurationParams value) {
        this.arrayConfiguration = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CheckArrayConnectivityParams)) {
            return false;
        }
        CheckArrayConnectivityParams otherObj = (CheckArrayConnectivityParams) obj;

        return (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.arrayConfiguration != null ? this.arrayConfiguration.equals(otherObj.arrayConfiguration) : this.arrayConfiguration == otherObj.arrayConfiguration);
    }


    public int hashCode() {
        return (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.arrayConfiguration != null ? this.arrayConfiguration.hashCode() : 0);
    }


    public String toString() {
        return "CheckArrayConnectivityParams [arrayType=" + this.arrayType + ", " + "arrayConfiguration=" + this.arrayConfiguration + "]";
    }
}


