package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterSupportedArrayManagementProviderAndArrayTypes", propOrder = {"clusterUID", "supportedAmpsAndArraysTypes"})
public class ClusterSupportedArrayManagementProviderAndArrayTypes {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    protected SupportedArrayManagementProviderAndArrayTypes supportedAmpsAndArraysTypes;

    public ClusterSupportedArrayManagementProviderAndArrayTypes() {
    }

    public ClusterSupportedArrayManagementProviderAndArrayTypes(ClusterUID clusterUID, SupportedArrayManagementProviderAndArrayTypes supportedAmpsAndArraysTypes) {
        this.clusterUID = clusterUID;
        this.supportedAmpsAndArraysTypes = supportedAmpsAndArraysTypes;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public SupportedArrayManagementProviderAndArrayTypes getSupportedAmpsAndArraysTypes() {
        return this.supportedAmpsAndArraysTypes;
    }


    public void setSupportedAmpsAndArraysTypes(SupportedArrayManagementProviderAndArrayTypes value) {
        this.supportedAmpsAndArraysTypes = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ClusterSupportedArrayManagementProviderAndArrayTypes)) {
            return false;
        }
        ClusterSupportedArrayManagementProviderAndArrayTypes otherObj = (ClusterSupportedArrayManagementProviderAndArrayTypes) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.supportedAmpsAndArraysTypes != null ? this.supportedAmpsAndArraysTypes.equals(otherObj.supportedAmpsAndArraysTypes) : this.supportedAmpsAndArraysTypes == otherObj.supportedAmpsAndArraysTypes);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.supportedAmpsAndArraysTypes != null ? this.supportedAmpsAndArraysTypes.hashCode() : 0);
    }


    public String toString() {
        return "ClusterSupportedArrayManagementProviderAndArrayTypes [clusterUID=" + this.clusterUID + ", " + "supportedAmpsAndArraysTypes=" + this.supportedAmpsAndArraysTypes + "]";
    }
}


