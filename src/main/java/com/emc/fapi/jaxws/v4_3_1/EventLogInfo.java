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
/*     */ 
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="EventLogInfo", propOrder={"level", "moreDetails", "scope", "seSummary", "summary", "topic", "userAction"})
/*     */ public class EventLogInfo
/*     */ {
/*     */   protected EventLogLevel level;
/*     */   protected String moreDetails;
/*     */   protected EventLogScope scope;
/*     */   protected String seSummary;
/*     */   protected String summary;
/*     */   protected EventLogTopic topic;
/*     */   protected String userAction;
/*     */   
/*     */   public EventLogInfo() {}
/*     */   
/*     */   public EventLogInfo(EventLogLevel level, String moreDetails, EventLogScope scope, String seSummary, String summary, EventLogTopic topic, String userAction)
/*     */   {
/*  62 */     this.level = level;
/*  63 */     this.moreDetails = moreDetails;
/*  64 */     this.scope = scope;
/*  65 */     this.seSummary = seSummary;
/*  66 */     this.summary = summary;
/*  67 */     this.topic = topic;
/*  68 */     this.userAction = userAction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EventLogLevel getLevel()
/*     */   {
/*  80 */     return this.level;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setLevel(EventLogLevel value)
/*     */   {
/*  92 */     this.level = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getMoreDetails()
/*     */   {
/* 104 */     return this.moreDetails;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMoreDetails(String value)
/*     */   {
/* 116 */     this.moreDetails = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EventLogScope getScope()
/*     */   {
/* 128 */     return this.scope;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setScope(EventLogScope value)
/*     */   {
/* 140 */     this.scope = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSeSummary()
/*     */   {
/* 152 */     return this.seSummary;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSeSummary(String value)
/*     */   {
/* 164 */     this.seSummary = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getSummary()
/*     */   {
/* 176 */     return this.summary;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setSummary(String value)
/*     */   {
/* 188 */     this.summary = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public EventLogTopic getTopic()
/*     */   {
/* 200 */     return this.topic;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTopic(EventLogTopic value)
/*     */   {
/* 212 */     this.topic = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getUserAction()
/*     */   {
/* 224 */     return this.userAction;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setUserAction(String value)
/*     */   {
/* 236 */     this.userAction = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 246 */     if (!(obj instanceof EventLogInfo)) {
/* 247 */       return false;
/*     */     }
/* 249 */     EventLogInfo otherObj = (EventLogInfo)obj;
/*     */     
/* 251 */     return (this.level != null ? this.level.equals(otherObj.level) : this.level == otherObj.level) && (this.moreDetails != null ? this.moreDetails.equals(otherObj.moreDetails) : this.moreDetails == otherObj.moreDetails) && (this.scope != null ? this.scope.equals(otherObj.scope) : this.scope == otherObj.scope) && (this.seSummary != null ? this.seSummary.equals(otherObj.seSummary) : this.seSummary == otherObj.seSummary) && (this.summary != null ? this.summary.equals(otherObj.summary) : this.summary == otherObj.summary) && (this.topic != null ? this.topic.equals(otherObj.topic) : this.topic == otherObj.topic) && (this.userAction != null ? this.userAction.equals(otherObj.userAction) : this.userAction == otherObj.userAction);
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
/* 266 */     return (this.level != null ? this.level.hashCode() : 0) ^ (this.moreDetails != null ? this.moreDetails.hashCode() : 0) ^ (this.scope != null ? this.scope.hashCode() : 0) ^ (this.seSummary != null ? this.seSummary.hashCode() : 0) ^ (this.summary != null ? this.summary.hashCode() : 0) ^ (this.topic != null ? this.topic.hashCode() : 0) ^ (this.userAction != null ? this.userAction.hashCode() : 0);
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
/* 281 */     return "EventLogInfo [level=" + this.level + ", " + "moreDetails=" + this.moreDetails + ", " + "scope=" + this.scope + ", " + "seSummary=" + this.seSummary + ", " + "summary=" + this.summary + ", " + "topic=" + this.topic + ", " + "userAction=" + this.userAction + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EventLogInfo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */