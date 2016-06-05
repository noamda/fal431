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
/*     */ @XmlType(name="ManagementMode", propOrder={"managedByRecoverPoint", "externalManagement"})
/*     */ public class ManagementMode
/*     */ {
/*     */   protected boolean managedByRecoverPoint;
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected ExternalManagement externalManagement;
/*     */   
/*     */   public ManagementMode() {}
/*     */   
/*     */   public ManagementMode(boolean managedByRecoverPoint, ExternalManagement externalManagement)
/*     */   {
/*  49 */     this.managedByRecoverPoint = managedByRecoverPoint;
/*  50 */     this.externalManagement = externalManagement;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isManagedByRecoverPoint()
/*     */   {
/*  58 */     return this.managedByRecoverPoint;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setManagedByRecoverPoint(boolean value)
/*     */   {
/*  66 */     this.managedByRecoverPoint = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ExternalManagement getExternalManagement()
/*     */   {
/*  78 */     return this.externalManagement;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setExternalManagement(ExternalManagement value)
/*     */   {
/*  90 */     this.externalManagement = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof ManagementMode)) {
/* 101 */       return false;
/*     */     }
/* 103 */     ManagementMode otherObj = (ManagementMode)obj;
/*     */     
/* 105 */     return (this.managedByRecoverPoint == otherObj.managedByRecoverPoint) && (this.externalManagement != null ? this.externalManagement.equals(otherObj.externalManagement) : this.externalManagement == otherObj.externalManagement);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.managedByRecoverPoint ? 1 : 0) ^ (this.externalManagement != null ? this.externalManagement.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "ManagementMode [managedByRecoverPoint=" + this.managedByRecoverPoint + ", " + "externalManagement=" + this.externalManagement + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ManagementMode.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */