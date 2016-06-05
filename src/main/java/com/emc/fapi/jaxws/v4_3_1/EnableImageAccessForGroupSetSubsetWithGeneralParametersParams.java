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
/*     */ @XmlType(name="enableImageAccessForGroupSetSubsetWithGeneralParametersParams", propOrder={"generalParams", "groupSetSubset"})
/*     */ public class EnableImageAccessForGroupSetSubsetWithGeneralParametersParams
/*     */ {
/*     */   protected ImageAccessGeneralParameters generalParams;
/*     */   protected ConsistencyGroupSetSubset groupSetSubset;
/*     */   
/*     */   public EnableImageAccessForGroupSetSubsetWithGeneralParametersParams() {}
/*     */   
/*     */   public EnableImageAccessForGroupSetSubsetWithGeneralParametersParams(ImageAccessGeneralParameters generalParams, ConsistencyGroupSetSubset groupSetSubset)
/*     */   {
/*  54 */     this.generalParams = generalParams;
/*  55 */     this.groupSetSubset = groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ImageAccessGeneralParameters getGeneralParams()
/*     */   {
/*  67 */     return this.generalParams;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGeneralParams(ImageAccessGeneralParameters value)
/*     */   {
/*  79 */     this.generalParams = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupSetSubset getGroupSetSubset()
/*     */   {
/*  91 */     return this.groupSetSubset;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupSetSubset(ConsistencyGroupSetSubset value)
/*     */   {
/* 103 */     this.groupSetSubset = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 113 */     if (!(obj instanceof EnableImageAccessForGroupSetSubsetWithGeneralParametersParams)) {
/* 114 */       return false;
/*     */     }
/* 116 */     EnableImageAccessForGroupSetSubsetWithGeneralParametersParams otherObj = (EnableImageAccessForGroupSetSubsetWithGeneralParametersParams)obj;
/*     */     
/* 118 */     return (this.generalParams != null ? this.generalParams.equals(otherObj.generalParams) : this.generalParams == otherObj.generalParams) && (this.groupSetSubset != null ? this.groupSetSubset.equals(otherObj.groupSetSubset) : this.groupSetSubset == otherObj.groupSetSubset);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 128 */     return (this.generalParams != null ? this.generalParams.hashCode() : 0) ^ (this.groupSetSubset != null ? this.groupSetSubset.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 138 */     return "EnableImageAccessForGroupSetSubsetWithGeneralParametersParams [generalParams=" + this.generalParams + ", " + "groupSetSubset=" + this.groupSetSubset + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EnableImageAccessForGroupSetSubsetWithGeneralParametersParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */