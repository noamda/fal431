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
/*     */ @XmlType(name="ArrayResourcePoolAllocationParams", propOrder={"supportedTiers", "tieringPolicies"})
/*     */ public class ArrayResourcePoolAllocationParams
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ArrayResourcePoolSupportedTiers supportedTiers;
/*     */   @XmlElement(required=true)
/*     */   protected ArrayResourcePoolTieringPolicies tieringPolicies;
/*     */   
/*     */   public ArrayResourcePoolAllocationParams() {}
/*     */   
/*     */   public ArrayResourcePoolAllocationParams(ArrayResourcePoolSupportedTiers supportedTiers, ArrayResourcePoolTieringPolicies tieringPolicies)
/*     */   {
/*  50 */     this.supportedTiers = supportedTiers;
/*  51 */     this.tieringPolicies = tieringPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolSupportedTiers getSupportedTiers()
/*     */   {
/*  63 */     return this.supportedTiers;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSupportedTiers(ArrayResourcePoolSupportedTiers value)
/*     */   {
/*  75 */     this.supportedTiers = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ArrayResourcePoolTieringPolicies getTieringPolicies()
/*     */   {
/*  87 */     return this.tieringPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTieringPolicies(ArrayResourcePoolTieringPolicies value)
/*     */   {
/*  99 */     this.tieringPolicies = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof ArrayResourcePoolAllocationParams)) {
/* 110 */       return false;
/*     */     }
/* 112 */     ArrayResourcePoolAllocationParams otherObj = (ArrayResourcePoolAllocationParams)obj;
/*     */     
/* 114 */     return (this.supportedTiers != null ? this.supportedTiers.equals(otherObj.supportedTiers) : this.supportedTiers == otherObj.supportedTiers) && (this.tieringPolicies != null ? this.tieringPolicies.equals(otherObj.tieringPolicies) : this.tieringPolicies == otherObj.tieringPolicies);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.supportedTiers != null ? this.supportedTiers.hashCode() : 0) ^ (this.tieringPolicies != null ? this.tieringPolicies.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "ArrayResourcePoolAllocationParams [supportedTiers=" + this.supportedTiers + ", " + "tieringPolicies=" + this.tieringPolicies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolAllocationParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */