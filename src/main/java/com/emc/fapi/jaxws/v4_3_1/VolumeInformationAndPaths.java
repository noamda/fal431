/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="VolumeInformationAndPaths", propOrder={"volumeInformation", "volumePaths"})
/*     */ public class VolumeInformationAndPaths
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected VolumeInformation volumeInformation;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VolumePath> volumePaths;
/*     */   
/*     */   public VolumeInformationAndPaths() {}
/*     */   
/*     */   public VolumeInformationAndPaths(VolumeInformation volumeInformation, List<VolumePath> volumePaths)
/*     */   {
/*  52 */     this.volumeInformation = volumeInformation;
/*  53 */     this.volumePaths = volumePaths;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VolumeInformation getVolumeInformation()
/*     */   {
/*  65 */     return this.volumeInformation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeInformation(VolumeInformation value)
/*     */   {
/*  77 */     this.volumeInformation = value;
/*     */   }
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
/*     */   public List<VolumePath> getVolumePaths()
/*     */   {
/* 103 */     if (this.volumePaths == null) {
/* 104 */       this.volumePaths = new ArrayList();
/*     */     }
/* 106 */     return this.volumePaths;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 116 */     if (!(obj instanceof VolumeInformationAndPaths)) {
/* 117 */       return false;
/*     */     }
/* 119 */     VolumeInformationAndPaths otherObj = (VolumeInformationAndPaths)obj;
/*     */     
/* 121 */     return (this.volumeInformation != null ? this.volumeInformation.equals(otherObj.volumeInformation) : this.volumeInformation == otherObj.volumeInformation) && (this.volumePaths != null ? this.volumePaths.equals(otherObj.volumePaths) : this.volumePaths == otherObj.volumePaths);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 131 */     return (this.volumeInformation != null ? this.volumeInformation.hashCode() : 0) ^ (this.volumePaths != null ? this.volumePaths.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 141 */     return "VolumeInformationAndPaths [volumeInformation=" + this.volumeInformation + ", " + "volumePaths=" + this.volumePaths + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VolumeInformationAndPaths.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */