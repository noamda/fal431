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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SplitterVolumeInfo", propOrder={"splitterVolume", "splitterName", "volumeName"})
/*     */ public class SplitterVolumeInfo
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected SplitterVolume splitterVolume;
/*     */   protected String splitterName;
/*     */   protected String volumeName;
/*     */   
/*     */   public SplitterVolumeInfo() {}
/*     */   
/*     */   public SplitterVolumeInfo(SplitterVolume splitterVolume, String splitterName, String volumeName)
/*     */   {
/*  52 */     this.splitterVolume = splitterVolume;
/*  53 */     this.splitterName = splitterName;
/*  54 */     this.volumeName = volumeName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterVolume getSplitterVolume()
/*     */   {
/*  66 */     return this.splitterVolume;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterVolume(SplitterVolume value)
/*     */   {
/*  78 */     this.splitterVolume = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSplitterName()
/*     */   {
/*  90 */     return this.splitterName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitterName(String value)
/*     */   {
/* 102 */     this.splitterName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getVolumeName()
/*     */   {
/* 114 */     return this.volumeName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeName(String value)
/*     */   {
/* 126 */     this.volumeName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 136 */     if (!(obj instanceof SplitterVolumeInfo)) {
/* 137 */       return false;
/*     */     }
/* 139 */     SplitterVolumeInfo otherObj = (SplitterVolumeInfo)obj;
/*     */     
/* 141 */     return (this.splitterVolume != null ? this.splitterVolume.equals(otherObj.splitterVolume) : this.splitterVolume == otherObj.splitterVolume) && (this.splitterName != null ? this.splitterName.equals(otherObj.splitterName) : this.splitterName == otherObj.splitterName) && (this.volumeName != null ? this.volumeName.equals(otherObj.volumeName) : this.volumeName == otherObj.volumeName);
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
/* 152 */     return (this.splitterVolume != null ? this.splitterVolume.hashCode() : 0) ^ (this.splitterName != null ? this.splitterName.hashCode() : 0) ^ (this.volumeName != null ? this.volumeName.hashCode() : 0);
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
/* 163 */     return "SplitterVolumeInfo [splitterVolume=" + this.splitterVolume + ", " + "splitterName=" + this.splitterName + ", " + "volumeName=" + this.volumeName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SplitterVolumeInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */