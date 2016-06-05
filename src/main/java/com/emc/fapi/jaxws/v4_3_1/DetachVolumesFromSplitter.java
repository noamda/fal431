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
/*     */ @XmlType(name="detachVolumesFromSplitter", propOrder={"splitter", "volumesIDs"})
/*     */ public class DetachVolumesFromSplitter
/*     */ {
/*     */   protected SplitterUID splitter;
/*     */   protected List<DeviceUID> volumesIDs;
/*     */   
/*     */   public DetachVolumesFromSplitter() {}
/*     */   
/*     */   public DetachVolumesFromSplitter(SplitterUID splitter, List<DeviceUID> volumesIDs)
/*     */   {
/*  49 */     this.splitter = splitter;
/*  50 */     this.volumesIDs = volumesIDs;
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
/*     */   public List<DeviceUID> getVolumesIDs()
/*     */   {
/* 100 */     if (this.volumesIDs == null) {
/* 101 */       this.volumesIDs = new ArrayList();
/*     */     }
/* 103 */     return this.volumesIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof DetachVolumesFromSplitter)) {
/* 114 */       return false;
/*     */     }
/* 116 */     DetachVolumesFromSplitter otherObj = (DetachVolumesFromSplitter)obj;
/*     */     
/* 118 */     return (this.splitter != null ? this.splitter.equals(otherObj.splitter) : this.splitter == otherObj.splitter) && (this.volumesIDs != null ? this.volumesIDs.equals(otherObj.volumesIDs) : this.volumesIDs == otherObj.volumesIDs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.splitter != null ? this.splitter.hashCode() : 0) ^ (this.volumesIDs != null ? this.volumesIDs.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "DetachVolumesFromSplitter [splitter=" + this.splitter + ", " + "volumesIDs=" + this.volumesIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\DetachVolumesFromSplitter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */