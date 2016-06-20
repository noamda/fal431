package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCArraySettings.class, name = "VCArraySettings")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArraySettings", propOrder = {"name", "serialNumber", "arrayUID", "type", "credentials", "connectionParams", "resourcePools"})
@XmlSeeAlso({VCArraySettings.class})
public class ArraySettings {
    protected String name;
    protected String serialNumber;
    @XmlElement(nillable = true)
    protected ArrayUID arrayUID;
    protected ArrayType type;
    protected BaseCredentials credentials;
    protected BaseConnectionParams connectionParams;
    @XmlElement(nillable = true)
    protected List<ArrayResourcePoolSettings> resourcePools;

    public ArraySettings() {
    }

    public ArraySettings(String name, String serialNumber, ArrayUID arrayUID, ArrayType type, BaseCredentials credentials, BaseConnectionParams connectionParams, List<ArrayResourcePoolSettings> resourcePools) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.arrayUID = arrayUID;
        this.type = type;
        this.credentials = credentials;
        this.connectionParams = connectionParams;
        this.resourcePools = resourcePools;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public String getSerialNumber() {
        return this.serialNumber;
    }


    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }


    public ArrayUID getArrayUID() {
        return this.arrayUID;
    }


    public void setArrayUID(ArrayUID value) {
        this.arrayUID = value;
    }


    public ArrayType getType() {
        return this.type;
    }


    public void setType(ArrayType value) {
        this.type = value;
    }


    public BaseCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(BaseCredentials value) {
        this.credentials = value;
    }


    public BaseConnectionParams getConnectionParams() {
        return this.connectionParams;
    }


    public void setConnectionParams(BaseConnectionParams value) {
        this.connectionParams = value;
    }


    public List<ArrayResourcePoolSettings> getResourcePools() {
        if (this.resourcePools == null) {
            this.resourcePools = new ArrayList();
        }
        return this.resourcePools;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArraySettings)) {
            return false;
        }
        ArraySettings otherObj = (ArraySettings) obj;

        return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.serialNumber != null ? this.serialNumber.equals(otherObj.serialNumber) : this.serialNumber == otherObj.serialNumber) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.connectionParams != null ? this.connectionParams.equals(otherObj.connectionParams) : this.connectionParams == otherObj.connectionParams) && (this.resourcePools != null ? this.resourcePools.equals(otherObj.resourcePools) : this.resourcePools == otherObj.resourcePools);
    }


    public int hashCode() {
        return (this.name != null ? this.name.hashCode() : 0) ^ (this.serialNumber != null ? this.serialNumber.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.connectionParams != null ? this.connectionParams.hashCode() : 0) ^ (this.resourcePools != null ? this.resourcePools.hashCode() : 0);
    }


    public String toString() {
        return "ArraySettings [name=" + this.name + ", " + "serialNumber=" + this.serialNumber + ", " + "arrayUID=" + this.arrayUID + ", " + "type=" + this.type + ", " + "credentials=" + this.credentials + ", " + "connectionParams=" + this.connectionParams + ", " + "resourcePools=" + this.resourcePools + "]";
    }
}


