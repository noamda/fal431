/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
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
/*     */ @JsonTypeName("VirtualVolumeInformation")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="VirtualVolumeInformation", propOrder={"fileName", "volumeType"})
/*     */ public class VirtualVolumeInformation
/*     */   extends VolumeInformation
/*     */ {
/*     */   protected String fileName;
/*     */   protected VirtualVolumeType volumeType;
/*     */   
/*     */   public VirtualVolumeInformation() {}
/*     */   
/*     */   public VirtualVolumeInformation(String fileName, VirtualVolumeType volumeType)
/*     */   {
/*  57 */     this.fileName = fileName;
/*  58 */     this.volumeType = volumeType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFileName()
/*     */   {
/*  70 */     return this.fileName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFileName(String value)
/*     */   {
/*  82 */     this.fileName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VirtualVolumeType getVolumeType()
/*     */   {
/*  94 */     return this.volumeType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeType(VirtualVolumeType value)
/*     */   {
/* 106 */     this.volumeType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof VirtualVolumeInformation)) {
/* 117 */       return false;
/*     */     }
/* 119 */     VirtualVolumeInformation otherObj = (VirtualVolumeInformation)obj;
/*     */     
/* 121 */     return (super.equals(obj)) && (this.fileName != null ? this.fileName.equals(otherObj.fileName) : this.fileName == otherObj.fileName) && (this.volumeType != null ? this.volumeType.equals(otherObj.volumeType) : this.volumeType == otherObj.volumeType);
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
/* 132 */     return super.hashCode() ^ (this.fileName != null ? this.fileName.hashCode() : 0) ^ (this.volumeType != null ? this.volumeType.hashCode() : 0);
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
/* 143 */     return "VirtualVolumeInformation [super=" + super.toString() + ", " + "fileName=" + this.fileName + ", " + "volumeType=" + this.volumeType + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VirtualVolumeInformation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */