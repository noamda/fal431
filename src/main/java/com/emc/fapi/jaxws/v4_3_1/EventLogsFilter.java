/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlSeeAlso;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonSubTypes;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.As;
/*     */ import org.codehaus.jackson.annotate.JsonTypeInfo.Id;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeInfo(use=JsonTypeInfo.Id.NAME, include=JsonTypeInfo.As.PROPERTY, property="JsonSubType")
/*     */ @JsonSubTypes({@org.codehaus.jackson.annotate.JsonSubTypes.Type(value=SystemEventLogsFilter.class, name="SystemEventLogsFilter"), @org.codehaus.jackson.annotate.JsonSubTypes.Type(value=UserEventLogsFilter.class, name="UserEventLogsFilter")})
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="EventLogsFilter", propOrder={"level", "scope", "eventsIDs"})
/*     */ @XmlSeeAlso({UserEventLogsFilter.class, SystemEventLogsFilter.class})
/*     */ public abstract class EventLogsFilter
/*     */ {
/*     */   @XmlElement(required=true)
/*     */   protected EventLogLevel level;
/*     */   @XmlElement(required=true)
/*     */   protected EventLogScope scope;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<Integer> eventsIDs;
/*     */   
/*     */   public EventLogsFilter() {}
/*     */   
/*     */   public EventLogsFilter(EventLogLevel level, EventLogScope scope, List<Integer> eventsIDs)
/*     */   {
/*  73 */     this.level = level;
/*  74 */     this.scope = scope;
/*  75 */     this.eventsIDs = eventsIDs;
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
/*  87 */     return this.level;
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
/*  99 */     this.level = value;
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
/* 111 */     return this.scope;
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
/* 123 */     this.scope = value;
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
/*     */   public List<Integer> getEventsIDs()
/*     */   {
/* 149 */     if (this.eventsIDs == null) {
/* 150 */       this.eventsIDs = new ArrayList();
/*     */     }
/* 152 */     return this.eventsIDs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 162 */     if (!(obj instanceof EventLogsFilter)) {
/* 163 */       return false;
/*     */     }
/* 165 */     EventLogsFilter otherObj = (EventLogsFilter)obj;
/*     */     
/* 167 */     return (this.level != null ? this.level.equals(otherObj.level) : this.level == otherObj.level) && (this.scope != null ? this.scope.equals(otherObj.scope) : this.scope == otherObj.scope) && (this.eventsIDs != null ? this.eventsIDs.equals(otherObj.eventsIDs) : this.eventsIDs == otherObj.eventsIDs);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 178 */     return (this.level != null ? this.level.hashCode() : 0) ^ (this.scope != null ? this.scope.hashCode() : 0) ^ (this.eventsIDs != null ? this.eventsIDs.hashCode() : 0);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 189 */     return "EventLogsFilter [level=" + this.level + ", " + "scope=" + this.scope + ", " + "eventsIDs=" + this.eventsIDs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\EventLogsFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */