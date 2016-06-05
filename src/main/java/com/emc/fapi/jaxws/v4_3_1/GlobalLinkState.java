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
/*     */ @XmlType(name="GlobalLinkState", propOrder={"deduplicationSupported", "globalLink"})
/*     */ public class GlobalLinkState
/*     */ {
/*     */   protected boolean deduplicationSupported;
/*     */   protected GlobalLinkUID globalLink;
/*     */   
/*     */   public GlobalLinkState() {}
/*     */   
/*     */   public GlobalLinkState(boolean deduplicationSupported, GlobalLinkUID globalLink)
/*     */   {
/*  47 */     this.deduplicationSupported = deduplicationSupported;
/*  48 */     this.globalLink = globalLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isDeduplicationSupported()
/*     */   {
/*  56 */     return this.deduplicationSupported;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDeduplicationSupported(boolean value)
/*     */   {
/*  64 */     this.deduplicationSupported = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public GlobalLinkUID getGlobalLink()
/*     */   {
/*  76 */     return this.globalLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGlobalLink(GlobalLinkUID value)
/*     */   {
/*  88 */     this.globalLink = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof GlobalLinkState)) {
/*  99 */       return false;
/*     */     }
/* 101 */     GlobalLinkState otherObj = (GlobalLinkState)obj;
/*     */     
/* 103 */     return (this.deduplicationSupported == otherObj.deduplicationSupported) && (this.globalLink != null ? this.globalLink.equals(otherObj.globalLink) : this.globalLink == otherObj.globalLink);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.deduplicationSupported ? 1 : 0) ^ (this.globalLink != null ? this.globalLink.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "GlobalLinkState [deduplicationSupported=" + this.deduplicationSupported + ", " + "globalLink=" + this.globalLink + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GlobalLinkState.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */