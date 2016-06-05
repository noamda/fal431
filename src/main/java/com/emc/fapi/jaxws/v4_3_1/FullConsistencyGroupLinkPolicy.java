/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
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
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="FullConsistencyGroupLinkPolicy", propOrder={"linkUID", "linkPolicy"})
/*     */ public class FullConsistencyGroupLinkPolicy
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupLinkUID linkUID;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupLinkPolicy linkPolicy;
/*     */   
/*     */   public FullConsistencyGroupLinkPolicy() {}
/*     */   
/*     */   public FullConsistencyGroupLinkPolicy(ConsistencyGroupLinkUID linkUID, ConsistencyGroupLinkPolicy linkPolicy)
/*     */   {
/*  50 */     this.linkUID = linkUID;
/*  51 */     this.linkPolicy = linkPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getLinkUID()
/*     */   {
/*  63 */     return this.linkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLinkUID(ConsistencyGroupLinkUID value)
/*     */   {
/*  75 */     this.linkUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkPolicy getLinkPolicy()
/*     */   {
/*  87 */     return this.linkPolicy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLinkPolicy(ConsistencyGroupLinkPolicy value)
/*     */   {
/*  99 */     this.linkPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 109 */     if (!(obj instanceof FullConsistencyGroupLinkPolicy)) {
/* 110 */       return false;
/*     */     }
/* 112 */     FullConsistencyGroupLinkPolicy otherObj = (FullConsistencyGroupLinkPolicy)obj;
/*     */     
/* 114 */     return (this.linkUID != null ? this.linkUID.equals(otherObj.linkUID) : this.linkUID == otherObj.linkUID) && (this.linkPolicy != null ? this.linkPolicy.equals(otherObj.linkPolicy) : this.linkPolicy == otherObj.linkPolicy);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 124 */     return (this.linkUID != null ? this.linkUID.hashCode() : 0) ^ (this.linkPolicy != null ? this.linkPolicy.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 134 */     return "FullConsistencyGroupLinkPolicy [linkUID=" + this.linkUID + ", " + "linkPolicy=" + this.linkPolicy + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\FullConsistencyGroupLinkPolicy.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */