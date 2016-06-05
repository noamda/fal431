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
/*     */ @XmlType(name="getEventLogsByUID", propOrder={"eventUID", "maxEventsLimit"})
/*     */ public class GetEventLogsByUID
/*     */ {
/*     */   protected SystemEventUID eventUID;
/*     */   protected int maxEventsLimit;
/*     */   
/*     */   public GetEventLogsByUID() {}
/*     */   
/*     */   public GetEventLogsByUID(SystemEventUID eventUID, int maxEventsLimit)
/*     */   {
/*  47 */     this.eventUID = eventUID;
/*  48 */     this.maxEventsLimit = maxEventsLimit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public SystemEventUID getEventUID()
/*     */   {
/*  60 */     return this.eventUID;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setEventUID(SystemEventUID value)
/*     */   {
/*  72 */     this.eventUID = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public int getMaxEventsLimit()
/*     */   {
/*  80 */     return this.maxEventsLimit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void setMaxEventsLimit(int value)
/*     */   {
/*  88 */     this.maxEventsLimit = value;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean equals(Object obj)
/*     */   {
/*  98 */     if (!(obj instanceof GetEventLogsByUID)) {
/*  99 */       return false;
/*     */     }
/* 101 */     GetEventLogsByUID otherObj = (GetEventLogsByUID)obj;
/*     */     
/* 103 */     return (this.eventUID != null ? this.eventUID.equals(otherObj.eventUID) : this.eventUID == otherObj.eventUID) && (this.maxEventsLimit == otherObj.maxEventsLimit);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public int hashCode()
/*     */   {
/* 113 */     return (this.eventUID != null ? this.eventUID.hashCode() : 0) ^ this.maxEventsLimit;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public String toString()
/*     */   {
/* 123 */     return "GetEventLogsByUID [eventUID=" + this.eventUID + ", " + "maxEventsLimit=" + this.maxEventsLimit + "]";
/*     */   }
/*     */ }


/* Location:              C:\Users\davidn1\Downloads\RecoverPoint_SDK\src\main\resources\fapi_client_4_3_1.jar!\com\emc\fapi\jaxws\v4_3_1\GetEventLogsByUID.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       0.7.1
 */