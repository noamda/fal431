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
/*     */ @XmlType(name="attachVolumeToSplitter", propOrder={"splitter", "volumeParam"})
/*     */ public class AttachVolumeToSplitter
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected SetVolumeParam volumeParam;
/*     */   
/*     */   public AttachVolumeToSplitter() {}
/*     */   
/*     */   public AttachVolumeToSplitter(SplitterUID splitter, SetVolumeParam volumeParam)
/*     */   {
/*  47 */     this.splitter = splitter;
/*  48 */     this.volumeParam = volumeParam;
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
/*  60 */     return this.splitter;
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
/*  72 */     this.splitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SetVolumeParam getVolumeParam()
/*     */   {
/*  84 */     return this.volumeParam;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeParam(SetVolumeParam value)
/*     */   {
/*  96 */     this.volumeParam = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof AttachVolumeToSplitter)) {
/* 107 */       return false;
/*     */     }
/* 109 */     AttachVolumeToSplitter otherObj = (AttachVolumeToSplitter)obj;
/*     */     
/* 111 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumeParam != null ? this.volumeParam.equals(otherObj.volumeParam) : this.volumeParam == otherObj.volumeParam);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumeParam != null ? this.volumeParam.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "AttachVolumeToSplitter [splitter=" + this.splitter + ", " + "volumeParam=" + this.volumeParam + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AttachVolumeToSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */