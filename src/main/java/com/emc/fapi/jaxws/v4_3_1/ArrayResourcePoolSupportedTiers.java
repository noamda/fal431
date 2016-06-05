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
/*     */ @XmlType(name="ArrayResourcePoolSupportedTiers", propOrder={"resourcePoolTier"})
/*     */ public class ArrayResourcePoolSupportedTiers
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayResourcePoolSupportedTier> resourcePoolTier;
/*     */   
/*     */   public ArrayResourcePoolSupportedTiers() {}
/*     */   
/*     */   public ArrayResourcePoolSupportedTiers(List<ArrayResourcePoolSupportedTier> resourcePoolTier)
/*     */   {
/*  48 */     this.resourcePoolTier = resourcePoolTier;
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
/*     */   public List<ArrayResourcePoolSupportedTier> getResourcePoolTier()
/*     */   {
/*  74 */     if (this.resourcePoolTier == null) {
/*  75 */       this.resourcePoolTier = new ArrayList();
/*     */     }
/*  77 */     return this.resourcePoolTier;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof ArrayResourcePoolSupportedTiers)) {
/*  88 */       return false;
/*     */     }
/*  90 */     ArrayResourcePoolSupportedTiers otherObj = (ArrayResourcePoolSupportedTiers)obj;
/*     */     
/*  92 */     return this.resourcePoolTier == otherObj.resourcePoolTier ? true : this.resourcePoolTier != null ? this.resourcePoolTier.equals(otherObj.resourcePoolTier) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.resourcePoolTier != null ? this.resourcePoolTier.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "ArrayResourcePoolSupportedTiers [resourcePoolTier=" + this.resourcePoolTier + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ArrayResourcePoolSupportedTiers.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */