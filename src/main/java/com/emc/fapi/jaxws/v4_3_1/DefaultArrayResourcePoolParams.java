package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultArrayResourcePoolParams", propOrder = {"requiredSizeInBytes", "arrayUid", "tieringPolicy", "poolType"})
public class DefaultArrayResourcePoolParams {
    protected long requiredSizeInBytes;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUid;
    protected ArrayResourcePoolTieringPolicy tieringPolicy;
    protected ArrayResourcePoolType poolType;

    public DefaultArrayResourcePoolParams() {
    }

    public DefaultArrayResourcePoolParams(long requiredSizeInBytes, ArrayUID arrayUid, ArrayResourcePoolTieringPolicy tieringPolicy, ArrayResourcePoolType poolType) {
        this.requiredSizeInBytes = requiredSizeInBytes;
        this.arrayUid = arrayUid;
        this.tieringPolicy = tieringPolicy;
        this.poolType = poolType;
    }


    public long getRequiredSizeInBytes() {
        return this.requiredSizeInBytes;
    }


    public void setRequiredSizeInBytes(long value) {
        this.requiredSizeInBytes = value;
    }


    public ArrayUID getArrayUid() {
        return this.arrayUid;
    }


    public void setArrayUid(ArrayUID value) {
        this.arrayUid = value;
    }


    public ArrayResourcePoolTieringPolicy getTieringPolicy() {
        return this.tieringPolicy;
    }


    public void setTieringPolicy(ArrayResourcePoolTieringPolicy value) {
        this.tieringPolicy = value;
    }


    public ArrayResourcePoolType getPoolType() {
        return this.poolType;
    }


    public void setPoolType(ArrayResourcePoolType value) {
        this.poolType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DefaultArrayResourcePoolParams)) {
            return false;
        }
        DefaultArrayResourcePoolParams otherObj = (DefaultArrayResourcePoolParams) obj;

        return (this.requiredSizeInBytes == otherObj.requiredSizeInBytes) && (this.arrayUid != null ? this.arrayUid.equals(otherObj.arrayUid) : this.arrayUid == otherObj.arrayUid) && (this.tieringPolicy != null ? this.tieringPolicy.equals(otherObj.tieringPolicy) : this.tieringPolicy == otherObj.tieringPolicy) && (this.poolType != null ? this.poolType.equals(otherObj.poolType) : this.poolType == otherObj.poolType);
    }


    public int hashCode() {
        return (int) this.requiredSizeInBytes ^ (this.arrayUid != null ? this.arrayUid.hashCode() : 0) ^ (this.tieringPolicy != null ? this.tieringPolicy.hashCode() : 0) ^ (this.poolType != null ? this.poolType.hashCode() : 0);
    }


    public String toString() {
        return "DefaultArrayResourcePoolParams [requiredSizeInBytes=" + this.requiredSizeInBytes + ", " + "arrayUid=" + this.arrayUid + ", " + "tieringPolicy=" + this.tieringPolicy + ", " + "poolType=" + this.poolType + "]";
    }
}


