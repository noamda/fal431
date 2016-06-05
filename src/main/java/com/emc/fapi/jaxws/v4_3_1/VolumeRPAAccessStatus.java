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
/*     */ @XmlType(name="VolumeRPAAccessStatus", propOrder={"rpaUID", "accessStatus"})
/*     */ public class VolumeRPAAccessStatus
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected RpaUID rpaUID;
/*     */   protected VolumeStatus accessStatus;
/*     */   
/*     */   public VolumeRPAAccessStatus() {}
/*     */   
/*     */   public VolumeRPAAccessStatus(RpaUID rpaUID, VolumeStatus accessStatus)
/*     */   {
/*  49 */     this.rpaUID = rpaUID;
/*  50 */     this.accessStatus = accessStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public RpaUID getRpaUID()
/*     */   {
/*  62 */     return this.rpaUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRpaUID(RpaUID value)
/*     */   {
/*  74 */     this.rpaUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeStatus getAccessStatus()
/*     */   {
/*  86 */     return this.accessStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAccessStatus(VolumeStatus value)
/*     */   {
/*  98 */     this.accessStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 108 */     if (!(obj instanceof VolumeRPAAccessStatus)) {
/* 109 */       return false;
/*     */     }
/* 111 */     VolumeRPAAccessStatus otherObj = (VolumeRPAAccessStatus)obj;
/*     */     
/* 113 */     return (this.rpaUID != null ? this.rpaUID.equals(otherObj.rpaUID) : this.rpaUID == otherObj.rpaUID) && (this.accessStatus != null ? this.accessStatus.equals(otherObj.accessStatus) : this.accessStatus == otherObj.accessStatus);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 123 */     return (this.rpaUID != null ? this.rpaUID.hashCode() : 0) ^ (this.accessStatus != null ? this.accessStatus.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 133 */     return "VolumeRPAAccessStatus [rpaUID=" + this.rpaUID + ", " + "accessStatus=" + this.accessStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeRPAAccessStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */