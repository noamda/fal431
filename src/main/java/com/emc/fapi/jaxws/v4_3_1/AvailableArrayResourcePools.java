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
/*     */ @XmlType(name="AvailableArrayResourcePools", propOrder={"arrayResourcePools"})
/*     */ public class AvailableArrayResourcePools
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ArrayResourcePoolInfo> arrayResourcePools;
/*     */   
/*     */   public AvailableArrayResourcePools() {}
/*     */   
/*     */   public AvailableArrayResourcePools(List<ArrayResourcePoolInfo> arrayResourcePools)
/*     */   {
/*  48 */     this.arrayResourcePools = arrayResourcePools;
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
/*     */   public List<ArrayResourcePoolInfo> getArrayResourcePools()
/*     */   {
/*  74 */     if (this.arrayResourcePools == null) {
/*  75 */       this.arrayResourcePools = new ArrayList();
/*     */     }
/*  77 */     return this.arrayResourcePools;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof AvailableArrayResourcePools)) {
/*  88 */       return false;
/*     */     }
/*  90 */     AvailableArrayResourcePools otherObj = (AvailableArrayResourcePools)obj;
/*     */     
/*  92 */     return this.arrayResourcePools == otherObj.arrayResourcePools ? true : this.arrayResourcePools != null ? this.arrayResourcePools.equals(otherObj.arrayResourcePools) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.arrayResourcePools != null ? this.arrayResourcePools.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "AvailableArrayResourcePools [arrayResourcePools=" + this.arrayResourcePools + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\AvailableArrayResourcePools.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */