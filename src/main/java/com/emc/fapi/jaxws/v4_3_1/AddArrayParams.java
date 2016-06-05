/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="AddArrayParams", propOrder={"arrayName", "serialNumber", "clusterUID", "arrayType", "ampUID", "arrayUID", "arrayConfiguration", "force"})
/*     */ public class AddArrayParams
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected String arrayName;
/*     */   protected String serialNumber;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ArrayType arrayType;
/*     */   protected ArrayManagementProviderUID ampUID;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   @XmlElement(required=true)
/*     */   protected ConfigurationParams arrayConfiguration;
/*     */   protected boolean force;
/*     */   
/*     */   public AddArrayParams() {}
/*     */   
/*     */   public AddArrayParams(String arrayName, String serialNumber, ClusterUID clusterUID, ArrayType arrayType, ArrayManagementProviderUID ampUID, ArrayUID arrayUID, ConfigurationParams arrayConfiguration, boolean force)
/*     */   {
/*  71 */     this.arrayName = arrayName;
/*  72 */     this.serialNumber = serialNumber;
/*  73 */     this.clusterUID = clusterUID;
/*  74 */     this.arrayType = arrayType;
/*  75 */     this.ampUID = ampUID;
/*  76 */     this.arrayUID = arrayUID;
/*  77 */     this.arrayConfiguration = arrayConfiguration;
/*  78 */     this.force = force;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getArrayName()
/*     */   {
/*  90 */     return this.arrayName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayName(String value)
/*     */   {
/* 102 */     this.arrayName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSerialNumber()
/*     */   {
/* 114 */     return this.serialNumber;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSerialNumber(String value)
/*     */   {
/* 126 */     this.serialNumber = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ClusterUID getClusterUID()
/*     */   {
/* 138 */     return this.clusterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setClusterUID(ClusterUID value)
/*     */   {
/* 150 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayType getArrayType()
/*     */   {
/* 162 */     return this.arrayType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayType(ArrayType value)
/*     */   {
/* 174 */     this.arrayType = value;
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
/* 186 */     return this.ampUID;
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
/* 198 */     this.ampUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayUID getArrayUID()
/*     */   {
/* 210 */     return this.arrayUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayUID(ArrayUID value)
/*     */   {
/* 222 */     this.arrayUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConfigurationParams getArrayConfiguration()
/*     */   {
/* 234 */     return this.arrayConfiguration;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setArrayConfiguration(ConfigurationParams value)
/*     */   {
/* 246 */     this.arrayConfiguration = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isForce()
/*     */   {
/* 254 */     return this.force;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setForce(boolean value)
/*     */   {
/* 262 */     this.force = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 272 */     if (!(obj instanceof AddArrayParams)) {
/* 273 */       return false;
/*     */     }
/* 275 */     AddArrayParams otherObj = (AddArrayParams)obj;
/*     */     
/* 277 */     return (this.arrayName != null ? this.arrayName.equals(otherObj.arrayName) : this.arrayName == otherObj.arrayName) && (this.serialNumber != null ? this.serialNumber.equals(otherObj.serialNumber) : this.serialNumber == otherObj.serialNumber) && (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.arrayType != null ? this.arrayType.equals(otherObj.arrayType) : this.arrayType == otherObj.arrayType) && (this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : this.ampUID == otherObj.ampUID) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.arrayConfiguration != null ? this.arrayConfiguration.equals(otherObj.arrayConfiguration) : this.arrayConfiguration == otherObj.arrayConfiguration) && (this.force == otherObj.force);
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
/*     */   public int hashCode()
/*     */   {
/* 293 */     return (this.arrayName != null ? this.arrayName.hashCode() : 0) ^ (this.serialNumber != null ? this.serialNumber.hashCode() : 0) ^ (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.arrayType != null ? this.arrayType.hashCode() : 0) ^ (this.ampUID != null ? this.ampUID.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.arrayConfiguration != null ? this.arrayConfiguration.hashCode() : 0) ^ (this.force ? 1 : 0);
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
/*     */   public String toString()
/*     */   {
/* 309 */     return "AddArrayParams [arrayName=" + this.arrayName + ", " + "serialNumber=" + this.serialNumber + ", " + "clusterUID=" + this.clusterUID + ", " + "arrayType=" + this.arrayType + ", " + "ampUID=" + this.ampUID + ", " + "arrayUID=" + this.arrayUID + ", " + "arrayConfiguration=" + this.arrayConfiguration + ", " + "force=" + this.force + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AddArrayParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */