/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
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
/*     */ @XmlType(name="VerifyConsistencyGroupStateParam", propOrder={"group", "againstSettings", "groupEnabled", "sourceCopy", "distributed", "links", "defaultLinkCondition", "linksConditions", "copies", "defaultCopyCondition", "copiesConditions", "settingsCondition", "username"})
/*     */ public class VerifyConsistencyGroupStateParam
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected ConsistencyGroupUID group;
/*     */   protected boolean againstSettings;
/*     */   protected Boolean groupEnabled;
/*     */   protected ConsistencyGroupCopyUID sourceCopy;
/*     */   protected Boolean distributed;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkUID> links;
/*     */   protected VerifyConsistencyGroupLinkStateParam defaultLinkCondition;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VerifyConsistencyGroupLinkStateParam> linksConditions;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyUID> copies;
/*     */   protected VerifyConsistencyGroupCopyStateParam defaultCopyCondition;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<VerifyConsistencyGroupCopyStateParam> copiesConditions;
/*     */   protected VerifyConsistencyGroupStateParam settingsCondition;
/*     */   @XmlElement(required=true)
/*     */   protected String username;
/*     */   
/*     */   public VerifyConsistencyGroupStateParam() {}
/*     */   
/*     */   public VerifyConsistencyGroupStateParam(ConsistencyGroupUID group, boolean againstSettings, Boolean groupEnabled, ConsistencyGroupCopyUID sourceCopy, Boolean distributed, List<ConsistencyGroupLinkUID> links, VerifyConsistencyGroupLinkStateParam defaultLinkCondition, List<VerifyConsistencyGroupLinkStateParam> linksConditions, List<ConsistencyGroupCopyUID> copies, VerifyConsistencyGroupCopyStateParam defaultCopyCondition, List<VerifyConsistencyGroupCopyStateParam> copiesConditions, VerifyConsistencyGroupStateParam settingsCondition, String username)
/*     */   {
/*  89 */     this.group = group;
/*  90 */     this.againstSettings = againstSettings;
/*  91 */     this.groupEnabled = groupEnabled;
/*  92 */     this.sourceCopy = sourceCopy;
/*  93 */     this.distributed = distributed;
/*  94 */     this.links = links;
/*  95 */     this.defaultLinkCondition = defaultLinkCondition;
/*  96 */     this.linksConditions = linksConditions;
/*  97 */     this.copies = copies;
/*  98 */     this.defaultCopyCondition = defaultCopyCondition;
/*  99 */     this.copiesConditions = copiesConditions;
/* 100 */     this.settingsCondition = settingsCondition;
/* 101 */     this.username = username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupUID getGroup()
/*     */   {
/* 113 */     return this.group;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroup(ConsistencyGroupUID value)
/*     */   {
/* 125 */     this.group = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isAgainstSettings()
/*     */   {
/* 133 */     return this.againstSettings;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setAgainstSettings(boolean value)
/*     */   {
/* 141 */     this.againstSettings = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isGroupEnabled()
/*     */   {
/* 153 */     return this.groupEnabled;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setGroupEnabled(Boolean value)
/*     */   {
/* 165 */     this.groupEnabled = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public ConsistencyGroupCopyUID getSourceCopy()
/*     */   {
/* 177 */     return this.sourceCopy;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSourceCopy(ConsistencyGroupCopyUID value)
/*     */   {
/* 189 */     this.sourceCopy = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public Boolean isDistributed()
/*     */   {
/* 201 */     return this.distributed;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDistributed(Boolean value)
/*     */   {
/* 213 */     this.distributed = value;
/*     */   }
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
/*     */   public List<ConsistencyGroupLinkUID> getLinks()
/*     */   {
/* 239 */     if (this.links == null) {
/* 240 */       this.links = new ArrayList();
/*     */     }
/* 242 */     return this.links;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifyConsistencyGroupLinkStateParam getDefaultLinkCondition()
/*     */   {
/* 254 */     return this.defaultLinkCondition;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultLinkCondition(VerifyConsistencyGroupLinkStateParam value)
/*     */   {
/* 266 */     this.defaultLinkCondition = value;
/*     */   }
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
/*     */   public List<VerifyConsistencyGroupLinkStateParam> getLinksConditions()
/*     */   {
/* 292 */     if (this.linksConditions == null) {
/* 293 */       this.linksConditions = new ArrayList();
/*     */     }
/* 295 */     return this.linksConditions;
/*     */   }
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
/*     */   public List<ConsistencyGroupCopyUID> getCopies()
/*     */   {
/* 321 */     if (this.copies == null) {
/* 322 */       this.copies = new ArrayList();
/*     */     }
/* 324 */     return this.copies;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifyConsistencyGroupCopyStateParam getDefaultCopyCondition()
/*     */   {
/* 336 */     return this.defaultCopyCondition;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultCopyCondition(VerifyConsistencyGroupCopyStateParam value)
/*     */   {
/* 348 */     this.defaultCopyCondition = value;
/*     */   }
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
/*     */   public List<VerifyConsistencyGroupCopyStateParam> getCopiesConditions()
/*     */   {
/* 374 */     if (this.copiesConditions == null) {
/* 375 */       this.copiesConditions = new ArrayList();
/*     */     }
/* 377 */     return this.copiesConditions;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public VerifyConsistencyGroupStateParam getSettingsCondition()
/*     */   {
/* 389 */     return this.settingsCondition;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSettingsCondition(VerifyConsistencyGroupStateParam value)
/*     */   {
/* 401 */     this.settingsCondition = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUsername()
/*     */   {
/* 413 */     return this.username;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUsername(String value)
/*     */   {
/* 425 */     this.username = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 435 */     if (!(obj instanceof VerifyConsistencyGroupStateParam)) {
/* 436 */       return false;
/*     */     }
/* 438 */     VerifyConsistencyGroupStateParam otherObj = (VerifyConsistencyGroupStateParam)obj;
/*     */     
/* 440 */     return (this.group != null ? this.group.equals(otherObj.group) : this.group == otherObj.group) && (this.againstSettings == otherObj.againstSettings) && (this.groupEnabled != null ? this.groupEnabled.equals(otherObj.groupEnabled) : this.groupEnabled == otherObj.groupEnabled) && (this.sourceCopy != null ? this.sourceCopy.equals(otherObj.sourceCopy) : this.sourceCopy == otherObj.sourceCopy) && (this.distributed != null ? this.distributed.equals(otherObj.distributed) : this.distributed == otherObj.distributed) && (this.links != null ? this.links.equals(otherObj.links) : this.links == otherObj.links) && (this.defaultLinkCondition != null ? this.defaultLinkCondition.equals(otherObj.defaultLinkCondition) : this.defaultLinkCondition == otherObj.defaultLinkCondition) && (this.linksConditions != null ? this.linksConditions.equals(otherObj.linksConditions) : this.linksConditions == otherObj.linksConditions) && (this.copies != null ? this.copies.equals(otherObj.copies) : this.copies == otherObj.copies) && (this.defaultCopyCondition != null ? this.defaultCopyCondition.equals(otherObj.defaultCopyCondition) : this.defaultCopyCondition == otherObj.defaultCopyCondition) && (this.copiesConditions != null ? this.copiesConditions.equals(otherObj.copiesConditions) : this.copiesConditions == otherObj.copiesConditions) && (this.settingsCondition != null ? this.settingsCondition.equals(otherObj.settingsCondition) : this.settingsCondition == otherObj.settingsCondition) && (this.username != null ? this.username.equals(otherObj.username) : this.username == otherObj.username);
/*     */   }
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
/*     */   public int hashCode()
/*     */   {
/* 461 */     return (this.group != null ? this.group.hashCode() : 0) ^ (this.againstSettings ? 1 : 0) ^ (this.groupEnabled != null ? this.groupEnabled.hashCode() : 0) ^ (this.sourceCopy != null ? this.sourceCopy.hashCode() : 0) ^ (this.distributed != null ? this.distributed.hashCode() : 0) ^ (this.links != null ? this.links.hashCode() : 0) ^ (this.defaultLinkCondition != null ? this.defaultLinkCondition.hashCode() : 0) ^ (this.linksConditions != null ? this.linksConditions.hashCode() : 0) ^ (this.copies != null ? this.copies.hashCode() : 0) ^ (this.defaultCopyCondition != null ? this.defaultCopyCondition.hashCode() : 0) ^ (this.copiesConditions != null ? this.copiesConditions.hashCode() : 0) ^ (this.settingsCondition != null ? this.settingsCondition.hashCode() : 0) ^ (this.username != null ? this.username.hashCode() : 0);
/*     */   }
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
/*     */   public String toString()
/*     */   {
/* 482 */     return "VerifyConsistencyGroupStateParam [group=" + this.group + ", " + "againstSettings=" + this.againstSettings + ", " + "groupEnabled=" + this.groupEnabled + ", " + "sourceCopy=" + this.sourceCopy + ", " + "distributed=" + this.distributed + ", " + "links=" + this.links + ", " + "defaultLinkCondition=" + this.defaultLinkCondition + ", " + "linksConditions=" + this.linksConditions + ", " + "copies=" + this.copies + ", " + "defaultCopyCondition=" + this.defaultCopyCondition + ", " + "copiesConditions=" + this.copiesConditions + ", " + "settingsCondition=" + this.settingsCondition + ", " + "username=" + this.username + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\VerifyConsistencyGroupStateParam.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */