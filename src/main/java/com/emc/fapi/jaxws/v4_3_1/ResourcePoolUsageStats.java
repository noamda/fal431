package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolUsageStats", propOrder = {"capacityInBytes", "usedSpaceInBytes"})
public class ResourcePoolUsageStats {
    protected long capacityInBytes;
    protected long usedSpaceInBytes;

    public ResourcePoolUsageStats() {
    }

    public ResourcePoolUsageStats(long capacityInBytes, long usedSpaceInBytes) {
        this.capacityInBytes = capacityInBytes;
        this.usedSpaceInBytes = usedSpaceInBytes;
    }


    public long getCapacityInBytes() {
        return this.capacityInBytes;
    }


    public void setCapacityInBytes(long value) {
        this.capacityInBytes = value;
    }


    public long getUsedSpaceInBytes() {
        return this.usedSpaceInBytes;
    }


    public void setUsedSpaceInBytes(long value) {
        this.usedSpaceInBytes = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ResourcePoolUsageStats)) {
            return false;
        }
        ResourcePoolUsageStats otherObj = (ResourcePoolUsageStats) obj;

        return (this.capacityInBytes == otherObj.capacityInBytes) && (this.usedSpaceInBytes == otherObj.usedSpaceInBytes);
    }


    public int hashCode() {
        return (int) this.capacityInBytes ^ (int) this.usedSpaceInBytes;
    }


    public String toString() {
        return "ResourcePoolUsageStats [capacityInBytes=" + this.capacityInBytes + ", " + "usedSpaceInBytes=" + this.usedSpaceInBytes + "]";
    }
}


