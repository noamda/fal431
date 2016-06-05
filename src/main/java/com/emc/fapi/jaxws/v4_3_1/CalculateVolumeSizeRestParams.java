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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="calculateVolumeSizeRestParams", propOrder={"distributedConsistencyGroup", "volumeSizeParams"})
/*     */ public class CalculateVolumeSizeRestParams
/*     */ {
/*     */   protected boolean distributedConsistencyGroup;
/*     */   protected CalculateVolumeSizeParams volumeSizeParams;
/*     */   
/*     */   public CalculateVolumeSizeRestParams() {}
/*     */   
/*     */   public CalculateVolumeSizeRestParams(boolean distributedConsistencyGroup, CalculateVolumeSizeParams volumeSizeParams)
/*     */   {
/*  54 */     this.distributedConsistencyGroup = distributedConsistencyGroup;
/*  55 */     this.volumeSizeParams = volumeSizeParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isDistributedConsistencyGroup()
/*     */   {
/*  63 */     return this.distributedConsistencyGroup;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDistributedConsistencyGroup(boolean value)
/*     */   {
/*  71 */     this.distributedConsistencyGroup = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CalculateVolumeSizeParams getVolumeSizeParams()
/*     */   {
/*  83 */     return this.volumeSizeParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setVolumeSizeParams(CalculateVolumeSizeParams value)
/*     */   {
/*  95 */     this.volumeSizeParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 105 */     if (!(obj instanceof CalculateVolumeSizeRestParams)) {
/* 106 */       return false;
/*     */     }
/* 108 */     CalculateVolumeSizeRestParams otherObj = (CalculateVolumeSizeRestParams)obj;
/*     */     
/* 110 */     return (this.distributedConsistencyGroup == otherObj.distributedConsistencyGroup) && (this.volumeSizeParams != null ? this.volumeSizeParams.equals(otherObj.volumeSizeParams) : this.volumeSizeParams == otherObj.volumeSizeParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 120 */     return (this.distributedConsistencyGroup ? 1 : 0) ^ (this.volumeSizeParams != null ? this.volumeSizeParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 130 */     return "CalculateVolumeSizeRestParams [distributedConsistencyGroup=" + this.distributedConsistencyGroup + ", " + "volumeSizeParams=" + this.volumeSizeParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CalculateVolumeSizeRestParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */