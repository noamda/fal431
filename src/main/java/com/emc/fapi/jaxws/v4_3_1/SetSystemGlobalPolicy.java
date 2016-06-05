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
/*     */ @XmlType(name="setSystemGlobalPolicy", propOrder={"policy"})
/*     */ public class SetSystemGlobalPolicy
/*     */ {
/*     */   protected SystemGlobalPolicy policy;
/*     */   
/*     */   public SetSystemGlobalPolicy() {}
/*     */   
/*     */   public SetSystemGlobalPolicy(SystemGlobalPolicy policy)
/*     */   {
/*  44 */     this.policy = policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemGlobalPolicy getPolicy()
/*     */   {
/*  56 */     return this.policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicy(SystemGlobalPolicy value)
/*     */   {
/*  68 */     this.policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetSystemGlobalPolicy)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetSystemGlobalPolicy otherObj = (SetSystemGlobalPolicy)obj;
/*     */     
/*  83 */     return this.policy == otherObj.policy ? true : this.policy != null ? this.policy.equals(otherObj.policy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.policy != null ? this.policy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetSystemGlobalPolicy [policy=" + this.policy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetSystemGlobalPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */