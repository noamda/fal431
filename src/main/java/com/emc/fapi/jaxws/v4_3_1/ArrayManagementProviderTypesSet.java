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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ArrayManagementProviderTypesSet", propOrder={"ampType", "supportedArrayTypes"})
/*     */ public class ArrayManagementProviderTypesSet
/*     */ {
/*     */   protected ArrayManagementProviderType ampType;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayType> supportedArrayTypes;
/*     */   
/*     */   public ArrayManagementProviderTypesSet() {}
/*     */   
/*     */   public ArrayManagementProviderTypesSet(ArrayManagementProviderType ampType, List<ArrayType> supportedArrayTypes)
/*     */   {
/*  51 */     this.ampType = ampType;
/*  52 */     this.supportedArrayTypes = supportedArrayTypes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayManagementProviderType getAmpType()
/*     */   {
/*  64 */     return this.ampType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAmpType(ArrayManagementProviderType value)
/*     */   {
/*  76 */     this.ampType = value;
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
/*     */   public List<ArrayType> getSupportedArrayTypes()
/*     */   {
/* 102 */     if (this.supportedArrayTypes == null) {
/* 103 */       this.supportedArrayTypes = new ArrayList();
/*     */     }
/* 105 */     return this.supportedArrayTypes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 115 */     if (!(obj instanceof ArrayManagementProviderTypesSet)) {
/* 116 */       return false;
/*     */     }
/* 118 */     ArrayManagementProviderTypesSet otherObj = (ArrayManagementProviderTypesSet)obj;
/*     */     
/* 120 */     return (this.ampType != null ? this.ampType.equals(otherObj.ampType) : this.ampType == otherObj.ampType) && (this.supportedArrayTypes != null ? this.supportedArrayTypes.equals(otherObj.supportedArrayTypes) : this.supportedArrayTypes == otherObj.supportedArrayTypes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 130 */     return (this.ampType != null ? this.ampType.hashCode() : 0) ^ (this.supportedArrayTypes != null ? this.supportedArrayTypes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 140 */     return "ArrayManagementProviderTypesSet [ampType=" + this.ampType + ", " + "supportedArrayTypes=" + this.supportedArrayTypes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayManagementProviderTypesSet.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */