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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="RegisterArrayResourcePoolParams", propOrder={"resourcePoolUID", "resourcePoolType"})
/*     */ public class RegisterArrayResourcePoolParams
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ResourcePoolUID resourcePoolUID;
/*     */   @XmlElement(required=true)
/*     */   protected ArrayResourcePoolType resourcePoolType;
/*     */   
/*     */   public RegisterArrayResourcePoolParams() {}
/*     */   
/*     */   public RegisterArrayResourcePoolParams(ResourcePoolUID resourcePoolUID, ArrayResourcePoolType resourcePoolType)
/*     */   {
/*  50 */     this.resourcePoolUID = resourcePoolUID;
/*  51 */     this.resourcePoolType = resourcePoolType;
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
/*  63 */     return this.resourcePoolUID;
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
/*  75 */     this.resourcePoolUID = value;
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
/*  87 */     return this.resourcePoolType;
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
/*  99 */     this.resourcePoolType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof RegisterArrayResourcePoolParams)) {
/* 110 */       return false;
/*     */     }
/* 112 */     RegisterArrayResourcePoolParams otherObj = (RegisterArrayResourcePoolParams)obj;
/*     */     
/* 114 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.equals(otherObj.resourcePoolUID) : this.resourcePoolUID == otherObj.resourcePoolUID) && (this.resourcePoolType != null ? this.resourcePoolType.equals(otherObj.resourcePoolType) : this.resourcePoolType == otherObj.resourcePoolType);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.resourcePoolUID != null ? this.resourcePoolUID.hashCode() : 0) ^ (this.resourcePoolType != null ? this.resourcePoolType.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "RegisterArrayResourcePoolParams [resourcePoolUID=" + this.resourcePoolUID + ", " + "resourcePoolType=" + this.resourcePoolType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RegisterArrayResourcePoolParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */