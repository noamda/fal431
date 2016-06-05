/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ArrayLicenseSettings.class, name="ArrayLicenseSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=ClusterLicenseSettings.class, name="ClusterLicenseSettings"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCLicenseSettings.class, name="VCLicenseSettings")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="LicenseSettings", propOrder={"licenseUID", "capacity", "capacityUnit", "expirationDate", "licenseType", "localReplicationOnly"})
/*     */ @XmlSeeAlso({ClusterLicenseSettings.class, VCLicenseSettings.class, ArrayLicenseSettings.class})
/*     */ public abstract class LicenseSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected LicenseUID licenseUID;
/*     */   protected int capacity;
/*     */   protected LicenseCapacityUnit capacityUnit;
/*     */   protected RecoverPointTimeStamp expirationDate;
/*     */   protected RecoverPointLicenseType licenseType;
/*     */   protected Boolean localReplicationOnly;
/*     */   
/*     */   public LicenseSettings() {}
/*     */   
/*     */   public LicenseSettings(LicenseUID licenseUID, int capacity, LicenseCapacityUnit capacityUnit, RecoverPointTimeStamp expirationDate, RecoverPointLicenseType licenseType, Boolean localReplicationOnly)
/*     */   {
/*  80 */     this.licenseUID = licenseUID;
/*  81 */     this.capacity = capacity;
/*  82 */     this.capacityUnit = capacityUnit;
/*  83 */     this.expirationDate = expirationDate;
/*  84 */     this.licenseType = licenseType;
/*  85 */     this.localReplicationOnly = localReplicationOnly;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseUID getLicenseUID()
/*     */   {
/*  97 */     return this.licenseUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicenseUID(LicenseUID value)
/*     */   {
/* 109 */     this.licenseUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getCapacity()
/*     */   {
/* 117 */     return this.capacity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCapacity(int value)
/*     */   {
/* 125 */     this.capacity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public LicenseCapacityUnit getCapacityUnit()
/*     */   {
/* 137 */     return this.capacityUnit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCapacityUnit(LicenseCapacityUnit value)
/*     */   {
/* 149 */     this.capacityUnit = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointTimeStamp getExpirationDate()
/*     */   {
/* 161 */     return this.expirationDate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExpirationDate(RecoverPointTimeStamp value)
/*     */   {
/* 173 */     this.expirationDate = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RecoverPointLicenseType getLicenseType()
/*     */   {
/* 185 */     return this.licenseType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLicenseType(RecoverPointLicenseType value)
/*     */   {
/* 197 */     this.licenseType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isLocalReplicationOnly()
/*     */   {
/* 209 */     return this.localReplicationOnly;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalReplicationOnly(Boolean value)
/*     */   {
/* 221 */     this.localReplicationOnly = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 231 */     if (!(obj instanceof LicenseSettings)) {
/* 232 */       return false;
/*     */     }
/* 234 */     LicenseSettings otherObj = (LicenseSettings)obj;
/*     */     
/* 236 */     return (this.licenseUID != null ? this.licenseUID.equals(otherObj.licenseUID) : this.licenseUID == otherObj.licenseUID) && (this.capacity == otherObj.capacity) && (this.capacityUnit != null ? this.capacityUnit.equals(otherObj.capacityUnit) : this.capacityUnit == otherObj.capacityUnit) && (this.expirationDate != null ? this.expirationDate.equals(otherObj.expirationDate) : this.expirationDate == otherObj.expirationDate) && (this.licenseType != null ? this.licenseType.equals(otherObj.licenseType) : this.licenseType == otherObj.licenseType) && (this.localReplicationOnly != null ? this.localReplicationOnly.equals(otherObj.localReplicationOnly) : this.localReplicationOnly == otherObj.localReplicationOnly);
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
/*     */   public int hashCode()
/*     */   {
/* 250 */     return (this.licenseUID != null ? this.licenseUID.hashCode() : 0) ^ this.capacity ^ (this.capacityUnit != null ? this.capacityUnit.hashCode() : 0) ^ (this.expirationDate != null ? this.expirationDate.hashCode() : 0) ^ (this.licenseType != null ? this.licenseType.hashCode() : 0) ^ (this.localReplicationOnly != null ? this.localReplicationOnly.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 264 */     return "LicenseSettings [licenseUID=" + this.licenseUID + ", " + "capacity=" + this.capacity + ", " + "capacityUnit=" + this.capacityUnit + ", " + "expirationDate=" + this.expirationDate + ", " + "licenseType=" + this.licenseType + ", " + "localReplicationOnly=" + this.localReplicationOnly + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\LicenseSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */