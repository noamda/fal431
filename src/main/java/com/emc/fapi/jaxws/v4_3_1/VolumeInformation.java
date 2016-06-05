/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClariionVolumeInformation.class, name="ClariionVolumeInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VirtualVolumeInformation.class, name="VirtualVolumeInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SymmetrixVolumeInformation.class, name="SymmetrixVolumeInformation"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VplexVolumeInformation.class, name="VplexVolumeInformation")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeInformation", propOrder={"rawUid", "naaUid", "volumeID", "vendorName", "productName", "modelName", "sizeInBytes", "vendorSpecificInformation", "volumeName", "arraySerialNumber", "onArrayWithRepository", "volumeStorageType", "hasLicense"})
/*     */ @XmlSeeAlso({ClariionVolumeInformation.class, VirtualVolumeInformation.class, SymmetrixVolumeInformation.class, VplexVolumeInformation.class})
/*     */ public class VolumeInformation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Byte> rawUid;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Byte> naaUid;
/*     */   protected DeviceUID volumeID;
/*     */   protected String vendorName;
/*     */   protected String productName;
/*     */   protected String modelName;
/*     */   protected Long sizeInBytes;
/*     */   protected String vendorSpecificInformation;
/*     */   protected String volumeName;
/*     */   protected String arraySerialNumber;
/*     */   protected Boolean onArrayWithRepository;
/*     */   @XmlElement(nillable=true)
/*     */   protected VolumeStorageType volumeStorageType;
/*     */   protected Boolean hasLicense;
/*     */   
/*     */   public VolumeInformation() {}
/*     */   
/*     */   public VolumeInformation(List<Byte> rawUid, List<Byte> naaUid, DeviceUID volumeID, String vendorName, String productName, String modelName, Long sizeInBytes, String vendorSpecificInformation, String volumeName, String arraySerialNumber, Boolean onArrayWithRepository, VolumeStorageType volumeStorageType, Boolean hasLicense)
/*     */   {
/* 107 */     this.rawUid = rawUid;
/* 108 */     this.naaUid = naaUid;
/* 109 */     this.volumeID = volumeID;
/* 110 */     this.vendorName = vendorName;
/* 111 */     this.productName = productName;
/* 112 */     this.modelName = modelName;
/* 113 */     this.sizeInBytes = sizeInBytes;
/* 114 */     this.vendorSpecificInformation = vendorSpecificInformation;
/* 115 */     this.volumeName = volumeName;
/* 116 */     this.arraySerialNumber = arraySerialNumber;
/* 117 */     this.onArrayWithRepository = onArrayWithRepository;
/* 118 */     this.volumeStorageType = volumeStorageType;
/* 119 */     this.hasLicense = hasLicense;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Byte> getRawUid()
/*     */   {
/* 145 */     if (this.rawUid == null) {
/* 146 */       this.rawUid = new ArrayList();
/*     */     }
/* 148 */     return this.rawUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public List<Byte> getNaaUid()
/*     */   {
/* 174 */     if (this.naaUid == null) {
/* 175 */       this.naaUid = new ArrayList();
/*     */     }
/* 177 */     return this.naaUid;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getVolumeID()
/*     */   {
/* 189 */     return this.volumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeID(DeviceUID value)
/*     */   {
/* 201 */     this.volumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVendorName()
/*     */   {
/* 213 */     return this.vendorName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVendorName(String value)
/*     */   {
/* 225 */     this.vendorName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getProductName()
/*     */   {
/* 237 */     return this.productName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setProductName(String value)
/*     */   {
/* 249 */     this.productName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getModelName()
/*     */   {
/* 261 */     return this.modelName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setModelName(String value)
/*     */   {
/* 273 */     this.modelName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Long getSizeInBytes()
/*     */   {
/* 285 */     return this.sizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSizeInBytes(Long value)
/*     */   {
/* 297 */     this.sizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVendorSpecificInformation()
/*     */   {
/* 309 */     return this.vendorSpecificInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVendorSpecificInformation(String value)
/*     */   {
/* 321 */     this.vendorSpecificInformation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVolumeName()
/*     */   {
/* 333 */     return this.volumeName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeName(String value)
/*     */   {
/* 345 */     this.volumeName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getArraySerialNumber()
/*     */   {
/* 357 */     return this.arraySerialNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArraySerialNumber(String value)
/*     */   {
/* 369 */     this.arraySerialNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isOnArrayWithRepository()
/*     */   {
/* 381 */     return this.onArrayWithRepository;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOnArrayWithRepository(Boolean value)
/*     */   {
/* 393 */     this.onArrayWithRepository = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeStorageType getVolumeStorageType()
/*     */   {
/* 405 */     return this.volumeStorageType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeStorageType(VolumeStorageType value)
/*     */   {
/* 417 */     this.volumeStorageType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isHasLicense()
/*     */   {
/* 429 */     return this.hasLicense;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setHasLicense(Boolean value)
/*     */   {
/* 441 */     this.hasLicense = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 451 */     if (!(obj instanceof VolumeInformation)) {
/* 452 */       return false;
/*     */     }
/* 454 */     VolumeInformation otherObj = (VolumeInformation)obj;
/*     */     
/* 456 */     return (this.rawUid != null ? this.rawUid.equals(otherObj.rawUid) : this.rawUid == otherObj.rawUid) && (this.naaUid != null ? this.naaUid.equals(otherObj.naaUid) : this.naaUid == otherObj.naaUid) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.vendorName != null ? this.vendorName.equals(otherObj.vendorName) : this.vendorName == otherObj.vendorName) && (this.productName != null ? this.productName.equals(otherObj.productName) : this.productName == otherObj.productName) && (this.modelName != null ? this.modelName.equals(otherObj.modelName) : this.modelName == otherObj.modelName) && (this.sizeInBytes != null ? this.sizeInBytes.equals(otherObj.sizeInBytes) : this.sizeInBytes == otherObj.sizeInBytes) && (this.vendorSpecificInformation != null ? this.vendorSpecificInformation.equals(otherObj.vendorSpecificInformation) : this.vendorSpecificInformation == otherObj.vendorSpecificInformation) && (this.volumeName != null ? this.volumeName.equals(otherObj.volumeName) : this.volumeName == otherObj.volumeName) && (this.arraySerialNumber != null ? this.arraySerialNumber.equals(otherObj.arraySerialNumber) : this.arraySerialNumber == otherObj.arraySerialNumber) && (this.onArrayWithRepository != null ? this.onArrayWithRepository.equals(otherObj.onArrayWithRepository) : this.onArrayWithRepository == otherObj.onArrayWithRepository) && (this.volumeStorageType != null ? this.volumeStorageType.equals(otherObj.volumeStorageType) : this.volumeStorageType == otherObj.volumeStorageType) && (this.hasLicense != null ? this.hasLicense.equals(otherObj.hasLicense) : this.hasLicense == otherObj.hasLicense);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 477 */     return (this.rawUid != null ? this.rawUid.hashCode() : 0) ^ (this.naaUid != null ? this.naaUid.hashCode() : 0) ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.vendorName != null ? this.vendorName.hashCode() : 0) ^ (this.productName != null ? this.productName.hashCode() : 0) ^ (this.modelName != null ? this.modelName.hashCode() : 0) ^ (this.sizeInBytes != null ? this.sizeInBytes.hashCode() : 0) ^ (this.vendorSpecificInformation != null ? this.vendorSpecificInformation.hashCode() : 0) ^ (this.volumeName != null ? this.volumeName.hashCode() : 0) ^ (this.arraySerialNumber != null ? this.arraySerialNumber.hashCode() : 0) ^ (this.onArrayWithRepository != null ? this.onArrayWithRepository.hashCode() : 0) ^ (this.volumeStorageType != null ? this.volumeStorageType.hashCode() : 0) ^ (this.hasLicense != null ? this.hasLicense.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 498 */     return "VolumeInformation [rawUid=" + this.rawUid + ", " + "naaUid=" + this.naaUid + ", " + "volumeID=" + this.volumeID + ", " + "vendorName=" + this.vendorName + ", " + "productName=" + this.productName + ", " + "modelName=" + this.modelName + ", " + "sizeInBytes=" + this.sizeInBytes + ", " + "vendorSpecificInformation=" + this.vendorSpecificInformation + ", " + "volumeName=" + this.volumeName + ", " + "arraySerialNumber=" + this.arraySerialNumber + ", " + "onArrayWithRepository=" + this.onArrayWithRepository + ", " + "volumeStorageType=" + this.volumeStorageType + ", " + "hasLicense=" + this.hasLicense + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */