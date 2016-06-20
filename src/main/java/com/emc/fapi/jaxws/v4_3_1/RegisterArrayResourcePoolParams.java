package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterArrayResourcePoolParams", propOrder = {"resourcePoolUID", "resourcePoolType"})
public class RegisterArrayResourcePoolParams {
    @XmlElement(required = true, nillable = true)
    protected ResourcePoolUID resourcePoolUID;
    @XmlElement(required = true)
    protected ArrayResourcePoolType resourcePoolType;

    public RegisterArrayResourcePoolParams() {
    }

    public RegisterArrayResourcePoolParams(ResourcePoolUID resourcePoolUID, ArrayResourcePoolType resourcePoolType) {
        this.resourcePoolUID = resourcePoolUID;
        this.resourcePoolType = resourcePoolType;
    }


    public ResourcePoolUID getResourcePoolUID() {
        return this.resourcePoolUID;
    }


    public void setResourcePoolUID(ResourcePoolUID value) {
        this.resourcePoolUID = value;
    }


    public ArrayResourcePoolType getResourcePoolType() {
        return this.resourcePoolType;
    }


    public void setResourcePoolType(ArrayResourcePoolType value) {
        this.resourcePoolType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof RegisterArrayResourcePoolParams)) {
            return false;
        }
        RegisterArrayResourcePoolParams otherObj = (RegisterArrayResourcePoolParams) obj;

        return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType);
    }


    public int hashCode() {
        return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0);
    }


    public String toString() {
        return "RegisterArrayResourcePoolParams [resourcePoolUID=" + this.resourcePoolUID + ", " + "resourcePoolType=" + this.resourcePoolType + "]";
    }
}


