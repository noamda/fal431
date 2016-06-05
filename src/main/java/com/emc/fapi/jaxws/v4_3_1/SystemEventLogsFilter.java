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
/*     */ 
/*     */ 
/*     */ @JsonTypeName("SystemEventLogsFilter")
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SystemEventLogsFilter", propOrder={"filterUID", "name", "topic", "groupsToInclude"})
/*     */ public class SystemEventLogsFilter
/*     */   extends EventLogsFilter
/*     */ {
/*     */   protected SystemEventLogsFilterUID filterUID;
/*     */   @XmlElement(required=true)
/*     */   protected String name;
/*     */   @XmlElement(required=true)
/*     */   protected EventLogTopic topic;
/*     */   @XmlElement(nillable=true)
/*     */   protected List<ConsistencyGroupUID> groupsToInclude;
/*     */   
/*     */   public SystemEventLogsFilter() {}
/*     */   
/*     */   public SystemEventLogsFilter(SystemEventLogsFilterUID filterUID, String name, EventLogTopic topic, List<ConsistencyGroupUID> groupsToInclude)
/*     */   {
/*  69 */     this.filterUID = filterUID;
/*  70 */     this.name = name;
/*  71 */     this.topic = topic;
/*  72 */     this.groupsToInclude = groupsToInclude;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemEventLogsFilterUID getFilterUID()
/*     */   {
/*  84 */     return this.filterUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setFilterUID(SystemEventLogsFilterUID value)
/*     */   {
/*  96 */     this.filterUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String getName()
/*     */   {
/* 108 */     return this.name;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setName(String value)
/*     */   {
/* 120 */     this.name = value;
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
/* 132 */     return this.topic;
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
/* 144 */     this.topic = value;
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
/*     */   public List<ConsistencyGroupUID> getGroupsToInclude()
/*     */   {
/* 170 */     if (this.groupsToInclude == null) {
/* 171 */       this.groupsToInclude = new ArrayList();
/*     */     }
/* 173 */     return this.groupsToInclude;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/* 183 */     if (!(obj instanceof SystemEventLogsFilter)) {
/* 184 */       return false;
/*     */     }
/* 186 */     SystemEventLogsFilter otherObj = (SystemEventLogsFilter)obj;
/*     */     
/* 188 */     return (super.equals(obj)) && (this.filterUID != null ? this.filterUID.equals(otherObj.filterUID) : this.filterUID == otherObj.filterUID) && (this.name != null ? this.name.equals(otherObj.name) : this.name == otherObj.name) && (this.topic != null ? this.topic.equals(otherObj.topic) : this.topic == otherObj.topic) && (this.groupsToInclude != null ? this.groupsToInclude.equals(otherObj.groupsToInclude) : this.groupsToInclude == otherObj.groupsToInclude);
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
/* 201 */     return super.hashCode() ^ (this.filterUID != null ? this.filterUID.hashCode() : 0) ^ (this.name != null ? this.name.hashCode() : 0) ^ (this.topic != null ? this.topic.hashCode() : 0) ^ (this.groupsToInclude != null ? this.groupsToInclude.hashCode() : 0);
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
/* 214 */     return "SystemEventLogsFilter [super=" + super.toString() + ", " + "filterUID=" + this.filterUID + ", " + "name=" + this.name + ", " + "topic=" + this.topic + ", " + "groupsToInclude=" + this.groupsToInclude + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemEventLogsFilter.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */