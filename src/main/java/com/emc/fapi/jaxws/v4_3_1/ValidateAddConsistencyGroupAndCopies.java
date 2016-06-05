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
/*     */ @XmlType(name="validateAddConsistencyGroupAndCopies", propOrder={"fullGroupPolicy"})
/*     */ public class ValidateAddConsistencyGroupAndCopies
/*     */ {
/*     */   protected FullConsistencyGroupPolicy fullGroupPolicy;
/*     */   
/*     */   public ValidateAddConsistencyGroupAndCopies() {}
/*     */   
/*     */   public ValidateAddConsistencyGroupAndCopies(FullConsistencyGroupPolicy fullGroupPolicy)
/*     */   {
/*  44 */     this.fullGroupPolicy = fullGroupPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FullConsistencyGroupPolicy getFullGroupPolicy()
/*     */   {
/*  56 */     return this.fullGroupPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFullGroupPolicy(FullConsistencyGroupPolicy value)
/*     */   {
/*  68 */     this.fullGroupPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof ValidateAddConsistencyGroupAndCopies)) {
/*  79 */       return false;
/*     */     }
/*  81 */     ValidateAddConsistencyGroupAndCopies otherObj = (ValidateAddConsistencyGroupAndCopies)obj;
/*     */     
/*  83 */     return this.fullGroupPolicy == otherObj.fullGroupPolicy ? true : this.fullGroupPolicy != null ? this.fullGroupPolicy.equals(otherObj.fullGroupPolicy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.fullGroupPolicy != null ? this.fullGroupPolicy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "ValidateAddConsistencyGroupAndCopies [fullGroupPolicy=" + this.fullGroupPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddConsistencyGroupAndCopies.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */