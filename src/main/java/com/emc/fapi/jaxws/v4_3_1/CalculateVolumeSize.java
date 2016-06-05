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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="calculateVolumeSize", propOrder={"isDistributedCg", "calculateVolumeSizeParams"})
/*     */ public class CalculateVolumeSize
/*     */ {
/*     */   protected boolean isDistributedCg;
/*     */   @XmlElement(namespace="http://impl.version4_3_1.fapi.emc.com/")
/*     */   protected CalculateVolumeSizeParams calculateVolumeSizeParams;
/*     */   
/*     */   public CalculateVolumeSize() {}
/*     */   
/*     */   public CalculateVolumeSize(boolean isDistributedCg, CalculateVolumeSizeParams calculateVolumeSizeParams)
/*     */   {
/*  49 */     this.isDistributedCg = isDistributedCg;
/*  50 */     this.calculateVolumeSizeParams = calculateVolumeSizeParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isIsDistributedCg()
/*     */   {
/*  58 */     return this.isDistributedCg;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIsDistributedCg(boolean value)
/*     */   {
/*  66 */     this.isDistributedCg = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public CalculateVolumeSizeParams getCalculateVolumeSizeParams()
/*     */   {
/*  78 */     return this.calculateVolumeSizeParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setCalculateVolumeSizeParams(CalculateVolumeSizeParams value)
/*     */   {
/*  90 */     this.calculateVolumeSizeParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 100 */     if (!(obj instanceof CalculateVolumeSize)) {
/* 101 */       return false;
/*     */     }
/* 103 */     CalculateVolumeSize otherObj = (CalculateVolumeSize)obj;
/*     */     
/* 105 */     return (this.isDistributedCg == otherObj.isDistributedCg) && (this.calculateVolumeSizeParams != null ? this.calculateVolumeSizeParams.equals(otherObj.calculateVolumeSizeParams) : this.calculateVolumeSizeParams == otherObj.calculateVolumeSizeParams);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 115 */     return (this.isDistributedCg ? 1 : 0) ^ (this.calculateVolumeSizeParams != null ? this.calculateVolumeSizeParams.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 125 */     return "CalculateVolumeSize [isDistributedCg=" + this.isDistributedCg + ", " + "calculateVolumeSizeParams=" + this.calculateVolumeSizeParams + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\CalculateVolumeSize.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */