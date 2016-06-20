package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonTypeName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@JsonTypeName("VolumeCreationParams")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeCreationParams", propOrder = {"volumeSize", "arrayUid", "poolUid", "tieringPolicy", "resourcePoolType"})
public class VolumeCreationParams
        extends BaseVolumeParams {
    @XmlElement(required = true, nillable = true)
    protected VolumeSize volumeSize;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUid;
    protected ResourcePoolUID poolUid;
    protected ArrayResourcePoolTieringPolicy tieringPolicy;
    protected ArrayResourcePoolType resourcePoolType;

    public VolumeCreationParams() {
    }

    public VolumeCreationParams(VolumeSize volumeSize, ArrayUID arrayUid, ResourcePoolUID poolUid, ArrayResourcePoolTieringPolicy tieringPolicy, ArrayResourcePoolType resourcePoolType) {
        this.volumeSize = volumeSize;
        this.arrayUid = arrayUid;
        this.poolUid = poolUid;
        this.tieringPolicy = tieringPolicy;
        this.resourcePoolType = resourcePoolType;
    }


    public VolumeSize getVolumeSize() {
        return this.volumeSize;
    }


    public void setVolumeSize(VolumeSize value) {
        this.volumeSize = value;
    }


    public ArrayUID getArrayUid() {
        return this.arrayUid;
    }


    public void setArrayUid(ArrayUID value) {
        this.arrayUid = value;
    }


    public ResourcePoolUID getPoolUid() {
        return this.poolUid;
    }


    public void setPoolUid(ResourcePoolUID value) {
        this.poolUid = value;
    }


    public ArrayResourcePoolTieringPolicy getTieringPolicy() {
        return this.tieringPolicy;
    }


    public void setTieringPolicy(ArrayResourcePoolTieringPolicy value) {
        this.tieringPolicy = value;
    }


    public ArrayResourcePoolType getResourcePoolType() {
        return this.resourcePoolType;
    }


    public void setResourcePoolType(ArrayResourcePoolType value) {
        this.resourcePoolType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeCreationParams)) {
            return false;
        }
        VolumeCreationParams otherObj = (VolumeCreationParams) obj;

        return (super.equals(obj)) && (this.volumeSize != null ? this.volumeSize.equals(otherObj.volumeSize) : this.volumeSize == otherObj.volumeSize) && (this.arrayUid != null ? this.arrayUid.equals(otherObj.arrayUid) : this.arrayUid == otherObj.arrayUid) && (this.poolUid != null ? this.poolUid.equals(otherObj.poolUid) : this.poolUid == otherObj.poolUid) && (this.tieringPolicy != null ? this.tieringPolicy.equals(otherObj.tieringPolicy) : this.tieringPolicy == otherObj.tieringPolicy) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType);
    }


    public int hashCode() {
        return super.hashCode() ^ (this.volumeSize != null ? this.volumeSize.hashCode() : 0) ^ (this.arrayUid != null ? this.arrayUid.hashCode() : 0) ^ (this.poolUid != null ? this.poolUid.hashCode() : 0) ^ (this.tieringPolicy != null ? this.tieringPolicy.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0);
    }


    public String toString() {
        return "VolumeCreationParams [super=" + super.toString() + ", " + "volumeSize=" + this.volumeSize + ", " + "arrayUid=" + this.arrayUid + ", " + "poolUid=" + this.poolUid + ", " + "tieringPolicy=" + this.tieringPolicy + ", " + "resourcePoolType=" + this.resourcePoolType + "]";
    }
}


