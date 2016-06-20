package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayManagementProviderTypesSet", propOrder = {"ampType", "supportedArrayTypes"})
public class ArrayManagementProviderTypesSet {
    protected ArrayManagementProviderType ampType;
    @XmlElement(nillable = true)
    protected List<ArrayType> supportedArrayTypes;

    public ArrayManagementProviderTypesSet() {
    }

    public ArrayManagementProviderTypesSet(ArrayManagementProviderType ampType, List<ArrayType> supportedArrayTypes) {
        this.ampType = ampType;
        this.supportedArrayTypes = supportedArrayTypes;
    }


    public ArrayManagementProviderType getAmpType() {
        return this.ampType;
    }


    public void setAmpType(ArrayManagementProviderType value) {
        this.ampType = value;
    }


    public List<ArrayType> getSupportedArrayTypes() {
        if (this.supportedArrayTypes == null) {
            this.supportedArrayTypes = new ArrayList();
        }
        return this.supportedArrayTypes;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayManagementProviderTypesSet)) {
            return false;
        }
        ArrayManagementProviderTypesSet otherObj = (ArrayManagementProviderTypesSet) obj;

        return (this.ampType != null ? this.ampType.equals(otherObj.ampType) : this.ampType == otherObj.ampType) && (this.supportedArrayTypes != null ? this.supportedArrayTypes.equals(otherObj.supportedArrayTypes) : this.supportedArrayTypes == otherObj.supportedArrayTypes);
    }


    public int hashCode() {
        return (this.ampType != null ? this.ampType.hashCode() : 0) ^ (this.supportedArrayTypes != null ? this.supportedArrayTypes.hashCode() : 0);
    }


    public String toString() {
        return "ArrayManagementProviderTypesSet [ampType=" + this.ampType + ", " + "supportedArrayTypes=" + this.supportedArrayTypes + "]";
    }
}


