/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("VolumeConnectivityStatus")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeConnectivityStatus", propOrder={"volumeID", "volumeStatus"})
/*     */ public class VolumeConnectivityStatus
/*     */   extends ClusterEntityConnectivityStatus
/*     */ {
/*     */   protected DeviceUID volumeID;
/*     */   @XmlElement(nillable=true)
/*     */   protected VolumeStatus volumeStatus;
/*     */   
/*     */   public VolumeConnectivityStatus() {}
/*     */   
/*     */   public VolumeConnectivityStatus(DeviceUID volumeID, VolumeStatus volumeStatus)
/*     */   {
/*  59 */     this.volumeID = volumeID;
/*  60 */     this.volumeStatus = volumeStatus;
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
/*  72 */     return this.volumeID;
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
/*  84 */     this.volumeID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeStatus getVolumeStatus()
/*     */   {
/*  96 */     return this.volumeStatus;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeStatus(VolumeStatus value)
/*     */   {
/* 108 */     this.volumeStatus = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 118 */     if (!(obj instanceof VolumeConnectivityStatus)) {
/* 119 */       return false;
/*     */     }
/* 121 */     VolumeConnectivityStatus otherObj = (VolumeConnectivityStatus)obj;
/*     */     
/* 123 */     return (super.equals(obj)) && (this.volumeID != null ? this.volumeID.equals(otherObj.volumeID) : this.volumeID == otherObj.volumeID) && (this.volumeStatus != null ? this.volumeStatus.equals(otherObj.volumeStatus) : this.volumeStatus == otherObj.volumeStatus);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 134 */     return super.hashCode() ^ (this.volumeID != null ? this.volumeID.hashCode() : 0) ^ (this.volumeStatus != null ? this.volumeStatus.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 145 */     return "VolumeConnectivityStatus [super=" + super.toString() + ", " + "volumeID=" + this.volumeID + ", " + "volumeStatus=" + this.volumeStatus + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeConnectivityStatus.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */