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
/*     */ @XmlAccessorType(XmlAccessType.FIELD)
/*     */ @XmlType(name="SystemEventLogs", propOrder={"eventLogs"})
/*     */ public class SystemEventLogs
/*     */ {
/*     */   @XmlElement(nillable=true)
/*     */   protected List<EventLog> eventLogs;
/*     */   
/*     */   public SystemEventLogs() {}
/*     */   
/*     */   public SystemEventLogs(List<EventLog> eventLogs)
/*     */   {
/*  48 */     this.eventLogs = eventLogs;
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
/*     */   public List<EventLog> getEventLogs()
/*     */   {
/*  74 */     if (this.eventLogs == null) {
/*  75 */       this.eventLogs = new ArrayList();
/*     */     }
/*  77 */     return this.eventLogs;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  87 */     if (!(obj instanceof SystemEventLogs)) {
/*  88 */       return false;
/*     */     }
/*  90 */     SystemEventLogs otherObj = (SystemEventLogs)obj;
/*     */     
/*  92 */     return this.eventLogs == otherObj.eventLogs ? true : this.eventLogs != null ? this.eventLogs.equals(otherObj.eventLogs) : false;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 101 */     return this.eventLogs != null ? this.eventLogs.hashCode() : 0;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 110 */     return "SystemEventLogs [eventLogs=" + this.eventLogs + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\SystemEventLogs.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */