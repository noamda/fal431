/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="unregisterArrayResourcePools", propOrder={"resourcePools"})
/*     */ public class UnregisterArrayResourcePools
/*     */ {
/*     */   protected List<ResourcePoolUID> resourcePools;
/*     */   
/*     */   public UnregisterArrayResourcePools() {}
/*     */   
/*     */   public UnregisterArrayResourcePools(List<ResourcePoolUID> resourcePools)
/*     */   {
/*  46 */     this.resourcePools = resourcePools;
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
/*     */   public List<ResourcePoolUID> getResourcePools()
/*     */   {
/*  72 */     if (this.resourcePools == null) {
/*  73 */       this.resourcePools = new ArrayList();
/*     */     }
/*  75 */     return this.resourcePools;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  85 */     if (!(obj instanceof UnregisterArrayResourcePools)) {
/*  86 */       return false;
/*     */     }
/*  88 */     UnregisterArrayResourcePools otherObj = (UnregisterArrayResourcePools)obj;
/*     */     
/*  90 */     return this.resourcePools == otherObj.resourcePools ? true : this.resourcePools != null ? this.resourcePools.equals(otherObj.resourcePools) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  99 */     return this.resourcePools != null ? this.resourcePools.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 108 */     return "UnregisterArrayResourcePools [resourcePools=" + this.resourcePools + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UnregisterArrayResourcePools.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */