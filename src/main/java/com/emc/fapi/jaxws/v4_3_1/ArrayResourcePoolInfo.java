package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolInfo", propOrder = {"resourcePoolUID", "name", "resourcePoolType", "allocationParams", "usageStats"})
public class ArrayResourcePoolInfo {
    @XmlElement(nillable = true)
    protected ResourcePoolUID resourcePoolUID;
    protected String name;
    protected ArrayResourcePoolType resourcePoolType;
    protected ArrayResourcePoolAllocationParams allocationParams;
    protected ResourcePoolUsageStats usageStats;

    public ArrayResourcePoolInfo() {
    }

    public ArrayResourcePoolInfo(ResourcePoolUID resourcePoolUID, String name, ArrayResourcePoolType resourcePoolType, ArrayResourcePoolAllocationParams allocationParams, ResourcePoolUsageStats usageStats) {
        this.resourcePoolUID = resourcePoolUID;
        this.name = name;
        this.resourcePoolType = resourcePoolType;
        this.allocationParams = allocationParams;
        this.usageStats = usageStats;
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


    public ResourcePoolUsageStats getUsageStats() {
        return this.usageStats;
    }


    public void setUsageStats(ResourcePoolUsageStats value) {
        this.usageStats = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolInfo)) {
            return false;
        }
        ArrayResourcePoolInfo otherObj = (ArrayResourcePoolInfo) obj;

        return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType) && (this.allocationParams != null ? this.allocationParams.equals(otherObj.allocationParams) : this.allocationParams == otherObj.allocationParams) && (this.usageStats != null ? this.usageStats.equals(otherObj.usageStats) : this.usageStats == otherObj.usageStats);
    }


    public int hashCode() {
        return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0) ^ (this.allocationParams != null ? this.allocationParams.hashCode() : 0) ^ (this.usageStats != null ? this.usageStats.hashCode() : 0);
    }


    public String toString() {
        return "ArrayResourcePoolInfo [resourcePoolUID=" + this.resourcePoolUID + ", " + "name=" + this.name + ", " + "resourcePoolType=" + this.resourcePoolType + ", " + "allocationParams=" + this.allocationParams + ", " + "usageStats=" + this.usageStats + "]";
    }
}


