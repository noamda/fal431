package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkArrayConnectivity", propOrder = {"clusterUID", "arrayType", "configurationParams"})
public class CheckArrayConnectivity {
    @XmlElement(nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(nillable = true)
    protected ArrayType arrayType;

    @XmlElement(namespace = "http:
            protected ConfigurationParams configurationParams;

            public CheckArrayConnectivity(){}

            public CheckArrayConnectivity(ClusterUID clusterUID, ArrayType arrayType, ConfigurationParams configurationParams) {
        this.clusterUID = clusterUID;
        this.arrayType = arrayType;
        this.configurationParams = configurationParams;
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


    public ConfigurationParams getConfigurationParams() {
        return this.configurationParams;
    }


    public void setConfigurationParams(ConfigurationParams value) {
        this.configurationParams = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof CheckArrayConnectivity)) {
            return false;
        }
        CheckArrayConnectivity otherObj = (CheckArrayConnectivity) obj;

        return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.configurationParams != null ? this.configurationParams.equals(otherObj.configurationParams) : this.configurationParams == otherObj.configurationParams);
    }


    public int hashCode() {
        return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.configurationParams != null ? this.configurationParams.hashCode() : 0);
    }


    public String toString() {
        return "CheckArrayConnectivity [clusterUID=" + this.clusterUID + ", " + "arrayType=" + this.arrayType + ", " + "configurationParams=" + this.configurationParams + "]";
    }
}


