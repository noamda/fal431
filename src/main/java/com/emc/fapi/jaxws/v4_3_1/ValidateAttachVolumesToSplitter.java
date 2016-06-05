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
/*     */ @XmlType(name="validateAttachVolumesToSplitter", propOrder={"splitter", "volumesParams"})
/*     */ public class ValidateAttachVolumesToSplitter
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected List<SetVolumeParam> volumesParams;
/*     */   
/*     */   public ValidateAttachVolumesToSplitter() {}
/*     */   
/*     */   public ValidateAttachVolumesToSplitter(SplitterUID splitter, List<SetVolumeParam> volumesParams)
/*     */   {
/*  49 */     this.splitter = splitter;
/*  50 */     this.volumesParams = volumesParams;
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
/*     */   public List<SetVolumeParam> getVolumesParams()
/*     */   {
/* 100 */     if (this.volumesParams == null) {
/* 101 */       this.volumesParams = new ArrayList();
/*     */     }
/* 103 */     return this.volumesParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof ValidateAttachVolumesToSplitter)) {
/* 114 */       return false;
/*     */     }
/* 116 */     ValidateAttachVolumesToSplitter otherObj = (ValidateAttachVolumesToSplitter)obj;
/*     */     
/* 118 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumesParams != null ? this.volumesParams.equals(otherObj.volumesParams) : this.volumesParams == otherObj.volumesParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumesParams != null ? this.volumesParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "ValidateAttachVolumesToSplitter [splitter=" + this.splitter + ", " + "volumesParams=" + this.volumesParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAttachVolumesToSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */