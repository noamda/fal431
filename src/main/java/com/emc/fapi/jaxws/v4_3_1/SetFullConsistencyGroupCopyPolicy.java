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
/*     */ @XmlType(name="setFullConsistencyGroupCopyPolicy", propOrder={"newCopyPolicy"})
/*     */ public class SetFullConsistencyGroupCopyPolicy
/*     */ {
/*     */   protected FullConsistencyGroupCopyPolicy newCopyPolicy;
/*     */   
/*     */   public SetFullConsistencyGroupCopyPolicy() {}
/*     */   
/*     */   public SetFullConsistencyGroupCopyPolicy(FullConsistencyGroupCopyPolicy newCopyPolicy)
/*     */   {
/*  44 */     this.newCopyPolicy = newCopyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public FullConsistencyGroupCopyPolicy getNewCopyPolicy()
/*     */   {
/*  56 */     return this.newCopyPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewCopyPolicy(FullConsistencyGroupCopyPolicy value)
/*     */   {
/*  68 */     this.newCopyPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof SetFullConsistencyGroupCopyPolicy)) {
/*  79 */       return false;
/*     */     }
/*  81 */     SetFullConsistencyGroupCopyPolicy otherObj = (SetFullConsistencyGroupCopyPolicy)obj;
/*     */     
/*  83 */     return this.newCopyPolicy == otherObj.newCopyPolicy ? true : this.newCopyPolicy != null ? this.newCopyPolicy.equals(otherObj.newCopyPolicy) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.newCopyPolicy != null ? this.newCopyPolicy.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "SetFullConsistencyGroupCopyPolicy [newCopyPolicy=" + this.newCopyPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetFullConsistencyGroupCopyPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */