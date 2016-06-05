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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="getSupportedArrayManagementProviderAndArrayTypes", propOrder={"clusterUID"})
/*     */ public class GetSupportedArrayManagementProviderAndArrayTypes
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected ClusterUID clusterUID;
/*     */   
/*     */   public GetSupportedArrayManagementProviderAndArrayTypes() {}
/*     */   
/*     */   public GetSupportedArrayManagementProviderAndArrayTypes(ClusterUID clusterUID)
/*     */   {
/*  46 */     this.clusterUID = clusterUID;
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
/*  58 */     return this.clusterUID;
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
/*  70 */     this.clusterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof GetSupportedArrayManagementProviderAndArrayTypes)) {
/*  81 */       return false;
/*     */     }
/*  83 */     GetSupportedArrayManagementProviderAndArrayTypes otherObj = (GetSupportedArrayManagementProviderAndArrayTypes)obj;
/*     */     
/*  85 */     return this.clusterUID == otherObj.clusterUID ? true : this.clusterUID != null ? this.clusterUID.equals(otherObj.clusterUID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.clusterUID != null ? this.clusterUID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "GetSupportedArrayManagementProviderAndArrayTypes [clusterUID=" + this.clusterUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetSupportedArrayManagementProviderAndArrayTypes.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */