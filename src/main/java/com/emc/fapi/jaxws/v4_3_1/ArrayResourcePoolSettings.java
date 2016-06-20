package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolSettings", propOrder = {"resourcePoolUID", "name", "resourcePoolType", "allocationParams"})
public class ArrayResourcePoolSettings {
    @XmlElement(nillable = true)
    protected ResourcePoolUID resourcePoolUID;
    protected String name;
    protected ArrayResourcePoolType resourcePoolType;
    protected ArrayResourcePoolAllocationParams allocationParams;

    public ArrayResourcePoolSettings() {
    }

    public ArrayResourcePoolSettings(ResourcePoolUID resourcePoolUID, String name, ArrayResourcePoolType resourcePoolType, ArrayResourcePoolAllocationParams allocationParams) {
        this.resourcePoolUID = resourcePoolUID;
        this.name = name;
        this.resourcePoolType = resourcePoolType;
        this.allocationParams = allocationParams;
    }


    public ResourcePoolUID getResourcePoolUID() {
        return this.resourcePoolUID;
    }


    public void setResourcePoolUID(ResourcePoolUID value) {
        this.resourcePoolUID = value;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public ArrayResourcePoolType getResourcePoolType() {
        return this.resourcePoolType;
    }


    public void setResourcePoolType(ArrayResourcePoolType value) {
        this.resourcePoolType = value;
    }


    public ArrayResourcePoolAllocationParams getAllocationParams() {
        return this.allocationParams;
    }


    public void setAllocationParams(ArrayResourcePoolAllocationParams value) {
        this.allocationParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolSettings)) {
            return false;
        }
        ArrayResourcePoolSettings otherObj = (ArrayResourcePoolSettings) obj;

        return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType) && (this.allocationParams != null ? this.allocationParams.equals(otherObj.allocationParams) : this.allocationParams == otherObj.allocationParams);
    }


    public int hashCode() {
        return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0) ^ (this.allocationParams != null ? this.allocationParams.hashCode() : 0);
    }


    public String toString() {
        return "ArrayResourcePoolSettings [resourcePoolUID=" + this.resourcePoolUID + ", " + "name=" + this.name + ", " + "resourcePoolType=" + this.resourcePoolType + ", " + "allocationParams=" + this.allocationParams + "]";
    }
}


