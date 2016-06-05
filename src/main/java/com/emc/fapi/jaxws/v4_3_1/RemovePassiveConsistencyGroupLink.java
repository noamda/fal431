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
/*     */ @XmlType(name="removePassiveConsistencyGroupLink", propOrder={"groupLink"})
/*     */ public class RemovePassiveConsistencyGroupLink
/*     */ {
/*     */   protected ConsistencyGroupLinkUID groupLink;
/*     */   
/*     */   public RemovePassiveConsistencyGroupLink() {}
/*     */   
/*     */   public RemovePassiveConsistencyGroupLink(ConsistencyGroupLinkUID groupLink)
/*     */   {
/*  44 */     this.groupLink = groupLink;
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
/*  56 */     return this.groupLink;
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
/*  68 */     this.groupLink = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  78 */     if (!(obj instanceof RemovePassiveConsistencyGroupLink)) {
/*  79 */       return false;
/*     */     }
/*  81 */     RemovePassiveConsistencyGroupLink otherObj = (RemovePassiveConsistencyGroupLink)obj;
/*     */     
/*  83 */     return this.groupLink == otherObj.groupLink ? true : this.groupLink != null ? this.groupLink.equals(otherObj.groupLink) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/*  92 */     return this.groupLink != null ? this.groupLink.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 101 */     return "RemovePassiveConsistencyGroupLink [groupLink=" + this.groupLink + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\RemovePassiveConsistencyGroupLink.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */