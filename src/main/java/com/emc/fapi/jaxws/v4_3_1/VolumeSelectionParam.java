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
/*     */ @JsonTypeName("VolumeSelectionParam")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VolumeSelectionParam", propOrder={"deviceUID"})
/*     */ public class VolumeSelectionParam
/*     */   extends BaseVolumeParams
/*     */ {
/*     */   @XmlElement(required=true, nillable=true)
/*     */   protected DeviceUID deviceUID;
/*     */   
/*     */   public VolumeSelectionParam() {}
/*     */   
/*     */   public VolumeSelectionParam(DeviceUID deviceUID)
/*     */   {
/*  56 */     this.deviceUID = deviceUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public DeviceUID getDeviceUID()
/*     */   {
/*  68 */     return this.deviceUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDeviceUID(DeviceUID value)
/*     */   {
/*  80 */     this.deviceUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof VolumeSelectionParam)) {
/*  91 */       return false;
/*     */     }
/*  93 */     VolumeSelectionParam otherObj = (VolumeSelectionParam)obj;
/*     */     
/*  95 */     return (super.equals(obj)) && (this.deviceUID != null ? this.deviceUID.equals(otherObj.deviceUID) : this.deviceUID == otherObj.deviceUID);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return super.hashCode() ^ (this.deviceUID != null ? this.deviceUID.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "VolumeSelectionParam [super=" + super.toString() + ", " + "deviceUID=" + this.deviceUID + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeSelectionParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */