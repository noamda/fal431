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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="setConsistencyGroupCopyPolicy", propOrder={"groupCopy", "newPolicy"})
/*     */ public class SetConsistencyGroupCopyPolicy
/*     */ {
/*     */   protected ConsistencyGroupCopyUID groupCopy;
/*     */   protected ConsistencyGroupCopyPolicy newPolicy;
/*     */   
/*     */   public SetConsistencyGroupCopyPolicy() {}
/*     */   
/*     */   public SetConsistencyGroupCopyPolicy(ConsistencyGroupCopyUID groupCopy, ConsistencyGroupCopyPolicy newPolicy)
/*     */   {
/*  47 */     this.groupCopy = groupCopy;
/*  48 */     this.newPolicy = newPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getGroupCopy()
/*     */   {
/*  60 */     return this.groupCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupCopy(ConsistencyGroupCopyUID value)
/*     */   {
/*  72 */     this.groupCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyPolicy getNewPolicy()
/*     */   {
/*  84 */     return this.newPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setNewPolicy(ConsistencyGroupCopyPolicy value)
/*     */   {
/*  96 */     this.newPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof SetConsistencyGroupCopyPolicy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SetConsistencyGroupCopyPolicy otherObj = (SetConsistencyGroupCopyPolicy)obj;
/*     */     
/* 111 */     return (this.groupCopy != null ? this.groupCopy.equals(otherObj.groupCopy) : this.groupCopy == otherObj.groupCopy) && (this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : this.newPolicy == otherObj.newPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupCopy != null ? this.groupCopy.hashCode() : 0) ^ (this.newPolicy != null ? this.newPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SetConsistencyGroupCopyPolicy [groupCopy=" + this.groupCopy + ", " + "newPolicy=" + this.newPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupCopyPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */