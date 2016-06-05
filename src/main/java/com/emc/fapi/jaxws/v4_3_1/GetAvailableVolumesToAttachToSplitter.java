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
/*     */ @XmlType(name="getAvailableVolumesToAttachToSplitter", propOrder={"splitter", "filterUnseenVolumes"})
/*     */ public class GetAvailableVolumesToAttachToSplitter
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected boolean filterUnseenVolumes;
/*     */   
/*     */   public GetAvailableVolumesToAttachToSplitter() {}
/*     */   
/*     */   public GetAvailableVolumesToAttachToSplitter(SplitterUID splitter, boolean filterUnseenVolumes)
/*     */   {
/*  47 */     this.splitter = splitter;
/*  48 */     this.filterUnseenVolumes = filterUnseenVolumes;
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
/*     */   public boolean isFilterUnseenVolumes()
/*     */   {
/*  80 */     return this.filterUnseenVolumes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilterUnseenVolumes(boolean value)
/*     */   {
/*  88 */     this.filterUnseenVolumes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof GetAvailableVolumesToAttachToSplitter)) {
/*  99 */       return false;
/*     */     }
/* 101 */     GetAvailableVolumesToAttachToSplitter otherObj = (GetAvailableVolumesToAttachToSplitter)obj;
/*     */     
/* 103 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.filterUnseenVolumes == otherObj.filterUnseenVolumes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.filterUnseenVolumes ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "GetAvailableVolumesToAttachToSplitter [splitter=" + this.splitter + ", " + "filterUnseenVolumes=" + this.filterUnseenVolumes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetAvailableVolumesToAttachToSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */