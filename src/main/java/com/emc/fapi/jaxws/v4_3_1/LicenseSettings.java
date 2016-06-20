package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ArrayLicenseSettings.class, name = "ArrayLicenseSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClusterLicenseSettings.class, name = "ClusterLicenseSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VCLicenseSettings.class, name = "VCLicenseSettings")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseSettings", propOrder = {"licenseUID", "capacity", "capacityUnit", "expirationDate", "licenseType", "localReplicationOnly"})
@XmlSeeAlso({ClusterLicenseSettings.class, VCLicenseSettings.class, ArrayLicenseSettings.class})
public abstract class LicenseSettings {
    @XmlElement(nillable = true)
    protected LicenseUID licenseUID;
    protected int capacity;
    protected LicenseCapacityUnit capacityUnit;
    protected RecoverPointTimeStamp expirationDate;
    protected RecoverPointLicenseType licenseType;
    protected Boolean localReplicationOnly;

    public LicenseSettings() {
    }

    public LicenseSettings(LicenseUID licenseUID, int capacity, LicenseCapacityUnit capacityUnit, RecoverPointTimeStamp expirationDate, RecoverPointLicenseType licenseType, Boolean localReplicationOnly) {
        this.licenseUID = licenseUID;
        this.capacity = capacity;
        this.capacityUnit = capacityUnit;
        this.expirationDate = expirationDate;
        this.licenseType = licenseType;
        this.localReplicationOnly = localReplicationOnly;
    }


    public LicenseUID getLicenseUID() {
        return this.licenseUID;
    }


    public void setLicenseUID(LicenseUID value) {
        this.licenseUID = value;
    }


    public int getCapacity() {
        return this.capacity;
    }


    public void setCapacity(int value) {
        this.capacity = value;
    }


    public LicenseCapacityUnit getCapacityUnit() {
        return this.capacityUnit;
    }


    public void setCapacityUnit(LicenseCapacityUnit value) {
        this.capacityUnit = value;
    }


    public RecoverPointTimeStamp getExpirationDate() {
        return this.expirationDate;
    }


    public void setExpirationDate(RecoverPointTimeStamp value) {
        this.expirationDate = value;
    }


    public RecoverPointLicenseType getLicenseType() {
        return this.licenseType;
    }


    public void setLicenseType(RecoverPointLicenseType value) {
        this.licenseType = value;
    }


    public Boolean isLocalReplicationOnly() {
        return this.localReplicationOnly;
    }


    public void setLocalReplicationOnly(Boolean value) {
        this.localReplicationOnly = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof LicenseSettings)) {
            return false;
        }
        LicenseSettings otherObj = (LicenseSettings) obj;

        return (this.licenseUID != null ? this.licenseUID.equals(otherObj.licenseUID) : this.licenseUID == otherObj.licenseUID) && (this.capacity == otherObj.capacity) && (this.capacityUnit != null ? this.capacityUnit.equals(otherObj.capacityUnit) : this.capacityUnit == otherObj.capacityUnit) && (this.expirationDate != null ? this.expirationDate.equals(otherObj.expirationDate) : this.expirationDate == otherObj.expirationDate) && (this.licenseType != null ? this.licenseType.equals(otherObj.licenseType) : this.licenseType == otherObj.licenseType) && (this.localReplicationOnly != null ? this.localReplicationOnly.equals(otherObj.localReplicationOnly) : this.localReplicationOnly == otherObj.localReplicationOnly);
    }


    public int hashCode() {
        return (this.licenseUID != null ? this.licenseUID.hashCode() : 0) ^ this.capacity ^ (this.capacityUnit != null ? this.capacityUnit.hashCode() : 0) ^ (this.expirationDate != null ? this.expirationDate.hashCode() : 0) ^ (this.licenseType != null ? this.licenseType.hashCode() : 0) ^ (this.localReplicationOnly != null ? this.localReplicationOnly.hashCode() : 0);
    }


    public String toString() {
        return "LicenseSettings [licenseUID=" + this.licenseUID + ", " + "capacity=" + this.capacity + ", " + "capacityUnit=" + this.capacityUnit + ", " + "expirationDate=" + this.expirationDate + ", " + "licenseType=" + this.licenseType + ", " + "localReplicationOnly=" + this.localReplicationOnly + "]";
    }
}


