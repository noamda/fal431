/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="ArrayResourcePoolTieringPolicies", propOrder={"tieringPolicies"})
/*     */ public class ArrayResourcePoolTieringPolicies
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayResourcePoolTieringPolicy> tieringPolicies;
/*     */   
/*     */   public ArrayResourcePoolTieringPolicies() {}
/*     */   
/*     */   public ArrayResourcePoolTieringPolicies(List<ArrayResourcePoolTieringPolicy> tieringPolicies)
/*     */   {
/*  48 */     this.tieringPolicies = tieringPolicies;
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
/*     */   public List<ArrayResourcePoolTieringPolicy> getTieringPolicies()
/*     */   {
/*  74 */     if (this.tieringPolicies == null) {
/*  75 */       this.tieringPolicies = new ArrayList();
/*     */     }
/*  77 */     return this.tieringPolicies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof ArrayResourcePoolTieringPolicies)) {
/*  88 */       return false;
/*     */     }
/*  90 */     ArrayResourcePoolTieringPolicies otherObj = (ArrayResourcePoolTieringPolicies)obj;
/*     */     
/*  92 */     return this.tieringPolicies == otherObj.tieringPolicies ? true : this.tieringPolicies != null ? this.tieringPolicies.equals(otherObj.tieringPolicies) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.tieringPolicies != null ? this.tieringPolicies.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "ArrayResourcePoolTieringPolicies [tieringPolicies=" + this.tieringPolicies + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolTieringPolicies.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */