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
/*     */ @XmlType(name="validateAddConsistencyGroupLink", propOrder={"groupLink", "policy"})
/*     */ public class ValidateAddConsistencyGroupLink
/*     */ {
/*     */   protected ConsistencyGroupLinkUID groupLink;
/*     */   protected ConsistencyGroupLinkPolicy policy;
/*     */   
/*     */   public ValidateAddConsistencyGroupLink() {}
/*     */   
/*     */   public ValidateAddConsistencyGroupLink(ConsistencyGroupLinkUID groupLink, ConsistencyGroupLinkPolicy policy)
/*     */   {
/*  47 */     this.groupLink = groupLink;
/*  48 */     this.policy = policy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getGroupLink()
/*     */   {
/*  60 */     return this.groupLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupLink(ConsistencyGroupLinkUID value)
/*     */   {
/*  72 */     this.groupLink = value;
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
/*  84 */     return this.policy;
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
/*  96 */     this.policy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 106 */     if (!(obj instanceof ValidateAddConsistencyGroupLink)) {
/* 107 */       return false;
/*     */     }
/* 109 */     ValidateAddConsistencyGroupLink otherObj = (ValidateAddConsistencyGroupLink)obj;
/*     */     
/* 111 */     return (this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : this.groupLink == otherObj.groupLink) && (this.policy != null ? this.policy.equals(otherObj.policy) : this.policy == otherObj.policy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupLink != null ? this.groupLink.hashCode() : 0) ^ (this.policy != null ? this.policy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "ValidateAddConsistencyGroupLink [groupLink=" + this.groupLink + ", " + "policy=" + this.policy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ValidateAddConsistencyGroupLink.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */