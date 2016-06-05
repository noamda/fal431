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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SupportedArrayManagementProviderAndArrayTypes", propOrder={"supportedAMPtoArrayTypes"})
/*     */ public class SupportedArrayManagementProviderAndArrayTypes
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayManagementProviderTypesSet> supportedAMPtoArrayTypes;
/*     */   
/*     */   public SupportedArrayManagementProviderAndArrayTypes() {}
/*     */   
/*     */   public SupportedArrayManagementProviderAndArrayTypes(List<ArrayManagementProviderTypesSet> supportedAMPtoArrayTypes)
/*     */   {
/*  48 */     this.supportedAMPtoArrayTypes = supportedAMPtoArrayTypes;
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
/*     */   public List<ArrayManagementProviderTypesSet> getSupportedAMPtoArrayTypes()
/*     */   {
/*  74 */     if (this.supportedAMPtoArrayTypes == null) {
/*  75 */       this.supportedAMPtoArrayTypes = new ArrayList();
/*     */     }
/*  77 */     return this.supportedAMPtoArrayTypes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof SupportedArrayManagementProviderAndArrayTypes)) {
/*  88 */       return false;
/*     */     }
/*  90 */     SupportedArrayManagementProviderAndArrayTypes otherObj = (SupportedArrayManagementProviderAndArrayTypes)obj;
/*     */     
/*  92 */     return this.supportedAMPtoArrayTypes == otherObj.supportedAMPtoArrayTypes ? true : this.supportedAMPtoArrayTypes != null ? this.supportedAMPtoArrayTypes.equals(otherObj.supportedAMPtoArrayTypes) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.supportedAMPtoArrayTypes != null ? this.supportedAMPtoArrayTypes.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "SupportedArrayManagementProviderAndArrayTypes [supportedAMPtoArrayTypes=" + this.supportedAMPtoArrayTypes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SupportedArrayManagementProviderAndArrayTypes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */