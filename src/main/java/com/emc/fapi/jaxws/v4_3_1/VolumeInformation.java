package com.emc.fapi.jaxws.v4_3_1;

import org.codehaus.jackson.annotate.JsonSubTypes;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeInfo.As;
import org.codehaus.jackson.annotate.JsonTypeInfo.Id;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "JsonSubType")
@JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value = ClariionVolumeInformation.class, name = "ClariionVolumeInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VirtualVolumeInformation.class, name = "VirtualVolumeInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = SymmetrixVolumeInformation.class, name = "SymmetrixVolumeInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value = VplexVolumeInformation.class, name = "VplexVolumeInformation")})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VolumeInformation", propOrder = {"rawUid", "naaUid", "volumeID", "vendorName", "productName", "modelName", "sizeInBytes", "vendorSpecificInformation", "volumeName", "arraySerialNumber", "onArrayWithRepository", "volumeStorageType", "hasLicense"})
@XmlSeeAlso({ClariionVolumeInformation.class, VirtualVolumeInformation.class, SymmetrixVolumeInformation.class, VplexVolumeInformation.class})
public class VolumeInformation {
    @XmlElement(nillable = true)
    protected List<Byte> rawUid;
    @XmlElement(nillable = true)
    protected List<Byte> naaUid;
    protected DeviceUID volumeID;
    protected String vendorName;
    protected String productName;
    protected String modelName;
    protected Long sizeInBytes;
    protected String vendorSpecificInformation;
    protected String volumeName;
    protected String arraySerialNumber;
    protected Boolean onArrayWithRepository;
    @XmlElement(nillable = true)
    protected VolumeStorageType volumeStorageType;
    protected Boolean hasLicense;

    public VolumeInformation() {
    }

    public VolumeInformation(List<Byte> rawUid, List<Byte> naaUid, DeviceUID volumeID, String vendorName, String productName, String modelName, Long sizeInBytes, String vendorSpecificInformation, String volumeName, String arraySerialNumber, Boolean onArrayWithRepository, VolumeStorageType volumeStorageType, Boolean hasLicense) {
        this.rawUid = rawUid;
        this.naaUid = naaUid;
        this.volumeID = volumeID;
        this.vendorName = vendorName;
        this.productName = productName;
        this.modelName = modelName;
        this.sizeInBytes = sizeInBytes;
        this.vendorSpecificInformation = vendorSpecificInformation;
        this.volumeName = volumeName;
        this.arraySerialNumber = arraySerialNumber;
        this.onArrayWithRepository = onArrayWithRepository;
        this.volumeStorageType = volumeStorageType;
        this.hasLicense = hasLicense;
    }


    public List<Byte> getRawUid() {
        if (this.rawUid == null) {
            this.rawUid = new ArrayList();
        }
        return this.rawUid;
    }


    public List<Byte> getNaaUid() {
        if (this.naaUid == null) {
            this.naaUid = new ArrayList();
        }
        return this.naaUid;
    }


    public DeviceUID getVolumeID() {
        return this.volumeID;
    }


    public void setVolumeID(DeviceUID value) {
        this.volumeID = value;
    }


    public String getVendorName() {
        return this.vendorName;
    }


    public void setVendorName(String value) {
        this.vendorName = value;
    }


    public String getProductName() {
        return this.productName;
    }


    public void setProductName(String value) {
        this.productName = value;
    }


    public String getModelName() {
        return this.modelName;
    }


    public void setModelName(String value) {
        this.modelName = value;
    }


    public Long getSizeInBytes() {
        return this.sizeInBytes;
    }


    public void setSizeInBytes(Long value) {
        this.sizeInBytes = value;
    }


    public String getVendorSpecificInformation() {
        return this.vendorSpecificInformation;
    }


    public void setVendorSpecificInformation(String value) {
        this.vendorSpecificInformation = value;
    }


    public String getVolumeName() {
        return this.volumeName;
    }


    public void setVolumeName(String value) {
        this.volumeName = value;
    }


    public String getArraySerialNumber() {
        return this.arraySerialNumber;
    }


    public void setArraySerialNumber(String value) {
        this.arraySerialNumber = value;
    }


    public Boolean isOnArrayWithRepository() {
        return this.onArrayWithRepository;
    }


    public void setOnArrayWithRepository(Boolean value) {
        this.onArrayWithRepository = value;
    }


    public VolumeStorageType getVolumeStorageType() {
        return this.volumeStorageType;
    }


    public void setVolumeStorageType(VolumeStorageType value) {
        this.volumeStorageType = value;
    }


    public Boolean isHasLicense() {
        return this.hasLicense;
    }


    public void setHasLicense(Boolean value) {
        this.hasLicense = value;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof VolumeInformation)) {
            return false;
        }
        VolumeInformation otherObj = (VolumeInformation) obj;

        return (this.rawUid != null ? this.rawUid.equals(otherObj.rawUid) : this.rawUid == otherObj.rawUid) && (this.naaUid != null ? this.naaUid.equals(otherObj.naaUid) : this.naaUid == otherObj.naaUid) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.vendorName != null ? this.vendorName.equals(otherObj.vendorName) : this.vendorName == otherObj.vendorName) && (this.productName != null ? this.productName.equals(otherObj.productName) : this.productName == otherObj.productName) && (this.modelName != null ? this.modelName.equals(otherObj.modelName) : this.modelName == otherObj.modelName) && (this.sizeInBytes != null ? this.sizeInBytes.equals(otherObj.sizeInBytes) : this.sizeInBytes == otherObj.sizeInBytes) && (this.vendorSpecificInformation != null ? this.vendorSpecificInformation.equals(otherObj.vendorSpecificInformation) : this.vendorSpecificInformation == otherObj.vendorSpecificInformation) && (this.volumeName != null ? this.volumeName.equals(otherObj.volumeName) : this.volumeName == otherObj.volumeName) && (this.arraySerialNumber != null ? this.arraySerialNumber.equals(otherObj.arraySerialNumber) : this.arraySerialNumber == otherObj.arraySerialNumber) && (this.onArrayWithRepository != null ? this.onArrayWithRepository.equals(otherObj.onArrayWithRepository) : this.onArrayWithRepository == otherObj.onArrayWithRepository) && (this.volumeStorageType != null ? this.volumeStorageType.equals(otherObj.volumeStorageType) : this.volumeStorageType == otherObj.volumeStorageType) && (this.hasLicense != null ? this.hasLicense.equals(otherObj.hasLicense) : this.hasLicense == otherObj.hasLicense);
    }


    public int hashCode() {
        return (this.rawUid != null ? this.rawUid.hashCode() : 0) ^ (this.naaUid != null ? this.naaUid.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.vendorName != null ? this.vendorName.hashCode() : 0) ^ (this.productName != null ? this.productName.hashCode() : 0) ^ (this.modelName != null ? this.modelName.hashCode() : 0) ^ (this.sizeInBytes != null ? this.sizeInBytes.hashCode() : 0) ^ (this.vendorSpecificInformation != null ? this.vendorSpecificInformation.hashCode() : 0) ^ (this.volumeName != null ? this.volumeName.hashCode() : 0) ^ (this.arraySerialNumber != null ? this.arraySerialNumber.hashCode() : 0) ^ (this.onArrayWithRepository != null ? this.onArrayWithRepository.hashCode() : 0) ^ (this.volumeStorageType != null ? this.volumeStorageType.hashCode() : 0) ^ (this.hasLicense != null ? this.hasLicense.hashCode() : 0);
    }


    public String toString() {
        return "VolumeInformation [rawUid=" + this.rawUid + ", " + "naaUid=" + this.naaUid + ", " + "volumeID=" + this.volumeID + ", " + "vendorName=" + this.vendorName + ", " + "productName=" + this.productName + ", " + "modelName=" + this.modelName + ", " + "sizeInBytes=" + this.sizeInBytes + ", " + "vendorSpecificInformation=" + this.vendorSpecificInformation + ", " + "volumeName=" + this.volumeName + ", " + "arraySerialNumber=" + this.arraySerialNumber + ", " + "onArrayWithRepository=" + this.onArrayWithRepository + ", " + "volumeStorageType=" + this.volumeStorageType + ", " + "hasLicense=" + this.hasLicense + "]";
    }
}


