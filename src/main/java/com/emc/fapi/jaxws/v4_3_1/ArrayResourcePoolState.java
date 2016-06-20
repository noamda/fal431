package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayResourcePoolState", propOrder = {"resourcePoolUID", "resourcePoolUsageStats"})
public class ArrayResourcePoolState {
    @XmlElement(nillable = true)
    protected ResourcePoolUID resourcePoolUID;
    @XmlElement(nillable = true)
    protected ResourcePoolUsageStats resourcePoolUsageStats;

    public ArrayResourcePoolState() {
    }

    public ArrayResourcePoolState(ResourcePoolUID resourcePoolUID, ResourcePoolUsageStats resourcePoolUsageStats) {
        this.resourcePoolUID = resourcePoolUID;
        this.resourcePoolUsageStats = resourcePoolUsageStats;
    }


    public ResourcePoolUID getResourcePoolUID() {
        return this.resourcePoolUID;
    }


    public void setResourcePoolUID(ResourcePoolUID value) {
        this.resourcePoolUID = value;
    }


    public ResourcePoolUsageStats getResourcePoolUsageStats() {
        return this.resourcePoolUsageStats;
    }


    public void setResourcePoolUsageStats(ResourcePoolUsageStats value) {
        this.resourcePoolUsageStats = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayResourcePoolState)) {
            return false;
        }
        ArrayResourcePoolState otherObj = (ArrayResourcePoolState) obj;

        return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.resourcePoolUsageStats != null ? this.resourcePoolUsageStats.equals(otherObj.resourcePoolUsageStats) : this.resourcePoolUsageStats == otherObj.resourcePoolUsageStats);
    }


    public int hashCode() {
        return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.resourcePoolUsageStats != null ? this.resourcePoolUsageStats.hashCode() : 0);
    }


    public String toString() {
        return "ArrayResourcePoolState [resourcePoolUID=" + this.resourcePoolUID + ", " + "resourcePoolUsageStats=" + this.resourcePoolUsageStats + "]";
    }
}


