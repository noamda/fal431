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
/*     */ @XmlType(name="VirtualDiskSettings", propOrder={"diskId", "included"})
/*     */ public class VirtualDiskSettings
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected VirtualDiskId diskId;
/*     */   protected boolean included;
/*     */   
/*     */   public VirtualDiskSettings() {}
/*     */   
/*     */   public VirtualDiskSettings(VirtualDiskId diskId, boolean included)
/*     */   {
/*  49 */     this.diskId = diskId;
/*  50 */     this.included = included;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualDiskId getDiskId()
/*     */   {
/*  62 */     return this.diskId;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDiskId(VirtualDiskId value)
/*     */   {
/*  74 */     this.diskId = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIncluded()
/*     */   {
/*  82 */     return this.included;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIncluded(boolean value)
/*     */   {
/*  90 */     this.included = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof VirtualDiskSettings)) {
/* 101 */       return false;
/*     */     }
/* 103 */     VirtualDiskSettings otherObj = (VirtualDiskSettings)obj;
/*     */     
/* 105 */     return (this.diskId != null ? this.diskId.equals(otherObj.diskId) : this.diskId == otherObj.diskId) && (this.included == otherObj.included);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.diskId != null ? this.diskId.hashCode() : 0) ^ (this.included ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "VirtualDiskSettings [diskId=" + this.diskId + ", " + "included=" + this.included + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualDiskSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */