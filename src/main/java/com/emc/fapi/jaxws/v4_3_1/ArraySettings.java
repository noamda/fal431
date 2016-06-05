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
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=VCArraySettings.class, name="VCArraySettings")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArraySettings", propOrder={"name", "serialNumber", "arrayUID", "type", "credentials", "connectionParams", "resourcePools"})
/*     */ @XmlSeeAlso({VCArraySettings.class})
/*     */ public class ArraySettings
/*     */ {
/*     */   protected String name;
/*     */   protected String serialNumber;
/*     */   @XmlElement(nillable=true)
/*     */   protected ArrayUID arrayUID;
/*     */   protected ArrayType type;
/*     */   protected BaseCredentials credentials;
/*     */   protected BaseConnectionParams connectionParams;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayResourcePoolSettings> resourcePools;
/*     */   
/*     */   public ArraySettings() {}
/*     */   
/*     */   public ArraySettings(String name, String serialNumber, ArrayUID arrayUID, ArrayType type, BaseCredentials credentials, BaseConnectionParams connectionParams, List<ArrayResourcePoolSettings> resourcePools)
/*     */   {
/*  82 */     this.name = name;
/*  83 */     this.serialNumber = serialNumber;
/*  84 */     this.arrayUID = arrayUID;
/*  85 */     this.type = type;
/*  86 */     this.credentials = credentials;
/*  87 */     this.connectionParams = connectionParams;
/*  88 */     this.resourcePools = resourcePools;
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
/* 100 */     return this.name;
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
/* 112 */     this.name = value;
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
/* 124 */     return this.serialNumber;
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
/* 136 */     this.serialNumber = value;
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
/* 148 */     return this.arrayUID;
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
/* 160 */     this.arrayUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayType getType()
/*     */   {
/* 172 */     return this.type;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setType(ArrayType value)
/*     */   {
/* 184 */     this.type = value;
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
/* 196 */     return this.credentials;
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
/* 208 */     this.credentials = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BaseConnectionParams getConnectionParams()
/*     */   {
/* 220 */     return this.connectionParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setConnectionParams(BaseConnectionParams value)
/*     */   {
/* 232 */     this.connectionParams = value;
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
/*     */   public List<ArrayResourcePoolSettings> getResourcePools()
/*     */   {
/* 258 */     if (this.resourcePools == null) {
/* 259 */       this.resourcePools = new ArrayList();
/*     */     }
/* 261 */     return this.resourcePools;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 271 */     if (!(obj instanceof ArraySettings)) {
/* 272 */       return false;
/*     */     }
/* 274 */     ArraySettings otherObj = (ArraySettings)obj;
/*     */     
/* 276 */     return (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.serialNumber != null ? this.serialNumber.equals(otherObj.serialNumber) : this.serialNumber == otherObj.serialNumber) && (this.arrayUID != null ? this.arrayUID.equals(otherObj.arrayUID) : this.arrayUID == otherObj.arrayUID) && (this.type != null ? this.type.equals(otherObj.type) : this.type == otherObj.type) && (this.credentials != null ? this.credentials.equals(otherObj.credentials) : this.credentials == otherObj.credentials) && (this.connectionParams != null ? this.connectionParams.equals(otherObj.connectionParams) : this.connectionParams == otherObj.connectionParams) && (this.resourcePools != null ? this.resourcePools.equals(otherObj.resourcePools) : this.resourcePools == otherObj.resourcePools);
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
/* 291 */     return (this.name != null ? this.name.hashCode() : 0) ^ (this.serialNumber != null ? this.serialNumber.hashCode() : 0) ^ (this.arrayUID != null ? this.arrayUID.hashCode() : 0) ^ (this.type != null ? this.type.hashCode() : 0) ^ (this.credentials != null ? this.credentials.hashCode() : 0) ^ (this.connectionParams != null ? this.connectionParams.hashCode() : 0) ^ (this.resourcePools != null ? this.resourcePools.hashCode() : 0);
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
/* 306 */     return "ArraySettings [name=" + this.name + ", " + "serialNumber=" + this.serialNumber + ", " + "arrayUID=" + this.arrayUID + ", " + "type=" + this.type + ", " + "credentials=" + this.credentials + ", " + "connectionParams=" + this.connectionParams + ", " + "resourcePools=" + this.resourcePools + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArraySettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */