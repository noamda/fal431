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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="ConsistencyGroupLinkSettings", propOrder={"groupLinkUID", "linkPolicy", "transferEnabled", "localLink"})
/*     */ public class ConsistencyGroupLinkSettings
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupLinkUID groupLinkUID;
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupLinkPolicy linkPolicy;
/*     */   protected boolean transferEnabled;
/*     */   protected boolean localLink;
/*     */   
/*     */   public ConsistencyGroupLinkSettings() {}
/*     */   
/*     */   public ConsistencyGroupLinkSettings(ConsistencyGroupLinkUID groupLinkUID, ConsistencyGroupLinkPolicy linkPolicy, boolean transferEnabled, boolean localLink)
/*     */   {
/*  56 */     this.groupLinkUID = groupLinkUID;
/*  57 */     this.linkPolicy = linkPolicy;
/*  58 */     this.transferEnabled = transferEnabled;
/*  59 */     this.localLink = localLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupLinkUID getGroupLinkUID()
/*     */   {
/*  71 */     return this.groupLinkUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupLinkUID(ConsistencyGroupLinkUID value)
/*     */   {
/*  83 */     this.groupLinkUID = value;
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
/*  95 */     return this.linkPolicy;
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
/* 107 */     this.linkPolicy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isTransferEnabled()
/*     */   {
/* 115 */     return this.transferEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTransferEnabled(boolean value)
/*     */   {
/* 123 */     this.transferEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isLocalLink()
/*     */   {
/* 131 */     return this.localLink;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLocalLink(boolean value)
/*     */   {
/* 139 */     this.localLink = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 149 */     if (!(obj instanceof ConsistencyGroupLinkSettings)) {
/* 150 */       return false;
/*     */     }
/* 152 */     ConsistencyGroupLinkSettings otherObj = (ConsistencyGroupLinkSettings)obj;
/*     */     
/* 154 */     return (this.groupLinkUID != null ? this.groupLinkUID.equals(otherObj.groupLinkUID) : this.groupLinkUID == otherObj.groupLinkUID) && (this.linkPolicy != null ? this.linkPolicy.equals(otherObj.linkPolicy) : this.linkPolicy == otherObj.linkPolicy) && (this.transferEnabled == otherObj.transferEnabled) && (this.localLink == otherObj.localLink);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 166 */     return (this.groupLinkUID != null ? this.groupLinkUID.hashCode() : 0) ^ (this.linkPolicy != null ? this.linkPolicy.hashCode() : 0) ^ (this.transferEnabled ? 1 : 0) ^ (this.localLink ? 1 : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 178 */     return "ConsistencyGroupLinkSettings [groupLinkUID=" + this.groupLinkUID + ", " + "linkPolicy=" + this.linkPolicy + ", " + "transferEnabled=" + this.transferEnabled + ", " + "localLink=" + this.localLink + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\ConsistencyGroupLinkSettings.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */