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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="validateApplyBalanceLoadRecommendation", propOrder={"recommendation"})
/*     */ public class ValidateApplyBalanceLoadRecommendation
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected BalanceLoadRecommendation recommendation;
/*     */   
/*     */   public ValidateApplyBalanceLoadRecommendation() {}
/*     */   
/*     */   public ValidateApplyBalanceLoadRecommendation(BalanceLoadRecommendation recommendation)
/*     */   {
/*  46 */     this.recommendation = recommendation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public BalanceLoadRecommendation getRecommendation()
/*     */   {
/*  58 */     return this.recommendation;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setRecommendation(BalanceLoadRecommendation value)
/*     */   {
/*  70 */     this.recommendation = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  80 */     if (!(obj instanceof ValidateApplyBalanceLoadRecommendation)) {
/*  81 */       return false;
/*     */     }
/*  83 */     ValidateApplyBalanceLoadRecommendation otherObj = (ValidateApplyBalanceLoadRecommendation)obj;
/*     */     
/*  85 */     return this.recommendation == otherObj.recommendation ? true : this.recommendation != null ? this.recommendation.equals(otherObj.recommendation) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  94 */     return this.recommendation != null ? this.recommendation.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 103 */     return "ValidateApplyBalanceLoadRecommendation [recommendation=" + this.recommendation + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateApplyBalanceLoadRecommendation.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */