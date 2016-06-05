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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="rescanSplitterVolumesConnections", propOrder={"splitter"})
/*     */ public class RescanSplitterVolumesConnections
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   
/*     */   public RescanSplitterVolumesConnections() {}
/*     */   
/*     */   public RescanSplitterVolumesConnections(SplitterUID splitter)
/*     */   {
/*  44 */     this.splitter = splitter;
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
/*  56 */     return this.splitter;
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
/*  68 */     this.splitter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof RescanSplitterVolumesConnections)) {
/*  79 */       return false;
/*     */     }
/*  81 */     RescanSplitterVolumesConnections otherObj = (RescanSplitterVolumesConnections)obj;
/*     */     
/*  83 */     return this.splitter == otherObj.splitter ? true : this.splitter != null ? this.splitter.equals(otherObj.splitter) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.splitter != null ? this.splitter.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "RescanSplitterVolumesConnections [splitter=" + this.splitter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RescanSplitterVolumesConnections.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */