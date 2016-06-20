package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSupportedArrayManagementProviderAndArrayTypes", propOrder = {"clusterUID"})
public class GetSupportedArrayManagementProviderAndArrayTypes {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;

    public GetSupportedArrayManagementProviderAndArrayTypes() {
    }

    public GetSupportedArrayManagementProviderAndArrayTypes(ClusterUID clusterUID) {
        this.clusterUID = clusterUID;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetSupportedArrayManagementProviderAndArrayTypes)) {
            return false;
        }
        GetSupportedArrayManagementProviderAndArrayTypes otherObj = (GetSupportedArrayManagementProviderAndArrayTypes) obj;

        return this.clusterUID == otherObj.clusterUID ? true : this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : false;
    }


    public int hashCode() {
        return this.clusterUID != null ? this.clusterUID.hashCode() : 0;
    }


    public String toString() {
        return "GetSupportedArrayManagementProviderAndArrayTypes [clusterUID=" + this.clusterUID + "]";
    }
}


