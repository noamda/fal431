/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayManagementProviderSettings", propOrder={"ampUID", "connetionParams", "credentials", "managedArrays", "name", "systemGenerated", "type"})
/*     */ public class ArrayManagementProviderSettings
/*     */ {
/*     */   protected ArrayManagementProviderUID ampUID;
/*     */   protected BaseConnectionParams connetionParams;
/*     */   protected BaseCredentials credentials;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArraySettings> managedArrays;
/*     */   protected String name;
/*     */   protected boolean systemGenerated;
/*     */   protected ArrayManagementProviderType type;
/*     */   
/*     */   public ArrayManagementProviderSettings() {}
/*     */   
/*     */   public ArrayManagementProviderSettings(ArrayManagementProviderUID ampUID, BaseConnectionParams connetionParams, BaseCredentials credentials, List<ArraySettings> managedArrays, String name, boolean systemGenerated, ArrayManagementProviderType type)
/*     */   {
/*  66 */     this.ampUID = ampUID;
/*  67 */     this.connetionParams = connetionParams;
/*  68 */     this.credentials = credentials;
/*  69 */     this.managedArrays = managedArrays;
/*  70 */     this.name = name;
/*  71 */     this.systemGenerated = systemGenerated;
/*  72 */     this.type = type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayManagementProviderUID getAmpUID()
/*     */   {
/*  84 */     return this.ampUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAmpUID(ArrayManagementProviderUID value)
/*     */   {
/*  96 */     this.ampUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseConnectionParams getConnetionParams()
/*     */   {
/* 108 */     return this.connetionParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnetionParams(BaseConnectionParams value)
/*     */   {
/* 120 */     this.connetionParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseCredentials getCredentials()
/*     */   {
/* 132 */     return this.credentials;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCredentials(BaseCredentials value)
/*     */   {
/* 144 */     this.credentials = value;
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
/*     */   public List<ArraySettings> getManagedArrays()
/*     */   {
/* 170 */     if (this.managedArrays == null) {
/* 171 */       this.managedArrays = new ArrayList();
/*     */     }
/* 173 */     return this.managedArrays;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 185 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 197 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isSystemGenerated()
/*     */   {
/* 205 */     return this.systemGenerated;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSystemGenerated(boolean value)
/*     */   {
/* 213 */     this.systemGenerated = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayManagementProviderType getType()
/*     */   {
/* 225 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(ArrayManagementProviderType value)
/*     */   {
/* 237 */     this.type = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 247 */     if (!(obj instanceof ArrayManagementProviderSettings)) {
/* 248 */       return false;
/*     */     }
/* 250 */     ArrayManagementProviderSettings otherObj = (ArrayManagementProviderSettings)obj;
/*     */     
/* 252 */     return (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.connetionParams != null ? this.connetionParams.equals(otherObj.connetionParams) : this.connetionParams == otherObj.connetionParams) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.managedArrays != null ? this.managedArrays.equals(otherObj.managedArrays) : this.managedArrays == otherObj.managedArrays) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.systemGenerated == otherObj.systemGenerated) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type);
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
/*     */   public int hashCode()
/*     */   {
/* 267 */     return (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.connetionParams != null ? this.connetionParams.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.managedArrays != null ? this.managedArrays.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.systemGenerated ? 1 : 0) ^ (this.type != null ? this.type.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 282 */     return "ArrayManagementProviderSettings [ampUID=" + this.ampUID + ", " + "connetionParams=" + this.connetionParams + ", " + "credentials=" + this.credentials + ", " + "managedArrays=" + this.managedArrays + ", " + "name=" + this.name + ", " + "systemGenerated=" + this.systemGenerated + ", " + "type=" + this.type + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayManagementProviderSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */