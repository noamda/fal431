/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="validateSetAttachedVolumesForSplitter", propOrder={"splitter", "volumes"})
/*     */ public class ValidateSetAttachedVolumesForSplitter
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected List<SetVolumeParam> volumes;
/*     */   
/*     */   public ValidateSetAttachedVolumesForSplitter() {}
/*     */   
/*     */   public ValidateSetAttachedVolumesForSplitter(SplitterUID splitter, List<SetVolumeParam> volumes)
/*     */   {
/*  49 */     this.splitter = splitter;
/*  50 */     this.volumes = volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SplitterUID getSplitter()
/*     */   {
/*  62 */     return this.splitter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSplitter(SplitterUID value)
/*     */   {
/*  74 */     this.splitter = value;
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
/*     */   public List<SetVolumeParam> getVolumes()
/*     */   {
/* 100 */     if (this.volumes == null) {
/* 101 */       this.volumes = new ArrayList();
/*     */     }
/* 103 */     return this.volumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ValidateSetAttachedVolumesForSplitter)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ValidateSetAttachedVolumesForSplitter otherObj = (ValidateSetAttachedVolumesForSplitter)obj;
/*     */     
/* 118 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumes != null ? this.volumes.equals(otherObj.volumes) : this.volumes == otherObj.volumes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumes != null ? this.volumes.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ValidateSetAttachedVolumesForSplitter [splitter=" + this.splitter + ", " + "volumes=" + this.volumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateSetAttachedVolumesForSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */