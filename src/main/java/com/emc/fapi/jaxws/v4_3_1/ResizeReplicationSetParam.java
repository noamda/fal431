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
/*     */ @XmlType(name="ResizeReplicationSetParam", propOrder={"additionalSpaceClean", "newSizeInBytes"})
/*     */ public class ResizeReplicationSetParam
/*     */ {
/*     */   protected boolean additionalSpaceClean;
/*     */   protected long newSizeInBytes;
/*     */   
/*     */   public ResizeReplicationSetParam() {}
/*     */   
/*     */   public ResizeReplicationSetParam(boolean additionalSpaceClean, long newSizeInBytes)
/*     */   {
/*  47 */     this.additionalSpaceClean = additionalSpaceClean;
/*  48 */     this.newSizeInBytes = newSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAdditionalSpaceClean()
/*     */   {
/*  56 */     return this.additionalSpaceClean;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAdditionalSpaceClean(boolean value)
/*     */   {
/*  64 */     this.additionalSpaceClean = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public long getNewSizeInBytes()
/*     */   {
/*  72 */     return this.newSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewSizeInBytes(long value)
/*     */   {
/*  80 */     this.newSizeInBytes = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  90 */     if (!(obj instanceof ResizeReplicationSetParam)) {
/*  91 */       return false;
/*     */     }
/*  93 */     ResizeReplicationSetParam otherObj = (ResizeReplicationSetParam)obj;
/*     */     
/*  95 */     return (this.additionalSpaceClean == otherObj.additionalSpaceClean) && (this.newSizeInBytes == otherObj.newSizeInBytes);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 105 */     return (this.additionalSpaceClean ? 1 : 0) ^ (int)this.newSizeInBytes;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 115 */     return "ResizeReplicationSetParam [additionalSpaceClean=" + this.additionalSpaceClean + ", " + "newSizeInBytes=" + this.newSizeInBytes + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ResizeReplicationSetParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */