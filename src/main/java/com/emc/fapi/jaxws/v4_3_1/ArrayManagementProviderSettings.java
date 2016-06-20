package com.emc.fapi.jaxws.v4_3_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayManagementProviderSettings", propOrder = {"ampUID", "connetionParams", "credentials", "managedArrays", "name", "systemGenerated", "type"})
public class ArrayManagementProviderSettings {
    protected ArrayManagementProviderUID ampUID;
    protected BaseConnectionParams connetionParams;
    protected BaseCredentials credentials;
    @XmlElement(nillable = true)
    protected List<ArraySettings> managedArrays;
    protected String name;
    protected boolean systemGenerated;
    protected ArrayManagementProviderType type;

    public ArrayManagementProviderSettings() {
    }

    public ArrayManagementProviderSettings(ArrayManagementProviderUID ampUID, BaseConnectionParams connetionParams, BaseCredentials credentials, List<ArraySettings> managedArrays, String name, boolean systemGenerated, ArrayManagementProviderType type) {
        this.ampUID = ampUID;
        this.connetionParams = connetionParams;
        this.credentials = credentials;
        this.managedArrays = managedArrays;
        this.name = name;
        this.systemGenerated = systemGenerated;
        this.type = type;
    }


    public ArrayManagementProviderUID getAmpUID() {
        return this.ampUID;
    }


    public void setAmpUID(ArrayManagementProviderUID value) {
        this.ampUID = value;
    }


    public BaseConnectionParams getConnetionParams() {
        return this.connetionParams;
    }


    public void setConnetionParams(BaseConnectionParams value) {
        this.connetionParams = value;
    }


    public BaseCredentials getCredentials() {
        return this.credentials;
    }


    public void setCredentials(BaseCredentials value) {
        this.credentials = value;
    }


    public List<ArraySettings> getManagedArrays() {
        if (this.managedArrays == null) {
            this.managedArrays = new ArrayList();
        }
        return this.managedArrays;
    }


    public String getName() {
        return this.name;
    }


    public void setName(String value) {
        this.name = value;
    }


    public boolean isSystemGenerated() {
        return this.systemGenerated;
    }


    public void setSystemGenerated(boolean value) {
        this.systemGenerated = value;
    }


    public ArrayManagementProviderType getType() {
        return this.type;
    }


    public void setType(ArrayManagementProviderType value) {
        this.type = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof ArrayManagementProviderSettings)) {
            return false;
        }
        ArrayManagementProviderSettings otherObj = (ArrayManagementProviderSettings) obj;

        return (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.connetionParams != null ? this.connetionParams.equals(otherObj.connetionParams) : this.connetionParams == otherObj.connetionParams) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.managedArrays != null ? this.managedArrays.equals(otherObj.managedArrays) : this.managedArrays == otherObj.managedArrays) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.systemGenerated == otherObj.systemGenerated) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
    }


    public int hashCode() {
        return (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.connetionParams != null ? this.connetionParams.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.managedArrays != null ? this.managedArrays.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.systemGenerated ? 1 : 0) ^ (this.type != null ? this.type.hashCode() : 0);
    }


    public String toString() {
        return "ArrayManagementProviderSettings [ampUID=" + this.ampUID + ", " + "connetionParams=" + this.connetionParams + ", " + "credentials=" + this.credentials + ", " + "managedArrays=" + this.managedArrays + ", " + "name=" + this.name + ", " + "systemGenerated=" + this.systemGenerated + ", " + "type=" + this.type + "]";
    }
}


