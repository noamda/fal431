package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddArrayParams", propOrder = {"arrayName", "serialNumber", "clusterUID", "arrayType", "ampUID", "arrayUID", "arrayConfiguration", "force"})
public class AddArrayParams {
    @XmlElement(required = true)
    protected String arrayName;
    protected String serialNumber;
    @XmlElement(required = true, nillable = true)
    protected ClusterUID clusterUID;
    @XmlElement(required = true, nillable = true)
    protected ArrayType arrayType;
    protected ArrayManagementProviderUID ampUID;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    @XmlElement(required = true)
    protected ConfigurationParams arrayConfiguration;
    protected boolean force;

    public AddArrayParams() {
    }

    public AddArrayParams(String arrayName, String serialNumber, ClusterUID clusterUID, ArrayType arrayType, ArrayManagementProviderUID ampUID, ArrayUID arrayUID, ConfigurationParams arrayConfiguration, boolean force) {
        this.arrayName = arrayName;
        this.serialNumber = serialNumber;
        this.clusterUID = clusterUID;
        this.arrayType = arrayType;
        this.ampUID = ampUID;
        this.arrayUID = arrayUID;
        this.arrayConfiguration = arrayConfiguration;
        this.force = force;
    }


    public String getArrayName() {
        return this.arrayName;
    }


    public void setArrayName(String value) {
        this.arrayName = value;
    }


    public String getSerialNumber() {
        return this.serialNumber;
    }


    public void setSerialNumber(String value) {
        this.serialNumber = value;
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


    public ConfigurationParams getArrayConfiguration() {
        return this.arrayConfiguration;
    }


    public void setArrayConfiguration(ConfigurationParams value) {
        this.arrayConfiguration = value;
    }


    public boolean isForce() {
        return this.force;
    }


    public void setForce(boolean value) {
        this.force = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof AddArrayParams)) {
            return false;
        }
        AddArrayParams otherObj = (AddArrayParams) obj;

        return (this.arrayName != null ? this.arrayName.equals(otherObj.arrayName) : this.arrayName == otherObj.arrayName) && (this.serialNumber != null ? this.serialNumber.equals(otherObj.serialNumber) : this.serialNumber == otherObj.serialNumber) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.arrayConfiguration != null ? this.arrayConfiguration.equals(otherObj.arrayConfiguration) : this.arrayConfiguration == otherObj.arrayConfiguration) && (this.force == otherObj.force);
    }


    public int hashCode() {
        return (this.arrayName != null ? this.arrayName.hashCode() : 0) ^ (this.serialNumber != null ? this.serialNumber.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.arrayConfiguration != null ? this.arrayConfiguration.hashCode() : 0) ^ (this.force ? 1 : 0);
    }


    public String toString() {
        return "AddArrayParams [arrayName=" + this.arrayName + ", " + "serialNumber=" + this.serialNumber + ", " + "clusterUID=" + this.clusterUID + ", " + "arrayType=" + this.arrayType + ", " + "ampUID=" + this.ampUID + ", " + "arrayUID=" + this.arrayUID + ", " + "arrayConfiguration=" + this.arrayConfiguration + ", " + "force=" + this.force + "]";
    }
}


