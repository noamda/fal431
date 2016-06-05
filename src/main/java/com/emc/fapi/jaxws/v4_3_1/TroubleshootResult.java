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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="TroubleshootResult", propOrder={"title", "message", "issueType", "entity", "severity", "fixable", "fixAcknowledgeMessage"})
/*     */ public class TroubleshootResult
/*     */ {
/*     */   protected String title;
/*     */   protected String message;
/*     */   @XmlElement(nillable=true)
/*     */   protected IssueType issueType;
/*     */   protected EntityInfo entity;
/*     */   protected TroubleshootResultSeverity severity;
/*     */   protected boolean fixable;
/*     */   protected String fixAcknowledgeMessage;
/*     */   
/*     */   public TroubleshootResult() {}
/*     */   
/*     */   public TroubleshootResult(String title, String message, IssueType issueType, EntityInfo entity, TroubleshootResultSeverity severity, boolean fixable, String fixAcknowledgeMessage)
/*     */   {
/*  64 */     this.title = title;
/*  65 */     this.message = message;
/*  66 */     this.issueType = issueType;
/*  67 */     this.entity = entity;
/*  68 */     this.severity = severity;
/*  69 */     this.fixable = fixable;
/*  70 */     this.fixAcknowledgeMessage = fixAcknowledgeMessage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getTitle()
/*     */   {
/*  82 */     return this.title;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTitle(String value)
/*     */   {
/*  94 */     this.title = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMessage()
/*     */   {
/* 106 */     return this.message;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMessage(String value)
/*     */   {
/* 118 */     this.message = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public IssueType getIssueType()
/*     */   {
/* 130 */     return this.issueType;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setIssueType(IssueType value)
/*     */   {
/* 142 */     this.issueType = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EntityInfo getEntity()
/*     */   {
/* 154 */     return this.entity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEntity(EntityInfo value)
/*     */   {
/* 166 */     this.entity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TroubleshootResultSeverity getSeverity()
/*     */   {
/* 178 */     return this.severity;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSeverity(TroubleshootResultSeverity value)
/*     */   {
/* 190 */     this.severity = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean isFixable()
/*     */   {
/* 198 */     return this.fixable;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFixable(boolean value)
/*     */   {
/* 206 */     this.fixable = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getFixAcknowledgeMessage()
/*     */   {
/* 218 */     return this.fixAcknowledgeMessage;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFixAcknowledgeMessage(String value)
/*     */   {
/* 230 */     this.fixAcknowledgeMessage = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 240 */     if (!(obj instanceof TroubleshootResult)) {
/* 241 */       return false;
/*     */     }
/* 243 */     TroubleshootResult otherObj = (TroubleshootResult)obj;
/*     */     
/* 245 */     return (this.title != null ? this.title.equals(otherObj.title) : this.title == otherObj.title) && (this.message != null ? this.message.equals(otherObj.message) : this.message == otherObj.message) && (this.issueType != null ? this.issueType.equals(otherObj.issueType) : this.issueType == otherObj.issueType) && (this.entity != null ? this.entity.equals(otherObj.entity) : this.entity == otherObj.entity) && (this.severity != null ? this.severity.equals(otherObj.severity) : this.severity == otherObj.severity) && (this.fixable == otherObj.fixable) && (this.fixAcknowledgeMessage != null ? this.fixAcknowledgeMessage.equals(otherObj.fixAcknowledgeMessage) : this.fixAcknowledgeMessage == otherObj.fixAcknowledgeMessage);
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
/*     */   public int hashCode()
/*     */   {
/* 260 */     return (this.title != null ? this.title.hashCode() : 0) ^ (this.message != null ? this.message.hashCode() : 0) ^ (this.issueType != null ? this.issueType.hashCode() : 0) ^ (this.entity != null ? this.entity.hashCode() : 0) ^ (this.severity != null ? this.severity.hashCode() : 0) ^ (this.fixable ? 1 : 0) ^ (this.fixAcknowledgeMessage != null ? this.fixAcknowledgeMessage.hashCode() : 0);
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
/*     */   public String toString()
/*     */   {
/* 275 */     return "TroubleshootResult [title=" + this.title + ", " + "message=" + this.message + ", " + "issueType=" + this.issueType + ", " + "entity=" + this.entity + ", " + "severity=" + this.severity + ", " + "fixable=" + this.fixable + ", " + "fixAcknowledgeMessage=" + this.fixAcknowledgeMessage + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\TroubleshootResult.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */