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
/*     */ @XmlType(name="SetVolumeParam", propOrder={"volumeID", "shouldAttachAsClean"})
/*     */ public class SetVolumeParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected DeviceUID volumeID;
/*     */   protected boolean shouldAttachAsClean;
/*     */   
/*     */   public SetVolumeParam() {}
/*     */   
/*     */   public SetVolumeParam(DeviceUID volumeID, boolean shouldAttachAsClean)
/*     */   {
/*  49 */     this.volumeID = volumeID;
/*  50 */     this.shouldAttachAsClean = shouldAttachAsClean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getVolumeID()
/*     */   {
/*  62 */     return this.volumeID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeID(DeviceUID value)
/*     */   {
/*  74 */     this.volumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isShouldAttachAsClean()
/*     */   {
/*  82 */     return this.shouldAttachAsClean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setShouldAttachAsClean(boolean value)
/*     */   {
/*  90 */     this.shouldAttachAsClean = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof SetVolumeParam)) {
/* 101 */       return false;
/*     */     }
/* 103 */     SetVolumeParam otherObj = (SetVolumeParam)obj;
/*     */     
/* 105 */     return (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.shouldAttachAsClean == otherObj.shouldAttachAsClean);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.shouldAttachAsClean ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "SetVolumeParam [volumeID=" + this.volumeID + ", " + "shouldAttachAsClean=" + this.shouldAttachAsClean + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetVolumeParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */