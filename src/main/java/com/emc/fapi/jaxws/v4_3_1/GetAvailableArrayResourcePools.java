package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAvailableArrayResourcePools", propOrder = {"arrayUID", "useCache", "filterManaged"})
public class GetAvailableArrayResourcePools {
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected boolean useCache;
    protected boolean filterManaged;

    public GetAvailableArrayResourcePools() {
    }

    public GetAvailableArrayResourcePools(ArrayUID arrayUID, boolean useCache, boolean filterManaged) {
        this.arrayUID = arrayUID;
        this.useCache = useCache;
        this.filterManaged = filterManaged;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public boolean isUseCache() {
        return this.useCache;
    }


    public void setUseCache(boolean value) {
        this.useCache = value;
    }


    public boolean isFilterManaged() {
        return this.filterManaged;
    }


    public void setFilterManaged(boolean value) {
        this.filterManaged = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetAvailableArrayResourcePools)) {
            return false;
        }
        GetAvailableArrayResourcePools otherObj = (GetAvailableArrayResourcePools) obj;

        return (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.useCache == otherObj.useCache) && (this.filterManaged == otherObj.filterManaged);
    }


    public int hashCode() {
        return (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.useCache ? 1 : 0) ^ (this.filterManaged ? 1 : 0);
    }


    public String toString() {
        return "GetAvailableArrayResourcePools [arrayUID=" + this.arrayUID + ", " + "useCache=" + this.useCache + ", " + "filterManaged=" + this.filterManaged + "]";
    }
}


