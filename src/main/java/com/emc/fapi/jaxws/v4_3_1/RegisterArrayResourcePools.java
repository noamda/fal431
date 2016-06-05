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
/*     */ @XmlType(name="registerArrayResourcePools", propOrder={"resourcePools"})
/*     */ public class RegisterArrayResourcePools
/*     */ {
/*     */   protected List<RegisterArrayResourcePoolParams> resourcePools;
/*     */   
/*     */   public RegisterArrayResourcePools() {}
/*     */   
/*     */   public RegisterArrayResourcePools(List<RegisterArrayResourcePoolParams> resourcePools)
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
/*     */   public List<RegisterArrayResourcePoolParams> getResourcePools()
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
/*  85 */     if (!(obj instanceof RegisterArrayResourcePools)) {
/*  86 */       return false;
/*     */     }
/*  88 */     RegisterArrayResourcePools otherObj = (RegisterArrayResourcePools)obj;
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
/* 108 */     return "RegisterArrayResourcePools [resourcePools=" + this.resourcePools + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RegisterArrayResourcePools.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */