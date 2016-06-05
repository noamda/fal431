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
/*     */ @XmlType(name="setConsistencyGroupLinkPolicy", propOrder={"groupLink", "newPolicy"})
/*     */ public class SetConsistencyGroupLinkPolicy
/*     */ {
/*     */   protected ConsistencyGroupLinkUID groupLink;
/*     */   protected ConsistencyGroupLinkPolicy newPolicy;
/*     */   
/*     */   public SetConsistencyGroupLinkPolicy() {}
/*     */   
/*     */   public SetConsistencyGroupLinkPolicy(ConsistencyGroupLinkUID groupLink, ConsistencyGroupLinkPolicy newPolicy)
/*     */   {
/*  47 */     this.groupLink = groupLink;
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
/*     */   public ConsistencyGroupLinkPolicy getNewPolicy()
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
/*     */   public void setNewPolicy(ConsistencyGroupLinkPolicy value)
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
/* 106 */     if (!(obj instanceof SetConsistencyGroupLinkPolicy)) {
/* 107 */       return false;
/*     */     }
/* 109 */     SetConsistencyGroupLinkPolicy otherObj = (SetConsistencyGroupLinkPolicy)obj;
/*     */     
/* 111 */     return (this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : this.groupLink == otherObj.groupLink) && (this.newPolicy != null ? this.newPolicy.equals(otherObj.newPolicy) : this.newPolicy == otherObj.newPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 121 */     return (this.groupLink != null ? this.groupLink.hashCode() : 0) ^ (this.newPolicy != null ? this.newPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 131 */     return "SetConsistencyGroupLinkPolicy [groupLink=" + this.groupLink + ", " + "newPolicy=" + this.newPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SetConsistencyGroupLinkPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */