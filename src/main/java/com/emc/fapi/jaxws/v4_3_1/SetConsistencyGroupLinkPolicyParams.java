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
/*     */ @XmlType(name="setConsistencyGroupLinkPolicyParams", propOrder={"firstCopy", "policy", "secondCopy"})
/*     */ public class SetConsistencyGroupLinkPolicyParams
/*     */ {
/*     */   protected GlobalCopyUID firstCopy;
/*     */   protected ConsistencyGroupLinkPolicy policy;
/*     */   protected GlobalCopyUID secondCopy;
/*     */   
/*     */   public SetConsistencyGroupLinkPolicyParams() {}
/*     */   
/*     */   public SetConsistencyGroupLinkPolicyParams(GlobalCopyUID firstCopy, ConsistencyGroupLinkPolicy policy, GlobalCopyUID secondCopy)
/*     */   {
/*  57 */     this.firstCopy = firstCopy;
/*  58 */     this.policy = policy;
/*  59 */     this.secondCopy = secondCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getFirstCopy()
/*     */   {
/*  71 */     return this.firstCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFirstCopy(GlobalCopyUID value)
/*     */   {
/*  83 */     this.firstCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkPolicy getPolicy()
/*     */   {
/*  95 */     return this.policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setPolicy(ConsistencyGroupLinkPolicy value)
/*     */   {
/* 107 */     this.policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalCopyUID getSecondCopy()
/*     */   {
/* 119 */     return this.secondCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSecondCopy(GlobalCopyUID value)
/*     */   {
/* 131 */     this.secondCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 141 */     if (!(obj instanceof SetConsistencyGroupLinkPolicyParams)) {
/* 142 */       return false;
/*     */     }
/* 144 */     SetConsistencyGroupLinkPolicyParams otherObj = (SetConsistencyGroupLinkPolicyParams)obj;
/*     */     
/* 146 */     return (this.firstCopy != null ? this.firstCopy.equals(otherObj.firstCopy) : this.firstCopy == otherObj.firstCopy) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy) && (this.secondCopy != null ? this.secondCopy.equals(otherObj.secondCopy) : this.secondCopy == otherObj.secondCopy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 157 */     return (this.firstCopy != null ? this.firstCopy.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0) ^ (this.secondCopy != null ? this.secondCopy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 168 */     return "SetConsistencyGroupLinkPolicyParams [firstCopy=" + this.firstCopy + ", " + "policy=" + this.policy + ", " + "secondCopy=" + this.secondCopy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupLinkPolicyParams.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */