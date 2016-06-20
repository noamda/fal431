package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DefaultArrayResourcePool", propOrder = {"ampUID", "arrayUID", "poolUID"})
public class DefaultArrayResourcePool {
    protected ArrayManagementProviderUID ampUID;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected ResourcePoolUID poolUID;

    public DefaultArrayResourcePool() {
    }

    public DefaultArrayResourcePool(ArrayManagementProviderUID ampUID, ArrayUID arrayUID, ResourcePoolUID poolUID) {
        this.ampUID = ampUID;
        this.arrayUID = arrayUID;
        this.poolUID = poolUID;
    }


    public ArrayManagementProviderUID getAmpUID() {
        return this.ampUID;
    }


    public void setAmpUID(ArrayManagementProviderUID value) {
        this.ampUID = value;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public ResourcePoolUID getPoolUID() {
        return this.poolUID;
    }


    public void setPoolUID(ResourcePoolUID value) {
        this.poolUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof DefaultArrayResourcePool)) {
            return false;
        }
        DefaultArrayResourcePool otherObj = (DefaultArrayResourcePool) obj;

        return (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.poolUID != null ? this.poolUID.equals(otherObj.poolUID) : this.poolUID == otherObj.poolUID);
    }


    public int hashCode() {
        return (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.poolUID != null ? this.poolUID.hashCode() : 0);
    }


    public String toString() {
        return "DefaultArrayResourcePool [ampUID=" + this.ampUID + ", " + "arrayUID=" + this.arrayUID + ", " + "poolUID=" + this.poolUID + "]";
    }
}


