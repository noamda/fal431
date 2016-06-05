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
/*     */ @XmlType(name="ClusterSupportedArrayManagementProviderAndArrayTypes", propOrder={"clusterUID", "supportedAmpsAndArraysTypes"})
/*     */ public class ClusterSupportedArrayManagementProviderAndArrayTypes
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   protected SupportedArrayManagementProviderAndArrayTypes supportedAmpsAndArraysTypes;
/*     */   
/*     */   public ClusterSupportedArrayManagementProviderAndArrayTypes() {}
/*     */   
/*     */   public ClusterSupportedArrayManagementProviderAndArrayTypes(ClusterUID clusterUID, SupportedArrayManagementProviderAndArrayTypes supportedAmpsAndArraysTypes)
/*     */   {
/*  49 */     this.clusterUID = clusterUID;
/*  50 */     this.supportedAmpsAndArraysTypes = supportedAmpsAndArraysTypes;
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
/*  62 */     return this.clusterUID;
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
/*  74 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SupportedArrayManagementProviderAndArrayTypes getSupportedAmpsAndArraysTypes()
/*     */   {
/*  86 */     return this.supportedAmpsAndArraysTypes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSupportedAmpsAndArraysTypes(SupportedArrayManagementProviderAndArrayTypes value)
/*     */   {
/*  98 */     this.supportedAmpsAndArraysTypes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof ClusterSupportedArrayManagementProviderAndArrayTypes)) {
/* 109 */       return false;
/*     */     }
/* 111 */     ClusterSupportedArrayManagementProviderAndArrayTypes otherObj = (ClusterSupportedArrayManagementProviderAndArrayTypes)obj;
/*     */     
/* 113 */     return (this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : this.clusterUID == otherObj.clusterUID) && (this.supportedAmpsAndArraysTypes != null ? this.supportedAmpsAndArraysTypes.equals(otherObj.supportedAmpsAndArraysTypes) : this.supportedAmpsAndArraysTypes == otherObj.supportedAmpsAndArraysTypes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.clusterUID != null ? this.clusterUID.hashCode() : 0) ^ (this.supportedAmpsAndArraysTypes != null ? this.supportedAmpsAndArraysTypes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "ClusterSupportedArrayManagementProviderAndArrayTypes [clusterUID=" + this.clusterUID + ", " + "supportedAmpsAndArraysTypes=" + this.supportedAmpsAndArraysTypes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ClusterSupportedArrayManagementProviderAndArrayTypes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */