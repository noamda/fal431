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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="PolicyTemplates", propOrder={"consistencyGroupCopyPolicyTemplate", "consistencyGroupLinkPolicyTemplate", "defaultGroupCopyPolicyName", "defaultLocalGroupLinkPolicyName", "defaultRemoteGroupLinkPolicyName"})
/*     */ public class PolicyTemplates
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupCopyPolicyTemplate> consistencyGroupCopyPolicyTemplate;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupLinkPolicyTemplate> consistencyGroupLinkPolicyTemplate;
/*     */   protected String defaultGroupCopyPolicyName;
/*     */   protected String defaultLocalGroupLinkPolicyName;
/*     */   protected String defaultRemoteGroupLinkPolicyName;
/*     */   
/*     */   public PolicyTemplates() {}
/*     */   
/*     */   public PolicyTemplates(List<ConsistencyGroupCopyPolicyTemplate> consistencyGroupCopyPolicyTemplate, List<ConsistencyGroupLinkPolicyTemplate> consistencyGroupLinkPolicyTemplate, String defaultGroupCopyPolicyName, String defaultLocalGroupLinkPolicyName, String defaultRemoteGroupLinkPolicyName)
/*     */   {
/*  61 */     this.consistencyGroupCopyPolicyTemplate = consistencyGroupCopyPolicyTemplate;
/*  62 */     this.consistencyGroupLinkPolicyTemplate = consistencyGroupLinkPolicyTemplate;
/*  63 */     this.defaultGroupCopyPolicyName = defaultGroupCopyPolicyName;
/*  64 */     this.defaultLocalGroupLinkPolicyName = defaultLocalGroupLinkPolicyName;
/*  65 */     this.defaultRemoteGroupLinkPolicyName = defaultRemoteGroupLinkPolicyName;
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
/*     */   public List<ConsistencyGroupCopyPolicyTemplate> getConsistencyGroupCopyPolicyTemplate()
/*     */   {
/*  91 */     if (this.consistencyGroupCopyPolicyTemplate == null) {
/*  92 */       this.consistencyGroupCopyPolicyTemplate = new ArrayList();
/*     */     }
/*  94 */     return this.consistencyGroupCopyPolicyTemplate;
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
/*     */   public List<ConsistencyGroupLinkPolicyTemplate> getConsistencyGroupLinkPolicyTemplate()
/*     */   {
/* 120 */     if (this.consistencyGroupLinkPolicyTemplate == null) {
/* 121 */       this.consistencyGroupLinkPolicyTemplate = new ArrayList();
/*     */     }
/* 123 */     return this.consistencyGroupLinkPolicyTemplate;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDefaultGroupCopyPolicyName()
/*     */   {
/* 135 */     return this.defaultGroupCopyPolicyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultGroupCopyPolicyName(String value)
/*     */   {
/* 147 */     this.defaultGroupCopyPolicyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDefaultLocalGroupLinkPolicyName()
/*     */   {
/* 159 */     return this.defaultLocalGroupLinkPolicyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultLocalGroupLinkPolicyName(String value)
/*     */   {
/* 171 */     this.defaultLocalGroupLinkPolicyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getDefaultRemoteGroupLinkPolicyName()
/*     */   {
/* 183 */     return this.defaultRemoteGroupLinkPolicyName;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setDefaultRemoteGroupLinkPolicyName(String value)
/*     */   {
/* 195 */     this.defaultRemoteGroupLinkPolicyName = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 205 */     if (!(obj instanceof PolicyTemplates)) {
/* 206 */       return false;
/*     */     }
/* 208 */     PolicyTemplates otherObj = (PolicyTemplates)obj;
/*     */     
/* 210 */     return (this.consistencyGroupCopyPolicyTemplate != null ? this.consistencyGroupCopyPolicyTemplate.equals(otherObj.consistencyGroupCopyPolicyTemplate) : this.consistencyGroupCopyPolicyTemplate == otherObj.consistencyGroupCopyPolicyTemplate) && (this.consistencyGroupLinkPolicyTemplate != null ? this.consistencyGroupLinkPolicyTemplate.equals(otherObj.consistencyGroupLinkPolicyTemplate) : this.consistencyGroupLinkPolicyTemplate == otherObj.consistencyGroupLinkPolicyTemplate) && (this.defaultGroupCopyPolicyName != null ? this.defaultGroupCopyPolicyName.equals(otherObj.defaultGroupCopyPolicyName) : this.defaultGroupCopyPolicyName == otherObj.defaultGroupCopyPolicyName) && (this.defaultLocalGroupLinkPolicyName != null ? this.defaultLocalGroupLinkPolicyName.equals(otherObj.defaultLocalGroupLinkPolicyName) : this.defaultLocalGroupLinkPolicyName == otherObj.defaultLocalGroupLinkPolicyName) && (this.defaultRemoteGroupLinkPolicyName != null ? this.defaultRemoteGroupLinkPolicyName.equals(otherObj.defaultRemoteGroupLinkPolicyName) : this.defaultRemoteGroupLinkPolicyName == otherObj.defaultRemoteGroupLinkPolicyName);
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
/*     */   public int hashCode()
/*     */   {
/* 223 */     return (this.consistencyGroupCopyPolicyTemplate != null ? this.consistencyGroupCopyPolicyTemplate.hashCode() : 0) ^ (this.consistencyGroupLinkPolicyTemplate != null ? this.consistencyGroupLinkPolicyTemplate.hashCode() : 0) ^ (this.defaultGroupCopyPolicyName != null ? this.defaultGroupCopyPolicyName.hashCode() : 0) ^ (this.defaultLocalGroupLinkPolicyName != null ? this.defaultLocalGroupLinkPolicyName.hashCode() : 0) ^ (this.defaultRemoteGroupLinkPolicyName != null ? this.defaultRemoteGroupLinkPolicyName.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 236 */     return "PolicyTemplates [consistencyGroupCopyPolicyTemplate=" + this.consistencyGroupCopyPolicyTemplate + ", " + "consistencyGroupLinkPolicyTemplate=" + this.consistencyGroupLinkPolicyTemplate + ", " + "defaultGroupCopyPolicyName=" + this.defaultGroupCopyPolicyName + ", " + "defaultLocalGroupLinkPolicyName=" + this.defaultLocalGroupLinkPolicyName + ", " + "defaultRemoteGroupLinkPolicyName=" + this.defaultRemoteGroupLinkPolicyName + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\PolicyTemplates.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */