/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @XmlType(name="getArrayManagementProviderSettings", propOrder={"ampUID"})
/*     */ public class GetArrayManagementProviderSettings
/*     */ {
/*     */   protected ArrayManagementProviderUID ampUID;
/*     */   
/*     */   public GetArrayManagementProviderSettings() {}
/*     */   
/*     */   public GetArrayManagementProviderSettings(ArrayManagementProviderUID ampUID)
/*     */   {
/*  44 */     this.ampUID = ampUID;
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
/*  56 */     return this.ampUID;
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
/*  68 */     this.ampUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof GetArrayManagementProviderSettings)) {
/*  79 */       return false;
/*     */     }
/*  81 */     GetArrayManagementProviderSettings otherObj = (GetArrayManagementProviderSettings)obj;
/*     */     
/*  83 */     return this.ampUID == otherObj.ampUID ? true : this.ampUID != null ? this.ampUID.equals(otherObj.ampUID) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.ampUID != null ? this.ampUID.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "GetArrayManagementProviderSettings [ampUID=" + this.ampUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetArrayManagementProviderSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */