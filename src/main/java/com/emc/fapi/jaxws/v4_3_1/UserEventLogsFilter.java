/*     */ package com.emc.fapi.jaxws.v4_3_1;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import javax.xml.bind.annotation.XmlAccessType;
/*     */ import javax.xml.bind.annotation.XmlAccessorType;
/*     */ import javax.xml.bind.annotation.XmlElement;
/*     */ import javax.xml.bind.annotation.XmlType;
/*     */ import org.codehaus.jackson.annotate.JsonTypeName;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @JsonTypeName("UserEventLogsFilter")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="UserEventLogsFilter", propOrder={"timeFrame", "topics", "textFilter"})
/*     */ public class UserEventLogsFilter
/*     */   extends EventLogsFilter
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected TimeFrame timeFrame;
/*     */   @XmlElement(required=true)
/*     */   protected List<EventLogTopic> topics;
/*     */   @XmlElement(nillable=true)
/*     */   protected TextFilter textFilter;
/*     */   
/*     */   public UserEventLogsFilter() {}
/*     */   
/*     */   public UserEventLogsFilter(TimeFrame timeFrame, List<EventLogTopic> topics, TextFilter textFilter)
/*     */   {
/*  66 */     this.timeFrame = timeFrame;
/*  67 */     this.topics = topics;
/*  68 */     this.textFilter = textFilter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TimeFrame getTimeFrame()
/*     */   {
/*  80 */     return this.timeFrame;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTimeFrame(TimeFrame value)
/*     */   {
/*  92 */     this.timeFrame = value;
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
/*     */   public List<EventLogTopic> getTopics()
/*     */   {
/* 118 */     if (this.topics == null) {
/* 119 */       this.topics = new ArrayList();
/*     */     }
/* 121 */     return this.topics;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public TextFilter getTextFilter()
/*     */   {
/* 133 */     return this.textFilter;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setTextFilter(TextFilter value)
/*     */   {
/* 145 */     this.textFilter = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 155 */     if (!(obj instanceof UserEventLogsFilter)) {
/* 156 */       return false;
/*     */     }
/* 158 */     UserEventLogsFilter otherObj = (UserEventLogsFilter)obj;
/*     */     
/* 160 */     return (super.equals(obj)) && (this.timeFrame != null ? this.timeFrame.equals(otherObj.timeFrame) : this.timeFrame == otherObj.timeFrame) && (this.topics != null ? this.topics.equals(otherObj.topics) : this.topics == otherObj.topics) && (this.textFilter != null ? this.textFilter.equals(otherObj.textFilter) : this.textFilter == otherObj.textFilter);
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
/* 172 */     return super.hashCode() ^ (this.timeFrame != null ? this.timeFrame.hashCode() : 0) ^ (this.topics != null ? this.topics.hashCode() : 0) ^ (this.textFilter != null ? this.textFilter.hashCode() : 0);
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
/* 184 */     return "UserEventLogsFilter [super=" + super.toString() + ", " + "timeFrame=" + this.timeFrame + ", " + "topics=" + this.topics + ", " + "textFilter=" + this.textFilter + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\UserEventLogsFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */