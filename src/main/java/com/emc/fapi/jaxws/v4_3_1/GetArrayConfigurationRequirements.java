package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getArrayConfigurationRequirements", propOrder = {"clusterUID", "arrayType"})
public class GetArrayConfigurationRequirements {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected ArrayType arrayType;

    public GetArrayConfigurationRequirements() {
    }

    public GetArrayConfigurationRequirements(ClusterUID clusterUID, ArrayType arrayType) {
        this.clusterUID = clusterUID;
        this.arrayType = arrayType;
    }


    public ClusterUID getClusterUID() {
        return this.clusterUID;
    }


    public void setClusterUID(ClusterUID value) {
        this.clusterUID = value;
    }


    public ArrayType getArrayType() {
        return this.arrayType;
    }


    public void setArrayType(ArrayType value) {
        this.arrayType = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof GetArrayConfigurationRequirements)) {
            return false;
        }
        GetArrayConfigurationRequirements otherObj = (GetArrayConfigurationRequirements) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0);
    }


    public String toString() {
        return "GetArrayConfigurationRequirements [clusterUID=" + this.clusterUID + ", " + "arrayType=" + this.arrayType + "]";
    }
}


