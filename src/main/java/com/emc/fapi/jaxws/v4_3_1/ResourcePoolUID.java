package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolUID", propOrder = {"uuid", "storageResourcePoolId", "arrayUid"})
public class ResourcePoolUID {
    protected long uuid;
    protected String storageResourcePoolId;
    @XmlElement(required = true, nillable = true)
    protected ArrayUID arrayUid;

    public ResourcePoolUID() {
    }

    public ResourcePoolUID(long uuid, String storageResourcePoolId, ArrayUID arrayUid) {
        this.uuid = uuid;
        this.storageResourcePoolId = storageResourcePoolId;
        this.arrayUid = arrayUid;
    }


    public long getUuid() {
        return this.uuid;
    }


    public void setUuid(long value) {
        this.uuid = value;
    }


    public String getStorageResourcePoolId() {
        return this.storageResourcePoolId;
    }


    public void setStorageResourcePoolId(String value) {
        this.storageResourcePoolId = value;
    }


    public ArrayUID getArrayUid() {
        return this.arrayUid;
    }


    public void setArrayUid(ArrayUID value) {
        this.arrayUid = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ResourcePoolUID)) {
            return false;
        }
        ResourcePoolUID otherObj = (ResourcePoolUID) obj;

        return (this.uuid == otherObj.uuid) && (this.storageResourcePoolId != null ? this.storageResourcePoolId.equals(otherObj.storageResourcePoolId) : this.storageResourcePoolId == otherObj.storageResourcePoolId) && (this.arrayUid != null ? this.arrayUid.equals(otherObj.arrayUid) : this.arrayUid == otherObj.arrayUid);
    }


    public int hashCode() {
        return (int) this.uuid ^ (this.storageResourcePoolId != null ? this.storageResourcePoolId.hashCode() : 0) ^ (this.arrayUid != null ? this.arrayUid.hashCode() : 0);
    }


    public String toString() {
        return "ResourcePoolUID [uuid=" + this.uuid + ", " + "storageResourcePoolId=" + this.storageResourcePoolId + ", " + "arrayUid=" + this.arrayUid + "]";
    }
}


