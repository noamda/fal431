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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayResourcePoolSettings", propOrder={"resourcePoolUID", "name", "resourcePoolType", "allocationParams"})
/*     */ public class ArrayResourcePoolSettings
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ResourcePoolUID resourcePoolUID;
/*     */   protected String name;
/*     */   protected ArrayResourcePoolType resourcePoolType;
/*     */   protected ArrayResourcePoolAllocationParams allocationParams;
/*     */   
/*     */   public ArrayResourcePoolSettings() {}
/*     */   
/*     */   public ArrayResourcePoolSettings(ResourcePoolUID resourcePoolUID, String name, ArrayResourcePoolType resourcePoolType, ArrayResourcePoolAllocationParams allocationParams)
/*     */   {
/*  55 */     this.resourcePoolUID = resourcePoolUID;
/*  56 */     this.name = name;
/*  57 */     this.resourcePoolType = resourcePoolType;
/*  58 */     this.allocationParams = allocationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ResourcePoolUID getResourcePoolUID()
/*     */   {
/*  70 */     return this.resourcePoolUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolUID(ResourcePoolUID value)
/*     */   {
/*  82 */     this.resourcePoolUID = value;
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
/*  94 */     return this.name;
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
/* 106 */     this.name = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolType getResourcePoolType()
/*     */   {
/* 118 */     return this.resourcePoolType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setResourcePoolType(ArrayResourcePoolType value)
/*     */   {
/* 130 */     this.resourcePoolType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolAllocationParams getAllocationParams()
/*     */   {
/* 142 */     return this.allocationParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAllocationParams(ArrayResourcePoolAllocationParams value)
/*     */   {
/* 154 */     this.allocationParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 164 */     if (!(obj instanceof ArrayResourcePoolSettings)) {
/* 165 */       return false;
/*     */     }
/* 167 */     ArrayResourcePoolSettings otherObj = (ArrayResourcePoolSettings)obj;
/*     */     
/* 169 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType) && (this.allocationParams != null ? this.allocationParams.equals(otherObj.allocationParams) : this.allocationParams == otherObj.allocationParams);
/*     */   }
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
/* 181 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0) ^ (this.allocationParams != null ? this.allocationParams.hashCode() : 0);
/*     */   }
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
/* 193 */     return "ArrayResourcePoolSettings [resourcePoolUID=" + this.resourcePoolUID + ", " + "name=" + this.name + ", " + "resourcePoolType=" + this.resourcePoolType + ", " + "allocationParams=" + this.allocationParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */