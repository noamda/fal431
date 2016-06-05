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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="DeviceInfo", propOrder={"oldVolumeName", "volumeUID"})
/*     */ public class DeviceInfo
/*     */ {
/*     */   protected String oldVolumeName;
/*     */   protected DeviceUID volumeUID;
/*     */   
/*     */   public DeviceInfo() {}
/*     */   
/*     */   public DeviceInfo(String oldVolumeName, DeviceUID volumeUID)
/*     */   {
/*  47 */     this.oldVolumeName = oldVolumeName;
/*  48 */     this.volumeUID = volumeUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getOldVolumeName()
/*     */   {
/*  60 */     return this.oldVolumeName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setOldVolumeName(String value)
/*     */   {
/*  72 */     this.oldVolumeName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getVolumeUID()
/*     */   {
/*  84 */     return this.volumeUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeUID(DeviceUID value)
/*     */   {
/*  96 */     this.volumeUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof DeviceInfo)) {
/* 107 */       return false;
/*     */     }
/* 109 */     DeviceInfo otherObj = (DeviceInfo)obj;
/*     */     
/* 111 */     return (this.oldVolumeName != null ? this.oldVolumeName.equals(otherObj.oldVolumeName) : this.oldVolumeName == otherObj.oldVolumeName) && (this.volumeUID != null ? this.volumeUID.equals(otherObj.volumeUID) : this.volumeUID == otherObj.volumeUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.oldVolumeName != null ? this.oldVolumeName.hashCode() : 0) ^ (this.volumeUID != null ? this.volumeUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "DeviceInfo [oldVolumeName=" + this.oldVolumeName + ", " + "volumeUID=" + this.volumeUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DeviceInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */