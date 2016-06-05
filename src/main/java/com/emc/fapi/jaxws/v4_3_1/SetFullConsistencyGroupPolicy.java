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
/*     */ @XmlType(name="setFullConsistencyGroupPolicy", propOrder={"newPolicy"})
/*     */ public class SetFullConsistencyGroupPolicy
/*     */ {
/*     */   protected FullConsistencyGroupPolicy newPolicy;
/*     */   
/*     */   public SetFullConsistencyGroupPolicy() {}
/*     */   
/*     */   public SetFullConsistencyGroupPolicy(FullConsistencyGroupPolicy newPolicy)
/*     */   {
/*  44 */     this.newPolicy = newPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FullConsistencyGroupPolicy getNewPolicy()
/*     */   {
/*  56 */     return this.newPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewPolicy(FullConsistencyGroupPolicy value)
/*     */   {
/*  68 */     this.newPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetFullConsistencyGroupPolicy)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetFullConsistencyGroupPolicy otherObj = (SetFullConsistencyGroupPolicy)obj;
/*     */     
/*  83 */     return this.newPolicy == otherObj.newPolicy ? true : this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.newPolicy != null ? this.newPolicy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetFullConsistencyGroupPolicy [newPolicy=" + this.newPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetFullConsistencyGroupPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */